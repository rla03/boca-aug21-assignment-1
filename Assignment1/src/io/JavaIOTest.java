package io;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class JavaIOTest {

    public static void main(String[] args) throws IOException, ParseException {
        // Read from file
        File f1 = new File("/Users/rajatacharya/Documents/Bo-Ca-Aug-2021/boca-aug21-assignment-1/Assignment1/tmp/bank_transactions.txt");
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String read = br.readLine();
        String[] date = null;
        String finalDay = null;

        // Write from file
        File f2 = new File("/Users/rajatacharya/Documents/Bo-Ca-Aug-2021/boca-aug21-assignment-1/Assignment1/tmp/out.txt");
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);


        while (read != null) {
            date = read.split("\t");
            String t = date[1];
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yy");
            Date dt1 = format1.parse(t);
            DateFormat format2 = new SimpleDateFormat("EEEE");
            finalDay = format2.format(dt1);
            // System.out.println("Day is :" + finalDay);

            bw.write(date[1] + " " + finalDay);
            bw.newLine();
            System.out.println(date[1] + " " + finalDay);
            read = br.readLine();
            System.out.println(Arrays.toString(date));
        }

        bw.flush();
        bw.close();
    }
}
