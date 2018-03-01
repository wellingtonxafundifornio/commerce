package unittest;

import org.junit.Assert;
import org.junit.Test;

import model.Caixa;

public class CaixaTest {

	@Test
	public void testeUm() throws Exception {
		Caixa caixa = new Caixa();

		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 50);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 100);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 130);
		Assert.assertEquals(caixa.getTotalDiscount(), 20);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 180);
		Assert.assertEquals(caixa.getTotalDiscount(), 20);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 230);
		Assert.assertEquals(caixa.getTotalDiscount(), 20);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 260);
		Assert.assertEquals(caixa.getTotalDiscount(), 40);
		caixa.remove("A");
		Assert.assertEquals(caixa.getTotalPrice(), 230);
		Assert.assertEquals(caixa.getTotalDiscount(), 20);
	}

	@Test
	public void testeDois() throws Exception {
		Caixa caixa = new Caixa();

		caixa.add("D");
		Assert.assertEquals(caixa.getTotalPrice(), 15);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 65);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("B");
		Assert.assertEquals(caixa.getTotalPrice(), 95);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 145);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("B");
		Assert.assertEquals(caixa.getTotalPrice(), 160);
		Assert.assertEquals(caixa.getTotalDiscount(), 15);
		caixa.add("A");
		Assert.assertEquals(caixa.getTotalPrice(), 190);
		Assert.assertEquals(caixa.getTotalDiscount(), 35);
		caixa.remove("A");
		Assert.assertEquals(caixa.getTotalPrice(), 160);
		Assert.assertEquals(caixa.getTotalDiscount(), 15);
		caixa.remove("B");
		Assert.assertEquals(caixa.getTotalPrice(), 145);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
	}

	@Test
	public void testeTres() throws Exception {
		Caixa caixa = new Caixa();

		caixa.add("C");
		Assert.assertEquals(caixa.getTotalPrice(), 20);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("C");
		Assert.assertEquals(caixa.getTotalPrice(), 40);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("C");
		Assert.assertEquals(caixa.getTotalPrice(), 40);
		Assert.assertEquals(caixa.getTotalDiscount(), 20);
		caixa.add("C");
		Assert.assertEquals(caixa.getTotalPrice(), 60);
		Assert.assertEquals(caixa.getTotalDiscount(), 20);
		caixa.remove("C");
		Assert.assertEquals(caixa.getTotalPrice(), 40);
		Assert.assertEquals(caixa.getTotalDiscount(), 20);
		caixa.remove("C");
		Assert.assertEquals(caixa.getTotalPrice(), 40);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
	}

	@Test
	public void testeQuatro() throws Exception {
		Caixa caixa = new Caixa();

		caixa.add("C");
		Assert.assertEquals(caixa.getTotalPrice(), 20);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("B");
		Assert.assertEquals(caixa.getTotalPrice(), 50);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
		caixa.add("B");
		Assert.assertEquals(caixa.getTotalPrice(), 65);
		Assert.assertEquals(caixa.getTotalDiscount(), 15);
		caixa.remove("B");
		Assert.assertEquals(caixa.getTotalPrice(), 50);
		Assert.assertEquals(caixa.getTotalDiscount(), 0);
	}

}
