import com.bryson.BankAccount.BankAccount;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        //a 'string' is a type of variable that holds character combinations (numbers, letters, punctuation, ect)
        String s = "Hello Welcome to Programming";
        System.out.println(s);

        // an 'int' or 'integer' is a type of variable that holds numbers with no decimals
        int x = 5;
        int y = 10;
        //a double is a "type" of variable that holds numbers with decimals in them
        double z = 15.3;





        /*More advanced introduces objects,  going to comment out for now*/
        /*
        BankAccount userOne = new BankAccount("John", 40.00);
        System.out.println(userOne.accountName + " has $" + userOne.getBalance());
        BankAccount userTwo = new BankAccount("Brian");
        System.out.println(userTwo.accountName + " has $" + userTwo.getBalance());

        userOne.Deposit(50.00);
        System.out.println(userOne.accountName + " has $" + userOne.getBalance());

        userTwo.Deposit(25.00);
        System.out.println(userTwo.accountName + " has $" + userTwo.getBalance());

        userTwo.Withdraw(50.45);
        System.out.println(userTwo.accountName + " has $" + userTwo.getBalance());
        */

    }
    public int add(int x, int y){
        return x + y;
    }
    public double addDouble(double x, double y){
        return x + y ;
    }
}
