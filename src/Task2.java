public class Task2 {
    private static int digit = 0;

    static void incValue() {
        System.out.println("digit: " + digit);
        digit += 1;
    }

    public static void main(String[] args) {
        Task2.incValue();
        Task2.incValue();
        Task2.incValue();
    }

}
