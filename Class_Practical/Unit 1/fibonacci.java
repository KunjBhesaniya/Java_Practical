public class fibonacci
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        int i = 3;
        while (i <= n)
        {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            i++;
        }
        System.out.println(f3);
    }
    
}
