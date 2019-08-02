/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.info.repository;

import com.mycompany.info.domain.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author  RoshanS
 */

@Repository
public interface EmployeeDetailsRepository extends JpaRepository< EmployeeDetails, Integer>{
   
}
