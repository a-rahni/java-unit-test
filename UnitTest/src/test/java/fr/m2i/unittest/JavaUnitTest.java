/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.unittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import static org.junit.jupiter.api.Assertions.*; // static pour eviter d'ecrire tout le chemin pour chaque assertion
// exp: asserTrue(true)
import org.junit.jupiter.api.Test;


/****************************************
 * methode beforeAll et afterAll doivent être
 ***************************************/
/**
 *
 * @author rahni
 */
public class JavaUnitTest {
    @Test
    public void firstTestMethod(){
        Assertions.assertTrue(true);        
    }
    
}
