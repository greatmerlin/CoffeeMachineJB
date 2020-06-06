package machine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeMachineFunction {

    Data data = new Data();
    boolean flag = true;

    public CoffeeMachineFunction() {
        startCoffeeMachine();
    }

    private void startCoffeeMachine() {

        while (flag) {

            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    try {
                        int whatToBuy = scanner.nextInt();
                        if (whatToBuy == 1) {
                            data.espresso();
                        }
                        else if(whatToBuy == 2) {
                            data.latte();
                        }
                        else if (whatToBuy == 3) {
                            data.cappuccino();
                        }
                        else {
                            break;
                        }
                    }catch (InputMismatchException e) {
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterToAdd = scanner.nextInt();
                    scanner.nextLine();
                    data.setWater(waterToAdd);
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milkToAdd = scanner.nextInt();
                    scanner.nextLine();
                    data.setMilk(milkToAdd);
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int beansToAdd = scanner.nextInt();
                    scanner.nextLine();
                    data.setBeans(beansToAdd);
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int cupsToAdd = scanner.nextInt();
                    scanner.nextLine();
                    data.setCups(cupsToAdd);
                    break;
                case "take":
                    System.out.println("i gave you $" + data.getMoney());
                    data.withdraw();
                    break;
                case "remaining":
                    System.out.println();
                    System.out.println("The coffee machine has:");
                    System.out.println(data.getWater() + " of water");
                    System.out.println(data.getMilk() + " of milk");
                    System.out.println(data.getBeans() + " of coffee beans");
                    System.out.println(data.getCups() + " of disposable cups");
                    System.out.println(data.getMoney() + " of money");
                    System.out.println();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    break;
            }
        }

    }

    private void cup(int cups, int machineWater, int machineMilk, int machineBeans) {
        int oneWater = 200;
        int oneMilk = 50;
        int oneBean = 15;

        int water = machineWater / oneWater;
        int milk = machineMilk / oneMilk;
        int beans = machineBeans / oneBean;

        int minElementOne = Math.min(water, milk);
        int minElementFinal = Math.min(minElementOne, beans);

        if (minElementFinal == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if(minElementFinal > cups) {
            int moreCUps = minElementFinal - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + moreCUps + " more than that)");
        }
        else {
            System.out.println("No, I can make only " + minElementFinal + " cup(s) of coffee");
        }

    }
}
