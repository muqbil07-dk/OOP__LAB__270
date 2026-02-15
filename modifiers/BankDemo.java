class BankAccount {
private double balance = 5000;
public void deposit(double amount) {
balance = balance + amount;
}
public void withdraw(double amount) {
if (amount <= balance) {
balance = balance - amount;
} else {
System.out.println("Insufficient Balance");
}
}
public double getBalance() {
return balance;
}
}
public class BankDemo {
public static void main(String[] args) {
BankAccount acc = new BankAccount();
acc.deposit(2000);
acc.withdraw(1000);
System.out.println("Current Balance: " + acc.getBalance());
}
}
