package org.example;

public class psyPatient extends patient {
    String psyStatus;

    /**
     * @param age       возраст
     * @param name      имя
     * @param phone     телефон
     * @param diagnosis диагноз
     * @param psyStatus пси статус
     */
// Почему конструктор psyPatient не может быть использован
// для работы констркуктора outpatientList в одноименном классе?
    public psyPatient(int age, String name, String phone, String diagnosis, String psyStatus) {
        super(age, name, phone, diagnosis);
        this.psyStatus = psyStatus;
    }
// Почему именно этот конструктор без параметров используется в конструкторе outpatientList,
// а не тот который расположен выше по коду?
    public psyPatient() {
    }

    @Override
    public String toString() {
        return "ФИО: " + super.getName() +
                ", возраст: " + super.getAge() +
                ", телефон: " + super.getPhone() +
                ", диагноз: " + diagnosis +
                ", статус: " + psyStatus;
    }
}
