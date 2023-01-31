package org.emp;

public class Employee {
private void empId() {
System.out.println("ID : 12345");
}
private void empName() {
System.out.println("Name : KARTHIK R");
}
private void empdDob() {
System.out.println("DOB : 01/01/2000");
}
private void empPh() {
System.out.println("Phone : 8459566545");
}
private void empEmail() {
System.out.println("Email : karthik@gmail.com");
}
private void empAdd() {
System.out.println("No.1,7th street, Pallavaram, Chennnai");
}
public static void main(String[] args) {
 Employee a=new Employee();
 a.empId();
 a.empName();
 a.empdDob();a.empEmail();
 a.empPh();a.empAdd();
}
}
