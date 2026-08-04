package org.example;

public class Person {

    final String name;
    String password;

    static int count = 0; // если переменная является статической,
    // то мы можем обратиться к ней без экземпляра класса, и если она изменится, то остальные экземпляры тоже изменятся.


    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }



    // если метод является финальным , то его нельзя наследовать.
    public final void test() {
        System.out.println("Вызов родителя!");
    }
    // если метод является статическим, то его нельзя наследовать.
    public static void displayInfo() {
        // Если метод является статическим, то внутри статического метода могут
        // быть вызваны только статические поля/методы
        System.out.println(count);
        System.out.println("Display info in console");
    }

    public void myTest2() {
        displayInfo(); // внутри не статического метода можно вызывать статические и не статические поля и методы.
    }
}
