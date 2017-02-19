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
    public static HashMap<String, ArrayList<Person>> switchBoard = new HashMap();


    public ReadWrite() throws IOException {
    }

    public void theEntireProject() {
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] lineFormatted = line.split("\\,");
            Person persons = new Person(Integer.valueOf(lineFormatted[0]), lineFormatted[1], lineFormatted[2],
                    lineFormatted[3], lineFormatted[4], lineFormatted[5]);

            if (switchBoard.containsKey(persons.getCountry())) {
                switchBoard.get(persons.getCountry()).add(persons);
            } else {
                switchBoard.put(persons.getCountry(), new ArrayList<Person>());
                switchBoard.get(persons.getCountry()).add(persons);
            }
        }
    }

    File phile = new File("people.json");

    public void writing() throws IOException {

        JsonSerializer serializer = new JsonSerializer();

        String jsonformattedPeople = serializer.deep(true).serialize(switchBoard);

        FileWriter fw = new FileWriter(phile);

        fw.write(jsonformattedPeople);
        fw.close();
    }
}