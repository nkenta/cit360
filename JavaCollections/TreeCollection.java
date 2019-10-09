/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsinaction;

import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author Nkenta Uchechukwu
 */
public class TreeCollection {
    public static void main(String args[]) {
        
    // Create and add element
    TreeSet<String> course;
        course = new TreeSet<>();
    course.add("Physics");
    course.add("Chemistry");
    course.add("Math");
    course.add("English");
    course.add("French");
    
    // Iterate through TreeSet
    Iterator<String> iterate;
        iterate = course.iterator();
        while(iterate.hasNext()) {
        System.out.println("Main List: " + iterate.next());
        }
    }
}
