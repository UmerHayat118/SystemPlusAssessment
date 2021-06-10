public class Basic_Arrays
{
    static void rotLeft(int a[], int d)
    {
        int[]temp=new int[d];
        for(int i=0;i<d;i++)//storing number of d variables in temp array
        {
            temp[i]=a[i];
        }
        for(int i=0;i<a.length-d;i++)//shifting other elements to the start of array
        {
            a[i]=a[i+d];
        }
        int counter=0;
        for(int i=a.length-d;i<a.length;i++)//storing d elements at the end of array
        {
            a[i]=temp[counter];
            counter++;
        }

        for(int i=0;i<a.length;i++)// Displaying entire array after left rotation
        {
            System.out.println(a[i]);
        }

    }
    static void ArrayReversal(int a[]) //Function will be same as Left Rotation,we just use length of recieved array instead of d
    {
        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++)//storing number of d variables in temp array
        {
            temp[i] = a[i];
        }
        for (int i = 0; i < a.length - a.length; i++)//shifting other elements to the start of array
        {
            a[i] = a[i + a.length];
        }
        int counter = 0;
        for (int i = a.length - a.length; i < a.length; i++)//storing d elements at the end of array
        {
            a[i] = temp[counter];
            counter++;
        }
        for(int i=0;i<a.length;i++)// Displaying array
        {
            System.out.println(a[i]);
        }
    }
public static void main(String[]args)
{
    int array[]=new int[4];
    array= new int[]{1, 2, 3, 4, 5};
    Basic_Arrays.ArrayReversal(array);
}
}
