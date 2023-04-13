package Course;

public class GroupC extends Student{
    public GroupC(int id, String name, int englishTestResult) {
        super(id, name, englishTestResult);
    }

    @Override
    public boolean canTakeCourse(String courseName) {
        if (courseName.equals("EE1") || courseName.equals("EE2")) {
            return true;
        }
        return false;
    }
}
