package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class temp {
    public static void main(String[] args) throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("/Users/rajatacharya/Documents/Bo-Ca-Aug-2021/boca-aug21-assignment-1/Assignment1/tmp/bank_transactions.txt"));
        List<String> lines = new ArrayList<>();

        String line;
        String data=null;
        while((line = abc.readLine()) != null) {
            lines.add(line);
            System.out.println(data);
        }
        abc.close();

// If you want to convert to a String[]
        data = lines.toArray(new String[]{}).toString();
    }
}
