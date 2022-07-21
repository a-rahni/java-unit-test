/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.unittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author rahni
 */
public class CycleVieTest {
     @BeforeAll
    public static void setupAll(){
        System.out.println("setup all");
    }
    
    @BeforeEach
    public void setupForeach(){
        System.out.println("setup");
    }
    
     @AfterEach
    public void teardown(){
        System.out.println("teardown");
    }
    
    @AfterAll
    public static void teardownAll(){
        System.out.println("teardownAll");
    }
    
    @Test
    public void unTest(){
        System.out.println("un test");     
    }
    
    @Test
    public void autreTest(){
        System.out.println("un autre test");     
    }
    
}
