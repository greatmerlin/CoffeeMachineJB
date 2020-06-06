import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        System.out.println(check(h1, h2, h3));
    }

    public static boolean check(int h1, int h2, int h3) {
        return  h1 >= h2 && h2 >= h3 ||
                h1 <= h2 && h2 <= h3;
    }
}