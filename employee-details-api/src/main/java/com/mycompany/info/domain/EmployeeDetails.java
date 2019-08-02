package com.mycompany.info.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class EmployeeDetails {

   @Id
   @GeneratedValue( strategy = GenerationType.AUTO)
   private int    id;
   private String firstName;
   private String lastName;
   @ManyToOne
   @JoinColumn
   private DepartmentDetails departmentDetails ;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public DepartmentDetails getDepartmentDetails() {
      return departmentDetails;
   }

   public void setDepartmentDetails(DepartmentDetails departmentDetails) {
      this.departmentDetails = departmentDetails;
   }

   
}
