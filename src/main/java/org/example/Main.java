package org.example;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person("Hello", "Password");
//        person.password = "pass";
//
//        System.out.println(person.name);
//        System.out.println(person.password);
//        person.displayInfo();
//        System.out.println(Person.count);
//        Person person = new Person("Hello", "Password");
//        Person person2 = new Person("Hello2", "Password2");
//
//        person.count += 1;
//        person2.count = 556;
//
//        System.out.println(person2.count);
//        System.out.println(person.count);

//        Person.displayInfo();

        PersonWithSallary personWithSallary = new PersonWithSallary("Ilya", "vasya222");
        System.out.println(personWithSallary.name);
        System.out.println(personWithSallary.password);
        personWithSallary.myTest2();
        personWithSallary.test();


        
        // alt + insert = вспомогательные окошки


    }


    public void printInfo() {

    }
}