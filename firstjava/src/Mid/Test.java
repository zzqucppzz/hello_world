package Mid;

public class Test {
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Intro to Programming", 3, 0, false, false);
        Course c2 = new Course("CS201", "Data Structures", 3, 1, true, true);
        
        System.out.println("Number of courses: " + Course.getNumCourses());
        
        c1.displayCourseInfo();
        System.out.println();
        c2.displayCourseInfo();
        
        System.out.println("\nUsing polymorphism:");
        Course[] courses = {c1, c2};
        for (Course course : courses){
            System.out.println(course.toString());
        }
    }
}
