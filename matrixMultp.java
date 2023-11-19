import java.util.Scanner;

public class matrixMultp {
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

        if(c1!=r2){
            System.out.println("Matrix Multiplication not possible!");
        }else{
            System.out.println("Enter Element of matrix 1");
            a=arr(r1,c1);
            System.out.println("Enter elements of matrix 2: ");
            b=arr(r2,c2);

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    c[i][j]=0;
                    for(int k=0;k<c1;k++){
                        c[i][j]+=a[i][k]*b[k][i];
                    }
                }
            }

            System.out.println("Matrix 1: ");
            display(a, r1, c1);
            System.out.println("Matix 2: ");
            display(b, r2, c2);
            System.out.println("Matrix 1 * Matrix 2: ");
            display(c, r1, c2);

        }
        sc.close();
    }

    static int[][] arr(int r, int c){
        int[][] arr= new int[r][c];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    static void display(int[][] arr, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
