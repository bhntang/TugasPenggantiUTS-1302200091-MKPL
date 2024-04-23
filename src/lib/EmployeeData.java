// package ini untuk menyimpan data Employe kayak nama, alamat, tangggal joinnya dan lainnya


package lib;

import java.util.LinkedList;
import java.util.List;

public class EmployeeData {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;
    private Date joinDate;
    private boolean isForeigner;
    private boolean gender;
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;
    private String spouseName;
    private String spouseIdNumber;
    private List<String> childNames;
    private List<String> childIdNumbers;

    
    public EmployeeData(String employeeId, String firstName, String lastName, String idNumber, String address, Date joinDate, boolean isForeigner, boolean gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.joinDate = joinDate;
        this.isForeigner = isForeigner;
        this.gender = gender;
        childNames = new LinkedList<>();
        childIdNumbers = new LinkedList<>();
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public void setSpouse(String spouseName, String spouseIdNumber) {
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
    }

    public void addChild(String childName, String childIdNumber) {
        childNames.add(childName);
        childIdNumbers.add(childIdNumber);
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public List<String> getChildIdNumbers() {
        return childIdNumbers;
    }
}