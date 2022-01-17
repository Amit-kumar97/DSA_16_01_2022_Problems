import java.util.Scanner;

// find the maximun sum of consecutive k array elements
public class WindowSum {
    public static void main(String[] args) {
        int[] ar ={2,3,5,4,8,6,1};
        //frame size getting from the user
        int frame = new Scanner(System.in).nextInt();
        //initialize the maxsum var with min_value
        int maxsum = Integer.MIN_VALUE;
        // nested loop for writing the logic
        for(int i=0; i<ar.length-frame; i++)
        {
            int framesum = 0;
            for(int j=i; j<i+frame; j++)
            {
                framesum = framesum+ar[j];
            }
            maxsum = maxvalue(maxsum, framesum);
        }
        System.out.println("Maximum Sum of Consecutive terms:"+maxsum);
    }
    public static int maxvalue(int maxsum, int framesum)
    {
        if (maxsum>framesum)
            return maxsum;
        else
            return framesum;
    }
}
