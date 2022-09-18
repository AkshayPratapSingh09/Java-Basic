import java.util.Scanner;

public class j_06_takeinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    // Types of Input::-->
    // nextBoolean()
    // nextByte()
    // nextDouble()
    // nextFloat()
    // nextInt()
    // nextLine()
    // nextLong()
    // nextShort()


    // System.out.println("Enter the first number:-->");
    // int a = sc.nextInt();
    // System.out.println("input variable: "+a);
    // System.out.println("Enter the second number:-->");
    // int b = sc.nextInt();
    // System.out.println("input variable: "+b);
    // System.out.println("Enter the third number:-->");
    // float c = sc.nextFloat();
    // System.out.println("input variable: "+c);
    // System.out.println("Sum is: "+ (a+b));
    // System.out.println("input variable: "+c);
    // boolean b1 = sc.hasNextInt();
    // System.out.println("Input Type is Bool : "+b1);
    // System.out.println("Input any String : ");
    // String s = sc.nextLine();
    // System.out.println("input variable: "+s);
    
    
    // Take a whole line as a input
    System.out.println("Enter a Line String input: ");
    String s = sc.nextLine();
    System.out.println("input variable: "+s+" DT: "+s.getClass().getSimpleName());
    
    // Take only a word as an input
    System.out.println("Enter any word String input: ");
    String f = sc.next();
    System.out.println("input variable: "+f+" DT: "+f.getClass().getSimpleName());

    // System.out.println("Enter an String input: ");
    // String g = sc.next();
    // System.out.println("input variable: "+g+" DT: "+g.getClass().getSimpleName());

    int number;
    
    // --> Take input in the same line
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number: ");
    number = input.nextInt(); 
    System.out.print("Number: "+number);
    input.close();
    
    
    
    }
}
