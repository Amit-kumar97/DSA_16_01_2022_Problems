import java.util.ArrayList;
import java.util.Scanner;
// a program to input the elements of a two- dimensional array. Then from this array, make two arrays one
// that stores all odd elements of the two-dimensional array and the other that stores all even elements of the array.
// Note:-  Resulting arrays will be of ArrayList type
public class Two_D_Array {
    int ar[][];
    int m;
    int n;
    Two_D_Array()                                          // Constructor
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Column respectively:");
        m = sc.nextInt();
        n = sc.nextInt();
        ar = new int[m][n];
        System.out.println("Enter the Elements of Array:");                         // uSer Input
        for (int i=0; i<ar.length; i++)
        {
            for (int j=0; j<ar[i].length; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
    }
    public void display()                                                      // Array Display Method
    {
        System.out.println("2D Array Representation:");
        for(int i=0; i< ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void oddEven()                                      // Selecting Odd And Even Element From the Array
    {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i< ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j]%2==0)
                {
                    even.add(ar[i][j]);
                }
                else
                {
                    odd.add(ar[i][j]);
                }
            }
        }
        System.out.println("Even Numbers:");
        System.out.println(even);
        System.out.println("Odd Number:");
        System.out.println(odd);
    }
}
class Two_D_Arraytest{                                            //Execution CLass
    public static void main(String[] args) {
        Two_D_Array obj = new Two_D_Array();
        obj.display();                                           // Calling Display Method
        obj.oddEven();                                           // Calling OddEven Method
    }
}
