import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        boolean flag = false;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < array.length - 1; i++) {
                if  (((array[i] == n) && (array[i + 1] == m)) ||
                    ((array[i] == m) && (array[i + 1] == n))){
                    flag = true;
                }
        }

        if (flag) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}