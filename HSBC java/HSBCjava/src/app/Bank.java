package app;

/**
 * Bank for abstact and inheritance we use it to make sure others classes that inherit must use these methods
 */
abstract public class Bank {

    abstract public void openAccount();
    abstract public void showBalance();

    final public void welcome(){
        System.out.println("Welcome to the bank");
    }
    
}