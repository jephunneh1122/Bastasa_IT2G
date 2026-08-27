import java.util.Scanner;
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("-------------------------------");
    System.out.println("-----PORTFOLIO OF ACTIVITY-----");
    System.out.println("NAME: MIKE GWAPO");
    System.out.println("SECTION AND YEAR: IT2G");
    System.out.println("-----------CONTENTS------------");
    System.out.println("1. Activity 1");
    System.out.println("-------------------------------");
    System.out.print("Enter Selection: ");
    int select = sc.nextInt();
    System.out.println("-------------------------------");

    if(select == 1){
        Activity1 act1 = new Activity1();
        act1.userGreeting();
    }else{
        System.out.println("Selection Not Found");
    }

}