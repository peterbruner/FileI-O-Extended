package com.theironyard.novauc;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        ReadWrite rw = new ReadWrite();
        Menu menu = new Menu();

        menu.menu();
        //rw.theEntireProject();
        //System.out.println(rw.switchBoard);
    }
}
