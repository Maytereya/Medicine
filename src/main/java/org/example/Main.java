package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<psyPatient> patientsList = new ArrayList<>();
        patientsList.add(new psyPatient(30, "Fedor", "+79033044033", "BAR", "Clean"));
        patientsList.add(new psyPatient(30, "Gven", "+79033044035", "BAR2", "Clean"));
        patientsList.add(new psyPatient(31, "Little", "+79033044043", "BAR1", "Clean"));
        patientsList.add(new psyPatient(36, "Nike", "+79033044023", "Schizo", "Delirium"));
        System.out.println("===== ====== =====");
        // Инициализация outpatientList с передачей в качестве аргумента списка patientsList возможна только если в
        // классах patient и psyPatient созданы дополнительные конструкторы без полей и без аргументов.
        // Почему так?
        outpatientList out_patient_list = new outpatientList(patientsList);
        System.out.println(out_patient_list.getPsyPatient(36));
    }
}