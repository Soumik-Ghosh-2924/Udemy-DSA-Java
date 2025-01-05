import java.util.*;

public class selectionsort 
{
    public static int[] selectionSort(int arr[])
    {
        int i, j;
        int len =arr.length;
        int maxValueIndex=-1;

        for(i=0; i<len-1; i++)
        {
            maxValueIndex=i;

            for(j=i+1; j<len; j++)
            {
                if(arr[maxValueIndex]>arr[j])
                {
                    maxValueIndex=j;
                }
            }

            int temp=arr[maxValueIndex];
            arr[maxValueIndex]=arr[i];
            arr[i]=temp;
        }

        return arr;
    }

    public static void main(String[] args) 
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


        System.out.println("Elements before selection sorting : ");
        for(int x : array)
        {
            System.out.print( x + " , ");
        }
        System.out.println();
        
        int a[]= selectionSort(array);

        System.out.println("here's the sorted array : ");

        for(int x : a)
        {
            System.out.print( x + " , " );
        }

        sc.close();
        
    }
}
