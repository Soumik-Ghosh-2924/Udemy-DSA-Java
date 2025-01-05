import java.util.*;

public class InsertionSort
{
    public static int[] ISort(int arr[])
    {
        int i, j;
        int len =arr.length;
        for(i =1; i<len;i++)
        {
            int key=arr[i];
            j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

            for(int y : arr)
            {
                System.out.print(y + " ");
            }
            System.out.println();
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


        System.out.println("Elements before insertion sorting : ");
        for(int x : array)
        {
            System.out.print( x + " , ");
        }
        System.out.println();
        
        int a[]= ISort(array);

        System.out.println("here's the sorted array : ");

        for(int x : a)
        {
            System.out.print( x + " , " );
        }

        sc.close();
        
    }
}
