package com.theironyard.novauc;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by peter on 2/18/17.
 */
public class Menu {

    public void menu() throws IOException{
        Scanner input = new Scanner(System.in);
        ReadWrite rw = new ReadWrite();
        while (true) {
            System.out.println("What would you like to do? the entire project / print hashmap / write json / finish");
            switch (input.nextLine()) {
                case "the entire project" :
                    rw.theEntireProject();
                    break;
                case "print hashmap" :
                    System.out.println(rw.switchBoard);
                    break;
                case "write json" :
                    rw.writing();
                    break;
                default:
                    return;
            }
        }
    }
}
