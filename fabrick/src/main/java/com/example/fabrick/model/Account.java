package com.example.fabrick.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private static Long accountId= 14537780L;
    private String iban;
    private String abuCode;
    private String cabCode;
    private String countryCode;
    private String internationalCin;
    private String nationalCin;
    private String account;
    private String alias;
    private String productName;
    private String holderName;
    private Date activatedDate;
    private String currency;
	
    
    
    public Account() {
		super();
	}



	public Account(String iban, String abuCode, String cabCode, String countryCode, String internationalCin,
			String nationalCin, String account, String alias, String productName, String holderName, Date activatedDate,
			String currency) {
		super();
		this.iban = iban;
		this.abuCode = abuCode;
		this.cabCode = cabCode;
		this.countryCode = countryCode;
		this.internationalCin = internationalCin;
		this.nationalCin = nationalCin;
		this.account = account;
		this.alias = alias;
		this.productName = productName;
		this.holderName = holderName;
		this.activatedDate = activatedDate;
		this.currency = currency;
	}



	@Override
	public String toString() {
		return "Account [iban=" + iban + ", abuCode=" + abuCode + ", cabCode=" + cabCode + ", countryCode="
				+ countryCode + ", internationalCin=" + internationalCin + ", nationalCin=" + nationalCin + ", account="
				+ account + ", alias=" + alias + ", productName=" + productName + ", holderName=" + holderName
				+ ", activatedDate=" + activatedDate + ", currency=" + currency + "]";
	}

    
    
	public static Long getAccountId() {
		return accountId;
	}

	public static void setAccountId(Long accountId) {
		Account.accountId = accountId;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getAbuCode() {
		return abuCode;
	}

	public void setAbuCode(String abuCode) {
		this.abuCode = abuCode;
	}

	public String getCabCode() {
		return cabCode;
	}

	public void setCabCode(String cabCode) {
		this.cabCode = cabCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getInternationalCin() {
		return internationalCin;
	}

	public void setInternationalCin(String internationalCin) {
		this.internationalCin = internationalCin;
	}

	public String getNationalCin() {
		return nationalCin;
	}

	public void setNationalCin(String nationalCin) {
		this.nationalCin = nationalCin;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Date getActivatedDate() {
		return activatedDate;
	}

	public void setActivatedDate(Date activatedDate) {
		this.activatedDate = activatedDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
    
	
}
