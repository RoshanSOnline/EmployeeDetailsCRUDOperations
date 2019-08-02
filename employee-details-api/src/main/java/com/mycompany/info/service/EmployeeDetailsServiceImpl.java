package com.mycompany.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.info.domain.EmployeeDetails;
import com.mycompany.info.repository.EmployeeDetailsRepository;
import java.util.List;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

   @Autowired
   private EmployeeDetailsRepository employeeDetailsRepository;

   @Override
   public List< EmployeeDetails > getEmployeeDetails( ) throws Exception {
      return employeeDetailsRepository.findAll();
   }

   @Override
   public EmployeeDetails addNewEmployee(EmployeeDetails newEmployeeDetails) throws Exception {
      return employeeDetailsRepository.save( newEmployeeDetails );
   }

   @Override
   public EmployeeDetails updateEmployee(EmployeeDetails employeeDetails) throws Exception {
      return employeeDetailsRepository.saveAndFlush( employeeDetails );
   }

   @Override
   public void deleteEmployee(int employeeId) throws Exception {
      employeeDetailsRepository.deleteById( employeeId );
   }

}
