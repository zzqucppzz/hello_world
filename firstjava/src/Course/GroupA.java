package Course;

public class GroupA extends Student{
    public GroupA(int id, String name, int englishTestResult) {
        super(id, name, englishTestResult);
    }

    @Override
    public boolean canTakeCourse(String courseName) {
        return true;
    }    
}
