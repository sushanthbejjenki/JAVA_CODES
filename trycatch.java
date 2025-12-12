public class trycatch {
    public static void main(String[] args) {
        int a= 10;
        int b=0;
        try {
            int c=a/b;
            System.out.println("result : " +c);
        }
        catch (Exception e) {
            System.out.println("Exception is : " + e.getMessage());

        }
        }
    }
    

