import java.util.*;

public class tSearch 
{
    public int TernarySearch(int arr[], int left , int right, int key)
    {
        int steps=0;
        int mid1= left + (right-left)/3;
        int mid2= right - (right-left)/3;

        while(right>=left)
        {
            steps++;
            if(arr[mid1]==key)
            {
                System.out.println("no of steps taken : "+steps);
                return mid1;
            }
            if(arr[mid2]==key)
            {
                System.out.println("no of steps taken : "+steps);
                return mid2;
            }

            if(key<arr[mid1])
            {
                right=mid1-1;
            }
            else if(key>arr[mid2])
            {
                left=mid2+1;
            }
            else
            {
                left=mid1+1;
                right=mid2-1;
            }
        }
        return -1;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array : ");
        int size= sc.nextInt();

        int arr[]= new int[size];

        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be searched : ");
        int key= sc.nextInt();

        tSearch ob = new tSearch();
        int val =ob.TernarySearch(arr, 0, size-1, key);

        if(val==-1)
        {
            System.out.println("The element is missing in the array .");
        }
        else
        {
            System.out.println("The element is found at index : "+ val);
        }

        sc.close();

    }
    

}
