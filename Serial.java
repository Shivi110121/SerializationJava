package com.company;

import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public class Serial {
    public static void main(String[] args) throws Exception {
        //Creating new object
        seaCreatures obj = new seaCreatures();

        //Assigning value to object initialized in class seaCreatures
        obj.killerWhale = 328;

        //Creating new object
        seaCreatures obj1 = new seaCreatures();

        //Assigning value to object initialized in class seaCreatures
        obj1.greatWhiteShark = 3900;

        //Creating new object
        seaCreatures obj2 = new seaCreatures();

        //Assigning value to object initialized in class seaCreatures
        obj2.octopus = 13100;

        //Creating new object
        seaCreatures obj3 = new seaCreatures();

        //Assigning value to object initialized in class seaCreatures
        obj3.starFish = 20000;

        //Creating new object
        seaCreatures obj4 = new seaCreatures();

        //Assigning value to object initialized in class seaCreatures
        obj4.lobster = 100;

        //Creating file for output objects created
        File file = new File("seaCreatures.txt");
        //Output for a file created
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //Writing objects into text file using java method called WriteObject.
        oos.writeObject(obj);
        oos.writeObject(obj1);
        oos.writeObject(obj2);
        oos.writeObject(obj3);
        oos.writeObject(obj4);
    }
}


class seaCreatures implements Serializable
{
    //Sea animals at what depth they live in ft
    int killerWhale;
    int greatWhiteShark;
    int octopus;
    int starFish;
    int lobster;
}