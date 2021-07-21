/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Employee.PrescriptionDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.FoodSupplier.FoodPackageDirectory;
import Business.GroceryStorePerson.ItemsDirectory;
import Business.Nurse.Nurse;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Doctor;
import Business.PatientManager.PatientManager;
import Business.Pharmacist.MedicineDirectory;
import Business.RegisteredUser.DailyRepotDirectory;
import Business.RegisteredUser.RegisteredUser;
import Business.SanitizationPerson.SanitizationService;
import Business.SanitizationPerson.SanitizationServiceDirectory;
import Business.Tester.TestsDirectory;
import com.db4o.User;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author amishagupta
 */
public class HealthRequest {
    private String requestNumber;
    private String status;
    private RegisteredUser user;
    private Doctor doctor;
    private Nurse nurse;
    private PatientManager patientManager;
    private Organization organization;
    private String fever;
    private String cough;
    private String bodyPain;
    private String otherSymptoms;
    private HospitalEnterprise hospital;
    private TestsDirectory testDirectory;
    private TestsDirectory previousTestDirectory;
    private MedicineDirectory medicineDirectory;
    private MedicineDirectory previousmedicineDirectory;
    private ItemsDirectory itemsDirectory;
    private ItemsDirectory previousitemsDirectory;
    private SanitizationServiceDirectory saniServiceTypeDir;
    private SanitizationServiceDirectory previousSaniServiceTypeDir;
    private FoodPackageDirectory foodPackageDirectory;
    private FoodPackageDirectory previousFoodPackageDirectory;
    private PrescriptionDirectory prescriptionDirectory;
    private DailyRepotDirectory dailyReportDirectory;
    private OrderDirectory orderDirectoryMed;
    

    public HealthRequest(String status, RegisteredUser user, Doctor doctor, Nurse nurse, PatientManager patientManager, Organization organization, String fever, String cough, String bodyPain, String otherSymptoms, HospitalEnterprise hospital) {
        Random rnd = new Random();
        requestNumber = "Req-" + rnd.nextInt(99999);
        this.status = status;
        this.user = user;
        this.doctor = doctor;
        this.nurse = nurse;
        this.patientManager = patientManager;
        this.organization = organization;
        this.fever = fever;
        this.cough = cough;
        this.bodyPain = bodyPain;
        this.otherSymptoms = otherSymptoms;
        this.hospital = hospital;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RegisteredUser getUser() {
        return user;
    }

    public void setUser(RegisteredUser user) {
        this.user = user;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public PatientManager getPatientManager() {
        return patientManager;
    }

    public void setPatientManager(PatientManager patientManager) {
        this.patientManager = patientManager;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getCough() {
        return cough;
    }

    public void setCough(String cough) {
        this.cough = cough;
    }

    public String getBodyPain() {
        return bodyPain;
    }

    public void setBodyPain(String bodyPain) {
        this.bodyPain = bodyPain;
    }

    public String getOtherSymptoms() {
        return otherSymptoms;
    }

    public void setOtherSymptoms(String otherSymptoms) {
        this.otherSymptoms = otherSymptoms;
    }

    public HospitalEnterprise getHospital() {
        return hospital;
    }

    public void setHospital(HospitalEnterprise hospital) {
        this.hospital = hospital;
    }

    public TestsDirectory getTestDirectory() {
        if(testDirectory == null){
            testDirectory = new TestsDirectory();
        }
        return testDirectory;
    }

    public TestsDirectory getPreviousTestDirectory() {
        if(previousTestDirectory == null){
            previousTestDirectory = new TestsDirectory();
        }
        return previousTestDirectory;
    }

    public void setPreviousTestDirectory(TestsDirectory previousTestDirectory) {
        this.previousTestDirectory = previousTestDirectory;
    }

    public MedicineDirectory getMedicineDirectory() {
        if(medicineDirectory==null){
            medicineDirectory=new MedicineDirectory();
        }
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public MedicineDirectory getPreviousmedicineDirectory() {
        if(previousmedicineDirectory==null){
            previousmedicineDirectory=new MedicineDirectory();
        }
        return previousmedicineDirectory;
    }

    public void setPreviousmedicineDirectory(MedicineDirectory previousmedicineDirectory) {
        this.previousmedicineDirectory = previousmedicineDirectory;
    }

    public ItemsDirectory getItemsDirectory() {
        if(itemsDirectory==null){
            itemsDirectory=new ItemsDirectory();
        }
        return itemsDirectory;
    }

    public void setItemsDirectory(ItemsDirectory itemsDirectory) {
        this.itemsDirectory = itemsDirectory;
    }

    public ItemsDirectory getPreviousitemsDirectory() {
        if(previousitemsDirectory==null){
            previousitemsDirectory=new ItemsDirectory();
        }
        return previousitemsDirectory;
    }

    public SanitizationServiceDirectory getSaniServiceTypeDir() {
        if(saniServiceTypeDir==null){
            saniServiceTypeDir=new SanitizationServiceDirectory();
        }
        return saniServiceTypeDir;
    }

    public void setSaniServiceTypeDir(SanitizationServiceDirectory saniServiceTypeDir) {
        this.saniServiceTypeDir = saniServiceTypeDir;
    }

    public SanitizationServiceDirectory getPreviousSaniServiceTypeDir() {
        if(previousSaniServiceTypeDir==null){
            previousSaniServiceTypeDir=new SanitizationServiceDirectory();
        }
        return previousSaniServiceTypeDir;
    }

    public void setPreviousSaniServiceTypeDir(SanitizationServiceDirectory previousSaniServiceTypeDir) {
        this.previousSaniServiceTypeDir = previousSaniServiceTypeDir;
    }
    
    

    public void setPreviousitemsDirectory(ItemsDirectory previousitemsDirectory) {
        this.previousitemsDirectory = previousitemsDirectory;
    }

    public FoodPackageDirectory getFoodPackageDirectory() {
        if(foodPackageDirectory==null){
            foodPackageDirectory=new FoodPackageDirectory();
        }
        return foodPackageDirectory;
    }

    public void setFoodPackageDirectory(FoodPackageDirectory foodPackageDirectory) {
        this.foodPackageDirectory = foodPackageDirectory;
    }

    public FoodPackageDirectory getPreviousFoodPackageDirectory() {
        if(previousFoodPackageDirectory==null){
            previousFoodPackageDirectory=new FoodPackageDirectory();
        }
        return previousFoodPackageDirectory;
    }

    public void setPreviousFoodPackageDirectory(FoodPackageDirectory previousFoodPackageDirectory) {
        this.previousFoodPackageDirectory = previousFoodPackageDirectory;
    }
    
    

    
    public PrescriptionDirectory getPrescriptionDirectory() {
        if(prescriptionDirectory==null){
            prescriptionDirectory = new PrescriptionDirectory();
        }
        return prescriptionDirectory;
    }

    public void setPrescriptionDirectory(PrescriptionDirectory prescriptionDirectory) {
        this.prescriptionDirectory = prescriptionDirectory;
    }

    public DailyRepotDirectory getDailyReportDirectory() {
        if(dailyReportDirectory == null){
            dailyReportDirectory = new DailyRepotDirectory();
        }
        return dailyReportDirectory;
    }

    public OrderDirectory getOrderDirectoryMed() {
        if(orderDirectoryMed == null){
            orderDirectoryMed = new OrderDirectory();
        }
        return orderDirectoryMed;
    }

    
      @Override
    public String toString() {
        return requestNumber;
    }
}
