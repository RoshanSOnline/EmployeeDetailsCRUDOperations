package com.mycompany.info.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.info.domain.EmployeeDetails;
import com.mycompany.info.dto.CommonResponce;
import com.mycompany.info.service.EmployeeDetailsService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeDetailsController {

   @Autowired
   private EmployeeDetailsService employeeDetailsService ;
   private CommonResponce commonResponce ;
   private static final Logger log = Logger.getLogger(EmployeeDetailsController.class);


   @GetMapping(value = "/all")
   public List<EmployeeDetails> getEmployeeDetailsById( ) {
      try {
         return employeeDetailsService.getEmployeeDetails();
         
      } catch (Exception e) {
         log.error("****** Exception Occurred in getEmployeeDetailsById ******* " + e);
      }
      return null;
   }

   @PostMapping(value = "/add")
   public EmployeeDetails addEmployeeDetails( @RequestBody EmployeeDetails newEmployee ) {
      try {
         if ( newEmployee != null ) {
            return employeeDetailsService.addNewEmployee(newEmployee);
         }
      } catch (Exception e) {
         log.error("****** Exception Occurred in addEmployeeDetails ******* " + e);
      }
      return null;
   }
   
   @PutMapping(value = "/update")
   public EmployeeDetails updateEmployeeDetailsById( @RequestBody EmployeeDetails employee ) {
      try {
         if ( employee != null ) {
            return employeeDetailsService.updateEmployee(employee );
         }
      } catch (Exception e) {
         log.error("****** Exception Occurred in updateEmployeeDetailsById ******* " + e);
      }
      return null;
   }
   
   @DeleteMapping(value = "/{id}")
   public EmployeeDetails deleteEmployeeDetailsById( @PathVariable int employeeId ) {
      try {
         if ( employeeId != 0 ) {
             employeeDetailsService.deleteEmployee( employeeId );
         }
      } catch (Exception e) {
         log.error("****** Exception Occurred in deleteEmployeeDetailsById ******* " + e);
      }
      return null;
   }
}
