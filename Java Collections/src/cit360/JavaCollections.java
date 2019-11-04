

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
public class JavaCollections {

    public static void main(String[] args) {
       
        // ArrayList example
        ArrayList<String> listoffriends = new ArrayList<>();
        listoffriends.add("Amy");
        listoffriends.add("Naomi");
        listoffriends.add("Becky");
        listoffriends.add("Matthew");
        listoffriends.add("Gail");
        System.out.println("\nArray Example: \n");
        System.out.println("My Friends");
        
       //Display the list
        	System.out.println("The full list:");
        for(String counter: listoffriends) {
        	System.out.println(counter);
        }
        
        listoffriends.remove("Gail");
        listoffriends.remove(3);
        
        //Display the list after I removed two friends
        System.out.println("The revised list:");
        for(String counter: listoffriends) {
        	System.out.println(counter);
        }
        
        //Display an unsorted list
        System.out.println("\nUnsorted List:");
        for(String counter: listoffriends) {
        	System.out.println(counter);
        }
        
        //Sort the list and show it
        Collections.sort(listoffriends);
        System.out.println("\nSorted List");
        for(String counter: listoffriends) {
        	System.out.println(counter);
        }
        
        //Example of a LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("object2");
        linkedlist.add("object3");
        linkedlist.add("object4");
        linkedlist.add("object5");
        linkedlist.add("object6");
        
        //the LinkedList:
        System.out.println("\nUnmodified LinkedList:");
        for(String counter: linkedlist) {
        	System.out.println(counter);
        }
        
        //Adding a First and Last to the linked list
        linkedlist.addFirst("object1");
        linkedlist.addLast("object7");
        
        //Display the modified list
        System.out.println("\nLinkedList with First/Last added: ");
        for(String counter: linkedlist) {
        	System.out.println(counter);
        }
        
        //get and set list values
        String firstObject = linkedlist.get(0);
        System.out.println("\nFirst object is: " + firstObject);
        linkedlist.set(0, "Changed First Object");
        firstObject = linkedlist.get(0);
        	System.out.println("First object is: " + firstObject);

        //Remove first and last items in a list
        linkedlist.removeFirst();
        linkedlist.removeLast();
        	System.out.println("\nLinkedList with First/Last Removed:");
        for(String counter: linkedlist) {
        	System.out.println(counter);
        }

        //Add/remove from a position in the list
        linkedlist.add(0, "Additional Object");
        linkedlist.remove(3);
        	System.out.println("\nModified LinkedList:");
        for(String counter: linkedlist) {
        	System.out.println(counter);
        }

        //Example of Queue
        Queue<String> numberQueue = new LinkedList<String>();

        //Add number members to queue
        numberQueue.add("One");
        numberQueue.add("Two");
        numberQueue.add("Three");
        numberQueue.add("Four");
        numberQueue.add("Five");

        //Display queue
        	System.out.println("\nQueue LinkedList:");
        for(String counter: numberQueue) {
        	System.out.println(counter);
        }

        //Remove number from the queue
        	System.out.println("\nRemoved element: " + numberQueue.poll());

        //Return first element in the queue
        	System.out.println("\nHead element: " + numberQueue.peek());

        //HashMap example
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

        //Add number members and map key
        employeeMap.put(21, "Christian Mandel");
        employeeMap.put(29, "Margaret Fortles");
        employeeMap.put(56, "Marion Landon");
        employeeMap.put(2, "Elvira Turnboles");
        employeeMap.put(60, "Patton Moncrief");

        //show map contents with iterator
        Set<java.util.Map.Entry<Integer, String>> set = employeeMap.entrySet();
        Iterator<java.util.Map.Entry<Integer, String>> iterator = set.iterator();
        	System.out.println("\nKey & Value output:");
        while (iterator.hasNext()) {
        	Map.Entry mapEntry = (Map.Entry)iterator.next();
        	System.out.println("Key: " + mapEntry.getKey() + " & value: " + mapEntry.getValue());           
        }

        //Get a specific element based on key
        	System.out.println("\nSpecific Value: " + employeeMap.get(60));

        	
        //example of HashSet
        HashSet<String> countries = new HashSet<String>();

        //adding items to the list
        countries.add("United Kingdom");
        countries.add("France");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Switzerland");
        System.out.println(countries);

        //adding duplicates
        countries.add("France");
        countries.add("Portugal");

        //removing items
        countries.remove("Portugal");
        System.out.println("List after removing Portugal: " + countries);

        }
    	}   