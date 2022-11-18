package pack10;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    
    private int empId;
    private String empName;
    private String address;
    private int salary;
    
    public Employee() {}

    public Employee(int empId, String empName, String address, int salary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", salary=" + salary
                + "]";
    }    
    
    
    @Override
    public int hashCode() {
        return Objects.hash(address, empId, empName, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(address, other.address) && empId == other.empId && Objects.equals(empName, other.empName)
                && salary == other.salary;
    }

    
    @Override
    public int compareTo(Employee o) {
        Employee e1 = this;
        Employee e2 = o;
        
        if(e1.getEmpId() > e2.getEmpId()) return 1;
        else if (e1.getEmpId() < e2.getEmpId()) return -1;
        return 0;
    } 
    
    

}
