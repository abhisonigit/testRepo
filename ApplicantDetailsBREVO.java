package com.bre.modelVO;

import java.util.Date;

public class ApplicantDetailsBREVO {
	private Long applicantId;
//	private LoanApplicationDetailsBREVO loanApplicantDetails;
//	private IncomeDetailsBREVO incomeDetails;
	private String applicantType;
	private String dateofBirth;
	private String gender;
	private int age;
	private int tenureAddedAge;
	private int tenure;
//	private int residingYears;
	private double loanAmount;
//	private String residencePincode;
//	private String residenceCityName;
//	private Long residenceCityId;
	private double income;
//	private String category;
//	private String ownedBy;
//	private long cibilId;
	private String appSumittDate;

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public int getTenureAddedAge() {
		return tenureAddedAge;
	}

	public void setTenureAddedAge(int tenureAddedAge) {
		this.tenureAddedAge = tenureAddedAge;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getAppSumittDate() {
		return appSumittDate;
	}

	public void setAppSumittDate(String appSumittDate) {
		this.appSumittDate = appSumittDate;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public ApplicantDetailsBREVO(Long applicantId, String applicantType, String dateofBirth, String gender, int age,
			int tenureAddedAge, int tenure, double loanAmount, double income, String appSumittDate) {
		super();
		this.applicantId = applicantId;
		this.applicantType = applicantType;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.age = age;
		this.tenureAddedAge = tenureAddedAge;
		this.tenure = tenure;
		this.loanAmount = loanAmount;
		this.income = income;
		this.appSumittDate = appSumittDate;
	}

	public ApplicantDetailsBREVO() {
		super();
	}

	
}