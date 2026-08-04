package org.example;

public class PersonWithSallary extends Person {

    public PersonWithSallary(String userName, String password) {
        super(userName, password); // super - вызывает конструктор класса родителя на 11 строчке.
    }

    @Override // @Override аннотация - показатель того, что метод наследуется от класса родителя.(не обязательно, но желательно)
    public void myTest2() {
//        super.myTest2();
        System.out.println("call method child");
    }




}


