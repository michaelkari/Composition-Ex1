/*
 * Michael Karimizadeh
 * 20/12/16
 * Customer class
 * Allows customers to be created and manipulated using methods that 
 * can retrieve info about the account or add/delete them
 */
public class Customer{
  private int custID;//Creates ID holder
  public Account[] accounts= new Account[116];//Creates a maximum of 116 accounts
  private String firstName;//Creates first name holder
  private String lastName;//Creates last name holder
  private int numOfAccounts;//Creates variable that holds number of accounts
  private String dob;//Creates date of birth holder
  public Customer(int cID, String fName, String lName, String dOb){
    //Creates customer using ID, names, and date of birth
    custID= cID;
    firstName= fName;
    lastName= lName;
    dob=dOb;
  }
  public Account getAccount(char type){
    //Returns acccount with matching type
    return accounts[type];
  }
  public int getCustID(){
    //Returns customer ID
    return custID;
  }
  public String getName(){
    //Returns customer name
    return firstName+" "+lastName;
  }
  public int getNumOfAccounts(){
    //Returns number of accounts
    int x=0;
    if(accounts['c']!=null){
      x++;//Adds one if chequeing account exists
    }
    if(accounts['r']!=null){
      x++;//Adds one if rsp account exists
    }
    if(accounts['s']!=null){
      x++;//Adds one if saving account exists
    }
    return x;
  }
  public String getDOB(){
    //Returns date of birth
    return dob;
  }
  public boolean addAccount(int acctID, double balance, char type){
    //Creates a new account using ID, balance, and type
    if(accounts[type]==null){//Runs if the type doesn't exist
      accounts[type] = new Account(acctID, balance, type);//Creates account
      return true;//Returns true if successful
    }
    else{
      return false;//Reutrns false if unsuccessful
    }
  }
  public boolean removeAccount(char type){
    //Removes account based on type
    if(accounts[type]!=null){//Run if account exists
      accounts[type]=null;//Destroys account
      return true;//Returns true if successful
    }
    else{
      return true;//Returns false if unsuccessful
    }
  }
  public String toString(){
    //Returns attributes
    String a="";//Creates chequing string
    String b="";//Creates savings string
    String c="";//Creates rsp string
    if(accounts['s']!=null){//Runs if savings exist
       b=", "+accounts['s'].toString();//Sets b string
    }
    if(accounts['c']!=null){//Runs if chequing exist
       a=", "+accounts['c'].toString();//Sets c string
    }
    if(accounts['r']!=null){//Runs if rsp exist
       c=", "+accounts['r'].toString();//Sets r string
    }
    //Returns all attributes
    return getName()+", Customer ID: "+getCustID()+", DOB: "+getDOB()+a+b+c;
  }
}