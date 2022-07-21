/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.unittest;

import static fr.m2i.unittest.UnitTest.isPalindrome;
import static  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author rahni
 */
public class PalindromeTest {
    
        @Test
    public void isPalindromeKayak() {
        boolean result = UnitTest.isPalindrome("kayak");
        
        assertTrue(result);
    }

    @Test
    public void isPalindromeBonjour() {
        boolean result = UnitTest.isPalindrome("bonjour");
        
        assertFalse(result);
    } 
        
    @Test
    public void isPalindromeChaineVide() {
        boolean result = UnitTest.isPalindrome("");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeKAYak() {
        boolean result = UnitTest.isPalindrome("KAYak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeAvecEspaces() {
        boolean result = UnitTest.isPalindrome("Engage le jeu que je le gagne");
        
        assertTrue(result);
    }
        
    @Test
    public void isPalindromeAvecDesAccents() {
        boolean result = UnitTest.isPalindrome("La mariée ira mal");
        
        assertTrue(result);
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = { "kayak", "xanax", "selles" })
    public void isAllPalindromes(String str) {
        boolean result = UnitTest.isPalindrome(str);
        
        assertTrue(result);
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = { "ecole", "voiture", "arbre" })
    public void isAllNotPalindromes(String str) {
        boolean result = UnitTest.isPalindrome(str);
        
        assertFalse(result);
    }
    
    @ParameterizedTest
    @CsvSource({
        "kayak, true",
        "rever, true",
        "arbre, false"
    })
    public void checkCsvSourcePalindrome(String str, boolean expectedResult) {
        boolean result = UnitTest.isPalindrome(str);

        assertEquals(result, expectedResult);
    }
    
    @RepeatedTest(5)
    public void repeatThisTest() {
        boolean result = UnitTest.isPalindrome("xanax");
        
        assertTrue(result);
    }
    
    
    @Test
    public void isPalindromeSuccess(){
        assertTrue(isPalindrome("lol lol"));
    }
    
    @Test
    public void isPalindromeUnsuccess(){
        assertFalse(isPalindrome("lol olll"));
    }
    
    @Test
    public void isPalindromeSuccess1(){
        assertTrue(isPalindrome("lol  lol "));
    }
    
    @ParameterizedTest
    @ValueSource(strings={"lol lol","pa ap",""})
    public void isPalindromeSuccess1S(String s){
        assertTrue(isPalindrome(s));
    }
    
    @ParameterizedTest
    @CsvSource({"lol lol, true ","ppap, false","sos,true"})
    public void isPalindromeSuccess1(String s, boolean result){
        assertEquals(result,isPalindrome(s));
    }
    
}
