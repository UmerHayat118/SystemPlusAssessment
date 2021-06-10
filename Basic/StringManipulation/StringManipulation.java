public class StringManipulation
{
    static double SimilarityIndexGenome(String a[], String b[])
    {
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]==b[i])
            {
                count++;
            }
        }
        double dcount=count;
        double length=a.length;
        return (dcount/length)*100;
    }

    static void RemoveChar(String a, char ch)
    {
        String s=String.valueOf(ch);
        a=a.replace(s,"");//replacing given char
        System.out.print(a);
    }
    public static void main(String[]args) {
        String[] a = {"A","T","A","T","G","T","A","T","G"};
        String[] b = {"A","T","A","T","A","T","A","T","G"};
        double res=StringManipulation.SimilarityIndexGenome(a, b);
        //System.out.print(res);
        String str="We Are Your Technology Partners";

        RemoveChar(str,' ');
    }
}

