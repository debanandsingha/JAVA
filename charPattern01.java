
public class charPattern01{

    public static void main(String[] args){
        int alphabet=65;
        //Repeating pattern
        for(int i=0; i<=5; i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+i));
            }
            System.out.println();
        }

        //Non-Repeating pattern
        for(int i=0; i<=5; i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+j));
            }
            System.out.println();
        }
        
    }
}