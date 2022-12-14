
import java.sql.Timestamp;


/**
 *
 * @author alexchristopher
 */


public class ScheduleEntry {
    private String semester;
    private String courseCode;
    private String studentID;
    private String status;
    private Timestamp timeStamp;
    
    public ScheduleEntry(){
        // constructor
    }
    
    public ScheduleEntry(String semester, String courseCode, String studentID, 
            String status, Timestamp timeStamp){
        this.semester = semester;
        this.courseCode = courseCode;
        this.studentID = studentID;
        this.status = status;
        this.timeStamp = timeStamp; 
    }
    
    public void setSemester(String semester){
        this.semester = semester;
    }
    
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void timeStamp(Timestamp timeStamp){
        this.timeStamp = timeStamp;
    }
    
    public String getSemester(){
        return semester;
    }
    
    public String getCourseCode(){
        return courseCode;
    }
    
    public String getStudentID(){
        return studentID;
    }
    
    public String getStatus(){
        return status;
    }
    
    public Timestamp getTimeStamp(){
        return timeStamp;
    }
}
