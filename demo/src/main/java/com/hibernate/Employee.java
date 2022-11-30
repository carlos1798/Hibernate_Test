package com.hibernate;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @Column(name = "emp_no")
  private int emp_no;

  @Column(name = "birth_date")
  private Date birth_date;

  @Column(name = "first_name")
  private String first_name;

  @Column(name = "last_name")
  private String last_name;

  @Column(name = "gender")
  private String gender;

  @Column(name = "hire_date")
  private Date hire_date;

  /**
 * @param emp_no
 * @param birth_date
 * @param first_name
 * @param last_name
 * @param gender
 * @param hire_date
 */
public Employee(
    int emp_no,
    Date birth_date,
    String first_name,
    String last_name,
    String gender,
    Date hire_date
  ) {
    this.emp_no = emp_no;
    this.birth_date = birth_date;
    this.first_name = first_name;
    this.last_name = last_name;
    this.gender = gender;
    this.hire_date = hire_date;
  }

  public int getEmp_no() {
    return emp_no;
  }

  public void setEmp_no(int emp_no) {
    this.emp_no = emp_no;
  }

  public Date getBirth_date() {
    return birth_date;
  }

  public void setBirth_date(Date birth_date) {
    this.birth_date = birth_date;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getHire_date() {
    return hire_date;
  }

  public void setHire_date(Date hire_date) {
    this.hire_date = hire_date;
  }
}
