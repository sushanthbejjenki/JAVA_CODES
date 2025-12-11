import java.util.Scanner;


public class votingsimulator {
     public static void main(String[] args) {

            int bjpVotes=51;
            int congressVotes=43;
            int tdpVotes=32; 
            int ysrcpVotes=43;
            int janasenaVotes=75;
            int trsVotes=67;   
           
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name:");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");           
            int age = sc.nextInt();
        

         if (age >= 18) {
             System.out.println(name + " You are eligible to vote.");
             System.out.println("BJP, CONGRESS, TDP, YSRCP, JANA SENA,TRS");
             Scanner scanner = new Scanner(System.in);
             System.out.print("Enter your vote: ");
             String vote = scanner.nextLine();
             if(vote.equals("BJP"))
             {
                bjpVotes++;
                System.out.println("BJP- " + bjpVotes);
             }
            if 
                (vote.equals("TDP"))
             {
                tdpVotes++;
                 System.out.println("TDP- " + tdpVotes);
                
             }
             if (vote.equals("CONGRESS"))
             {
                congressVotes++;
                 System.out.println("CONGRESS- " + congressVotes);
             }
             if (vote.equals("YSRCP"))
             {
                ysrcpVotes++;
                System.out.println("YSRCP- " + ysrcpVotes);
             }
             if (vote.equals("JANA SENA"))
             {
                janasenaVotes++;
                 System.out.println("JANASENA- " + janasenaVotes);
             }
             if (vote.equals("TRS"))
             {
                trsVotes++;
                System.out.println("TRS- " + trsVotes);
             }
             System.out.println("Thank you for voting " + name + "!");


         } else {
             System.out.println(name + " You are not eligible to vote.");
         }
         
         
        
        
         
        
         

     }
}