package hibernate.pojos;
// Generated Mar 22, 2017 6:14:24 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BackupEmpLeaveInfoId generated by hbm2java
 */
@Embeddable
public class BackupEmpLeaveInfoId  implements java.io.Serializable {


     private String year;
     private int userId;

    public BackupEmpLeaveInfoId() {
    }

    public BackupEmpLeaveInfoId(String year, int userId) {
       this.year = year;
       this.userId = userId;
    }
   


    @Column(name="Year", nullable=false, length=10)
    public String getYear() {
        return this.year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }


    @Column(name="UserID", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BackupEmpLeaveInfoId) ) return false;
		 BackupEmpLeaveInfoId castOther = ( BackupEmpLeaveInfoId ) other; 
         
		 return ( (this.getYear()==castOther.getYear()) || ( this.getYear()!=null && castOther.getYear()!=null && this.getYear().equals(castOther.getYear()) ) )
 && (this.getUserId()==castOther.getUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getYear() == null ? 0 : this.getYear().hashCode() );
         result = 37 * result + this.getUserId();
         return result;
   }   


}

