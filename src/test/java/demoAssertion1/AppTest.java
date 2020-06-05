package demoAssertion1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import service.CalculatriceService;

public class AppTest {
	
	public static CalculatriceService Calculette;
	public int resultat;
	public static int compteur;

	@Before
	public void beforeAll()
	{
	   Calculette = new CalculatriceService();
	}
	
	@AfterClass
	public static void afterEach()
	{
	    System.out.println("Fin des tests");
	    compteur++;
	}
	
	
	
	@After
	public void afterAll()
	{
	    System.out.println("Fin du test "+ compteur);
	}
	@Ignore @Test
    public void monPremierTest() {
    	assertEquals(Calculette.addition(2,3),5);
    }
	
	@Test(timeout = 1000)
    public void monDeuxiemeTest() {
		assertEquals(Calculette.soustraction(2,3),-1);
    }

	@Test(timeout = 2000)
    public void monTroisiemeTest() {
		assertEquals(Calculette.produit(2,3),6);
    }
	
	@Test(timeout = 3000)
    public void monQuatriemeTest() {
		assertEquals(Calculette.division(6,3),2);
    }
}
