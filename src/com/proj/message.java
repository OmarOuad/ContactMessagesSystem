package com.proj;

import java.util.ArrayList;

public class message {
    public String message;
    public static ArrayList<message> listOfMessages = new ArrayList<>();

    public message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "message{" +
                "message='" + message + '\'' +
                '}';
    }

    public static void displayMessages(){
        for(int i = 0;i<listOfMessages.size();i++){
            System.out.println(listOfMessages.get(i).toString());
        }
    }
    public static void addMessage(message messageNew){
        listOfMessages.add(messageNew);
    }
}
