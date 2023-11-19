import java.util.Scanner;
public class prime{

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr num: ");
        n=sc.nextInt();

        if(n==0 || n==1){
            System.out.println("Not Prime!");
        }else{
            int flag=0;
            for(int i=2; i<=n; i++){
                if(n%2==0){
                    System.out.println("Not Prime!");
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Prime!");
            }
        }
        
        
    }
}