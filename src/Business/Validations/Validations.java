/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author amishagupta
 */
public class Validations {
    
     
    public Boolean isValidPassword(String password) {
        Pattern pat;
        pat = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,15}$");
        Matcher matcher = pat.matcher(password);
        boolean b = matcher.matches();
        if (!b) {
            JOptionPane.showMessageDialog(null,
                    "A password is considered valid if all the following constraints are satisfied!\n"
                    + "It contains at least 8 characters and at most 15 characters.\n"
                    + "It contains at least one upper case alphabet [A-Z].\n"
                    + "It contains at least one lower case alphabet [a-z].\n"
                    + "It contains at least one special character which includes !@#$%&*()-+=^.\n"
                    + "It doesn’t contain any white space.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public Boolean isValidEmail(String email) {
        Pattern pat;
        Matcher matcher;

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        pat = Pattern.compile(emailRegex);
        matcher = pat.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid email format! Eg: test@test.com", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public Boolean isValidZipCode(String zipcode){
        Pattern pat;
        Matcher matcher;
        
        String zipcodeRegex="^[0-9]{5}(?:-[0-9]{4})?$";
        pat=Pattern.compile(zipcodeRegex);
        matcher=pat.matcher(zipcode);
        if(matcher.matches()){
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter valid Zipcode.", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public Boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern;
        Matcher matcher;
        String phonePattern = "^[0-9]{10}$";
        pattern = Pattern.compile(phonePattern);
        matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid mobile number! Ex: 7873923408", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean isInt(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public boolean isNull(String strNum) {
        if (strNum.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
}
