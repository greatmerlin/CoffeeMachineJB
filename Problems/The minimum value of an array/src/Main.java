import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] myArray = new int[length];
    for (int i = 0; i <= myArray.length - 1; i++) {
        myArray[i] = scanner.nextInt();
    }

        System.out.println(getMinValue(myArray));
    }

    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}


