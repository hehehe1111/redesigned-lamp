package chapter3;
//9/17/2021
//Hemanta Parajuli 
//data structures and algorithms
//week 3 homework
//submitted to Professor Vohra

import java.util.Scanner;

public class PileDemo {

	public static void main(String[] args) {
		//creating a bookpile and adding some books
		PileOfBooks<String> bookpile = new PileOfBooks<>();
		bookpile.add("The Alchemist");
		bookpile.add("Zero to One");
		bookpile.add("Taoism");
		bookpile.add("Into the Wild");
	
		Scanner x = new Scanner(System.in);
		
		System.out.println("Do you want to add any books?");
		String ans = x.nextLine();
		if (ans.equals("y")) {
		System.out.println("How Many books?");
		int n = x.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Enter The name");
			String Book = x.nextLine();
			x.nextLine();
			bookpile.add(Book);
		}
		
		
	}
		System.out.println("Do you want to remove the top Book?");
		String ans1 = x.nextLine();
		if (ans1.equals("y")) {
		
		bookpile.remove();	
	}
		System.out.println("The Book on top is "+bookpile.getTopBook());
		
		System.out.println("It is "+bookpile.isEmpty()+" that bookpile is empty");
		
		System.out.println("Using the Clear method.......");
		bookpile.clear();
		System.out.println("It is "+bookpile.isEmpty()+" that bookpile is empty");
	}
}
