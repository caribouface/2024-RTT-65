package org.jonathonstephens.introductiontojavabasics;
/*
-Sequence of characters - String variable
-String is immutable - means that the state of the string object cannot change
after it is created.
-We can change the reference to it (WHAT IT HOLDS OR REPRESENTS)
but we cannot change the OBJECT itself
 */
public class StringPractice {
    public static void main(String[] args) {
        /*
        Creates a new String object (heap
        Creates a literal "Welcome" in the STRING CONSTANT POOL
         */
        String s = new String("Welcome");

        /*
        String literal
        Since the String already exists in the constant pool,
        the JVM doesn't create a new string in the constant pool.
         */
        String s1 = "Welcome";
        String s2 = " Welcome ";
        String s3 = "welcome";

        //length:
        int length = s2.length(); //9 is the number of characters
        System.out.println(length);
        int length1 = s1.length(); //7 characters
        System.out.println(length1);

        //isEmpty method - it returns TRUE if the length of the string is ZERO
        String s4 ="";   // length is ZERO // null string
        int length2 = s4.length();
        System.out.println(length2);
        String s5 =" ";  // length is 1
        int length3 = s5.length();
        System.out.println(length3);
        boolean emptyOrNot = s4.isEmpty(); //TRUE
        System.out.println(emptyOrNot);
        boolean emptyOrNot2 = s5.isEmpty(); //FALSE
        System.out.println(emptyOrNot2);

        //isBlank
        boolean blankOrNot = s3.isEmpty(); //FALSE
        System.out.println(blankOrNot);
        boolean blankOrNot2 = s4.isEmpty(); //TRUE
        System.out.println(blankOrNot2);

        //String comparison
        //Equals method
        boolean equalOrNot = s3.equals(s4);
        System.out.println(equalOrNot);
        //equalsIgnoreCase - if they refer to the same SPELLED word
        boolean equalsCase = s1.equalsIgnoreCase(s3); //should return true
        //Jonathon JONATHON jonathon JoNaThOn
        System.out.println(equalsCase);

        //compareTo // 0 if the strings are the same, negative if the first one is smaller
        //positive value if the first one is bigger lexicographically:
        int sameOrNot = "Ezra".compareTo("Justice");
        System.out.println(sameOrNot);

        //valueOf: digs deep into the variable and extracts the value:
        int intValue = 100;
        /*
        I have an integer, I want to convert it to a String so that I can use it
        as a String. In order to do that I create a String and I call the valueOf method
        to take the integer and convert it to a String.
         */
        String stringOfIntValue = String.valueOf(intValue);
        System.out.println(stringOfIntValue);

        String myString = "Jonathon Stephens";
        System.out.println(myString);
        boolean checkForJ = myString.startsWith("J"); //TRUE
        System.out.println(checkForJ);
        checkForJ = myString.startsWith("j");        //FALSE
        System.out.println(checkForJ);
        boolean checkForS = myString.endsWith("s"); //TRUE
        System.out.println(checkForS);

        //indices - 0, 1, 2 - indices are zero-based:
        //indexOf returns the position of the first OCCURRENCE of that character
        int positionOfS = myString.indexOf("S"); //9
        System.out.println(positionOfS);
        int positionOfLastS = myString.lastIndexOf("S");
        System.out.println(positionOfLastS);

        //Sometimes we want to make sure a string contains something:
        boolean containsX = myString.contains("x");
        System.out.println(containsX);

        //Extract a character
        char characterH = myString.charAt(5);
        System.out.println(characterH);

        //Extract a substring
        String firstName = myString.substring(0, 8);
        System.out.println(firstName);

        //Conversion methods:
        String jonathonLowerCase = myString.toLowerCase();
        System.out.println(jonathonLowerCase);

        String jonathonUpperCase = myString.toUpperCase();
        System.out.println(jonathonUpperCase);

        //Concat - it takes one string and joins it to another string:
        String programmer = " - Programmer";
        myString = myString.concat(programmer);
        System.out.println(myString);

        //Trim - creates a new String removing white spaces from front and back
        String trimmedS2 = s2.trim();
        System.out.println(trimmedS2);

        //Strip - strips the leading and the trailing white spaces:
        String trimmedS22 = s2.strip();
        System.out.println(trimmedS22);

        //Processing methods:
        String perScholas = "Per Scholas";
        String newPerScholas = perScholas.replace('P', 'M');
        System.out.println(newPerScholas);

        String newPerScholas2 = perScholas.replaceAll("Per", "My");
        System.out.println(newPerScholas2);

        //Check to see if some part of the string matches something:
        boolean doesItMatch = perScholas.matches(newPerScholas);
        System.out.println(doesItMatch);

        //Replace ALL ex:
        String str1 = "aabbaaac";
        String str2 = "Learn223Java55from555perscholas";
        //regex for sequence of digits
        String regex = "\\d+";


    }
}
