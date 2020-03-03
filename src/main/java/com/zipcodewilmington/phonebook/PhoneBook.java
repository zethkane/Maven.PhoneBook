package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> myPhoneBook = new HashMap<>();


    public PhoneBook(Map<String, List<String>> map) {
    }

    public PhoneBook() {

    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = Arrays.asList(phoneNumber);
        this.myPhoneBook.put(name, numbers);

    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> numbers = new ArrayList<>();
        if(phoneNumbers != null){
            for (String nums: phoneNumbers) {
                numbers.add(nums);
            }
            myPhoneBook.put(name, numbers);
        }
    }

    public void remove(String name) {
        if(myPhoneBook.containsKey(name)){
            myPhoneBook.remove(name);
        }
    }

    public Boolean hasEntry(String name) {
        return myPhoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return myPhoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {

        return null;
    }

    public List<String> getAllContactNames() {
        String name = "";
        name += myPhoneBook.keySet();
        List<String> names = new ArrayList<>();

        return names;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
