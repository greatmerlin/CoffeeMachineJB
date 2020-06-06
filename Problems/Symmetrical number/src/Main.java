import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int firstChar = input/1000;
        int secondCHar = ((input%1000)/100);
        int thirdChar = (((input%1000)%100)/10);
        int forthChar = (((input%1000)%100)%10);

        if ((firstChar == forthChar) &&
            (secondCHar == thirdChar)){
            System.out.println(1);
        }
        else {
            System.out.println(37);
        }
    }
}