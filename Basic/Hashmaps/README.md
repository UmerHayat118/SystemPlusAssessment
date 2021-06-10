# Hashmaps Problems:

## Problem 1: Shared SubStrings between Two Strings

    Given two strings return a boolean indicating that the two
    strings share a substring between each other.

    Example:

        'abcd' and 'cde' returns 1;
        'abc' and 'xyz' returns 0;

        Function Description

        Complete the function shareSubString with following details:

        shareSubString has the following parameter(s):
        string a: first string
        string b: second string

        Returns
        bool: 1 or 0


    Command/Script to Run Problem 1:
        String a="abcd";
        String b="cde";
        int res=Hashmaps.shareSubString(a,b);
        System.out.print(res);
    ________________ (Fill this in when submitting)

## Problem 2: Comparsion Of Two Maps

    Given two maps return a boolean indicating the equailty of two maps.

    Note: the order of the keys do not matter

    Example:

        Hashmap x  = {a:1,b:2,c:3}, Hashmap b={c:3,b:2,a:1} returns 1;

        Hashmap x'  = {a:1,b:2,d:3}, Hashmap b={x:3,c:2,a:1} returns 0;

    Questions:

        Can we use this method to return how many elements match between two maps?
        Yes,if we implement the solution mannualy matching 1 key value pairs with others(We can increment count each time a key value pair matches with the 2nd Hashmap key     value)

    Command/Script to Run Problem 2: 
    HashMap<String,Integer>x=new HashMap<>();
        x.put("a",1);
        x.put("b",2);
        x.put("c",3);
        HashMap<String,Integer>b=new HashMap<>();
        b.put("c", 3);
        b.put("b", 2);
        b.put("a", 1);
        CompareMaps(x,b);
    ________________ (Fill this in when submitting)
