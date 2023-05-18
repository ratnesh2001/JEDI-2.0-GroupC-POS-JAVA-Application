/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ratnesh.khandelwal
 *
 */
public class Card extends Offline{

	private int cardNumber;
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	private String cardType;
}
