/******************************************************************************
 *  Is Unique?
 *  Problem from Gayle Laakman "Cracking the Code Interview" book, Chapter 1,
 *  page 90. Implement an algorithm that determine if a string has all unique
 *  characters
 ******************************************************************************/

import java.util.Arrays;

public class isUnique {

    // Solution: Sort the string and linearly check the neighbor characters 
    // that are identical 
    public static boolean isUnique (String str) {

        char[] strCharArray = str.toCharArray();
        Arrays.sort(strCharArray);

        int i = 0;
        while(i < strCharArray.length - 1) {
            if(strCharArray[i] == strCharArray[i + 1])
                return false;
            i++;
        }

        return true;
    }

    // Book Solution
    public static boolean isUnique2(String str) {

        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(charSet[val])
                return false;
            charSet[val] = true;
        }

        return true;
    }

}
