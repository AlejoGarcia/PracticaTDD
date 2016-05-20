
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArrayListTest {

	private ArrayList al;
	
	@Before
	public void setUp(){
		al = new ArrayList();
	}
	
	@Test
	public void AñadirEntradaEnElArrayList(){
		al.put("primero","uno");
		assertEquals("uno",al.get("primero"));
	}
	
	@Rule
	public ExpectedException except = ExpectedException.none();
	@Test
	public void LaFuncionGetElevaUnaException(){
		except.expect(ClaveNoEncontradaException.class);
		except.expectMessage("Clave no encontrada");
		assertEquals("uo",al.get("primero"));
	}
	
	@Test
	public void ImplementacionDeLaOperacionGetOrElse(){
		al.put("primero","uno");
		assertEquals("uno",al.getOrElse("primero","defalut"));
		assertEquals("default",al.getOrElse("segundo","default"));
	}
	
	@Test
	public void ImplementacionDeLaOperacionContainsKey(){
		al.put("primero","uno");
		assertEquals(true,al.containsKey("primero"));
		assertEquals(false,al.containsKey("segundo"));
	}
	
	@Test
	public void ImplementacionDeLaOperacionRemove(){
		al.put("primero", "uno");
		assertEquals(true,al.remove("primero"));
		assertEquals(false,al.containsKey("primero"));
	}
	
}
