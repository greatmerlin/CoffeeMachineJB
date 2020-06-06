package machine;

public class Data {

    private int water, milk, beans, cups, money;

    public Data() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public void espresso() {
        int esWater = 250;
        int esBeans = 16;
        int esCost = 4;

        if (this.water / esWater <= 0) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.beans / esBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
        }

        if (this.cups == 0) {
            System.out.println("Sorry, not enough disposable cups!");
        }

        if((this.water / esWater > 0) &&
                (this.beans / esBeans > 0) &&
                (this.money / esCost > 0 ) &&
                (this.cups != 0)) {
            this.water -= esWater;
            this.beans -= esBeans;
            this.money += esCost;
            this.cups--;
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
        }
    }

    public void latte() {
        int latWater = 350;
        int latBeans = 20;
        int latCost = 7;
        int latMilk = 75;

        if (this.water / latWater <= 0) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.beans / latBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.milk / latMilk <= 0) {
            System.out.println("Sorry, not enough milk!");
        }
        if (this.cups == 0) {
            System.out.println("Sorry, not enough disposable cups!");
        }

        if(     (this.water / latWater > 0) &&
                (this.beans / latBeans > 0) &&
                (this.money / latCost > 0 ) &&
                (this.milk / latMilk > 0)   &&
                (this.cups != 0))  {

            this.water -= latWater;
            this.beans -= latBeans;
            this.money += latCost;
            this.milk -= latMilk;
            this.cups--;
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
        }
    }

    public void cappuccino() {
        int capWater = 200;
        int capBeans = 12;
        int capCost = 6;
        int capMilk = 100;

        if (this.water / capWater <= 0) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.beans / capBeans <= 0) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.milk / capMilk <= 0) {
            System.out.println("Sorry, not enough milk!");
        }
        if (this.cups == 0) {
            System.out.println("Sorry, not enough disposable cups!");
        }

        if(     (this.water / capWater > 0) &&
                (this.beans / capBeans > 0) &&
                (this.money / capCost > 0 ) &&
                (this.milk / capMilk > 0) &&
                (this.cups != 0)) {

            this.water -= capWater;
            this.beans -= capBeans;
            this.money += capCost;
            this.milk -= capMilk;
            this.cups--;
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
        }

    }

    public void withdraw() {
        this.money = 0;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water += water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk += milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans += beans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups += cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }
}
