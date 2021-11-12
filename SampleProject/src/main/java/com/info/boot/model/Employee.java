/*
 * package com.info.boot.model;
 * 
 * import java.util.Objects;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.Id; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table public class Employee {
 * 
 * 
 * public Employee(Integer employeeId, String employeeName, Double
 * employeeSalary) { super(); this.employeeId = employeeId; this.employeeName =
 * employeeName; this.employeeSalary = employeeSalary; }
 * 
 * 
 * public Employee(int employeeId2, String employeeName2, double
 * employeeSalary2) { // TODO Auto-generated constructor stub }
 * 
 * 
 * private Integer employeeId; private String employeeName; private Double
 * employeeSalary;
 * 
 * public Integer getEmployeeId() { return employeeId; } public void
 * setEmployeeId(Integer employeeId) { this.employeeId = employeeId; } public
 * String getEmployeeName() { return employeeName; } public void
 * setEmployeeName(String employeeName) { this.employeeName = employeeName; }
 * public Double getEmployeeSalary() { return employeeSalary; } public void
 * setEmployeeSalary(Double employeeSalary) { this.employeeSalary =
 * employeeSalary; }
 * 
 * @Override public String toString() { return "Employee [employeeId=" +
 * employeeId + ", employeeName=" + employeeName + ", employeeSalary=" +
 * employeeSalary + "]"; }
 * 
 * @Override public int hashCode() { return Objects.hash(employeeId,
 * employeeName, employeeSalary); }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Employee other = (Employee) obj; return Objects.equals(employeeId,
 * other.employeeId) && Objects.equals(employeeName, other.employeeName) &&
 * Objects.equals(employeeSalary, other.employeeSalary); } }
 */