package dmtir.example;

import dmtir.example.comparator.PersonAgeComparator;
import dmtir.utils.CollectionDisplay;
import dmtir.utils.ESDBWorker;

import java.io.*;
import java.net.URL;
import java.util.*;

public class Main {

    private static final String person_names_path = "/person_names";

    public static void main(String[] args) {
        URL personNamesURL = Main.class.getResource(person_names_path);
        assert personNamesURL != null;
        ArrayList<String> personNames = ESDBWorker.GetDBLines(personNamesURL.getFile());

        Random random = new Random();
        int personsCount = random.nextInt(1, personNames.size());
        Person[] persons = new Person[personsCount];

        String pName;
        float pAge, pWeight, pHeight;
        for (int i = 0; i < personsCount; i++) {
            pName = personNames.get(random.nextInt(personNames.size()));
            pAge = random.nextFloat(16.0f, 64.0f);
            pWeight = random.nextFloat(50.0f, 140.0f);
            pHeight = random.nextFloat(145.0f, 200.0f);
            persons[i] = new Person(pName, pAge, pWeight, pHeight);
        }

        PersonAgeComparator pac = new PersonAgeComparator();
        SortedSet<Person> ss = new TreeSet<>(pac.reversed());
        ss.addAll(Arrays.asList(persons));

        CollectionDisplay.display(ss);
    }

}
