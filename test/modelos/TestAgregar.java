package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {
    
    public TestAgregar() {
    }

    @Test
    public void TestAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta();
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
    
}
