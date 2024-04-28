import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter an integer number:s");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if (n%2==0){
            System.out.println("The entered number is an even number");
        }else 
        System.out.println("The number is an odd number");
input.close();
    }
}
