package mypractice;
import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> shoppingList = new ArrayList<String>();
	
	System.out.println("Enter the number of items in the list:");
	int n = scanner.nextInt();
	for(int i = 0; i < n;i++) {
		shoppingList.add(scanner.next());
	}
	System.out.println("Enter the number of items purchased:");
	int m = scanner.nextInt();
	for(int i = 0; i < m; i++) {
		String purchasedItem = scanner.next();
		shoppingList.remove(purchasedItem);
	}
	for(int i=0; i<shoppingList.size(); i++) {
		System.out.print(shoppingList.get(i) );
		if(i < shoppingList.size()-1) {
			System.out.print(", ");
		}
	}
	
	 }

}
