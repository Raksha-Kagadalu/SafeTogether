/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CDC;

/**
 *
 * @author shrikrishnajoisa
 */
public class CDC {

    // variable which is used to set everything
    public CDC(String firstName, String secondName, String userID, String userPassword, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.userID = userID;
        this.userPassword = userPassword;
        this.phoneNumber = phoneNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Holds everything that is related to government
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    String firstName;
    String secondName;
    String userID;
    String userPassword;
    String phoneNumber;
          
}