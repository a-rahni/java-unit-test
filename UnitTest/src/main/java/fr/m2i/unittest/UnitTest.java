/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.m2i.unittest;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rahni
 */
public class UnitTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.printf("entrez votre chaine: ");
        String s = input.nextLine();
        System.out.println(isPalindrome(s));
        
    }
    
//    public static boolean isPalindrome(String chaine){
//        
//        StringBuilder sb = new StringBuilder();
//        sb.append(StringUtils.stripAccents(chaine.toLowerCase().replaceAll(" ", "")));
//        sb.reverse();
//        return (sb.toString().equals(StringUtils.stripAccents(chaine.toLowerCase().replaceAll(" ", ""))));
//    }
    
    public static boolean isPalindrome(String phrase) {

        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(" ", "");
        phrase = StringUtils.stripAccents(phrase);
        
        int start = 0;
        int end = phrase.length() - 1;

        while (start < end) {
            if (phrase.charAt(start) != phrase.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        
        return true;
    }
    
    
}
