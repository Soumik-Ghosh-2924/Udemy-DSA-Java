import java.util.*;

public class Bsearch
{
    public int binarySearch(int arr[], int target)
    {
        int steps=0;
        int left=0;
        int right = arr.length-1;

        while(left<=right)
        {
            steps++;
            int mid=left+(right-left)/2;

            if(arr[mid]==target)
            {

                System.out.println("The number of steps taken by Binary Search : "+steps);
                return mid;
            }
            else if (arr[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }

        System.out.println("The number of steps taken by binary search : "+steps);
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");

        int size= sc.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be searched : ");
        int target = sc.nextInt();

        Bsearch obj = new Bsearch();
        int val = obj.binarySearch(arr, target );



        if(val!=-1)
        {
            System.out.println("The element has been found at " + val + " positon/index of the array");
        }
        else
        {
            System.out.println("The element is missing in the array. ");
        }

        sc.close();
    }
}