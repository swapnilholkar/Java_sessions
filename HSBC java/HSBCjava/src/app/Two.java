package app;

/**
 * Two
 */
public class Two extends One{

    public Two(){
        super(3);
        System.out.println("first constructor of Two");
    }

    public Two(int a){
        super(3);
        System.out.println("second constructor of Two");
    }
}