package com.example;

public class Jokes {
    public static String getRandomJoke() {
        //Courtesy of https://xkcd.com/221/
        String joke = "";
        joke += "int getRandomNumber()\n";
        joke += "{\n";
        joke += "    return 4; // chosen by fair dice roll.\n";
        joke += "              // guaranted to be random\n";
        joke += "}";
        return joke;
    }
}
