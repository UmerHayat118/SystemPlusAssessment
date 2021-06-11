public class GreedyAlgorithms
{
    static void findAbsMin(int a[])
    {
        int n=a.length;
        if(n<2)
        {
            return;
        }
        int result=a[1]-a[0];//intitializing result variable (subtracting first element from second element)

        for (int i=2;i<n;i++)//for loop to traverse elements of array
        {
            result=a[i]-a[i-1];//changing result
        }

        result=a[n-1]-a[0];
        System.out.print("Minimum Absolute Difference="+result);
    }

    public static void main(String[]args)
    {
        int a[] = {10,12,13,15,10};
        GreedyAlgorithms.findAbsMin(a);
    }
}
