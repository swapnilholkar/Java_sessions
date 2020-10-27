package app;

/**
 * Exam
 */
public class Exam {

    private int phy,che,total;
    private float percent;
    private String name;

    public void physics(int a){
        phy=a;
    }

    public void chemistry(int a){
        che=a;
    }

    public void name(String name){
        this.name=name;
    }

    public void showResults(){
        total=phy+che;
        percent = (float)total*100/300;
        System.out.println("Name of student is: "+ name);
        System.out.println("Total marks is: "+ total);
        System.out.println("Percentage is: "+ percent);
    }
}