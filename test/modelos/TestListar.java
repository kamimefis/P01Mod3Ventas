package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {
    
    @Test
    public void TestListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
    
}
