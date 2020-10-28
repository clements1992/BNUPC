
/**
 * Write a description of class Course here.
 *
 * @Author Alex Clements - 21922124
 * @version 0.1
 */


public class Course
{
    //* Code Number of the course */
    private String codeNumber;
    //* Title */
    private String name;
    
    public Course(String courseName,String courseCode)
    {
        codeNumber = courseCode;
        name = courseName;
    }
    
    public String getCodeNumber()
    {
        return codeNumber;
    }
    
    public String getCourseName()
    {
        return name;
    }








}   

   
