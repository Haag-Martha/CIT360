/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/*
 @author martha
 */
public class CollectionsExample {

    public static void main(String[] args) {
        //Array Example
        System.out.println("*****Example of an Array*****");
        ArrayList<String> listofcountries = new ArrayList<>();
        listofcountries.add("Ireland");
        listofcountries.add("United Kingdom");
        listofcountries.add("Scotland");
        listofcountries.add("United States of America");
        listofcountries.add("Canada");
        listofcountries.add("Mexico");
        listofcountries.add("Russia");
        
        //Display Current ArrayList
                System.out.println("Origial Array List:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        listofcountries.remove("Russia");
        listofcountries.remove(3);
        
        //Display Removed List
                System.out.println("\nCurrent Array List:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        
        //Display Unsorted List
                System.out.println("\nBefore Sorting:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        
        //Sort statement
        Collections.sort(listofcountries);
        
        //Display Sorted List
                System.out.println("\nAfter Sorting:");
        for(String counter: listofcountries) {
                System.out.println(counter);
        }
        
        System.out.println("\n*****Example of a LinkedList*****");
        //LinkedList Example
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Item3");
        linkedlist.add("Item9");
        linkedlist.add("Item16");
        linkedlist.add("Item0");
        linkedlist.add("Item5");
        
        //Display LinkedList items
                System.out.println("\nOrignial LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        //Add First and Last
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        
        //Display LinkedList items
                System.out.println("\nFirst/Last Item LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        //Get and Set values in the list
        String firstItem = linkedlist.get(0);
                System.out.println("\nFirst element is: " + firstItem);
        linkedlist.set(0, "Changed First Item");
        firstItem = linkedlist.get(0);
                System.out.println("First element is: " + firstItem);
        
        //Remove first and last items in a list
        linkedlist.removeFirst();
        linkedlist.removeLast();
                System.out.println("\nRemove First/Last LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        //Add/remove from a position in the list
        linkedlist.add(0, "Additional Item");
        linkedlist.remove(2);
                System.out.println("\nFinal LinkedList:");
        for(String counter: linkedlist) {
                System.out.println(counter);
        }
        
        System.out.println("\n*****Queue Example*****");
        //Queue example
        Queue<String> familyQueue = new LinkedList<String>();
        
        //Add Family members to queue
        familyQueue.add("Kristopher");
        familyQueue.add("Margaret");
        familyQueue.add("Landon");
        familyQueue.add("Elsira");
        
        //Display queue
                System.out.println("\nQueue LinkedList:");
        for(String counter: familyQueue) {
                System.out.println(counter);
        }
        
        //Remove Family members from the queue
        System.out.println("\nRemoved element: " + familyQueue.poll());
        
        //Return first element in the queue
        System.out.println("\nHead element: " + familyQueue.peek());
        
        System.out.println("\n*****HashMap Example*****");
        //HashMap Example
        HashMap<Integer, String> familyMap = new HashMap<Integer, String>();
        
        //Add Family members and map key
        familyMap.put(39, "Kristopher");
        familyMap.put(37, "Margaret");
        familyMap.put(12, "Landon");
        familyMap.put(4, "Elsira");
        
        //display map contents using iterator
        Set set = familyMap.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("\nKey & Value output:");
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.println("Key: " + mapEntry.getKey() + " & value: " + mapEntry.getValue());           
        }
        
        //Get specific element based on key
        System.out.println("\nSpecific Value: " + familyMap.get(37));
        
        System.out.println("\n*****HashSet Example*****");
        //HashSet Example
        HashSet<String> animalHash = new HashSet<String>();
        
        //adding items to the list
        animalHash.add("Cat");
        animalHash.add("Dog");
        animalHash.add("Bird");
        animalHash.add("Fish");
        animalHash.add("Lizard");
        
        //adding duplicate values
        animalHash.add("Cat");
        animalHash.add("Fish");
        
        //adding null values
        animalHash.add(null);
        
        //display contents of list
                System.out.println("\nAnimal HashSet List:");
        for(String counter: animalHash) {
                System.out.println(counter);
        }
    }   
}