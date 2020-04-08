package lab8.entities;

import lab8.annotations.Column;
import lab8.annotations.Entity;

//Доктора
@Entity
public class Doctor extends PersonalInformation {
    @Column
    String specialty;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
