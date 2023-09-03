package dmtir.example.comparator;

import dmtir.example.Person;

import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Float.compare(o1.getHeight(), o2.getHeight());
    }

}
