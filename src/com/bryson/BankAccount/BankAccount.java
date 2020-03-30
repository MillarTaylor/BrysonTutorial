package com.bryson.BankAccount;

public class BankAccount {
    /**
     * The next two lines are what are called variables,  a variable is basically a placeholder for whatever value you store into it
    * in this class we will have 2 variables,  the account holders name, and the totalFunds which is the users account balance*/
    private double totalFunds;
    public String accountName;

    /**
     * This is called the Constructor, Notice how it has the same name as the Class it is in  (class BankAccount)
    * It is responsible for creating a new BankAccount, with which you can add and withdraw funds
    * @param accountName this is the name of the account holder
     * @param initialDeposit this is the initial amount of money the user creates his account with
    * */
    public BankAccount(String accountName, double initialDeposit) {
        this.totalFunds=initialDeposit;
        this.accountName = accountName;

    }

   /**Like you have seen above this is another version of a constructor which creates a bank account, notice this time tho that it only takes 1 value to create the bank account
    * the account holders name,  This gives you another option to create a bank account if you look inside of the constructor you can see that it sets the account name to what was
    * provided in the parameter.  But it sets the totalFunds to 0,  Basically this is saying if the user creates a bank account and doesnt provide a value, we are going to assume
    * that they have 0 funds
    * @param  accountName Account holders name
    * */
    public BankAccount(String accountName){
        this.totalFunds = 0;
        this.accountName = accountName;
    }
    /**
     * Function: Deposit
     * Purpose: This function deposits money into the bank account
     * @param  funds amount of money to be deposited
     * */
    public void Deposit(double funds){
        System.out.println(accountName +": Deposited " + funds + " in to his account.");
        this.totalFunds= this.totalFunds+funds;
    }
    /**
     * Function: Withdraw
     * Purpose: Withdraws funds from the account
     * NOTICE: inside this function it does a check before it withdraws any money from the account if(this.totalFunds < funds)
     * If the user does not have enough money to withraw the money it just prints a message saying they cannot withdraw the funds
     * @param funds How much money to withdraw from the account*/
    public double Withdraw(double funds) {

        if(this.totalFunds < funds){
          System.out.println(accountName +": Does not have enough money to withdraw $" + funds + "/n he only has $" + getBalance());
          return 0.00;
        } else {
            this.totalFunds = this.totalFunds - funds;
            System.out.println((accountName + ": Withdrew $" + funds));
            return funds;
        }
    }
    /**
    * Function: getBalance
     * Purpose: Gets the total Funds inside of the bank Account
    * */
    public double getBalance(){
        return this.totalFunds;
    }

    /**
     * Function: changeName
     * Purpose: Changes the name of the account holder
     * */
    public void changeName(String name){

        if(this.accountName.equals(name)){
            System.out.println("You cant change your name to the same name!!!");
            return;
        }
        System.out.println(this.accountName + " changed his name to " + name);
        this.accountName = name;
    }


}
