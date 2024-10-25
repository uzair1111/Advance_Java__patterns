import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the height of Butterfly ::");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("It's a caterpillar");
        } else {
            System.out.println("Here is your butterfly");
        }
        for(int i= 1; i <= (n*2); i++){
            for(int j = 0; j<=n*2; j++){
                if(i>n+1 && ((j > ((n*2)-i)) && (j<i))){
                    System.out.print(" ");
                } else if(i>j || j>((n*2)-i) || i == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
