/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicant;

/**
 *
 * @author Nkenta Uchechukwu
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import qcjson.*;
import model.Student;

public class RunJSON {

    public static void main(String[] args) {

        Student student = new Student("Uchechukwu", "Nkenta", "Brigham Young University", 2016, 4, 2020);
        File studentFile = new File("studentFile.json");

        try {

            // This will add a return to variable in which will print it out
            String jsonString = JSONUtilities.stringify(student);
            System.out.print("Java object converted to json:\n");
            System.out.print("------------------------------\n");
            System.out.print(jsonString);

            // Creates file and return from JSON
            FileOutputStream fileStream = new FileOutputStream(studentFile);
            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
            jsonOut.writeObject(student);
            jsonOut.close();

        } catch (JSONException | IOException exc) {
            exc.printStackTrace();
        }

        try {

            // This will read from the file
            FileInputStream fileStream = new FileInputStream(studentFile);
            JSONInputStream jsonFile = new JSONInputStream(fileStream);

            HashMap jsonMap = (HashMap) jsonFile.readObject();
            jsonFile.close();

            Student studentData = new Student();
            studentData.setFirstName((String) jsonMap.get("firstName"));
            studentData.setLastName((String) jsonMap.get("lastName"));
            studentData.setSchoolName((String) jsonMap.get("schoolName"));
            long enrolledYear = (long) jsonMap.get("enrolledYear");
            studentData.setEnrolledYear((int) enrolledYear);
            studentData.setCurrentGpa((double) jsonMap.get("currentGpa"));
            long graduateYear = (long) jsonMap.get("graduateYear");
            studentData.setGraduateYear((int) graduateYear);

            String jsonString = JSONUtilities.stringify(studentData);
            System.out.print("\n\nJSON string in studentFile:\n");
            System.out.print("---------------------------\n");
            System.out.print(jsonString);
            System.out.print("\n\nJSON string converted to java. Here each values are added to the Student java object:\n");
            System.out.print("-------------------------------------------------------------------------------------\n");
            System.out.print("Fullname: " + studentData.getFirstName() + " " + studentData.getLastName()
                    + "\n" + "School: " + studentData.getSchoolName() + "\n" + "Enrolled Year: "
                    + studentData.getEnrolledYear() + "\n" + "Current GPA: " + studentData.getCurrentGpa()
                    + "\n" + "Graduate Year: " + studentData.getGraduateYear() +"\n\n");

        } catch (JSONException | IOException | ParseException e) {
            e.printStackTrace();
        }

    }

}
