import static java.lang.Math.PI;

public class CircleMath {

    static double pi = PI;

    private CircleMath() {
    }

    static double length (double radius){
        return 2 * pi * radius;
    }

    static double area (double radius){
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(length(5.6));
        System.out.println(area(18.3));
    }

}
