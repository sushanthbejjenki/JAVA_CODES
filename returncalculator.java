public class returncalculator {
    public static void main(String[] args) {
       int a=10;
       int b=20;
       
       int sum=add(a,b);
       System.out.println("Sum of a and b is: " + sum);
       
       int difference=subtract(b,a);
       System.out.println("Difference of b and a is: " + difference);

       int multiply=a*b;
       System.out.println("mutiplication of a and b is  : " + multiply);

       int division =a/b;
       System.out.println("division od a by b is :" +division);

       int modulo =a%b;
       System.out.println("modilo of a by b is : " +modulo);

    }
    
    public static int add(int a, int b){
        return a + b;
    }
    
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int modulo(int a, int b){
        return a % b;
    }

}