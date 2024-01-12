public class Task9 {
    static void swap(char[] ch) {
        int halfLength = ch.length/2;
        for (int i = 0, j = ch.length-1; i < halfLength; i++, j--) {
            char tmp = ch[i];
            ch[i] = ch[j];
            ch[j] = tmp;
        }

    }
    public static void main(String[] args) {
        char[] data = {'a', 'b', 'c', 'd', 'e', 'x'};

        System.out.println("Source array:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        Task9.swap(data);

        System.out.println("Array after swap elements:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

}