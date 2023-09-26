package org.example;

import java.util.List;

public class outpatientList extends psyPatient {
    List<psyPatient> patientList;

    /**
     * @param patientList Список пациентов
     */
    public outpatientList(List<psyPatient> patientList) {
        this.patientList = patientList;
    }

    public psyPatient getPsyPatient(int age) {
        for (psyPatient patient : patientList) {
            if (patient.getAge() == age) {
                return patient;
            }
        }
        return null;
    }

}
