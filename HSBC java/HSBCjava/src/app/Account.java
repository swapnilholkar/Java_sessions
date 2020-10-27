package app;

/**
 * Account example is for static variables hich is not created inside the object but outside and is changed by all objects
 */
public class Account {
    static int dollar;

    public void amount(int am){
        int val = am*dollar;
        System.out.println("total value is: "+ val);
    }
    public void setDollar(int dol){
        dollar=dol;
    }
    
}