public class Main
    {
        public static void main(String args[])
        {
            Rectangle r1 = new Rectangle(0,5,0,5);
            Rectangle r2 = new Rectangle(3,3,5,5);
	    r2.show();
	    r1.move(1,1);
	    System.out.println(r1.isInside(1,1));
        }
    }

    class Rectangle
    {
        public int x1,y1,x2,y2;
        Rectangle(int x1,int y1, int x2, int y2)
	{
            this.x1 =x1;
            this.x2 =x2;
            this.y1 =y1;
            this.y2 =y2;
        }
        public void show()
        {
		System.out.println("현재위치 : "+x1+", "+y1);
		System.out.println("가로세로길이 : "+(x2-x1)+", "+(y2-y1));
		System.out.println("면적 : "+(x2-x1)*(y2-y1));
        }
	public void move(int deltaX,int deltaY)
	{
		x1 += deltaX;
		x2 += deltaX;
		y1 += deltaY;
		y2 += deltaY;
	}
	public String isInside(int px,int py)
	{
		if(x1>=px && px <=x2)
			if(y1>=py && py <= y2)
				return "true";
			else
				return "false";
		else
			return "false";
	}
    }