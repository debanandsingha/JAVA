public class reverseStr {
    public static void main(String[] args) {
        String s="Hello";
        
        //Using Char array
        char[] s1= s.toCharArray();
        for(int i=s1.length-1; i>=0; i--){
            System.out.print(s1[i]);
        }

        //Using StringBuilder class
        StringBuilder s3 = new StringBuilder();
        s3.append(s);
        System.out.println(s3.reverse());
    }
}
