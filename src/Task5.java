public class Task5 {
    static int x;
    static int sumSqrt(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            x += n*n + sumSqrt(n-1);
            return x;

        }
    }
    public static void main(String[] args) {
        System.out.println(Task5.sumSqrt(3));
    }
}
