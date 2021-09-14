package io;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class JavaIOTest {

    public static void main(String[] args) throws IOException, ParseException {

        String[] date = null;
        String finalDay = null;
        String check = "Monday";
        Calendar c = Calendar.getInstance();

        // Read from file
        File f1 = new File("/Users/rajatacharya/Documents/Bo-Ca-Aug-2021/boca-aug21-assignment-1/Assignment1/tmp/bank_transactions.txt");
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String read = br.readLine();

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
            System.out.println("Day is : " + finalDay);

            c.setTime(dt1);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            System.out.println("Day of week: " + dayOfWeek);

            System.out.println("equal or not check with Monday " + finalDay.equals(check));
            read = br.readLine();

            if (dayOfWeek == 2) {
                bw.write(date[0] + " " +date[1] + " "+date[2] + " "+date[3] + " "+date[4] + " "+date[5] + " "+date[6] + " "
                        +date[7] + " " + finalDay + " " +dayOfWeek);
                bw.newLine();
                System.out.println(date[1] + " " + finalDay);
                System.out.println(Arrays.toString(date));
          }
        }
        bw.flush();
        bw.close();
    }
}