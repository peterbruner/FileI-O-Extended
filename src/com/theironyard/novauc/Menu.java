package com.theironyard.novauc;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by peter on 2/18/17.
 */
public class Menu {

    Person crazyPerson = new Person();

    public void menu() throws IOException{
        Scanner input = new Scanner(System.in);
        ReadWrite readenem = new ReadWrite();
        while (true) {
            System.out.println("What would you like to do? the entire project / print hashmap / write json / finish");
            switch (input.nextLine()) {
                case "the entire project" :
                    //System.out.println("withdraw shows here");
                    readenem.theEntireProject();
                    break;
                case "print hashmap" :
                    //System.out.println("checkbalance shows here");
                    System.out.println(readenem.switchBoard);
                    break;
                case "write json" :
                    //System.out.println("removeAccount shows here");
                    readenem.writing(crazyPerson);
                    break;
                default:
                    return;
            }
        }
    }
}
