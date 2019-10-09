/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsinaction;

import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Nkenta Uchechukwu
 */
class MobileBrand implements Comparable<MobileBrand> {
    
    String name;
    int grade;
    String position;
    
public MobileBrand(String name, int grade, String position) {
    this.name = name;
    this.grade = grade;
    this.position = position;
}
    @Override
    // if statement to determine is the brand is perfect.
    // using a as grade point
    // return 1 means grade1 and in perfect condition
    /* return 2 means grade2 and not as perfect and condition good condition
    as grade 1 */
    public int compareTo (MobileBrand a) {
    if(grade==a.grade){
        return 1;
    } else if(grade!=a.grade) {
        return 2;
    } else {
        return 0;
    }
}
}

public class TreeSetCollection {
    
    public static void main(String args[]) {
    
        Set<MobileBrand> set = new TreeSet<>();
        
        // Create MobileBrand with their position in the worlds
        MobileBrand mb1 = new MobileBrand("Apple", 3, "Third");
        MobileBrand mb2 = new MobileBrand("Samsung", 1, "First");
        MobileBrand mb3 = new MobileBrand("Huawei", 2, "Second");
        
        // Add MobileBrand to TreeSet
        set.add(mb1);
        set.add(mb2);
        set.add(mb3);
        
        // Iterating through the MobileBrand TreeSet
        set.forEach((MobileBrand mobile) -> {
            System.out.println(mobile.name + " " + mobile.grade + " " + mobile.position);
        });
    }
}
