package lesson_01.ex003;

public class Program {
    

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        //a.setX(12);
        System.out.println(a.getX());
        System.out.println(a.getY());
        //a = new Point2D();
        //Point2D b = new Point2D(10, 10);
        Point2D b = new Point2D(0);
        System.out.println(a);
        System.out.println(b);
        
        //System.out.println(b.toString());
        //System.out.println(distance(a, b));
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
