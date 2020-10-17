import java.util.Scanner;
public class Taxing {
    
    public void details(){
        int date,month,year,salary;
        String name;
        double tax;
        Scanner u=new Scanner(System.in);
        System.out.print("Enter the Name: ");
        name = u.nextLine();
        System.out.print("Enter the Date of birth: ");
        date=u.nextInt();
        System.out.print("Enter the Month of birth: ");
        month=u.nextInt();
        System.out.print("Enter the Year of birth: ");
        year=u.nextInt();
        System.out.print("Enter the Salary: ");
        salary=u.nextInt();
        u.close();
        if (salary>=500000){
            tax=(0.2*salary);
            System.out.println("Tax :"+tax);
        }
        else if (salary>=400000){
            tax=(0.15*salary);
            System.out.println("Tax :"+tax);
        }
        else if (salary>=300000){
            tax=(0.1*salary);
            System.out.println("Tax :"+tax);
        }
        else if (salary>=200000){
            tax=(0.05*salary);
            System.out.println("Tax :"+tax);
        }
        else {
            System.out.println("No need to pay Tax");
        }
        System.out.println("Name: "+name);
        System.out.println("Date of birth: "+date);
        System.out.println("Month of birth: "+month);
        System.out.println("Year of birth: "+year);
        System.out.println("Salary: "+salary);

    }
    public static void main(String[] args) {
        Taxing e = new Taxing();
        e.details();
    }
}

