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
//        System.out.println("=human=");
//        Human human = new Human("Shmidt");
//        System.out.println(human.getName());
//        human.setMakeOrder(true);
//        System.out.println("isTakeOrder: " + human.isTakeOrder);
//        System.out.println("isMakeOrder: " + human.isMakeOrder);
//        human.setTakeOrder(true);
//        System.out.println("isTakeOrder: " + human.isTakeOrder);
//        System.out.println("isMakeOrder: " + human.isMakeOrder);
//        System.out.println(human);
        System.out.println("=MARKET=");

 //       List<Actor> actors = new ArrayList<>();
//        actors.add(0, new Human("Paul"));
//        actors.add(1, new Human("Leo"));
//        actors.add(2, new Human("Zhick"));
//        actors.add(3, new Human("Cat"));

        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }
}