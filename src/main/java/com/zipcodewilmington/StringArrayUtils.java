package com.zipcodewilmington;

import com.sun.media.jfxmedia.logging.Logger;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String response = "";

        if (array != null && array.length > 0){
            response = String.valueOf(array[0]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String response = "";

        if (array != null && array.length > 0){
            response = String.valueOf(array[1]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String response = "";

        if (array != null && array.length > 0){
            response = String.valueOf(array[array.length - 1]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String response = "";

        if (array != null && array.length > 1){
            response = String.valueOf(array[array.length - 2]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;

        for (String sName : array) {
            answer = sName.equals(value);
            if (answer = true) break;
        }

        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] newArray = new String[array.length];
        int arrayCounter = 0;

        for (int i = array.length; i>=1; i--){
            newArray[arrayCounter] = array[i-1];
            arrayCounter ++ ;
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPali = true;
        int counter = array.length-1;

        String [] newArray = new String[array.length];

        // store the reversed array in a new array and compare
        for (String sValue : array){
            newArray[counter] = sValue;
            counter--;
        }

        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] != array[i]) isPali = false;
        }
        //isPali = array.equals(newArray);
        return isPali;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int nrOccurances = 0;

        for (String sName : array) {
            if (sName.equals(value)) nrOccurances++;
        }
        return nrOccurances;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
