package com.jspiders.hibernatejpql.hibernatejpql.dta;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

import lombok.Data;



	@Entity
	@Data
	public class AccountDTO {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		private long accountNo;
		
		private String accountHolder;
		
		private String ifsc;
		
		private String branch;
		
		private String bank;
		
		private String city;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public long getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}

		public String getAccountHolder() {
			return accountHolder;
		}

		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}

		public String getIfsc() {
			return ifsc;
		}

		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getBank() {
			return bank;
		}

		public void setBank(String bank) {
			this.bank = bank;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public AccountDTO(int id, long accountNo, String accountHolder, String ifsc, String branch, String bank,
				String city) {
			super();
			this.id = id;
			this.accountNo = accountNo;
			this.accountHolder = accountHolder;
			this.ifsc = ifsc;
			this.branch = branch;
			this.bank = bank;
			this.city = city;
		}

		@Override
		public String toString() {
			return "AccountDTO [id=" + id + ", accountNo=" + accountNo + ", accountHolder=" + accountHolder + ", ifsc="
					+ ifsc + ", branch=" + branch + ", bank=" + bank + ", city=" + city + "]";
		}

		public AccountDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		

	}
	
	

