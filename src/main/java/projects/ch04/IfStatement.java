package projects.ch04;

public class IfStatement {
    public static void main(String[] args) {
        int x = 4, y = 5;
        formal(x, y);
        normal(x, y);
        bad(x, y);

        //    "if expression"
        System.out.println((x < y ? x + " < " + y : (x > y ? x + " > " + y : x + " = " + y)));
    }

    public static void formal(int x, int y) {
        if ( x < y ) {
            System.out.println(x + " < " + y);
        } else {
            if ( x > y ) {
                System.out.println(x + " > " + y);
            } else {
                System.out.println(x + " = " + y);
            }
        }
    }

    public static void normal(int x, int y) {
        if ( x < y ) {
            System.out.println(x + " < " + y);
        } else if ( x > y ) {
            System.out.println(x + " > " + y);
        } else {
            System.out.println(x + " = " + y);
        }
    }

    public static void bad(int x, int y) {
        if ( x < y )
            System.out.println(x + " < " + y);
        else
            if ( x > y )
                System.out.println(x + " > " + y);
            else
                System.out.println(x + " = " + y);
    }
}
