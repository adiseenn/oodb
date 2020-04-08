package lab9.entities;

import javax.persistence.Column;
import javax.persistence.Id;

//Личная информация

public abstract class PersonalInformation {

    @Id
    Long id;
    @Column
    String name;
    @Column
    String surname;
    @Column
    String lastname;
    @Column
    String phoneNumber;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public void setSurname(){
        this.surname=surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setLastname(){
        this.lastname=lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString() {
        return "lab9.entities.PersonalInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
