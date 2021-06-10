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
    
}

