
package com.ritubrata.GenericsAndVarargs;

/**
 *
 * @author Ritubrata Chatterjee
 *
 */
public class Varargs {

	public static void main(final String[] args) {
		final String imem1 = "Apples";
		final String item2 = "Oranges";
		final String item3 = "Pears";
		printShoppingList(imem1, item2, item3);
		printShoppingList("Bread", "Milk", "Eggs", "Bananas");
	}




	private static void printShoppingList(final String... items) {
		System.out.println("SHOPPING LIST");
		for (int i = 0; i < items.length; i++) {
			System.out.println(i + 1 + ": " + items[i]);
		}
		System.out.println();

	}


}
