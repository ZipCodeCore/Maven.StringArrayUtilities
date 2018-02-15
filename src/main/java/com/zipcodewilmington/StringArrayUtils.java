package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;

        for (String s : array) {
            if (s.equals(value)) {
                answer = true;
            }
        }
        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[index] = array[i];
            index++;
        }

        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        return Arrays.equals(StringArrayUtils.reverse(array), array) ? true : false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int counter = 0;
        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (String s : array) {
            for (int i = 0; i < s.length(); i++) {
                String test = Character.toString(s.charAt(i));
                for (int j = 0; j <= alphabet.length - 1; j++) {
                    if (test.equalsIgnoreCase(alphabet[j])) {
                        counter += 1;
                        alphabet[j] = "\\";
                        break;
                    }
                }
            }
        }
        return counter == 26 ? true : false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String s : array) {
            if (s.equals(value)) counter++;
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] answer = new String[0];
        for(String s : array){
            if(!s.equals(valueToRemove)){
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[answer.length-1] = s;
            }
        }
        return answer;


    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String prev = "\\";
        String[] answer = new String[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (!prev.equals(array[i])) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length-1] = array[i];
                prev = array[i];
            }
        }
        return answer;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder packer = new StringBuilder();
        for (int i = 0; i < array.length-1; i++){
            if(array[i] == array[i+1]){
                packer.append(array[i]);
            }
            else{
                packer.append(array[i]).append(" ");
            }
        }
        packer.append(array[array.length-1]);
        String answer = packer.toString();
        String[] realAnswer = answer.split(" ");
        return realAnswer;
    }
}
