import java.util.Scanner;
public class test{
     public void inp(){
        int m,p,c,b,z;
        float percent;
        char grade;
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the marks: ");
        m = n.nextInt();
        System.out.print("Enter the marks: ");
        p=n.nextInt();
        System.out.print("Enter the marks: ");
        c=n.nextInt();
        System.out.print("Enter the marks: ");
        b=n.nextInt();
        System.out.print("Enter the marks: ");
        z=n.nextInt();
        n.close();
        percent=(m+p+b+c+z)/5;
        System.out.println("Percentage: "+percent);
        if (percent >= 90){
            grade='A';
            System.out.println("Grade: "+grade);
            }
        else if ((percent >75) & (percent <90)){
            grade='B';
            System.out.println("Grade: "+grade);
        }
        else if ((percent >=50) & (percent <75)){
            grade='C';
            System.out.println("Grade: "+grade);
        }
        else if ((percent>=35) & (percent<50)){
            grade='D';
            System.out.println("Grade: "+grade);
        }
        else{
            System.out.println("Fail");
        }
        }
     public static void main(String[] args) {
         test a = new test();
         a.inp();
        

     }
}
    