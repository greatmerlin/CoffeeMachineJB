import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howMany = scanner.nextInt();

        int zero = 0;
        int eins = 0;
        int zwei = 0;

        for (int i = 0; i < howMany; i++) {
            int input = scanner.nextInt();
            switch (input) {
                case 0:
                    zero++;
                    break;
                case 1:
                    eins++;
                    break;
                case -1:
                    zwei++;
                    break;
            }

        }
        System.out.println(zero + " " + eins  + " " + zwei );
    }
}