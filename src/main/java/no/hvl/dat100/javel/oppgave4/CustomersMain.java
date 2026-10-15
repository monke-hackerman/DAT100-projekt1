package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import static no.hvl.dat100.javel.oppgave3.PowerAgreementType.*;
import static no.hvl.dat100.javel.oppgave3.PowerAgreementType.NORGESPRICE;
import static no.hvl.dat100.javel.oppgave3.PowerAgreementType.POWERSUPPORT;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

        Customer customer1 = new Customer("Alice Smith", "alice@example.com", 1001, SPOTPRICE);
        Customer customer2 = new Customer("Bob Johnson", "bob@example.com", 1002, NORGESPRICE);
        Customer customer3 = new Customer("Charlie Rose", "charlie@example.com", 1003, POWERSUPPORT);
        Customer customer4 = new Customer("Diana Prince", "diana@example.com", 1004, NORGESPRICE);
        Customer customer5 = new Customer("Ethan Hunt", "ethan@example.com", 1005, POWERSUPPORT);



        Customers c = new Customers(10);
        c.addCustomer(customer1);
        System.out.println(c.getCustomer(1001));

        System.out.println(c.countNonNull());




    }








}
