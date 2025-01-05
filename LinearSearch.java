import java.util.*;

public class LinearSearch 
{
    public static int LSearch(int array[], int key)
    {
        for(int i=0;i<array.length; i++)
        {
            if(array[i]==key)
            {
                return 1;
            }
        }

        return -1;
    }




    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size = sc.nextInt();

        int array[]= new int [size];

        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<size; i++)
        {
            array[i]=sc.nextInt();
        }

        System.out.println("Enter the key to be found :");
        int key=sc.nextInt();

        int val=LSearch(array, key);

        if(val!=1)
        {
            System.out.println("Element is missing.");
        }
        else{
            System.out.println("Element is present.");
        }

        sc.close();
        
    }
    
}
