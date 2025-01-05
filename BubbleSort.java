import java.util.*;

public class BubbleSort 
{
    public static int[] bubbleS(int arr[])
    {
        int len= arr.length;

        for(int i=0;i<len-1; i++)
        {
            for(int j=0;j<len-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;


    }

    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();

        int array[]= new int[size];

        System.out.println("Enter the elements of the array : ");

        for(int i=0;i<size ; i++)
        {
            array[i]=sc.nextInt();
        }
        
        int a[]= bubbleS(array);

        System.out.println("here's the sorted array : ");

        for(int x : a)
        {
            System.out.print(x+" , " );
        }

        sc.close();
    }
    
}
