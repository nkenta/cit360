/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsinaction;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class SetCollection {
    public static void main(String args[]) {
        // This does not retain the way it was written. use new HashSetLinkedSet to maintain order
       // new TreeSet can be used to make it in order
        Set<String> fruitBox1;
        fruitBox1 = new HashSet<>();
        // Making an if statement for empty name field
        if(fruitBox1.isEmpty()) {
            System.out.println("Sorry! This is empty.");
        }
        fruitBox1.add("Apple");
        fruitBox1.add("Orange");
        fruitBox1.add("Mango");
        fruitBox1.add("Daney"); 
        System.out.println("Here are the names in set: " + fruitBox1);
        System.out.println("HashSet does not maintain the name order. "
                + "Use HashLinkedSet to make it in order. Or use the TreeSet to "
                + "create arrange the names in alphabetical or numerical order");
                      
        // Sample of Sets (Note: Does not allow duplicates)
        fruitBox1.add("Apple");
        fruitBox1.add("Mango");
        System.out.println("Sorry! This item can not be added. "
                + "Name already exist. See:" + fruitBox1);
        
        // Setting (adding) a unique item
        fruitBox1.add("Lemon");
        System.out.println("New item added:" + fruitBox1);
        
        // iterate the set
        fruitBox1.forEach((element) -> {
            System.out.println(element);
        });
        
        // Search for item
        if (fruitBox1.contains("Apple")) {
            System.out.println("Apple found.");
        }
        
      // Intersection
        Set<String> fruitBox2 = new HashSet<>();
        fruitBox2.add("Apple");
        fruitBox2.add("Pinapple");
        fruitBox2.add("Grape");
        fruitBox2.add("Orange");      
                
        // View the two diffrent fruit box
        Set<String> difference = new HashSet<>(fruitBox1);
        difference.removeAll(fruitBox2);
        System.out.println("Here are the two sets (FruitBox1 and FruitBox2):" + difference);
        
        // Make a copy of the fruit
        Set<String> intersection = new HashSet<>(fruitBox1);
            System.out.println(intersection);
        
    }  
}