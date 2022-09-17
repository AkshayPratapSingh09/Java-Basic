public class j_04_datatypes {
    public static void main(String[] args) {
        byte num1 = 127;
        short num2 = 129;
        int num3 = 33000;
        long num4 = 55000l;
        // String[] arr = new String[5];
        // System.out.println(arr.getClass().getSimpleName());
        // for 
        System.out.println("Byte datatype: "+num1);
        System.out.println(((Object) num1).getClass().getSimpleName());
        System.out.println("short datatype: "+num2);
        System.out.println(((Object) num2).getClass().getSimpleName());
        System.out.println("int datatype: "+num3);
        System.out.println(((Object) num3).getClass().getSimpleName());
        System.out.println("long datatype: "+num4);
        System.out.println(((Object) num4).getClass().getSimpleName());
        
        System.out.println("Any datatype has range: 2** (8 * number of bits they take in memory) / 2");
        
    }
}

// for primitive data type we use
// ==> ((Object) num1).getClass().getSimpleName()
// 
// While for Non-Primitive Datatype we use
// ==> arr.getClass().getSimpleName()