package projects.ch07;

public class CallByValue {
    public static void main(String[] args) {
        int x = 19;         // primitive
        int[] arr = {1, 2}; // array
        callByValue(x, arr);
        System.out.println(x); // 19, unchanged
        System.out.println(arr[0] + ", " + arr[1]); // -1, 2
        x = callByValue(x, arr);
        System.out.println(x); // -1, changed
    }
    public static int callByValue(int x, int[] arr){
        x       = -1;
        arr[0]  = -1;
        return x;
    }
}
