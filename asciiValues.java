public class asciiValues {
    public static void main(String[] args) {
        for(int i=0;i<=255;i++){
            System.out.println("ASCII val of "+(char)i+" = "+i);
        }
        System.out.println();
        char ch='a';
        int x=ch;

        System.out.println("ASCII value of "+ch+" is "+x);
    }
}
