package lib;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private EmployeeData employeeData;
    private SalaryCalculator salaryCalculator;
    private TaxCalculator taxCalculator;

    public Employee(EmployeeData employeeData, SalaryCalculator salaryCalculator, TaxCalculator taxCalculator) {
        this.employeeData = employeeData;
        this.salaryCalculator = salaryCalculator;
        this.taxCalculator = taxCalculator;
    }

    public void calculateMonthlySalary(int grade) {
        employeeData.setMonthlySalary(salaryCalculator.calculateMonthlySalary(grade, employeeData.isForeigner()));
    }

    public void setAnnualDeductible(int deductible) {
        employeeData.setAnnualDeductible(deductible);
    }

    public void setAdditionalIncome(int income) {
        employeeData.setOtherMonthlyIncome(income);
    }

    public void setSpouse(String spouseName, String spouseIdNumber) {
        employeeData.setSpouse(spouseName, spouseIdNumber);
    }

    public void addChild(String childName, String childIdNumber) {
        employeeData.addChild(childName, childIdNumber);
    }

    public int getAnnualIncomeTax() {
        int monthWorkingInYear = calculateMonthsWorkedInYear();
        return taxCalculator.calculateTax(employeeData, monthWorkingInYear);
    }

    private int calculateMonthsWorkedInYear() {
        LocalDate now = LocalDate.now();
        if (now.getYear() == employeeData.getJoinDate().getYear()) {
            return now.getMonthValue() - employeeData.getJoinDate().getMonth();
        } else {
            return 12;
        }
    }
}