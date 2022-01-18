import java.util.Scanner;
// Done... uploaded to git...✔

// ----- implementing the concept of ternary operator
public class TernaryOperator {
    int x, y, z;
    TernaryOperator()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three integer values:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
    }
    public void nested_ternary()
    {
        //------ logic of Ternary operator or we can say Syntax:
        int maxnumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The Greatest numbers is:  "+maxnumber);
    }
}
class ternarytest
{
    public static void main(String[] args) {
        TernaryOperator obj = new TernaryOperator();
        obj.nested_ternary();
    }
}
