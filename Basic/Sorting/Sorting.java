import java.util.Arrays;

public class Sorting
{

    //Function for Poblem 1:Distribute An Array of Numbers around a given pivot
    public void DistributeArray(int[] array,int b) {
        sort(array, b,array.length-1);
    }

    private void swap(int[] array, int i, int j)// function to swap variables(when changing values around pivot)
    {
        if (i>=0 && j>=0 && i<array.length && j<array.length)
        {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
    private void sort(int[] array, int b, int r)
    {
        if(b<r)//pivot element on position b
        {
            int pivot=array[b];
            int i=b;// partition and shuffle around pivot
            int j=r;
            while(i<j)//move right to not override pivot element
            {
                i+=1;
                while(i<=r && array[i]<pivot)//while loop to traverse and Find elements greater than pivot
                {
                    i+=1;
                }
                while (j>=b && array[j]>pivot) //while loop to traverse and Find elements smaller than pivot
                {
                    j-=1;
                }
                if (i<=r && i<j)
                {
                    swap(array, i, j);//swap around pivot
                }
            }
            swap(array, b, j);//Put pivot in correct place

            sort(array, b, j - 1);//Sort partitions
            sort(array, j + 1, r);
        }
    }
    //End Problem 1


}
