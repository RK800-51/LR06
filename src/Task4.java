public class Task4 {
    static int doubleFactorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        else {
            x = x * doubleFactorial(x-2);
            return x;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Task4.doubleFactorial(n));
    }
}
