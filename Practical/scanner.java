import java.util.Scanner;
public class scanner {
    public static void main(String[] args)
    {
        System.out.println("Enter No1 : ");
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();

        System.out.println("Enter No2 : ");
        int no2 = sc.nextInt();
        
        int no3 = no1 + no2;

        System.out.println("Answer : "+no3);
    }
}
