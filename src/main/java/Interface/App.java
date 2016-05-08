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
		System.out.print("1. ������� ��� (� �������):.");
		w = Integer.parseInt(br.nextLine());
		System.out.println("2. ����.");
		col = br.nextLine();
		System.out.println("3. �������� (�������/������). ");
		check = br.nextLine();
		if (check.equals("�������"))
			r = false;
		else if (check.equals("������"))
			r = true;
		System.out.println("4. ��������� (�������/������).");
		check = br.nextLine();
		if (check.equals("�������"))
			con = true;
		else if (check.equals("������"))
			con = false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int size = 0;
		Basket basket = new Basket();
		Combine combine = new Combine();
		int n = -1;
		while (n != 0) {
			System.out.println("1. �������� �������� � �������.");
			System.out.println("2. �������� �������� �� �������.");
			System.out.println("3. ����� �� ���������.");
			n = Integer.parseInt(br.nextLine());

			switch (n) {

			case 1:
				System.out.println("1. �������� ����.");
				System.out.println("2. �������� �����.");
				n = Integer.parseInt(br.nextLine());
				switch (n) {
				case 1:
					System.out.println("1. ��������.");
					System.out.println("2. ��������.");
					System.out.println("3. ���������.");
					System.out.println("4. ���");
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
						System.out.println("�������� ��������!");
						break;
					}
					break;
				case 2:
					System.out.println("1. ������.");
					System.out.println("2. �����.");
					System.out.println("3. ��������.");
					System.out.println("4. �����.");
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
						System.out.println("�������� ��������!");
						break;
					}
					break;
				default:
					System.out.println("�������� ��������!");
					break;
				}
				break;
			case 2:
				Plant[] plants = new Plant[basket.extractAll().length];
				System.out.println("1. �����basket�� ���� ��������.");
				System.out.println("2. ������� ��� ������.");
				System.out.println("3. ������� ��� �����.");
				System.out.println("4. ������� ��� ��������.");

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
					System.out.println("�������� ��������!");
					break;
				}

				System.out.println("1. ��������� ��������.");
				System.out.println("2. �������� ��������.");
				System.out.println("3. ����������� ��������.");
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
					System.out.println("�������� ��������!");
					break;
				}
			case 0:
				break;
			default:
				System.out.println("�������� ��������!");
				break;
			}
		}
	}
}
