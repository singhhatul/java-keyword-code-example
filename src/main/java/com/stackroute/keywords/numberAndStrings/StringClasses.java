package com.stackroute.keywords.numberAndStrings;

class StringClasses
{
    public static void main (String[] args)
    {
        String s= "Atul_Singh";
        // or String s= new String ("GeeksforGeeks");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());

        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                + s.charAt(3));

        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));

        // Concatenates string2 to the end of string1.
        String s1 = "Atul";
        String s2 = "Singh";
        System.out.println("Concatenated string  = " +
                s1.concat(s2));

        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "stack route";
        System.out.println("Index of stack " +
                s4.indexOf("stack"));

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " +
                s4.indexOf('a',3));

        // Checking equality of Strings
        Boolean out = "Atul".equals("atul");
        System.out.println("Checking Equality  " + out);
        out = "Atul".equals("atul");
        System.out.println("Checking Equality  " + out);

        out = "Atul".equalsIgnoreCase("aTuL ");
        System.out.println("Checking Equality " + out);

        int out1 = s1.compareTo(s2);
        System.out.println("If s1 = s2 " + out);

        // Converting cases
        String word1 = "ATUL";
        System.out.println("Changing to lower Case " +
                word1.toLowerCase());

        // Converting cases
        String word2 = "atul";
        System.out.println("Changing to UPPER Case " +
                word1.toUpperCase());

        // Trimming the word
        String word4 = " Atul SIngh ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "singhhhatul";
        System.out.println("Original String " + str1);
        String str2 = "atulsinghhh".replace('s' ,'l') ;
        System.out.println("Replaced s with l -> " + str2);
    }
}
