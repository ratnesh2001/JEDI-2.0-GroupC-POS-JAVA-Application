/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ratnesh.khandelwal
 *
 */
public class Offline extends Payment{

}

class Cheque extends Offline{
	private String bankName;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	private int chequeNumber;
}
