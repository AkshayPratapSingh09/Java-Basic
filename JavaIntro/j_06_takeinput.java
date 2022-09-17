import java.util.Scanner;

public class j_06_takeinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:-->");
    int a = sc.nextInt();
    System.out.println("input variable: "+a);
    System.out.println("Enter the second number:-->");
    int b = sc.nextInt();
    System.out.println("input variable: "+b);
    System.out.println("Enter the third number:-->");
    float c = sc.nextFloat();
    System.out.println("input variable: "+c);
    System.out.println("Sum is: "+ (a+b));
    System.out.println("input variable: "+c);
    boolean b1 = sc.hasNextInt();
    System.out.println("Input Type is Bool : "+b1);
    System.out.println("Input any String : ");
    String s = sc.nextLine();
    System.out.println("input variable: "+s);
    
    }
}
