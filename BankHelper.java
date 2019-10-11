/*
 * Michael Karimizadeh
 * 20/12/16
 * Bank helper class
 * Allows user to search for customers and accounts via
 * customer ID and account ID
 */
public class BankHelper{
  public static int findCustomer(int cID, Customer Customer[]){//Uses ID and Customer array as parameters
    //Finds the array position of the matching target ID if there is any
    int target=-1;
    for(int i=0; i<Customer.length; i++){//Checks all objects in array
      if(cID==Customer[i].getCustID()){
        target=i;//Makes variable equal counter if the correct customer is found
      }
    }
    return target;
  }
  public static Customer findCustomerMatchingAcctNum(Customer Customer[], int acctNum){//Uses Customer array and account number as parameters
    //Finds the customer that has a matching Account ID
    int target=-1;//Sets target to -1 in case nothing is found
    for(int i=0; i<Customer.length; i++){
      if(Customer[i].getAccount('c')!=null)//Try if Chequeing exists
      {
        if(Customer[i].getAccount('c').getAcctID()==acctNum){
          target=i;//Sets variable to counter if account is found
        }
      }
      if(Customer[i].getAccount('s')!=null)//Try if Savings exists
      {
        if(Customer[i].getAccount('s').getAcctID()==acctNum){
          target=i;//Sets variable to counter if account is found
        }
      }
      if(Customer[i].getAccount('r')!=null)//Try if RSP exists
      {
        if(Customer[i].getAccount('r').getAcctID()==acctNum){
          target=i;//Sets variable to counter if account is found
        }
      }
    }
    return Customer[target];
  }
  public static Account findAccount(Customer Customer[], int acctNum){//Uses customer array and account number as parameters
    //Finds the object with a matching Account ID
    int x=-1;//Sets target to -1 in case nothing is found
    char target=' ';//Creates empty array to store response
    for(int i=0; i<Customer.length; i++){
      if(Customer[i].getAccount('c')!=null)//Try if chequing exists
      {
        if(Customer[i].getAccount('c').getAcctID()==acctNum){//Checks account ID
          x=i;//Records customer if correct
          target='c';//Sets account type if correct
        }
      }
      if(Customer[i].getAccount('s')!=null)//Try if savings exists
      {
        if(Customer[i].getAccount('s').getAcctID()==acctNum){//Checks account ID
          x=i;//Records customer if correct
          target='s';//Sets account type if correct
        }
      }
      if(Customer[i].getAccount('r')!=null)//Try if rsp exists
      {
        if(Customer[i].getAccount('r').getAcctID()==acctNum){//Checks account ID
          x=i;//Records customer if correct
          target='r';//Sets account type if correct
        }
      }
    }
    return Customer[x].accounts[target];//Returns location of matching account ID
  }
}