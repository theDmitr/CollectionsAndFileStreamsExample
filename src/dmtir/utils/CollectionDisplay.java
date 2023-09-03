package dmtir.utils;

import java.util.Collection;

public class CollectionDisplay {

    private static final String DELIMITER = "\n";

    public static <T> void display(Collection<T> collection) {
        display(collection, DELIMITER);
    }

    public static <T> void display(Collection<T> collection, String delimiter) {
        for (T t : collection) System.out.print(t + delimiter);
    }

}
