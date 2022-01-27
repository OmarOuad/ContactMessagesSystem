package com.proj;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class contact {
    public String name;
    public int phoneNumber;
    public static ArrayList<contact> listOfContacts = new ArrayList<>();

    public contact() {

    }

    public contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
    public static void displayContacts(){
        for(int i = 0; i < listOfContacts.size();i++){
            System.out.println(listOfContacts.get(i).toString());
        }
    }
    public static void addNewContact(contact newContact) {
        listOfContacts.add(newContact);
        Collections.sort(listOfContacts, contactNameComparator);
    }
    public static int findContactIndex(String name){
        int n = listOfContacts.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            String contactNameMid = listOfContacts.get(mid).getName().toUpperCase();
            String contactName = name.toUpperCase();
            if (contactNameMid.equals(contactName)) {
                return mid;
            }
            if (contactNameMid.compareTo(contactName)>0) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static contact searchContact(String name) {
        if (findContactIndex(name)==-1){
            return null;
        }
        else {
            return listOfContacts.get(findContactIndex(name));
        }

    }

    public static void deleteContact(String name){
        int i = findContactIndex(name);
        listOfContacts.remove(i);

    }
    public static Comparator<contact> contactNameComparator = new Comparator<contact>() {
        public int compare(contact c1, contact c2) {
            String contactName1 = c1.getName().toUpperCase();
            String contactName2 = c2.getName().toUpperCase();
            return contactName1.compareTo(contactName2);
        }
    };
}
