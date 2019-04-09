import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	@Test
	void newCartItemCountTest() { //when a new car is created the item count should be 0
		ShoppingCart testCart = new ShoppingCart();
		int count = testCart.getItemCount();
		assertEquals(0,count);
	}
	
	@Test
	void emptyCartItemTest() { //when a cart is empty the item count should be empty
		ShoppingCart testCart = new ShoppingCart();
		
		Product milk = new Product("Milk", 2.50);
		
		testCart.addItem(milk);
		testCart.empty();
		
		int itemCount = testCart.getItemCount();
		
		assertEquals(0,itemCount);
	}

	@Test
	void productIncrementTest() {
		ShoppingCart testCart = new ShoppingCart();
		Product milk = new Product("Milk", 2.50);
		
		int itemCountBefore = testCart.getItemCount();
		
		testCart.addItem(milk);
		
		int itemCountAfter = testCart.getItemCount();
		
		assertEquals(1, itemCountAfter - itemCountBefore);
	}
	
	@Test
	void productdecrementTest() throws ProductNotFoundException {
		ShoppingCart Cart = new ShoppingCart();
		Product corn = new Product("Corn", 5.98);
		
		Cart.addItem(corn);
		Cart.addItem(corn);
		
		int AfterCounter = Cart.getItemCount();
		
		Cart.removeItem(corn);
		
		assertEquals(1, AfterCounter-Cart.getItemCount());
		
	}
}
