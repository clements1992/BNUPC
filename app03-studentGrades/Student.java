import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Alex Clements
 * @version 26/10/2020
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    //Course name
    private Course course;

    public Student(String fullName, String studentID)
    {
        //Constructor that initializes each variable
        name = fullName;
        id = studentID;
        credits = 0;
        course = null;
        
    }
    
    //enroll a student on a course
    public void enrollStudent(Course course)
    {
        this.course = course;
    }
    
    //change a students name
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    //Return the student ID
    public String getStudentID()
    {
        return id;
    }

    //Add credit points
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    //Get credits
    public int getCredits()
    {
        return credits;
    }

    //Get login name
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    //print
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}
