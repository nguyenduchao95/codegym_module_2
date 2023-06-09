package b2;

public class Test {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(4.2);
        System.out.println(c);
        System.out.println(c.getVolume());
        c.setRadius(2);
        c.setColor("blue");
        System.out.println(c);
        System.out.println(c.getVolume());
    }
}
