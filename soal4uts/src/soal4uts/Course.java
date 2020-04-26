
package soal4uts;

public class Course {

  private final String courseName;
    private final Instructor instructor;
    private final TextBook textBook;
    	
    public Course(String name, Instructor instr, TextBook text) {
        //Assign the courseName
        courseName = name;
        
        //Create a new Instructor object, passing
        //instr as an argument to the copy instructor,
        instructor = new Instructor(instr);
        
        //create a new textbook object, passing
        //text as an argument to the copy instructor
        textBook = new TextBook(text);
    }
    /**
     * getName method
     * @return 
     */
    public String getName() {
        return courseName;
    }
    
    public Instructor getInstructor() {
        return new Instructor(instructor);
    }
    
    public TextBook getTextBook() {
        return new TextBook(textBook);
    }
    
    public String toString() {
        String str = "Course name: " + courseName +
                "\nInstructor Information: \n" + instructor +
                "\nTextBook information: \n" + textBook;
        
                return str;
    }
}

