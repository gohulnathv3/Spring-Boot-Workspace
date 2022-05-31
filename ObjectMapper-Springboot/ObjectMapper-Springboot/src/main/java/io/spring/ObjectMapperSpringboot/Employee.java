package io.spring.ObjectMapperSpringboot;

public class Employee {
  private String name;
  private String designation;
  private String location;
  private String department;

  public Employee(){
      super();
  }

    public Employee(String name, String designation, String location, String department) {
        this.name = name;
        this.designation = designation;
        this.location = location;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
