package projects.ch07;

public class Overload {
    public static void main(String[] args) {
        f(2, 3);
        f(2);
        f(3L);

        g(8);
        g(8.0);
        g((byte) 8);
    }

    public static void f(long l, int i) {
        System.out.println("long + int");
    }

//    public static void f(int i, long l) {
//        System.out.println("int + long");
//    }

    public static void f(int i) {
        System.out.println("int");
    }

    public static void f(long l) {
        System.out.println("long");
    }

    public static void g(Number n) {
        System.out.println("Number");
    }

    public static void g(Integer i) {
        System.out.println("Integer");
    }

    public static void g(Double d) {
        System.out.println("Double");
    }
}
