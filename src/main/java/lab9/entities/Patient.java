package lab9.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Пациенты
@Entity
public class Patient extends PersonalInformation{
    @Column
    String policyNumber;
    @Id
    private String id;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

}
