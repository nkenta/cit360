/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsinaction;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Deque;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class ListCollection {
 public static void main(String[] args) {
        // Making a list
        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("DVD Player");
        electronics.add("Video Game");
        electronics.add("Telephone");
        electronics.add("Cell Phone");
        electronics.add("Laptop");
        electronics.add("Printer");
        System.out.println("Amazon list for top Electronics:");
        System.out.println("\t" + electronics);
        
        // Delete specific element from the list
        electronics.remove(3);
        System.out.println("A List from Amazon Electronics was Removed (Telephone) :");
        System.out.println("\t" + electronics);
        
        // Verify Delete
        if(electronics.remove("Telephone")) {
            System.out.println("Removed");
        } else {
            System.out.println("Sorry! Telephone not found");
        }
        
        // Add an element to a specific index number
        electronics.add(5, "Smart Watch");
        System.out.println("New item added on Amazon Eletronics list (Smart Watch) :");
        System.out.println("\t" + electronics);
        
        // Update elements in a Capital letter format
        electronics.set(1, "KEYBOARD");
        electronics.set(2, "AIRCOOL");
        electronics.add(3, "DECODER");
        electronics.add(4, "TOY CAR");
        System.out.println("A capitalized List of items on Amazon Electronics:");
        System.out.println("\t" + electronics);
        
        // Iterate through the list
        electronics.forEach(System.out::println);
        
         // Search the list
        if(electronics.contains("Printer")) {
            System.out.println("Found Printer on the list");
        } else {
            System.out.println("Sorry! Printer not found");
        }
        
         // Make a copy of the list
        List<String> ebayElectronic = new ArrayList<>();
        Collections.copy(electronics, ebayElectronic);
        System.out.println("New copies from Amazon Electronics to Ebay Electrics list: " + electronics);
        
        // Sort the list
        Collections.sort(electronics);
        System.out.println("Amozon List sorted: " + electronics);
        
        // find indexed element
        int firstIndex = electronics.indexOf("TV");
        System.out.println("Success! TV found " + firstIndex);
        
        // Shuffle the list
        Collections.shuffle(electronics);
        System.out.println("New Shuffled list: " + electronics);
        
        // Reversing the list
        Collections.reverse(electronics);
        System.out.println("Electronics reversed: " + electronics);    
        
        
                // Make a Queue (Sequence) list
        Queue<String> queueelectronics;
        queueelectronics = new LinkedList<>();
        queueelectronics.add("Watch");
        queueelectronics.add("Modem");
        queueelectronics.add("Router");
        queueelectronics.add("Fan");
        queueelectronics.add("Electric Bell");
        
        // Remove specific item from the queue list
       String router;
       router = queueelectronics.remove();
       System.out.println("Success! List removed: " + queueelectronics);
        
        
        // Adding element to the first and last of the list
       Deque<String> queueelectronics2 = new ArrayDeque<>(queueelectronics);
       queueelectronics2.addFirst("Portable Game");
       queueelectronics2.addLast("Smart shoe");
       System.out.println("Portabel Game and Smart show added: "
               + queueelectronics2);
        
       
 } 
}
    