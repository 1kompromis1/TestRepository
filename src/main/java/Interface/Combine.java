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
public class Combine implements Peeler, Cutter, Slicer {

	public void slice(Plant plant) {
		if (!plant.isPeeled)
			throw new IllegalArgumentException();
		plant.setWeight(plant.getWeight() * 0.98);

	}

	public void sliceAll(Plant[] plant) {
		for (int i = 0; i < plant.length; i++) {
			if (!plant[i].isPeeled)
				throw new IllegalArgumentException();
			plant[i].setWeight(plant[i].getWeight() * 0.95);
		}
	}

	public void cut(Plant plant) {
		if (!plant.isPeeled)
			throw new IllegalArgumentException();
		plant.setWeight(plant.getWeight() * 0.98);
	}

	public void cutAll(Plant[] plant) {
		for (int i = 0; i < plant.length; i++) {
			if (!plant[i].isPeeled)
				throw new IllegalArgumentException();
			plant[i].setWeight(plant[i].getWeight() * 0.98);
		}
	}

	public void peelItem(Plant plant) {
		if (plant.isPeeled)
			throw new IllegalArgumentException();
		plant.setPeeled(true);
		plant.setWeight(plant.getWeight() * 0.95);
	}

	public void peelItems(Plant[] plant) {
		for (int i = 0; i < plant.length; i++) {
			if (plant[i].isPeeled)
				throw new IllegalArgumentException();
			plant[i].setPeeled(true);
			plant[i].setWeight(plant[i].getWeight() * 0.95);
		}
	}
}