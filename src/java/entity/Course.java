package entity;
// Generated 18/03/2020 02:58:50 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private int idCourse;
     private Group group;
     private String courseName;
     private String maxStudents;
     private Set handsigns = new HashSet(0);

    public Course() {
    }

	
    public Course(int idCourse, Group group) {
        this.idCourse = idCourse;
        this.group = group;
    }
    public Course(int idCourse, Group group, String courseName, String maxStudents, Set handsigns) {
       this.idCourse = idCourse;
       this.group = group;
       this.courseName = courseName;
       this.maxStudents = maxStudents;
       this.handsigns = handsigns;
    }
   
    public int getIdCourse() {
        return this.idCourse;
    }
    
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }
    public Group getGroup() {
        return this.group;
    }
    
    public void setGroup(Group group) {
        this.group = group;
    }
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getMaxStudents() {
        return this.maxStudents;
    }
    
    public void setMaxStudents(String maxStudents) {
        this.maxStudents = maxStudents;
    }
    public Set getHandsigns() {
        return this.handsigns;
    }
    
    public void setHandsigns(Set handsigns) {
        this.handsigns = handsigns;
    }




}

