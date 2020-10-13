
public class Employee{
        int age=23;
        String name="Saurabh";
        String city="chennai";
        public void display(){
            System.out.println("The name is " + name);
            System.out.println("Age is "+age);
            System.out.println("City is "+city);
        }
            public static void main(String[] args){
                Employee n = new Employee();
                n.display();
        }
}
