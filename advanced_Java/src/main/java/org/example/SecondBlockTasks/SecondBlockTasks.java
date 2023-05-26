package org.example.SecondBlockTasks;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class SecondBlockTasks {


    public List<Object> duplicationRemoval(List<?> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    public Integer countNumber(Integer number, Integer digit){
        Integer count = 0;
        Integer n = 0;
        for (int i = 1; i<=number; i++) {
            n = i;
            while (n > 0) {
                if (n % 10 == digit) {
                    count++;
                }
                n = n / 10;
            }
        }
        return count;
    }


    public Boolean permutation(String s1, String s2){
        if(s1.length() == s2.length()){
            int countS1 = 0;
            int countS2 = 0;
            while (s1.length() != 0 && countS1 < s1.length()){
                while (countS2 < s2.length()){
                    char tempS1 = s1.charAt(countS1);
                    char tempS2 = s2.charAt(countS2);
                    if(tempS1 == tempS2){
                        s1 = s1.substring(0, countS1) + s1.substring(countS1 + 1);
                        s2 = s2.substring(0, countS2) + s2.substring(countS2 + 1);
                        break;
                    }
                    countS2++;
                    if(countS2 == s2.length()){
                        return false;
                    }
                }
                countS2 = 0;
                countS1++;
            }
        }
        else {
            return false;
        }
        return true;
    }

    public String stringСompression(String s){
        char[] c = s.toCharArray();
        char[] answer = new char[s.length()*2];
        int count = 0;
        int countMas = 0;
        int countPoint = 0;
        for(int i = 0; i < s.length(); i++){
            if(i == s.length()-1){
                answer[countMas] = c[i-1];
                countMas++;
                answer[countMas] = (char) (count + '0');
                break;
            }
            else if(c[countPoint] == c[i]){
                count++;
            }
            else{
                answer[countMas] = c[i-1];
                countMas++;
                answer[countMas] = (char) (count + '0');
                countPoint += count;
                count = 0;
                countMas++;
                i--;
            }
        }


        if(countMas < s.length()){
            return new String(answer);
        }

        return s;
    }

    public static char findMostRepeatedChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой.");
        }

        int[] charCount = new int[256]; // Создаем массив для подсчета количества повторений символов

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        char mostRepeatedChar = 0;
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            if (charCount[c] > maxCount) {
                maxCount = charCount[c];
                mostRepeatedChar = c;
            }
        }

        return mostRepeatedChar;
    }

    public static String validateBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return "Invalid string";
                }
            }
        }

        while (!stack.empty()) {
            str += ')';
            stack.pop();
        }

        return str;
    }

    public static String reduceSpaces(String str) {
        return str.replaceAll("\\s+", " ");
    }

    public static Integer findPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            int frequency = freqMap.getOrDefault(num, 0);
            count += frequency;
            freqMap.put(num, frequency + 1);
        }
        return count;
    }
}
