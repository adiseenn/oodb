package lab9.entities;

import javax.persistence.*;
import java.util.Date;

//Запись на прием
@Entity
public class Reception {

    @Temporal(TemporalType.TIMESTAMP)
    Date dateReception;
    @Id
    long id;

    @ManyToOne
    Doctor doctor;

    @ManyToOne
    Patient patient;

    public Reception(long id, Doctor doctor, Patient patient, Date date){
        this.id=id;;
        this.doctor=doctor;
        this.patient=patient;
        this.dateReception =date;

    }

    public Reception(){

    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public void setDoctor(Doctor doctor){
        this.doctor=doctor;
    }

    public Patient getPatient(){
        return patient;
    }

    public void setPatient(Patient patient){
        this.patient=patient;
    }

    public Date getDateReception(){
        return dateReception;
    }

    public void setDateReception(Date dateReception){
        this.dateReception = dateReception;
    }
}
