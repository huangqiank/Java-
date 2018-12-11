package class14;
//do while,while,for

public class main {
    public static void main(String[] args) {
        int c = 5;
        while (c > 0) {
            System.out.println(c);
            c -= 1;
        }
        c = 5;
        do {
            System.out.println(c);
            c -= 1;
        } while (c > 0);
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}