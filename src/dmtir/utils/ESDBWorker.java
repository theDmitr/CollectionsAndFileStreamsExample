package dmtir.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ESDBWorker {

    public static ArrayList<String> GetDBLines(String filePath) {
        ArrayList<String> collection = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.ready())
                collection.add(br.readLine());
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        return collection;
    }

    public static void WriteDBLines(java.lang.String filePath, ArrayList<String> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            Iterator<String> i = data.iterator();
            String sdata;
            while (i.hasNext()) {
                sdata = i.next();
                bw.write(sdata, 0, sdata.length());
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
