public class Pattern {
    public static void main(String [] args)
    {
        int a = 10, i, j;
        System.out.println("Displaying the pattern below: ");
        for(i = 0; i < a; i++)
        {for(j = 0; j <= i; j++)
        {
            System.out.print("*");
        }
            System.out.println();
        }
    }
}