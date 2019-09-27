package modelos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSubTotal {

    public TestSubTotal() {
    }
    
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
