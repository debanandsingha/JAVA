import java.util.Scanner;
public class matrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int c[][] = new int[4][4];

        int r1,c1,r2,c2;
        System.out.println("Matrix 1");
        System.out.print("Row: ");
        r1=sc.nextInt();
        System.out.print("Column: ");
        c1=sc.nextInt();

        System.out.println("Matrix 2");
        System.out.print("Row: ");
        r2=sc.nextInt();
        System.out.print("Column: ");
        c2=sc.nextInt();

        //Matrix Addition Condition
        if(r1!=r2 && c1!=c2){
            System.out.println("Matrix Addition Not Possible");
        }else{
            System.out.println("Enter elements of Matrix 1");
            a=arr(r1,c1);
            System.out.println("Enter elements of matrix 2");
            b=arr(r2,c2);
            
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            
            System.out.println("Matrix 1: ");
            display(a, r1, c2);
            System.out.println("Matrix 2: ");
            display(b, r2, c2);
            System.out.println("Matrix 1 + Matrix 2: ");
            display(c, r2, c2);
        }
        sc.close();
    }

    //Function to return an array
    static int[][] arr(int r, int c){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    //FUnction to take an array as parameter
    static void display(int arr[][],int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
