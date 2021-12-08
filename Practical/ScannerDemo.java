import java.util.Scanner;
public class ScannerDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter No1 : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter No2 : ");
        int num2 = sc.nextInt();

        int num3 = num1 + num2;

        System.out.println("Answer : "+num3);
    }
}