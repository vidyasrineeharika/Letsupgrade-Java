import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        int arr[]= new int[5];
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integers:");
        for(int i=0; i<5; i++) {
            arr[i] = s.nextInt();
    }
    s.close();
    for(int i=0; i<5; i++) {
        sum+=arr[i];
    }
    System.out.println(sum);
}
}
