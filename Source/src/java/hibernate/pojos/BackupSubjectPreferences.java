package hibernate.pojos;
// Generated Apr 2, 2017 5:52:42 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BackupSubjectPreferences generated by hbm2java
 */
@Entity
@Table(name="backup_subject_preferences"
    ,catalog="faculty_portal"
)
public class BackupSubjectPreferences  implements java.io.Serializable {


     private BackupSubjectPreferencesId id;

    public BackupSubjectPreferences() {
    }

    public BackupSubjectPreferences(BackupSubjectPreferencesId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="year", column=@Column(name="Year", nullable=false, length=10) ), 
        @AttributeOverride(name="userId", column=@Column(name="UserID", nullable=false) ), 
        @AttributeOverride(name="subId", column=@Column(name="SubID", nullable=false) ) } )
    public BackupSubjectPreferencesId getId() {
        return this.id;
    }
    
    public void setId(BackupSubjectPreferencesId id) {
        this.id = id;
    }




}


