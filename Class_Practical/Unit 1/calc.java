import java.util.Scanner;
class calc
{
    public static void main(String[] args)
    {
       char operator;
       double n1, n2, result;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1 = input.nextDouble();
        System.out.println("Enter second number: ");
        n2 = input.nextDouble();

        System.out.println("Enter operator: ");
        operator = input.next().charAt(0);

        switch(operator)
        {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}