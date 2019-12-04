/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;

/**
 *
 * @author Nkenta
 */
import java.io.Serializable;

public class Data implements Serializable {

    private long id;
    // This includes/holds the users important informations
    private String firstName;
    private String middleName;
    private String surName;
    private String age;
    private String email;
    private String occupation;
    private String location;

    public Data() {
        super();
    }

    public Data(long id, String firstName, String middleName, String surName, 
            String age, String email, String occupation, String location) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
        this.age = age;
        this.email = email;
        this.occupation = occupation;
        this.location = location;
    }

    // Get the user ID
    public long getId() {
        return id;
    }

    // Set the user ID
    public void setId(long id) {
        this.id = id;
    }

    // Get the user's first name
    public String getFirstName() {
        return firstName;
    }

    // Set the user's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Get user's middle name
    public String getMiddleName() {
        return middleName;
    }

    // Set user's middle name
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // Get user's surname
    public String getSurName() {
        return surName;
    }

    // Set user's surname
    public void setSurName(String surName) {
        this.surName = surName;
    }

    // Get user's Age
    public String getAge() {
        return age;
    }

    // Set user's Age
    public void setAge(String age) {
        this.age = age;
    }

    // Get user's email
    public String getEmail() {
        return email;
    }

    // Set user's email
    public void setEmail(String email) {
        this.email = email;
    }

    // Get user's occupation
    public String getOccupation() {
        return occupation;
    }

    // Set user's occupation
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    // Get user's location
    public String getLocation() {
        return location;
    }

    // Set user's location
    public void setLocation(String location) {
        this.location = location;
    }
}
