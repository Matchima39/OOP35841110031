package lab3;
import  java.util.Scanner;



public class ex1 {
    public static  void  main (String[] args){

        String name;
        Scanner sc = new Scanner (System.in);

        System.out.println("What is your nickname? : ");
        name = sc.nextLine();

        System.out.println("Hello,"+name);

        //age
        System.out.println("How old are you? :");
        int age = sc.nextInt();
        System.out.println("You are "+age+"years old.");

        if (age > 30) System.out.println("You are older.");
        else  System.out.println("You are younger.");

        }


    }//main
// }//class
