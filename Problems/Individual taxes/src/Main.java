import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfCompanies = sc.nextInt();
        int[] yrIncomeArr = new int[numOfCompanies];
        double[] taxPercentArr = new double[numOfCompanies];
        double[] taxAmount = new double[numOfCompanies];

        for (int i = 0; i < yrIncomeArr.length; i++) {
            yrIncomeArr[i] = sc.nextInt();
        }
        for (int i = 0; i < taxPercentArr.length; i++) {
            taxPercentArr[i] = sc.nextInt();
        }

        //calculate taxes for each company
        for (int i = 0; i < yrIncomeArr.length; i++) {
            if (yrIncomeArr[i] == 0.0){
                taxAmount[i] = 0.0;
                continue;
            }
            if (taxPercentArr[i] == 0.0) {
                taxAmount[i] = 0.0;
                continue;
            }
            taxAmount[i] = (yrIncomeArr[i] / taxPercentArr[i]);
            if (taxAmount[i] < 1) {
                taxAmount[i] = taxAmount[i] * 100;
            }
        }

        //establish a counter and find the highest tax.
        double highestTax = 0;
        int k = 1;
        for (int i = 0; i < yrIncomeArr.length; i++) {
            if (taxAmount[i] > highestTax) {
                highestTax = taxAmount[i];
                k = i + 1;
            }
        }
        System.out.println(k);
    }
}