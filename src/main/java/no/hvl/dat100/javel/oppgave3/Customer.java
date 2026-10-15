package no.hvl.dat100.javel.oppgave3;

public class Customer {
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;


    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }


    public String getName() {
        return this.name;
    }


    public String getEmail() {
        return this.email;
    }


    public int getCustomerId() {
        return this.customer_id;
    }


    public PowerAgreementType getAgreement() {
        return this.agreement;
    }


    public void setName(String inputName) {
        this.name = inputName;
    }


    public void setEmail(String inputEmail) {
        this.email = inputEmail;
    }


    public void setCustomerId(int inputCustomer_id) {
        this.customer_id = inputCustomer_id;
    }


    public void setAgreement(PowerAgreementType inputAgreement) {
        this.agreement = inputAgreement;
    }


    public String toString() {
        return "Customer number: " + this.customer_id + "\nName: " + this.name + "\nEmail: " + this.email + "\nAgreement: " + this.agreement;
    }




}
