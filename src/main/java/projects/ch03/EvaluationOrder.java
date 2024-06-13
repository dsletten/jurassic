package projects.ch03;

public class EvaluationOrder {
    public static void main(String[] args) {
        boolean a = false, b = false, c = false;
//        (a = true) || (b = true) && (c = true);
        System.out.println((a = true) || (b = true) && (c = true));
        System.out.println(a + " " + b + " " + c);

        System.out.println(f() + g() * h());
//        System.out.println(f() + (g() * h()));
    }

    public static int f() {
        System.out.println("In f!");
        return 2;
    }

    public static int g() {
        System.out.println("In g!");
        return 3;
    }

    public static int h() {
        System.out.println("In h!");
        return 4;
    }
}
