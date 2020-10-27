package app;

/**
 * Exam
 */
public class Exam {

    private int phy,che,total;
    private int max_physics, max_chemistry;
    private float percent;
    private String name;

    public Exam(){
        max_physics=100;
        max_chemistry=100;
        name="swapnil";
    }

    public Exam(int marks){
        max_physics=marks;
        max_chemistry=marks;
    }

    public void chemistry(int c){
        if(c >=0 && c<=max_chemistry){
            che=c;
        }else{
            System.out.println("invalid value for chemistry must be between 1-"+max_chemistry);
        }
    }

    public void physics(int p){
        if(p >=0 && p<=max_physics){
            phy=p;
        }else{
            System.out.println("invalid value for physics must be between 1-"+max_physics);
        }
    }

    public void name(String name){
        this.name=name;
    }

    public void showResults(){
        total=phy+che;
        percent = (float)total*100/(max_chemistry+max_physics);
        System.out.println("chemistry mark is: "+ che);
        System.out.println("physics mark is: "+ phy);
        System.out.println("Total marks is: "+ total);
        System.out.println("Percentage is: "+ percent);

        
        System.out.println("name: "+ name);
    }
}