package com.theironyard.novauc;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by peter on 2/18/17.
 */
public class Menu {

    public void menu() throws IOException{
        Scanner input = new Scanner(System.in);
        ReadWrite readenem = new ReadWrite();
        while (true) {
            System.out.println("What would you like to do? the entire project / get silly ");
            switch (input.nextLine()) {
                case "the entire project" :
                    //System.out.println("withdraw shows here");
                    readenem.theEntireProject();
                    break;
                case "get silly" :
                    //System.out.println("checkbalance shows here");
                    System.out.println(readenem.switchBoard);
                    break;
                case "remove account" :
                    //System.out.println("removeAccount shows here");
                    //removeAccount();
                    break;
                default:
                    return;
            }
        }
    }
}
