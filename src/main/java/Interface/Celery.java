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
public class Celery extends Vegetable{
	
	String kind = "���������";
	
	public Celery(double w, String col, boolean r, boolean c, boolean isP) {
		weight = w;
		color = col;
		ripeness = r;
		condition = c;
		isPeeled = isP;
	}
}
