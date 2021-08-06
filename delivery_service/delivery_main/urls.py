from django.urls import path

from . import views


urlpatterns = [
    path('', views.index, name='index'),
    path('recommand/', views.recommand, name='recommand'),
    path('recommand/good', views.good, name='good'),
    path('recommand/bad', views.bad, name='bad'),
]