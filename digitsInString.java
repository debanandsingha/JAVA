public class digitsInString {
    public static void main(String[] args) {
        String s = "Hello 2024";
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
        }

        System.out.println("No of digits: "+count);
    }
}
