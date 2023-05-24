/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package examen;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class MetodosNGTest {
    String [] cadenes = {"hola", "que", "tal", "cómo", "estás", "hola"};
    public MetodosNGTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class Metodos.
     */
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = 'h';
        Metodos instance = new Metodos(cadenes);
        int expResult = 2;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class Metodos.
     */
    @Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 't';
        Metodos instance = new Metodos(cadenes);
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getConcatenacionCadenas method, of class Metodos.
     */
    @Test
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        Metodos instance = new Metodos(cadenes);
        String expResult = "hola que tal cómo estás hola";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicionesDe method, of class Metodos.
     */
    //@Test
    public void testGetPosicionesDe1() {
        System.out.println("getPosicionesDe");
        String unaCadena = "adiós";
        Metodos instance = new Metodos(cadenes);
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //@Test
    public void testGetPosicionesDe2() {
        System.out.println("getPosicionesDe");
        String unaCadena = "hola";
        Metodos instance = new Metodos(cadenes);
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //@Test
    public void testGetPosicionesDe3() {
        System.out.println("getPosicionesDe");
        String unaCadena = null;
        Metodos instance = new Metodos(cadenes);
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
