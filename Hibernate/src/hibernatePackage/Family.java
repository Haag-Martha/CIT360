package hibernatePackage;

import javax.persistence.*;
/**
*
* @author martha
*/
/*Create the family class. It's going to get
* and set the id, name, and date of birth
* from the family table and display it to the user.*/

/*this tells hibernate that this
* relates to a table by the name of family*/
@Entity
@Table(name="family")
public class Family {
    /*tellhibernate this field
     * relates to the column "id" in our family
     * table.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /*tell hibernate that this field
    * relates to the column "name" in the family
    * table.*/
    @Column(name = "name")
    private String name;

    /*tell hibernate that this field
     * relates to the column "dob" (date of birth) in the family
     * table.*/
    @Column(name="dob")
    private String dob;

    //getters and setters for the fields in the family table
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob){
        this.dob=dob;
    }

    //string to print to console
    public String toString(){
        return Integer.toString(id) + " " + name + " " + dob;
    }

}