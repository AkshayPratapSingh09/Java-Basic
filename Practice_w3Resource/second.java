// Write a Java program that reads a number in inches, 
// converts it to meters

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value for inch:");
        float i = input.nextFloat();
        System.out.println(i+" inch is "+(i*0.0254)+" meters.");
    }
}
