/*
 * Michael Karimizadeh
 * 20/12/16
 * Account class
 * Allows user to interact with accounts by getting IDs, types, 
 * balances, or withdrawing/depositing 
 */
public class Account{
  private char accType; //Creates account type holder
  private double balance; //Creates balance holder
  private int acctID; //Creates account ID holder
  public Account(int actID, double amount, char type){
    //Creates account using account ID, balance, and account type
    acctID=actID;
    accType=type;
    balance=amount;
  }
  public int getAcctID(){
    //Returns account ID
    return acctID;
  }
  public char getAcctType(){
    //Returns account type
    return accType;
  }
  public double getBalance(){
    //Returns balance
    return balance;
  }
  public boolean withdraw(double amount){
    //Allows withdrawing from account if balance is greater than 0
    if(balance-amount>=0){
      balance-=amount;//Subracts amount wanted from balance
      return true;//Returns true if successful
    }
    else{
      return false;//Returns false if unsuccessful
    }
  }
  public void deposit(double amount){
    //Allows depositing into accounts
    balance+=amount;//Adds amount deposited into balance
  }
  public String toString(){
    //Returns attributes
    return "Type: "+accType+", Account number: "+acctID+", $"+balance;
  }
}