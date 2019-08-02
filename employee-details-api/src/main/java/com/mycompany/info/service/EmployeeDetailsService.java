package com.mycompany.info.service;

import com.mycompany.info.domain.EmployeeDetails;
import java.util.List;

public interface EmployeeDetailsService {

   public List< EmployeeDetails > getEmployeeDetails() throws Exception;
   public EmployeeDetails   addNewEmployee( EmployeeDetails newEmployeeDetails ) throws Exception;
   public EmployeeDetails   updateEmployee( EmployeeDetails employeeDetails ) throws Exception;
   public void              deleteEmployee( int employeeId ) throws Exception;

}
