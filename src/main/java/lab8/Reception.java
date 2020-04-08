package lab8;

import lab8.annotations.Column;
import lab8.annotations.Entity;
import lab8.annotations.Id;
import lab8.annotations.ManyToOne;
import lab8.entities.Doctor;
import lab8.entities.Patient;

//Запись на прием
@Entity
public class Reception {

    @Column
    String dateReception;
    @Id
    long id;

    @Column
    @ManyToOne
    Doctor doctor;

    @Column
    @ManyToOne
    Patient patient;

    public Reception(long id, Doctor doctor, Patient patient, String date){
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

    public String getDateReception(){
        return dateReception;
    }

    public void setDateReception(String dateReception){
        this.dateReception = dateReception;
    }
}
