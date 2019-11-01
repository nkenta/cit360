/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nkenta Uchechukwu
 */

import java.util.HashMap;

public class RunJUnits {
    // Determine the size of a cube
 public int CalCube (int w, int l, int h){
	int cubeSize = w * l * h;
	return cubeSize;
	}

    // Run a program based on conditional statement
    // Using boolean "True" or "False"
    // Check if the GPA is greater than or equal to 3.0
    public boolean checkGPA(int gpa){
	boolean gpaReport = false;
	if(gpa >= 3.0){
	   gpaReport = true;
	}
	return gpaReport;
	}
    
    // Add values to specific variables.
    public String getValue(final String block){
        HashMap<String, String> value = new HashMap<>();
        value.put("BlockA", "Team1");
        value.put("BlockB", "Team2");
        value.put("BlockC", "Team3");
        // Return Value
        return value.get(block);
    }
    
    // Array: Create an arrry to hold a fixed number of string value using cury braces {}
    public static String[] stringArray() {
		String[] words = {"Cowboy", "animal", "monster"};
		return words;
	}
}	
