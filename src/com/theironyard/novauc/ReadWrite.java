package com.theironyard.novauc;

import java.io.File;
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
    HashMap<String, ArrayList<Person>> switchBoard = new HashMap();


    public ReadWrite() throws IOException {
    }

    public void theEntireProject() {
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] lineFormatted = line.split("\\,");
            Person persons = new Person(Integer.valueOf(lineFormatted[0]), lineFormatted[1], lineFormatted[2],
                    lineFormatted[3], lineFormatted[4], lineFormatted[5]);
            System.out.printf("(%d), %s, %s, %s, %s, %s\n", persons.id, persons.first_name, persons.last_name,
                    persons.email, persons.country, persons.ip_address);
            if (switchBoard.containsKey(persons.country)) {
                switchBoard.get(persons.country).add(persons);
            }
            else {
                switchBoard.put(persons.country, new ArrayList<Person>());
                switchBoard.get(persons.country).add(persons);
            }

            //if the key doenst exist add a new arraylist and then put the object into the arraylist
            // , if the key does exist add to the arraylist

            //ToDo: write an if, so that lines that don't start with an integer are not included, check forum project?
            //not going to work, the line has 0 for first line. make it >=1
        }
    }
}
