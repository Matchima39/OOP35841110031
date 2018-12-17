package lab4;
import com.sun.javafx.scene.EnteredExitedHandler;
import com.sun.org.apache.xpath.internal.operations.Mult;

import  java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter integer 1:");
        x = sc.nextInt();
        System.out.println("Enter integer 2:");
        y = sc.nextInt();
        //call methods
        System.out.println("sum = "+sumt(x,y));
        System.out.println("Mul = "+subt(x,y));
        System.out.println("Mul = "+mult(x,y));
        System.out.println("div = "+divt(x,y));
    }//main

    private static int divt(int x, int y){
        return x / y;
    }

    private static int mult(int x, int y){
        return x * y;
    }

    private static int subt(int x, int y){
        return x - y;
    }


    private static int sumt(int x, int y){
        return x + y;
    }
}
