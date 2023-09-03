package dmtir.example;

import dmtir.utils.CollectionDisplay;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final String person_names_path = "/person_names";

    public static void main(String[] args) {
        ArrayList<String> personNames = getPersonNames();

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

        CollectionDisplay.display(Arrays.asList(persons));
    }

    private static ArrayList<String> getPersonNames() {
        ArrayList<String> collection = new ArrayList<>();

        URL personNamesURL = Main.class.getResource(person_names_path);
        assert personNamesURL != null;
        try (BufferedReader br = new BufferedReader(new FileReader(personNamesURL.getFile()))) {
            while (br.ready()) collection.add(br.readLine());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return collection;
    }

}
