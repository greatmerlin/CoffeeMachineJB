import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 1) {
            System.out.println("no army");
        }
        else if(input >= 1 && input <= 19) {
            System.out.println("pack");
        }
        else if(input >= 20 && input <= 249) {
            System.out.println("throng");
        }
        else if(input >= 250 && input <= 999) {
            System.out.println("zounds");
        }
        else {
            System.out.println("legion");
        }
    }
}