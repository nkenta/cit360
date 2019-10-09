/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsinaction;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Nkenta Uchechukwu
 */

class Students{
    private final String name;
    private final String course;
    private final int age;
    private final int gpa;
    
    public Students(String name, String course, int age, int gpa){
        this.name = name;
        this.course = course;
        this.age = age;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "(Student name is: " + name + "; Student is taking " + course + " this semester;"
                + " Student Age is: " + age + " And has a GPA of " + gpa + ")";
    }
// Adding equals and hashcode in case of duplicates
    @Override
    public int hashCode() {
        int hash = 8;
        hash = 120 * hash + Objects.hashCode(this.name);
        hash = 120 * hash + Objects.hashCode(this.course);
        hash = 120 * hash + this.age;
        hash = 120 * hash + this.gpa;
        return hash;
    }

    @Override
    public boolean equals(Object objs) {
        if (this == objs) {
            return true;
        }
        if (objs == null) {
            return false;
        }
        if (getClass() != objs.getClass()) {
            return false;
        }
        final Students data = (Students) objs;
        if (!Objects.equals(this.name, data.name)) {
            return false;
        }
        if (!Objects.equals(this.course, data.course)) {
            return false;
        }
        if (this.age != data.age) {
            return false;
        }
        return this.gpa == data.gpa;
    }   
}

public class MapCollection {
    
    public static void main(String args[]){
        /* Using LinkedHashMap(TreeMap) to retain the order it was written */
        /* Here "mem" means Member in a short form */
        /* Note the age and GPA are just a made up numbers */
        Students mem1 = new Students("Benjamin Wood", "CIT360", 18, 3);
        Students mem2 = new Students("Aaron Wright", "CIT360", 27, 4);
        Students mem3 = new Students("Daniel Guzman", "CIT360", 19, 3);
        Students mem4 = new Students("Gwen Allphin", "CIT360", 22, 4);
        Students mem5 = new Students("Gary Moser", "CIT360", 24, 3);
        Students mem6 = new Students("Theodore Hancock", "CIT360", 26, 4);
        Students mem7 = new Students("Les Aycock", "CIT360", 28, 4);
        Students mem8 = new Students("Nkenta Ferdinand", "CIT360", 23, 3);
        
        Map<Students, Integer> map = new LinkedHashMap<>();
        // TO add into the map we use the put key format
        map.put(mem1, 1);
        map.put(mem2, 2);
        map.put(mem3, 3);
        map.put(mem4, 4);
        map.put(mem5, 5);
        map.put(mem6, 6);
        map.put(mem7, 7);
        map.put(mem8, 8); 
        
        // iterating through map
        map.keySet().forEach((Students key) -> {
            System.out.println(key + ": " + map.get(key));
        });
        Set<Students> set;
        set = new LinkedHashSet<>();
        // Add set items
        set.add(mem1);
        set.add(mem2);
        set.add(mem3);
        set.add(mem4);
        set.add(mem5);
        set.add(mem6);
        set.add(mem7);
        set.add(mem8);
        System.out.println(set);
    }   
}
