public class OOPS {
    public static void main(String[] args) {

        // Pen object
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen Color: " + p1.color);

        // BankAccount object
        BankAccount myAcc = new BankAccount();
        myAcc.username = "John";
        myAcc.setPassword("abcdefgh");

        System.out.println("Username: " + myAcc.username);
        System.out.println("Password has been set successfully.");
    }
}

// Pen class
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
}

// BankAccount class
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}