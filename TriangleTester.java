import Main.Triangle;

public class TriangleTester {
    public static void main(String[] args) {

        Triangle area = new Triangle(4.0, 2.5);
        System.out.println(area.getBase());
        System.out.println(area.getHeight());

        System.out.println(area.calculateArea());

      area.setBase(8);
        System.out.println(area.getBase());
        System.out.println(area.calculateArea());






    }
}
