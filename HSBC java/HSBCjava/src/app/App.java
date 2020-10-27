package app;

public class App {
    public static void main(String[] args) throws Exception {
        // int physics,chemistry,maths,total;
        // float percentage;
        // physics=90;
        // chemistry=90;
        // maths=91;
        // total=physics+chemistry+maths;
        // percentage=(float)total*100/300;
        // System.out.println("this is the percentage:"+percentage);

        // if( percentage>=90){
        //     System.out.println("Grade A");
        // }else if(percentage>=80){
        //     System.out.println("Grade B");
        // }else if(percentage>=70){
        //     System.out.println("Grade C");
        // }else{
        //     System.out.println("Failed");
        // }
//....................................................
        Exam student =new Exam();
        
        student.name("hello");
        student.physics(90);;
        student.chemistry(94);;
        student.showResults();
//....................................................

        // Maths ta = new Maths();

        // ta.addValues(10, 20);
        // ta.name("swapnil");

//.................................................... inheritance

            One one = new One();
            one.mess();
            one.welcome();
    }
}