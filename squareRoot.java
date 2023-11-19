public class squareRoot {
    public static void main(String[] args) {
        double x=4;
        System.out.println(Math.sqrt(x));

        sqrRoot(25);
    }

    //Logic to find square root of a number
    static void sqrRoot(int n){
        double temp;
        double sqrt=n/2;

        do{
            temp=sqrt;
            sqrt=(temp+(n/temp))/2;
        }while((temp-sqrt)!=0);

        System.out.println("Sqrt: "+temp);
    }
}
