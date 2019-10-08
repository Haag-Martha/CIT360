

package cit360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/*
 @author martha
 */
public class Collections {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // ArrayList example
        List one = new ArrayList();
        one.add("Amy");
        one.add("Naomi");
        one.add("Becky");
        one.add("Matthew");
        one.add("Gail");
        System.out.println("\n\nLists Example: \n");
        System.out.println("My Friends");
        
        Iterator friends = one.iterator();
        while(friends.hasNext()) {
        Object element = friends.next();
        System.out.print(element + "\n");
        }
        
        System.out.print("\n");        
        
        // Set example
        System.out.println("Set Collections Example");
        int advance[] = {2,9,4,0,3,1,5};
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 7; i++) {
            set.add(advance[i]);
        }
        System.out.println(set + "\n");

        //  Map example
        System.out.println("HashMap Example");
        Map hmap = new HashMap();
        hmap.put("George Washington", "1789 - 1797");
        hmap.put("John Adams", "1797 - 1801");
        hmap.put("Thomas Jefferson", "1801 - 1809");
        hmap.put("James Madison", "1809 - 1825");
        hmap.put("John Quincy Adams", "1825 - 1829");

        System.out.println("The first presidents of the United were: \n");

        hmap.forEach((k,v) -> System.out.println("President - " + k 
                + ", Presided from " + v + "\n"));

        // Tree example
        System.out.println("TreeSet Example. With Trees!");
        TreeSet baum = new TreeSet();
        baum.add("Magnolia");
        baum.add("Elm");
        baum.add("Oak");
        baum.add("Pine");
        baum.add("Maple");
        baum.add("Ash");
        baum.add("Cherry");
        
        Iterator list = baum.iterator();
        while(list.hasNext()) {
        Object element = list.next();
        System.out.print(element + "\n");
        }

        // Queue example
        System.out.println("\nQueue Example of German Cars:");
        Queue<String> warteschlange = new LinkedList<>();

        warteschlange.add("BMW");
        warteschlange.add("Volkswagen");
        warteschlange.add("Merceded");
        warteschlange.add("Audi");
        warteschlange.add("Porsche");

        warteschlange.forEach(name -> {
           System.out.println(name);
        });

    }
}