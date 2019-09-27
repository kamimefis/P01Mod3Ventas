package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    
    
    @Test
    public void TestModificar(){
        System.out.println("Modificar");
        Venta venta= new Venta("cod1",0,0);
        ColeccionVentas instance= new ColeccionVentas();  
        instance.Agregar(venta);
        boolean esperado= true;
        venta= new Venta("cod1",0,0);
        boolean obtenido= instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido); 
    }
}
