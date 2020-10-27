package app;


/**
 * One
 */
public class One extends Parent {

    public One(){
        System.out.println("first constructor of one");
    }

    public One(int a){
        System.out.println("second constructor of one");
    }


    public void welcome(){
        System.out.println("welcome to child");
    }

    public void add(int a, int b){
        int result =a+b;
        System.out.println("addtion is: "+result);
    }
}