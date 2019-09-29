package com.juankevintrujillo;

import java.util.Date;

/**
 *
 * @author juankevintr
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Juan Kevin", new Date(92, 8, 21));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }

}
