/**
@author Alex Clements
@version 30/10/2020
*/

public class Module
{   
    //* title of the module */
    private String title;
    //* code for the module */
    private String code;
    //* student marks for each module */
    private int marks;
    
    //* creates a module with a title, code and marks at 0 */
    public Module(String title,String code)
    {
     this.title = title;
     this.code = code;
     marks = 0;
    }

    //Get code
    public String getCode()
    {
        return code;
    }
    
    //* returns the code of the module */
    public String getTitle()
    {
       return title;
    }
    
    //* returns marks of a module
    public int getMark()
    {
        return marks;
    }
    
    //Award mark
    public void awardMark(int mark)
    {
        if((marks >= 0) && (mark <= 100))
        {
            this.marks = mark;
        }
        
        else
        {
            System.out.println("Invalid Mark");
        }
    }
    
    //Print
    public void print()
    {
        System.out.println("Code Number " + this.code + "Module Title " + this.title + " Marks " + this.marks);
    }
}
       
    
    
    
