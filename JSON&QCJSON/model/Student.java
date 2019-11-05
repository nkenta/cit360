package model;

import java.io.Serializable;

/**
 * In computing based on the Java Platform, JavaBeans are classes that
 * encapsulate many objects into a single object. They are Serializable, have a
 * zero-argument constructor, and allow access to properties using getter and
 * setter methods.*
 */
public class Student implements Serializable {

    // Student First Name
    private String firstName;
    // Student Last Name
    private String lastName;
    // Students School Name
    private String schoolName;
    // Student Enrolled Year
    private int enrolledYear;
    // Student Current GPA
    private double currentGpa;
    // Student Graduation Year
    private int graduateYear;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String schoolName,
            int enrolledYear, double currentGpa, int graduateYear) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.enrolledYear = enrolledYear;
        this.currentGpa = currentGpa;
        this.graduateYear = graduateYear;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the schoolName
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * @param schoolName the schoolName to set
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * @return the enrolledYear
     */
    public int getEnrolledYear() {
        return enrolledYear;
    }

    /**
     * @param enrolledYear the enrolledYear to set
     */
    public void setEnrolledYear(int enrolledYear) {
        this.enrolledYear = enrolledYear;
    }

    /**
     * @return the currentGpa
     */
    public double getCurrentGpa() {
        return currentGpa;
    }

    /**
     * @param currentGpa the currentGpa to set
     */
    public void setCurrentGpa(double currentGpa) {
        this.currentGpa = currentGpa;
    }

    /**
     * @return the graduateYear
     */
    public int getGraduateYear() {
        return graduateYear;
    }

    /**
     * @param graduateYear the graduateYear to set
     */
    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }

}
