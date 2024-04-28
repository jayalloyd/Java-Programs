import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number x:");
        int x=input.nextInt();
        System.out.println("Enter the second number y:");
        int y=input.nextInt();
        System.out.println("Enter the third number z:");
        int z=input.nextInt();
        if (x>y&&x>z){
            System.out.println("X is the largest number"+x);
        }else if(x<y&&y>z)
        {
            System.out.println("The largest number is y"+y);

        }else System.out.println("the largest  number is z");
        input.close();

   
    }

}
