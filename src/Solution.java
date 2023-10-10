public class Solution {
    public int romanToInt(String roman){

        int number = 0;

        for (int i = 0; i < roman.length(); i++){
            // Checking for IV or IX
            if(roman.charAt(i) == 'I'){
                number +=1;
            } else if (roman.charAt(i) == 'V') {
                if (i > 0 && roman.charAt(i-1) == 'I'){
                    number += 3;
                }else {
                    number += 5;
                }
            } else if (roman.charAt(i) == 'X') {
                if (i > 0 && roman.charAt(i-1) == 'I'){
                    number += 8;
                }else {
                    number += 10;
                }
            } else if (roman.charAt(i) == 'L') {
                if (i > 0 && roman.charAt(i-1) == 'X'){
                    number += 30;
                }else {
                    number += 50;
                }
            } else if (roman.charAt(i) == 'C') {
                if (i > 0 && roman.charAt(i-1) == 'X'){
                    number += 80;
                }else {
                    number += 100;
                }
            } else if (roman.charAt(i) == 'D') {
                if (i > 0 && roman.charAt(i-1) == 'C'){
                    number += 300;
                }else {
                    number += 500;
                }
            } else if (roman.charAt(i) == 'M') {
                if (i > 0 && roman.charAt(i-1) == 'C'){
                    number += 800;
                }else {
                    number += 1000;
                }
            }
        }

        return number;
    }
}