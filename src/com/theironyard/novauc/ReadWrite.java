package com.theironyard.novauc;

import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by peter on 2/16/17.
 */
public class ReadWrite {
    File fille = new File("people.txt");
    Scanner fileScanner = new Scanner(fille);
    public HashMap<String, ArrayList<Person>> switchBoard = new HashMap();


    public ReadWrite() throws IOException {
    }

    public void theEntireProject() {
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] lineFormatted = line.split("\\,");
            Person persons = new Person(Integer.valueOf(lineFormatted[0]), lineFormatted[1], lineFormatted[2],
                    lineFormatted[3], lineFormatted[4], lineFormatted[5]);
//            System.out.printf("(%d), %s, %s, %s, %s, %s\n", persons.getId(), persons.getFirst_name(),
//                    persons.getLast_name(), persons.getEmail(), persons.getCountry(), persons.getIp_address());
            if (switchBoard.containsKey(persons.getCountry())) {
                switchBoard.get(persons.getCountry()).add(persons);
            } else {
                switchBoard.put(persons.getCountry(), new ArrayList<Person>());
                switchBoard.get(persons.getCountry()).add(persons);
            }

            //if the key doenst exist add a new arraylist and then put the object into the arraylist
            // , if the key does exist add to the arraylist

            //not going to work, the line has 0 for first line. make it >=1
        }
    }

    File phile = new File("people.json");

    public void writing(Person crazyPerson) throws IOException {

        JsonSerializer serializer = new JsonSerializer();

        String jsonformattedPeople = serializer.serialize(crazyPerson);

        FileWriter fw = new FileWriter(phile);

        fw.write(jsonformattedPeople);
        fw.close();
    }
}

