import java.util.HashMap;

public class Hashmaps
{
    //FUnction for Problem 1: Shared SubStrings between Two Strings
    static int shareSubString(String a, String b)
    {
        int count=0;
        for(int i=0;i<a.length();i++)//outer loop to traverse 1 character of first string with complete second string
        {
            for(int j=0;j<b.length();j++)//inner loop to travers second string characters
            {
                if(a.charAt(i)==b.charAt(j))//condition to check char is equal or not
                {
                    count++;//every time char is equal count will be incremented
                }
            }
        }
        if(count>=1)
        {
            return 1;//return 1 if string b has some of characters as sub string of string a
        }
        if(count==0)
        {
            return 0;//return 0 if not a substring
        }
        return 0;

    }

    //Function for Problem 2: Comparsion Of Two Maps
    static int CompareMaps(HashMap<String, Integer> x,HashMap<String, Integer> b)
    {
        if(x.equals(b))//using equals method of java to compare both maps
        {
            return 1;
        }
        else
            return 0;
    }
    public static void main(String[]args)
    {
        //String a="abcd";
        //String b="cde";
        //int res=Hashmaps.shareSubString(a,b);
        //System.out.print(res);

        HashMap<String,Integer>x=new HashMap<>();
        x.put("a",1);
        x.put("b",2);
        x.put("c",3);
        HashMap<String,Integer>b=new HashMap<>();
        b.put("c", 3);
        b.put("b", 2);
        b.put("a", 1);
        CompareMaps(x,b);
    }
}
