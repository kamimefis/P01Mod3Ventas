/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lila
 */
public class ColeccionVentasTest {
    
    public ColeccionVentasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Listar method, of class ColeccionVentas.
     */
    @Test
    public void testListar() {
       System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }

    /**
     * Test of Agregar method, of class ColeccionVentas.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta();
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    }

    /**
     * Test of modificar method, of class ColeccionVentas.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta= new Venta("cod1",0,0);
        ColeccionVentas instance= new ColeccionVentas();  
        instance.Agregar(venta);
        boolean esperado= true;
        venta= new Venta("cod1",0,0);
        boolean obtenido= instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido); 
    }

    /**
     * Test of Eliminar method, of class ColeccionVentas.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo= "cod1";
        Venta venta= new Venta("cod1");
        ColeccionVentas instance= new ColeccionVentas();  
        instance.Agregar(venta);
        boolean esperado= true;
        boolean obtenido= instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);  
    }

    /**
     * Test of SubTotal method, of class ColeccionVentas.
     */
    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        Venta v = new Venta();
        ColeccionVentas instance = new ColeccionVentas();
        int expResult = 0;
        int result = instance.SubTotal(v);
        assertEquals(expResult, result);
        
    }
    
}
