import java.util.Scanner;
public class Avenger {
    String name,power,planet,weapon;
    int age;
    Scanner sc=new Scanner(System.in);
   public void getDetails(){
        
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Power : ");
        power = sc.next();
        System.out.print("Enter Weapon : ");
        weapon = sc.next();
        System.out.print("Enter planet : ");
        planet =sc.next();
        
    }
  public void display(){
        
            System.out.println(" Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Power "+power);
            System.out.println("Weapon: "+weapon);
            System.out.println("Planet: "+planet);
    }
public static void main(String[] args) {
    Avenger[] a = new Avenger[5];
    for(int i=0;i<5;i++){
        a[i]=new Avenger();
        a[i].getDetails();
    }
    for(int i=0;i<5;i++){
    a[i].display();
    }
}
}
