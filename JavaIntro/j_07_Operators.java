
public class j_07_Operators {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        int i = 45;
        int j = 67;
        
        System.out.println("\nArithmetic Operators::--");
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" X "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        i++; //--> ++ (Arithmetic Operator)
        System.out.println("i is "+i);
        i--; //--> -- (Arithmetic Operator)
        System.out.println("i is "+i);
        j+=5; //--> += (Assignment Operator)
        System.out.println("j is "+j);
        System.out.println("\nComparison Operators::--");
        System.out.println("a == b is "+(a==b));
        System.out.println("a >= b is "+(a>=b));
        System.out.println("a <= b is "+(a<=b));
        
        System.out.println("\nRelational Operators::--");
        if (a>b && b<100){
            
            System.out.println("&& : Operators used for giving multiple condition");
            System.out.println("a>b && b<100");
            // System.out.println("a <= b is "+(a<=b));
          
        }

    }
}


// Arithmetic Operators --> -, +, /, %, ++, --
// Assignment Operators --> =, +=
// Comparison Operators --> ==, <=, >=
// Logical Operators --> &&, ||, !
// Logical Operators --> &, |, (operates bitwise)

// Notes::
//-->  Arithmetic Operators doesnt work with bools
//-->  % operators can work on floats and doubles


