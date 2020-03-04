package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> myPhoneBook = new LinkedHashMap<>();


    public PhoneBook(Map<String, List<String>> map) {
        this.myPhoneBook = map;
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
        return false;
    }

    public List<String> lookup(String name) {
        return myPhoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String result = "";
        if(myPhoneBook.containsValue(phoneNumber)){
           result += myPhoneBook.entrySet();
        return result;}
        else {return null;}
    }

    public List<String> getAllContactNames() {
        ArrayList<String> names = new ArrayList<>();
        for (String key: myPhoneBook.keySet()) {
            names.add(key);
        }
        return names;
    }

    public Map<String, List<String>> getMap() {
        return myPhoneBook;
    }
}
