
package soal4uts;

public class CourseDemo {
       public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Arsyani", "Dipta", "18051214053");
       
       TextBook myTextBook = new TextBook("Anohana", "Cho Heiwa", "MnC");
       
       Course myCourse = new Course("Anime", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}
