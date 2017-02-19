package com.theironyard.novauc;

/**
 * Created by peter on 2/16/17.
 */
public class Person {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String country;
    private String ip_address;

    Person(int id, String first_name, String last_name, String email, String country, String ip_address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
    }

    @Override
    public String toString() {
        return String.format("%s %s at %s from %s can be reached at %s\n ",this.first_name, this.last_name, this.ip_address,
                this.country, this.email);
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getLast_name() {
        return last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() { return email; }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
    public String getIp_address() {
        return ip_address;
    }

}
