import java.util.ArrayList;
/**
@author Alex Clements
@version 27/10/2020
*/
public class Course
{
    //Name of Course
    private String title;
    //Total marks
    private int currentMarks;
    //Final grade
    private String finalGrade;
    //Final Mark
    private int finalMark;
    
    
    //Enum
    private Grades finalGrades;
    
    //Module numbers
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    //* creates a course with a title, current mark (0) and final drage */
    public Course(String title, String course)
    {
        this.title = title;
        
        this.currentMarks = 0;
        this.finalGrade = null;
        
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Computer Architecture", "CO451");
        module3 = new Module("Web Development", "CO453");
        module4 = new Module("Hilarys Class", "CO450");
    }
    
    //Add marks to each module
    public void addMark(int marks, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(marks);
        }
        
        if(moduleNo == 2)
        {
            module2.awardMark(marks);
        }
        
        if(moduleNo == 3)
        {
            module3.awardMark(marks);
        }
    
        if(moduleNo == 4)
        {
            module4.awardMark(marks);
        }
    }
    
    //Convert marks to grades
    public Grades convertToGrade(int marks)
    {
        if((marks >= 0) && (marks < 40))
        {
            return Grades.F;
        }
        
        else if((marks >= 40) && (marks < 49))
        {
            return Grades.D;
        }
        
        else if((marks >= 50) && (marks < 59))
        {
            return Grades.C;
        }
        
        else if((marks >= 60) && (marks < 69))
        {
            return Grades.B;
        }
        
        else if((marks >= 70) && (marks < 100))
        {
            return Grades.A;
        }
        
        return Grades.X;
    }
    
    //print
    public void print()
    {
        System.out.println("Course title " + title + " Current Marks " + currentMarks);
    }
}
    
    
   
    
