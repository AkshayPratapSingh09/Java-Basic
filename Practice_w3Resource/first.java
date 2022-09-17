// Write a Java program to convert 
// temperature from Fahrenheit to Celsius degree.

import java.util.Scanner;

public class first {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a degree in Fahrenheit:-->");
    int a = sc.nextInt();
    int c = ((a-32)*5)/9;
    System.out.println("The temp in Celcius is "+c+" C.");    
}
}