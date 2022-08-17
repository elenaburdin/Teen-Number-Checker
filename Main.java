package academy.learningprogram;

public class Main {
    public static void main(String[] args) {
        isTeen(13);

    }

    public static boolean isTeen(int teen1) {
        if (teen1 >= 13 && teen1 <= 19) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}