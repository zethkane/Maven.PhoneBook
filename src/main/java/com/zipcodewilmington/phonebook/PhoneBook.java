package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> myPhoneBook;


    public PhoneBook(Map<String, List<String>> map) {
        if(!map.isEmpty()){
            myPhoneBook.putAll(map);
        }
        else {
            this.myPhoneBook = new HashMap<>();
        }
    }

    public PhoneBook() {
        this.myPhoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = Arrays.asList(phoneNumber);
        this.myPhoneBook.put(name, numbers);

    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> numbers = new ArrayList<>();
        if(phoneNumbers != null){
            for (String names: phoneNumbers) {
                numbers.add(names);
            }
        }
        this.myPhoneBook.put(name, numbers);


    }

    public void remove(String name) {
        myPhoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if(myPhoneBook.containsKey(name)){
        return true;}
        else{ return false;}
    }

    public List<String> lookup(String name) {

        return null;
    }

    public String reverseLookup(String phoneNumber)  {

        return null;
    }

    public List<String> getAllContactNames() {
//        myPhoneBook.
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
