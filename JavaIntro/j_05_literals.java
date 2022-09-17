public class j_05_literals {
    public static void main(String[] args) {
    byte age = 34;    
    int age2 = 56;    
    short age3 = 88;    
    long ageDino = 88345754634563565l;
    char ch = 'F';
    float f1 = 7.8f;
    double d1 = 3.78;
    boolean f = true;
    String s = "Akshay";

    System.out.println("age: "+age+"    datatype:"+((Object) age).getClass().getSimpleName());
    System.out.println("age: "+age2+"    datatype:    "+((Object) age2).getClass().getSimpleName());
    System.out.println("age: "+age3+"    datatype:    "+((Object) age3).getClass().getSimpleName());
    System.out.println("ageDino: "+ageDino+"    datatype: "+((Object) ageDino).getClass().getSimpleName());
    System.out.println("Char: "+ch+"    datatype:    "+((Object) ch).getClass().getSimpleName());
    System.out.println("age: "+f1+"    datatype:    "+((Object) f1).getClass().getSimpleName());
    System.out.println("age: "+d1+"    datatype:    "+((Object) d1).getClass().getSimpleName());
    System.out.println("age: "+f+"    datatype:    "+((Object) f).getClass().getSimpleName());
    System.out.println("S: "+s+"    datatype:    "+((Object) s).getClass().getSimpleName());


    }
}
