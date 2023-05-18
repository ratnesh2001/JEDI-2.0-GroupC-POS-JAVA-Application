/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ratnesh.khandelwal
 *
 */
public class NetBanking extends Online{
	private String modeOfTransfer;
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIFSCode() {
		return IFSCode;
	}
	public void setIFSCode(String iFSCode) {
		IFSCode = iFSCode;
	}
	private int accountNumber;
	private String IFSCode;
}
