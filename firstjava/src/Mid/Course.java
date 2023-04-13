package Mid;
import java.util.*;

public class Course {
    private String id;
    private String name;
    private int lectureCredits;
    private int labCredits;
    private boolean requireComputers;
    private boolean requireSpecialEquipment;
    private static int numCourses = 0;
    
    public Course(String id, String name, int lectureCredits, int labCredits,
                  boolean requireComputers, boolean requireSpecialEquipment) {
        // Check input validity
        if (id.isEmpty()) {
            throw new IllegalArgumentException("Course ID cannot be empty.");
        }
        if (lectureCredits <= 0) {
            throw new IllegalArgumentException("Lecture credits must be greater than zero.");
        }
        if (labCredits < 0) {
            throw new IllegalArgumentException("Lab credits cannot be negative.");
        }
        
        // Set instance variables
        this.id = id;
        this.name = name.toUpperCase();
        this.lectureCredits = lectureCredits;
        this.labCredits = labCredits;
        this.requireComputers = requireComputers;
        this.requireSpecialEquipment = requireSpecialEquipment;
        
        // Update course count
        numCourses++;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getLectureCredits() {
        return lectureCredits;
    }
    
    public int getLabCredits() {
        return labCredits;
    }
    
    public boolean requiresComputers() {
        return requireComputers;
    }
    
    public boolean requiresSpecialEquipment() {
        return requireSpecialEquipment;
    }
    
    public static int getNumCourses() {
        return numCourses;
    }
    
    public void displayCourseInfo() {
        System.out.println("Course ID: " + id);
        System.out.println("Course Name: " + name);
        System.out.println("Lecture Credits: " + lectureCredits);
        if (labCredits > 0) {
            System.out.println("Lab Credits: " + labCredits + " (HAVE LAB SESSIONS)");
            System.out.println("Lab Room Requirements: ");
            if (requireComputers) {
                System.out.println("- Computers");
            }
            if (requireSpecialEquipment) {
                System.out.println("- Special Equipment");
            }
        } else {
            System.out.println("Lab Credits: " + labCredits);
        }
    }
    
    // Override the toString() method to display course information
    @Override
    public String toString() {
        return "Course ID: " + id + "\n" +
               "Course Name: " + name + "\n" +
               "Lecture Credits: " + lectureCredits + "\n" +
               "Lab Credits: " + labCredits + "\n" +
               "Lab Room Requirements: " +
               (requireComputers ? "- Computers\n" : "") +
               (requireSpecialEquipment ? "- Special Equipment\n" : "");
    }
}

