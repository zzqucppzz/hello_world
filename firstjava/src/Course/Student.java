package Course;
public class Student {
    private int id;
    private String name;
    private int englishGradeResult;

    public Student(int id, String name, int englishGradeResult) {
        this.id = id;
        this.name = name;
        this.englishGradeResult = englishGradeResult;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getEnglishGradeResult() {
        return englishGradeResult;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEnglishGradeResult(int englishGradeResult) {
        this.englishGradeResult = englishGradeResult;
    }
    public  boolean canTakeCourse(String courseName){
        return false;
    }
}    

