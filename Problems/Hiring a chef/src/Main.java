//put imports you need here

import java.util.Scanner;

class Client {
    Scanner scanner = new Scanner(System.in);
    String firstName, soe, cuisine = "";
    int age, yoe;

    Client() {
        String firstName = scanner.nextLine();
        setFirstName(firstName);
        String age = scanner.nextLine();
        String soe = scanner.nextLine();
        String yoe = scanner.nextLine();
        String cuisine = scanner.nextLine();
        setCuisine(cuisine);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSoe() {
        return soe;
    }

    public void setSoe(String soe) {
        this.soe = soe;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }
}

class Main {
    public static void main(String[] args) {

        Client client = new Client();

        System.out.println("The form for " + client.getFirstName() + " is completed. We will contact you if we need a chef that cooks " + client.getCuisine() + " dishes.");
    }
}