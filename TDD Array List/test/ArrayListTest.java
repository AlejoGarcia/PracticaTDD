
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

	private ArrayList al;
	
	@Before
	public void setUp(){
		al = new ArrayList();
	}
	
	@Test
	public void A�adirEntradaEnElArrayList(){
		al.put("primero","uno");
		assertEquals("uno",al.get("primero"));
	}
}
