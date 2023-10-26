
import java.util.Scanner;

public class magic8 {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball");
        System.out.println("What is your wish?:");
        String wish = p.nextLine();

        int wishNumber = (int)(Math.random()*10);
        
        if (wishNumber == 1) {
            
        } else if (wishNumber == 2) {
            System.out.println("Yes");
        } else if (wishNumber == 3) {
            System.out.println("My reply is no");
        } else if (wishNumber == 4) {
            System.out.println("It is certain");
        } else if (wishNumber == 5) {
            System.out.println("Cannot predict now");
        } else if (wishNumber == 6) {
            System.out.println("Signs point to yes");
        } else if (wishNumber == 7) {
            System.out.println("Outlook not so good");
        } else if (wishNumber == 8) {
            System.out.println("reply hazy, try again");
        } else if (wishNumber == 9) {
            System.out.println("Most likely");
        } else {
            System.out.println("My sourcess say no");
        }
        
    }
}