package hibernate.pojos;
// Generated Mar 22, 2017 6:14:24 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BackupEmpLeaveRequestId generated by hbm2java
 */
@Embeddable
public class BackupEmpLeaveRequestId  implements java.io.Serializable {


     private String year;
     private int empLeaveId;

    public BackupEmpLeaveRequestId() {
    }

    public BackupEmpLeaveRequestId(String year, int empLeaveId) {
       this.year = year;
       this.empLeaveId = empLeaveId;
    }
   


    @Column(name="Year", nullable=false, length=10)
    public String getYear() {
        return this.year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }


    @Column(name="EmpLeaveID", nullable=false)
    public int getEmpLeaveId() {
        return this.empLeaveId;
    }
    
    public void setEmpLeaveId(int empLeaveId) {
        this.empLeaveId = empLeaveId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BackupEmpLeaveRequestId) ) return false;
		 BackupEmpLeaveRequestId castOther = ( BackupEmpLeaveRequestId ) other; 
         
		 return ( (this.getYear()==castOther.getYear()) || ( this.getYear()!=null && castOther.getYear()!=null && this.getYear().equals(castOther.getYear()) ) )
 && (this.getEmpLeaveId()==castOther.getEmpLeaveId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getYear() == null ? 0 : this.getYear().hashCode() );
         result = 37 * result + this.getEmpLeaveId();
         return result;
   }   


}


