/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class EnterpriseDirectory {
     private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String numOfBeds,String name,String contactNumber, String email, String address, String zipcode,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(numOfBeds, name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.FoodSupplyingUnits){
            enterprise=new FoodSupplyingEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
         else if(type==Enterprise.EnterpriseType.NecessitiesProvider){
            enterprise=new NecessitiesProviderEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseType.PatientSupportServices){
            enterprise=new PatientSupportEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
           else if(type==Enterprise.EnterpriseType.SanitizationUnits){
            enterprise=new SanitizationEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
            else if(type==Enterprise.EnterpriseType.TestingUnits){
            enterprise=new TestingEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
             else if(type==Enterprise.EnterpriseType.Transportation){
            enterprise=new TranspotationEnterprise(name, contactNumber, email, address, zipcode);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
