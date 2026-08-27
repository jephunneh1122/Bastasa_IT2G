import java.util.Scanner;

public class Activity1 {

    public void userGreeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter birth year: ");
        int byear = sc.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Greetings "+name);
        System.out.println("Your Age is: "+(2026-byear));
        System.out.println("---------------------------------");
    }

}
