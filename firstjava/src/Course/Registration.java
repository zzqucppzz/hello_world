package Course;
import java.util.Scanner;
public class Registration {
    public Registration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter English test result: ");
        int englishGradeResult = scanner.nextInt();
        Student student;
        if (englishGradeResult >= 80) {
            student = new GroupA(id, name, englishGradeResult);
        } else if (englishGradeResult >= 60 && englishGradeResult <= 79) {
            student = new GroupB(id, name, englishGradeResult);
        } else {
            student = new GroupC(id, name, englishGradeResult);
        }
        System.out.print("Enter course name: ");
        String courseName = scanner.next();

        if (student.canTakeCourse(courseName)) {
            System.out.println("Student " + name + " can take " + courseName);
        } else {
            System.out.println("Student " + name + " cannot take " + courseName);
        }

        scanner.close();
    }
}
