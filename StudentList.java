import java.io.*;
import java.text.*;
import java.util.*;

public class StudentList {
    public static void main(String[] args) {

//		Check arguments
        if (args[0].equals("a")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferreader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String st = bufferreader.readLine();
                String i[] = st.split(",");
                for (String j : i) {
                    System.out.println(j);
                }
            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].equals("r")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferreader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String st = bufferreader.readLine();
                System.out.println(r);
                String i[] = st.split(",");
                Random x = new Random();
                int y = x.nextInt();
                System.out.println(i[y]);
            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("+")) {
            System.out.println("Loading data ...");
            try {
                BufferedWriter bufferwriter = new BufferedWriter(
                        new FileWriter("students.txt", true));
                String t = args[0].substring(1);
                Date d = new Date();
                String df = "dd/mm/yyyy-hh:mm:ss a";
                DateFormat dateFormat = new SimpleDateFormat(df);
                String fd = dateFormat.format(d);
                bufferwriter.write(", " + t + "\nList last updated on " + fd);
                bufferwriter.close();
            } catch (Exception e) {
            }

            System.out.println("Data Loaded.");
        } else if (args[0].contains("?")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferreader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String st = bufferreader.readLine();
                String i[] = st.split(",");
                boolean done = false;
                String t = args[0].substring(1);
                for (int idx = 0; idx < i.length && !done; idx++) {
                    if (i[idx].equals(t)) {
                        System.out.println("We found it!");
                        break;
                    }
                }
            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        } else if (args[0].contains("c")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferreader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String D = bufferreader.readLine();
                char a[] = D.toCharArray();
                boolean in_word = false;
                int count = 0;
                for (char c : a) {
                    if (c == ' ') {
                        if (!in_word) {
                            count++;
                            in_word = true;
                        } else {
                            in_word = false;
                        }
                    }
                }
                System.out.println(count + " word(s) found " + a.length);
            } catch (Exception e) {
            }
            System.out.println("Data Loaded.");
        }
        //System.out.println("Invalid number");
    }

}