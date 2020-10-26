
/**
 * Write a description of class Module here.
 *
 * @author Alex Clements
 * @version 23/10/2020
 */
public class Module
{
    //The students title
    private String title;
    //The students module code
    private int moduleCode;
    //Percentage mark
    private int percentage;
    
    private String ComputingA;
    private String    ComputingB;
    private String    ComputingC;
    private String    ComputingD;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, int moduleCode, int percentage)
    {
        // initialise instance variables
        title = title;
        moduleCode = moduleCode;
        percentage = percentage;
    }
    
   
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getTitle()
    {
        // return title
        return title;
        
    }
    
     /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getmoduleCode()
    {
        // return module code
        return moduleCode;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getpercentage()
    {
        // return percentage;
        return percentage;
        
    }
    
    public void arrayList()
    {
        String[] Course = {ComputingA, ComputingB, ComputingC, ComputingD};
    }
    
    public void print()
    {
        System.out.println("Percentage is " + percentage);
        System.out.println("#########");
        System.out.println("Module Code is " + moduleCode);
        System.out.println("#########");
        System.out.println("Course title is " + title);
    }
   
}
    
