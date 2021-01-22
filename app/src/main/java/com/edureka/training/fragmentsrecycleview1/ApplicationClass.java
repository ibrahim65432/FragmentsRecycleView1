package com.edureka.training.fragmentsrecycleview1;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();
        people.add(new Person("Chuck Norris", "0012901232"));
        people.add(new Person("John Rambo", "121321232131"));
        people.add(new Person("Nelson Mandela", "0012312313"));

    }
}
