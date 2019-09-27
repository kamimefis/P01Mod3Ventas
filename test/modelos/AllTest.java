package modelos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestAgregar.class, TestEliminar.class, TestListar.class, TestModificar.class, TestSubTotal.class
})
public class AllTest {
    
}
