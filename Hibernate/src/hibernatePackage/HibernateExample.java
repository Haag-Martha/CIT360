package hibernatePackage;

import java.util.*;
/**
*
* @author martha
*/
public class HibernateExample {
    public static void main (String[] args){
        //create a new instance of database interface
        DatabaseInterface dbi= DatabaseInterface.getInstance();

        //loop through list and display contents of the table
        List<Family> family = dbi.getFamily();
        for(Family i:family){
            System.out.println(i);
        }


    }
}
