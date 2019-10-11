/*
 * Michael Karmizadeh
 * 20/12/16
 * Main class
 * This program creates and organizes bank accounts
 * */
public class Main{
  public static void main(String[] args){
    Customer[] customers= new Customer[3];//Creates array of 3 customers
    //Creates and sets account for victor
    customers[0]=new Customer(971354658, "Victor", "Kong", "09/12/1985");
    customers[0].addAccount(1235,1220.23, 'c');
    customers[0].addAccount(1236,5023.15, 's');
    customers[0].addAccount(1237,15020.23, 'r');
    //Creates and sets account for jame
    customers[1]=new Customer(897515312, "Jame", "Lee", "10/1/1970");
    customers[1].addAccount(3421,1220.23, 'c');
    customers[1].addAccount(3422,23.15, 's');
    customers[1].addAccount(3423,45312.12, 'r');
    //Creates and sets account for james
    customers[2]=new Customer(123456465, "James", "Brown", "01/29/1978");
    customers[2].addAccount(2124,1220.23, 'c');
    customers[2].addAccount(2121,1210.12, 'r');
    
    //ii 1. Withdraw $200.00 from account 1235
    (BankHelper.findAccount(customers, 1235)).withdraw(200.0); 
    //ii 2. Deposit $1000.00 into account 1236
    (BankHelper.findAccount(customers,1236)).deposit(1000.0);
    //ii 3. Withdraw $40.00 from account 3422
    (BankHelper.findAccount(customers, 3422)).withdraw(40.0);
    //ii 4. Tranfers $1200.50 from account 2124 to account 2121
    (BankHelper.findAccount(customers, 2124)).withdraw(1200.50);
    (BankHelper.findAccount(customers, 2121)).deposit(1200.50);
    //ii 5. Transfer all the money from account 3422 into 3423 and close the account
    double x=(BankHelper.findAccount(customers, 3422)).getBalance();
    (BankHelper.findAccount(customers, 3422)).withdraw(x);
    (BankHelper.findAccount(customers, 3423)).deposit(x); 
    //ii 6. Withdraw all the money from account 1236 and close the account
    (BankHelper.findAccount(customers, 1236)).withdraw((BankHelper.findAccount(customers, 1236)).getBalance());
    (BankHelper.findCustomerMatchingAcctNum(customers, 1236)).removeAccount((BankHelper.findAccount(customers, 1236)).getAcctType());
    //ii 7. Add a new Savings account to Customer 971354658 with a balance of $3050.00
    customers[(BankHelper.findCustomer(971354658, customers))].addAccount(1236, 3050.0,'s');
    //ii 8. Add a new Savings account to Customer 123456465 with a balance of $100.00
    customers[(BankHelper.findCustomer(123456465 , customers))].addAccount(2123, 100.0,'s');
  }
}