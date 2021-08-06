from typing import ValuesView
from django.http.response import HttpResponse, HttpResponseRedirect
from django.shortcuts import redirect, render
from .models import Attribute, Food
from django.db import connection

def index(request):
    return render(request,'delivery_main/index.html')

def recommand(request):
    keyword = request.GET
    try:
        cursor = connection.cursor()
        sql = "select name, path, frequency, good, bad, food.fno from food, attribute where food.fno = attribute.fno order by frequency desc limit 3"
        cursor.execute(sql)
        result_data = cursor.fetchall()
        connection.commit()
        connection.close()
        data_list = []
        for food in result_data:
            row = {'name' : food[0], 'path' : '/static/images/' + food[1], 'frequency' : food[2], 'good' : food[3], 'bad' : food[4], 'fno' : food[5]}
            data_list.append(row)
    except:
        connection.rollback()
        print("failed selecting in database")
    return render(request, 'delivery_main/recommand.html', {"list" : data_list, "keyword" : keyword})

def good(request):
    if request.method == 'POST':
        fno = request.POST['fno']
        sense = request.POST['sense']
        try:
            cursor = connection.cursor()
            sql = "update attribute set good = good + 1 where sense = %s and fno = %s"
            cursor.execute(sql, (sense, fno))
            connection.commit()
            connection.close()
        except:
            connection.rollback()
            print("failed updating in database")
        return HttpResponseRedirect('/recommand/?keyword=' + request.POST['sense'])

def bad(request):
    if request.method == 'POST':
        fno = request.POST['fno']
        sense = request.POST['sense']
        try:
            cursor = connection.cursor()
            sql = "update attribute set bad = bad + 1 where sense = %s and fno = %s"
            cursor.execute(sql, (sense, fno))
            connection.commit()
            connection.close()
        except:
            connection.rollback()
            print("failed updating in database")
        return HttpResponseRedirect('/recommand/?keyword=' + request.POST['sense'])