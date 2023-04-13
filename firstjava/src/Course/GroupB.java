package Course;

public class GroupB extends Student{
    public GroupB(int id, String name, int englishTestResult) {
        super(id, name, englishTestResult);
    }

    @Override
    public boolean canTakeCourse(String courseName) {
        if (courseName.equals("IE1") || courseName.equals("IE2") 
        || courseName.equals("PT1") || courseName.equals("PT2")) {
            return true;
        }
        return false;
    }    
}
