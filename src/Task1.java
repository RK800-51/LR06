public class Task1 {
    private char ch;
    private String str;

    public void setValues(char ch) {
        this.ch = ch;
    }

    public void setValues(String str) {
        this.str = str;
    }

    public void setValues(char[] chars) {
        if (chars.length == 0) {
            return;
        }
        if (chars.length == 1) {
            this.ch = chars[0];
        }
        else {
            this.str = String.valueOf(chars);
        }

    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task1 task2 = new Task1();
        Task1 task3 = new Task1();

        char[] chars = {'a', 'b', 'c'};

        task1.setValues('a');
        task2.setValues("a");
        task3.setValues(chars);
    }


}
