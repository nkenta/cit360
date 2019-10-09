/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        System.out.println("----------ArrayLists---------------");
        //Add a list of items in array but remove one
        ArrayList<String> fruit;
        fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Lemon");
        fruit.add("Mango");
        
        boolean remove;
        remove = fruit.remove("Grape");
        System.out.println(fruit);
        
        System.out.println("----------ArrayList Sort----------");
        //Sort an ArrayList Strings
        ArrayList<String> animals;
        animals = new ArrayList<>();
        animals.add("Lizards");
        animals.add("Fish");
        animals.add("Snakes");
        animals.add("Dog");

        Collections.sort(animals);
        System.out.println(animals);
        
        System.out.println("------ArrayList Sort Integer-------");
        //Sort an ArrayList Integer
        ArrayList<Integer> nums;
        nums = new ArrayList<>();
        nums.add(5);
        nums.add(43);
        nums.add(5);
        nums.add(62);
        nums.add(18);

        Collections.sort(nums);
        System.out.println(nums);
        
        System.out.println("----------HashMap---------------");
        //HashMap returns value attached to an element
        HashMap<String, Double> gpa;
        gpa = new HashMap<>();
        gpa.put("Alex", 3.5);
        gpa.put("Ferdinand", 4.0);
        gpa.put("Mike", 2.4);
        System.out.println(gpa.get("Ferdinand")); 

        System.out.println("----------HashSet---------------");
        //HashSet
        HashSet<String> set;
        set = new HashSet<>();
        set.add("360");
        set.add("180");
        set.add("60");
        System.out.println(set);
        
        System.out.println("----------LinkedLists---------------");
        //LinkedList of student but ommit one student (Eric)
        LinkedList<String> students;
        students = new LinkedList<>();
        students.add("Alex");
        students.add("John");
        students.add("Emma");
        students.add("Dinna");
        
        students.remove("Eric");
        students.forEach((name) -> {
            System.out.println(name);
        });     
        
        System.out.println("-------LinkedList/Iterator---------");
        LinkedList<String> Colors;
        Colors = new LinkedList<>();
        Colors.add("RED");
        Colors.add("BLUE");
        Colors.add("GREEN");
        //An iterator over a collection.
        Iterator<String> Color;
        Color = Colors.iterator();
        String value = Color.next();
        System.out.println(value);
    } 
}
