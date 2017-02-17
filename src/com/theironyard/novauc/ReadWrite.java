package com.theironyard.novauc;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by peter on 2/16/17.
 */
public class ReadWrite {
    File fille = new File("people.txt");
    Scanner fileScanner = new Scanner(fille);


    public ReadWrite() throws FileNotFoundException {
    }

    public void read() {
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();

            String[] lineFormatted = line.split("\\,");
            Person persons = new Person(Integer.valueOf(lineFormatted[0]), lineFormatted[1], lineFormatted[2],
                    lineFormatted[3], lineFormatted[4], lineFormatted[5]);
            System.out.printf("(%d), %s, %s, %s, %s, %s\n", persons.id, persons.first_name, persons.last_name,
                    persons.email, persons.country, persons.ip_address);

            //write an if, so that lines that don't start with an integer are not included
        }
    }
}
