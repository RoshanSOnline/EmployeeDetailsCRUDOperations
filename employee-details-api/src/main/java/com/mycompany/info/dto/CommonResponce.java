/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.info.dto;

/**
 *
 * @author RoshanS
 */
public class CommonResponce {

   private int    resultCode ;
   private String resultDescription ;
   private Object resultObject ;

   public CommonResponce () {}
   
   public CommonResponce (  int resultCode , String resultDescription ,Object resultObject ) {  
      this.resultCode        = resultCode ;
      this.resultDescription = resultDescription ;
      this.resultObject      = resultObject ;
   }
      
   public int getResultCode() {
      return resultCode;
   }

   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   public String getResultDescription() {
      return resultDescription;
   }

   public void setResultDescription(String resultDescription) {
      this.resultDescription = resultDescription;
   }

   public Object getResultObject() {
      return resultObject;
   }

   public void setResultObject(Object resultObject) {
      this.resultObject = resultObject;
   }
   
}
