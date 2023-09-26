package org.example;


public abstract class patient {

    private int age;
    private String name;
    private String phone;
    public String diagnosis;


    public patient(int age, String name, String phone, String diagnosis) {
        this.age = age;
        this.phone = phone;
        this.diagnosis = diagnosis;
        this.name = name;
    }

    // Что это за конструктор без параметров и полей, и почему он
    // нужен для корректного вызова outpatientList в Main?
    // Почему если использовать только одноименный конструктор, который выше по коду, инициализация outpatientList
    // в Main не будет компилироваться?
    protected patient() {
    }
    // Почему модификатор доступа установлен как protected?


    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ФИО: " + name +
                ", возраст: " + age +
                ", телефон: " + phone +
                ", диагноз: " + diagnosis;
    }
}
