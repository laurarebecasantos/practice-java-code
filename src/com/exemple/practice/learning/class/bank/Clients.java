package dia5.bank;


import java.text.NumberFormat;

public class Clients {
    private String firstName;
    private int age;
    private Double balance;

    Clients(String firstName, int age, double balance) {
        this.firstName = firstName;
        this.age = age;
        this.balance = balance;
    }

    void newAccount() {
        System.out.println(firstName + ", Account Created!");

    }

    void newBalance() {
        NumberFormat value = NumberFormat.getCurrencyInstance();
        double money = balance + 10;
        System.out.println("The new balance is " + value.format(money));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
