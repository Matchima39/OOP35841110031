package lab3;

import java.util.Scanner;

public class ex2 {

        public static   void  main (String[] args){

            String name;
            Scanner sc = new Scanner (System.in);
            Scanner mm = new Scanner(System.in);

            System.out.println("What is your nickname? : ");
            name = sc.nextLine();

            System.out.println("Hello,"+name);

            //age
            System.out.println("How old are you? :");
            int age = mm.nextInt();
            System.out.println("You are "+age+"years old.");

            if (age > 30) System.out.println("You are older.");
            else  System.out.println("You are younger.");

            String sex;
            System.out.println("เพศอะไร:");
            sex = sc.nextLine();

            System.out.println("เพศ"+sex+" ");


            System.out.println("ที่อยู่? :");
            String add = sc.nextLine();
            System.out.println("ที่อยู่"+add+" ");

            System.out.println("เบอร์โทร? :");
            String phon = sc.nextLine();
            System.out.println("เบอร์โทร"+phon+" ");






        }
}
