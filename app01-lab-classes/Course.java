
/**
 * Write a description of class Course here.
 *
 * @Author Alex Clements - 21922124
 * @version 0.1
 */


public class Course
{
    //* Code Number of the course */
    private String courseCode;
    //* Title */
    private String courseName;
    
    public Course(String courseName,String courseCode)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    
    public String getCodeNumber()
    {
        return courseCode;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public void print()
    {
        System.out.println("Course = " + courseCode + " Course Name = " + courseName);
    }








}   

   
