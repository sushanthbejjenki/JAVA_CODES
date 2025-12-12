public class palindrome {
    public static void main(String[] args) {
        String str = "LEVEL";
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
}
