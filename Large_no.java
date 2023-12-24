import java.util.Scanner;

public class Large_no{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
      

        System.out.println("Enter a 1st number :");
        int num1 = obj.nextInt();

        System.out.println("Enter a 2nd Number :");
        int num2 = obj.nextInt();

        int larger_no;

        if(num1>num2){
            larger_no = num1;
        }else{
            larger_no = num2;
        }

        System.out.println("The larger number is:"+ larger_no);

    }
}