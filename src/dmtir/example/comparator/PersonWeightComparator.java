package dmtir.example.comparator;

import dmtir.example.Person;

import java.util.Comparator;

public class PersonWeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Float.compare(o1.getWeight(), o2.getWeight());
    }

}
