package projects.ch07;

public class Varargs {
    public static void main(String[] args) {
        m1();
        m1("A");
        System.out.println();
        m1("A", "B");
        System.out.println();
        m1("A", "B", "C");
        System.out.println();
        m1(new String[] {});
        System.out.println();
        m1(new String[] {"a"});
        System.out.println();
        m1(new String[] {"a", "b", "c", "d"});
    }
//    public static void m1(int n, String... args){}
//    public static void m1(String... args, int n){}
//    public static void m1(String[] args){} // this is not varargs

    public static void m1(String... args){ // varargs
        for(int i=0; i<args.length; i++){
            System.out.print(args[i]);
        }
        System.out.println();
        for(String s:args){
            System.out.print(s);
        }
        System.out.println();
    }
}
