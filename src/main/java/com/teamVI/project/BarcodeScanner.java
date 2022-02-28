/**
 * 
 */
package com.teamVI.project;

/**
 * @author crodas
 *
 */
public class BarcodeScanner extends SmartKart {

	private String laserType;
	private String mountType;
	private String softwareOS;
	private String speaker;
	
	public void on() {
		//Turns barcode scanner ON when presented with Barcode
	}
	public void off() {
		//Turns barcode scanner Off when no barcode has been provided over a certain amount of time
	}
	public void scanProduct() {
		//Scans item barcode 
	}
	public void alertError() {
		//Set Error Alert when the scan sequence has hit an error exception 
	}
}
