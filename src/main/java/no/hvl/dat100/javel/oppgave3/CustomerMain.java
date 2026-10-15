package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

import static no.hvl.dat100.javel.oppgave3.PowerAgreementType.*;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */


        Customer customer1 = new Customer("Alice Smith", "alice@example.com", 1001, SPOTPRICE);
        Customer customer2 = new Customer("Bob Johnson", "bob@example.com", 1002, NORGESPRICE);
        Customer customer3 = new Customer("Charlie Rose", "charlie@example.com", 1003, POWERSUPPORT);
        Customer customer4 = new Customer("Diana Prince", "diana@example.com", 1004, NORGESPRICE);
        Customer customer5 = new Customer("Ethan Hunt", "ethan@example.com", 1005, POWERSUPPORT);
        System.out.println(customer1.toString());
        System.out.println();
        System.out.println(customer2.toString());
        System.out.println();
        System.out.println(customer3.toString());
        System.out.println();
        System.out.println(customer4.toString());
        System.out.println();
        System.out.println(customer5.toString());
        System.out.println();
        customer1.setName("Hillary");
        System.out.println();
        customer1.setEmail("hillary@example.com");
        System.out.println();
        customer1.setCustomerId(1008);
        System.out.println();
        customer1.setAgreement(POWERSUPPORT);
        System.out.println();
        System.out.println(customer1.getName());
        System.out.println();
        System.out.println(customer1.getEmail());
        System.out.println();
        System.out.println(customer1.getCustomerId());
        System.out.println();
        System.out.println(customer1.getAgreement());
        System.out.println();


    }





}
