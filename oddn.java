import java.util.Scanner;
public class oddn {
    
    public static void main(String[] args) {
    int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Integers: ");
        
        for(int i=0; i<5; i++) {
            a[i] = sc.nextInt();
            
        }
        sc.close();
        System.out.println("Odd Numbers");
        
        for(int i=0; i<5; i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
            
        }
        
    }
    
}

