import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long second = scanner.nextLong();



        long result;

        switch(operator) {
            case '+':
                result = first + second;
                System.out.println(result);
                break;

            case '-':
                result = first - second;
                System.out.println(result);
                break;

            case '*':
                result = first * second;
                System.out.println(result);
                break;

            case '/':
                if (second == 0){
                    System.out.println("Division by 0!");
                    break;
                }
                result = first / second;
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
        }

    }
}