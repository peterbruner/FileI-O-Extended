package com.theironyard.novauc;

/**
 * Created by peter on 2/16/17.
 */
public class Person {

    int id;
    String first_name;
    String last_name;
    String email;
    String country;
    String ip_address;

    Person(int id, String first_name, String last_name, String email, String country, String ip_address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
    }


}
