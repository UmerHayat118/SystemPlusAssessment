public class DynamicProgramming {
    //Function for Problem 1: Solve Fibonnaci Problem using Memoization.

    static int[] term = new int[1000];

    static int fib(int n) {
        if(n<=1)
        {
            return n;
        }
        /*in Fibonacci series everytime until it is completely solved, we have same task to complete like calling
        fibonacci function again and again as we done in recursive approach.So Basically we have same sub problem
        everytime to solve in fibonacci.
        When the sub problem is solved for the first time its result is not saved or stored, so everytime we have to
        do it from scratch.
        */
        /*So Memoization it's not solved by scratch or again and again, We use recursion but we do not
         do further recursive calls and  reduce tasks by stroing it*/

        if(term[n]!=0)
        {
            return term[n];
        }
        else // Storing computed value of fibonacci series in term arrayat index n so it will not computed again
        {
            term[n] = fib(n - 1) + fib(n - 2);
            return term[n];
        }
    }
    //end of Problem 1

    //Function for Problem 2: Find Longest Common SubSequence in two strings.
    static void LCS(String a,String b)
    {
        int counter=0;
        System.out.print("LCS for input Sequences "+a+" and "+b+ " is ");
        for(int i=0;i<a.length();i++)//For loop to get first character of String a
        {
            for(int j=0;j<b.length();j++)//inner loop to compare first character of String a with all characters of String b
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    System.out.print(a.charAt(i));
                    counter++;
                }
            }
        }
        System.out.print(" of length "+counter);
    }
    public static void main(String[]args)
    {
        int n=5;
        System.out.println(fib(n));
        String a="ABCDGH";
        String b="AEDFHR";
        DynamicProgramming.LCS(a,b);

    }
}
