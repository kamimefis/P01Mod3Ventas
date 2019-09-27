package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo= "cod1";
        Venta venta= new Venta("cod1");
        ColeccionVentas instance= new ColeccionVentas();  
        instance.Agregar(venta);
        boolean esperado= true;
        boolean obtenido= instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);  
    }
    
}
