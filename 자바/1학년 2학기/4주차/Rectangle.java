public class Rectangle {
    public static float findArea(int w)
        { return (float)(w*w); }
    public static float findArea(int w, int h)
        { return (float)(w*h); }
    public static double findArea(double w, double h)
        { return w*h; }

    public static void main(String[] args){
        System.out.println(findArea(5));
        System.out.println(findArea(5, 4));
        System.out.println(findArea(5.3, 5.5));
    }
}