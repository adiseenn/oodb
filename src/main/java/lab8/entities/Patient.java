package lab8.entities;

import lab8.annotations.Column;
import lab8.annotations.Entity;

//Пациенты
@Entity
public class Patient extends PersonalInformation{
    @Column
    String policyNumber;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
