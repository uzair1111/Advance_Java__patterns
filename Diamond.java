import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the height of Diamond ::");
        int n = sc.nextInt();
        System.out.println("Here is your Diamond");
        
        for(int i= 1; i <= n; i++){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=2; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        
        
        }
        for(int i= n; i >= 1; i--){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=2; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        
        
        }
    
    }
}
