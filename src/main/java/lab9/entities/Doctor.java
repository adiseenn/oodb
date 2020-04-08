package lab9.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Доктора
@Entity
public class Doctor extends PersonalInformation {
    @Column
    String specialty;
    @Id
    private String id;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "lab9.entities.Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

}
