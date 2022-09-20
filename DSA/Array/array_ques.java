import java.util.Scanner;

public class array_ques {

    public static void main(String[] args) {
        // int x;
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        for (int i =0; i<nums.length;i++){
            System.out.println("Enter the value for index "+i+" ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search : ");
            int x = sc.nextInt();
        for (int i =0; i<nums.length;i++){
            System.out.println("Here i : "+i);
            if (nums[i] == x){
                System.out.println("Found "+x+" at location : "+i);
                break;
            }
        }
    }
}
