/**
 * 
 */
package com.teamVI.project;

/**FOB CLass
 * @author crodas
 *
 */
public class FOB extends Computer {
	
	private int fobID;
	private float size;
	private String casingType;
	private int rfReceiverDistance;
	
	
	public void on() {
		//Turns FOB on when removed from cart
	}
	public void off() {
		//Turns FOB OFF when returned to cart
	}
	public void detectGeofence() {
		//Detects geofence created by antennae and keeps connected to frequency
	}

}
