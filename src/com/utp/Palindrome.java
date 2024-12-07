package com.utp;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        // Loop through the string with two pointers: left and right
        int left = 0;
        int right = input.length() - 1;
        
        boolean isPalindrome = true;
        
        // Loop while left < right to compare characters
        while (left < right) {
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);
            
            // Convert characters manually to lower case if they are upper case
            if (leftChar >= 'A' && leftChar <= 'Z') {
                leftChar = (char) (leftChar + 32);
            }
            if (rightChar >= 'A' && rightChar <= 'Z') {
                rightChar = (char) (rightChar + 32);
            }
            
            // Compare the characters
            if (leftChar != rightChar) {
                isPalindrome = false;
                break;
            }
            
            left++;
            right--;
        }
        
        // Output the result
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
