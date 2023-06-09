package b3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D p = new Point3D(1.2f,2.3f,4.5f);
        System.out.println(Arrays.toString(p.getXYZ()));
        System.out.println(p);
    }
}
