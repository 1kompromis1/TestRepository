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
public class Basket {

	private Plant[] arr;
	private int size;

	public Basket() {
		arr = new Plant[10];
		size = 0;
	}

	public int getSize() {
		return size;

	}

	public void put(Plant plant, String type) {
		if (size == this.arr.length)
			expand();
		this.arr[size] = plant;
		this.arr[size].type = type;
		size++;
		System.out.println("Weight: "+getWeight()+ "g.");
	}

	public void expand() {
		Plant[] temp = null;
		temp = new Plant[size * 3 / 2 + 1];
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[i];
		arr = temp;
	}

	public Plant extract(int index) {
		Plant temp = new Plant();
		temp = arr[index - 1];
		for (int i = index; i < arr.length; i++)
			arr[i - 1] = arr[i];
		size--;
		return temp;
	}

	public Plant[] extractAll() {
		Plant[] temp = new Plant[size];
		for (int i = 0; i < temp.length; i++)
			temp[i] = arr[i];
		size = 0;
		return temp;
	}

	public Fruit[] extractFruits() {
		int count = 0;
		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < size; i++)
			if ((arr[i].type).equals("Fruit"))
				count++;
		Fruit[] temp = new Fruit[count];
		Plant[] newtemp = new Plant[arr.length];
		for (int i = 0; i < size; i++)
			if ((arr[i].type).equals("Fruit")) {
				temp[c1] = (Fruit) arr[i];
				c1++;
			} else {
				newtemp[c2] = arr[i];
				c2++;
			}
		for (int i = 0; i < size; i++)
			arr[i] = newtemp[i];
		size = size - count;
		return temp;
	}

	public Vegetable[] extractVegetables() {
		int count = 0;
		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < size; i++)
			if ((arr[i].type).equals("Vegetables"))
				count++;
		Vegetable[] temp = new Vegetable[count];
		Plant[] newtemp = new Plant[arr.length];
		for (int i = 0; i < size; i++)
			if ((arr[i].type).equals("Vegetables")) {
				temp[c1] = (Vegetable) arr[i];
				c1++;
			} else {
				newtemp[c2] = arr[i];
				c2++;
			}
		for (int i = 0; i < size; i++)
			arr[i] = newtemp[i];
		size = size - count;
		return temp;
	}

	public double getWeight() {
		double sum = 0;
		for (int i = 0; i < size; i++)
			sum = sum + arr[i].getWeight();
		return sum;
	}

	public void clear() {
		size = 0;
	}

	public void print() {
		if (size == 0) {
			System.out.println("Empty");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(i+1+" Weight:" + arr[i].weight + " Colour: " + arr[i].color + " Maturity: " + arr[i].ripeness
						+ " Condition: " + arr[i].condition + " Purity: " + arr[i].isPeeled);
			}
			System.out.println();
		}
	}
}