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
     this.marks = 0;
    }
    
    
   
    
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
    
    public void print()
    {
        System.out.println(this.code + this.title + this.marks);
    }
}
       
    
    
    
