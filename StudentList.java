import java.io.*;
import java.text.*;
import java.util.*;

public class StudentList {
    public static void main(String[] args) {

//		Check arguments
        if (args[0].equals("a")) {
            System.out.println("Loading data ...");
            try {

                BufferedReader s = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String r = s.readLine();//string name r is improvement
                String i[] = r.split(",");
                for (String j : i) {
                    System.out.println(j);
                }
            } catch (Exception e) {
			}
            System.out.println("Data Loaded.");

        } else if (args[0].equals("r")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader s = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String r = s.readLine();
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

                BufferedWriter r = new BufferedWriter(
                        new FileWriter("students.txt", true));
                String t = args[0].substring(1);
                Date d = new Date();
                String df = "dd/mm/yyyy-hh:mm:ss a";
                DateFormat dateFormat = new SimpleDateFormat(df);
                String fd = dateFormat.format(d);
                r.write(", " + t + "\nList last updated on " + fd);
                r.close();
            } catch (Exception e) {
			}

            System.out.println("Data Loaded.");

        } else if (args[0].contains("?")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader s = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String r = s.readLine();
                String i[] = r.split(",");
                boolean done = false;
                String t = args[0].substring(1);
                for (int index = 0; index < i.length && !done; index++) {
                    if (i[index].equals(t)) {
                        System.out.println("We found it!");
                        done=true;
                    }
                }
            } catch (Exception e) {
			}
            System.out.println("Data Loaded.");

        } else if (args[0].contains("c")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader s = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String D = s.readLine();
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

    }
}

