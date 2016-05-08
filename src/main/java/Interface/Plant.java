/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author РќРёРєРёС‚Р°
 */
public class Plant implements Peelable {

	double weight;
	String color;
	boolean ripeness;
	boolean condition;
	boolean isPeeled;
	String type;
	String kind;
	
	public String getType() {
		return type;
	}
	
	public String getKind() {
		return kind;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isRipeness() {
		return ripeness;
	}

	public void setRipeness(boolean ripeness) {
		this.ripeness = ripeness;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public void setPeeled(boolean isPeeled) {
		this.isPeeled = isPeeled;
	}

	public void Peel() {
		weight = weight * 0.95;
		isPeeled = true;
	}

	public void Print() {
		System.out.println("Вес:" + weight + " Цвет: " + color + " Зрелость: " + ripeness + " Состояние: " + condition
				+ " Очищенность: " + isPeeled);
	}

	public boolean isPeeled() {
		return isPeeled;
	}
}