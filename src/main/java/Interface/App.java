/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Никита
 */
import java.io.IOException;
import java.util.Scanner;

public class App {

	static double w;
	static String col;
	static String check;
	static boolean r = false;
	static boolean con = false;
	static boolean isPeeled = false;
	static Scanner br = new Scanner((System.in));

	public static void stats() throws IOException {
		System.out.print("1.Enter the weight (in grams):.");
		w = Integer.parseInt(br.nextLine());
		System.out.println("2. Colour.");
		col = br.nextLine();
		System.out.println("3. Maturity (green / ripe). ");
		check = br.nextLine();
		if (check.equals("green"))
			r = false;
		else if (check.equals("ripe"))
			r = true;
		System.out.println("4. Condition (good / bad).");
		check = br.nextLine();
		if (check.equals("good"))
			con = true;
		else if (check.equals("bad"))
			con = false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int size = 0;
		Basket basket = new Basket();
		Combine combine = new Combine();
		int n = -1;
		while (n != 0) {
			System.out.println("1. Add to Shopping Cart plant.");
			System.out.println("2. Remove the plant from the basket.");
			System.out.println("3. Exit the program.");
			n = Integer.parseInt(br.nextLine());

			switch (n) {

			case 1:
				System.out.println("1. Add vegetable.");
				System.out.println("2. Add fruit.");
				n = Integer.parseInt(br.nextLine());
				switch (n) {
				case 1:
					System.out.println("1. Potato.");
					System.out.println("2. Carrot.");
					System.out.println("3. Celery.");
					System.out.println("4. Onion.");
					n = Integer.parseInt(br.nextLine());
					switch (n) {
					case 1:
						stats();
						Potato potato = new Potato(w, col, r, con, isPeeled);
						basket.put(potato, potato.getType());
						break;
					case 2:
						stats();
						Carrot carrot = new Carrot(w, col, r, con, isPeeled);
						basket.put(carrot, carrot.getType());
						break;
					case 3:
						stats();
						Celery celery = new Celery(w, col, r, con, isPeeled);
						basket.put(celery, celery.getType());
						break;
					case 4:
						stats();
						Onion onion = new Onion(w, col, r, con, isPeeled);
						basket.put(onion, onion.getType());
						break;
					default:
						System.out.println("Incorrect value!");
						break;
					}
					break;
				case 2:
					System.out.println("1. Apple.");
					System.out.println("2. Banana.");
					System.out.println("3. Orange.");
					System.out.println("4. Pear.");
					n = Integer.parseInt(br.nextLine());
					switch (n) {
					case 1:
						stats();
						Apple apple = new Apple(w, col, r, con, isPeeled);
						basket.put(apple, apple.getType());
						break;
					case 2:
						stats();
						Banana banana = new Banana(w, col, r, con, isPeeled);
						basket.put(banana, banana.getType());
						break;
					case 3:
						stats();
						Orange orange = new Orange(w, col, r, con, isPeeled);
						basket.put(orange, orange.getType());
						break;
					case 4:
						stats();
						Pear pear = new Pear(w, col, r, con, isPeeled);
						basket.put(pear, pear.getType());
						break;
					default:
						System.out.println("Incorrect value!");
						break;
					}
					break;
				default:
					System.out.println("Incorrect value!");
					break;
				}
				break;
			case 2:
				Plant[] plants = new Plant[basket.extractAll().length];
				System.out.println("1. Choose one plant.");
				System.out.println("2. Choose whole fruits.");
				System.out.println("3. Choose whole vegetables.");
				System.out.println("4. Choose whole plants.");

				n = Integer.parseInt(br.nextLine());
				switch (n) {
				case 1:
					basket.print();
					n = Integer.parseInt(br.nextLine());
					plants[0] = basket.extract(n);
					size = 2;
					break;
				case 2:
					plants = basket.extractFruits();
					System.out.println(plants.length);
					size = basket.extractFruits().length;
					break;
				case 3:
					basket.extractVegetables();
					plants = basket.extractVegetables();
					size = basket.extractVegetables().length;
					break;
				case 4:
					basket.extractAll();
					plants = basket.extractAll();
					size = basket.extractAll().length;
					break;
				default:
					System.out.println("Incorrect value!");
					break;
				}

				System.out.println("1. Clear plant.");
				System.out.println("2. Cut plants.");
				System.out.println("3. Shred plants.");
				n = Integer.parseInt(br.nextLine());
				switch (n) {
				case 1:
					combine.peelItems(plants);
					for (int i = 0; i < size; i++)
						basket.put(plants[i], plants[i].type);
					basket.getWeight();
					break;
				case 2:
					for (int i = 0; i < size; i++)
						basket.put(plants[i], plants[i].type);
					basket.getWeight();
					break;
				case 3:
					for (int i = 0; i < size; i++)
						basket.put(plants[i], plants[i].type);
					basket.getWeight();
					break;
				default:
					System.out.println("Incorrect value!");
					break;
				}
			case 0:
				break;
			default:
				System.out.println("Incorrect value!");
				break;
			}
		}
	}
}
