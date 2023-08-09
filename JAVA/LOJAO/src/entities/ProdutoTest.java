package entities;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProdutoTest {
	
	Produto product = new Produto("001","Camiseta Excelente",200.00, 10);
	
	@Test
	void testTirarEstoque() {
		
		product.tirarEstoque(-1);
		Assertions.assertEquals(10, product.getEstoque());
	}

	@Test
	void testIncluirEstoque() {
		product.incluirEstoque(0);
		Assertions.assertEquals(10, product.getEstoque());	
  }
}