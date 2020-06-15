package entity;
// Generated 18/03/2020 02:58:50 PM by Hibernate Tools 4.3.1



/**
 * Handsign generated by hbm2java
 */
public class Handsign  implements java.io.Serializable {


     private int idHandsign;
     private Course course;
     private String handSignRawData;
     private String handSignName;

    public Handsign() {
    }

	
    public Handsign(int idHandsign, Course course) {
        this.idHandsign = idHandsign;
        this.course = course;
    }
    public Handsign(int idHandsign, Course course, String handSignRawData, String handSignName) {
       this.idHandsign = idHandsign;
       this.course = course;
       this.handSignRawData = handSignRawData;
       this.handSignName = handSignName;
    }
   
    public int getIdHandsign() {
        return this.idHandsign;
    }
    
    public void setIdHandsign(int idHandsign) {
        this.idHandsign = idHandsign;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getHandSignRawData() {
        return this.handSignRawData;
    }
    
    public void setHandSignRawData(String handSignRawData) {
        this.handSignRawData = handSignRawData;
    }
    public String getHandSignName() {
        return this.handSignName;
    }
    
    public void setHandSignName(String handSignName) {
        this.handSignName = handSignName;
    }




}

