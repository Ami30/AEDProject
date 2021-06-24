/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.AmbulanceDriver.AmbulanceDriverDirectory;
import Business.CabDriver.CabDriverDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.FoodSupplier.FoodSupplierDirectory;
import Business.GroceryStorePerson.GroceryStorePersonDirectory;
import Business.Nurse.NurseDirectory;
import Business.RegisteredUser.RegisteredUserDirectory;
import Business.PatientManager.PatientManagerDirectory;
import Business.Pharmacist.PharmacistDirectory;
import Business.Role.Role;
import Business.SanitizationPerson.SanitizationPersonDirectory;
import Business.Tester.TesterDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public abstract class Organization {
    
    private String name;
    private String email;
    private String contactNumber;
    private String zipcode;
    private String address;
    private WorkQueue workQueue;
    private UserAccountDirectory accountDirectory;
    private EmployeeDirectory empDir;
    private DoctorDirectory docDir;
    private NurseDirectory nurDir;
    private PharmacistDirectory pharDir;
    private DeliveryManDirectory delManDir;
    private GroceryStorePersonDirectory GrocPerDir;
    private PatientManagerDirectory pManagerDir;
    private SanitizationPersonDirectory saniPersonDir;
    private TesterDirectory testerDir;
    private FoodSupplierDirectory foodSupplierDir;
    private CabDriverDirectory cabDriverDir;
    private AmbulanceDriverDirectory ambulanceDriverDir;

    private int orgID;
    private static int counter=0;
    private Type type;
    public abstract ArrayList<Role> getSupportedRole();
    
    public enum Type{
        Doctor("Doctor Organization"),
        Nurse("Nurse Organization"),
        FoodProvider("Food Provider Organization"),
        CabProvider("Cab Provider Organization"),
        AmbulanceProvider("Ambulance Provider Organization"),
        DeliveryMan("Delivery Provider Organization"),
        Pharmacy("Pharmacy Organization"),
        GroceryStore("Grocery Store Organization"),
        SanitizationProvider("Sanitization Provider Organization"),
        TestingProvider("Testing Provider Organization"),
        PatientManager("Patient Manager Organization");

        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
          @Override
        public String toString() {
            return value;
        }
    }

    public Organization(String name, String contactNumber, String email, String address, String zipcode) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.zipcode = zipcode;
        workQueue = new WorkQueue();
        empDir = new EmployeeDirectory();
//        docDir=new DoctorDirectory();
//        nurDir=new NurseDirectory();
        pharDir=new PharmacistDirectory();
        delManDir=new DeliveryManDirectory();
        GrocPerDir=new GroceryStorePersonDirectory();
        pManagerDir=new PatientManagerDirectory();
        saniPersonDir=new SanitizationPersonDirectory();
        testerDir=new TesterDirectory();
        foodSupplierDir=new FoodSupplierDirectory();
        cabDriverDir=new CabDriverDirectory();
        ambulanceDriverDir=new AmbulanceDriverDirectory();  
       // accountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }

    public Organization(String name) {
        this.name = name;
    }
    
    public UserAccountDirectory getUserAccountDir() {
        if(accountDirectory==null){
        accountDirectory = new UserAccountDirectory();
        }
        return accountDirectory;
    }

    public int getOrgID() {
        return orgID;
    }

    public DoctorDirectory getDocDir() {
        if(docDir == null){
            docDir=new DoctorDirectory();
        }
        return docDir;
    }

    public void setDocDir(DoctorDirectory docDir) {
        this.docDir = docDir;
    }

    public PharmacistDirectory getPharDir() {
        return pharDir;
    }

    public void setPharDir(PharmacistDirectory pharDir) {
        this.pharDir = pharDir;
    }

    public PatientManagerDirectory getpManagerDir() {
        return pManagerDir;
    }

    public void setpManagerDir(PatientManagerDirectory pManagerDir) {
        this.pManagerDir = pManagerDir;
    }

    public SanitizationPersonDirectory getSaniPersonDir() {
        return saniPersonDir;
    }

    public void setSaniPersonDir(SanitizationPersonDirectory saniPersonDir) {
        this.saniPersonDir = saniPersonDir;
    }

    public TesterDirectory getTesterDir() {
        return testerDir;
    }

    public void setTesterDir(TesterDirectory testerDir) {
        this.testerDir = testerDir;
    }

    public FoodSupplierDirectory getFoodSupplierDir() {
        return foodSupplierDir;
    }

    public void setFoodSupplierDir(FoodSupplierDirectory foodSupplierDir) {
        this.foodSupplierDir = foodSupplierDir;
    }

    public CabDriverDirectory getCabDriverDir() {
        return cabDriverDir;
    }

    public void setCabDriverDir(CabDriverDirectory cabDriverDir) {
        this.cabDriverDir = cabDriverDir;
    }

    public AmbulanceDriverDirectory getAmbulanceDriverDir() {
        return ambulanceDriverDir;
    }

    public void setAmbulanceDriverDir(AmbulanceDriverDirectory ambulanceDriverDir) {
        this.ambulanceDriverDir = ambulanceDriverDir;
    }
    

    public DeliveryManDirectory getDelManDir() {
        return delManDir;
    }

    public void setDelManDir(DeliveryManDirectory delManDir) {
        this.delManDir = delManDir;
    }

    public GroceryStorePersonDirectory getGrocPerDir() {
        return GrocPerDir;
    }

    public void setGrocPerDir(GroceryStorePersonDirectory GrocPerDir) {
        this.GrocPerDir = GrocPerDir;
    }

    public NurseDirectory getNurDir() {
        if(nurDir == null){
            nurDir=new NurseDirectory();
        }
        return nurDir;
    }

    public void setNurDir(NurseDirectory nurDir) {
        this.nurDir = nurDir;
    }

    public EmployeeDirectory getEmpDir() {
        return empDir;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
}
