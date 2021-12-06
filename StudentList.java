import java.io.*;
import java.text.*;
import java.util.*;

public class StudentList {
    public static void main(String[] args) {

//		Check arguments
        if (args[0].equals("a")) {
            System.out.println("Loading data ...");
            try {           //try statement use to error handling
            	//variable name  improvement
                BufferedReader bufferreader = new BufferedReader(    //new bufferfile decelere
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String st = bufferreader.readLine();//string name r is improvement
                String i[] = st.split(",");
                for (String j : i) {
                    System.out.println(j);
                }
            } catch (Exception e)

            System.out.println("Data Loaded.");
            //another statement passing
        } else if (args[0].equals("r")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferreader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String st = bufferreader.readLine();
                System.out.println(st); //string st is passing to see output
                String i[] = st.split(",");
                Random x = new Random();
                int y = x.nextInt();
                System.out.println(i[y]);
            } catch (Exception e)

            System.out.println("Data Loaded.");
            //go to another statement
        } else if (args[0].contains("+")) {
            System.out.println("Loading data ...");
            try {
            	//variable s change to new variable
                BufferedWriter bufferwriter = new BufferedWriter(
                        new FileWriter("students.txt", true));
                String t = args[0].substring(1);
                Date d = new Date();
                String df = "dd/mm/yyyy-hh:mm:ss a";
                DateFormat dateFormat = new SimpleDateFormat(df);
                String fd = dateFormat.format(d);
                bufferwriter.write(", " + t + "\nList last updated on " + fd);//new variable passing
                bufferwriter.close();//new variable passing
            } catch (Exception e)


            System.out.println("Data Loaded.");
            //go to another else if statement
        } else if (args[0].contains("?")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferreader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String st = bufferreader.readLine(); //variable name improvement into st
                String i[] = st.split(",");
                boolean done = false;
                String t = args[0].substring(1);
                for (int index = 0; index < i.length && !done; index++) {  //initialision index zero decelere
                    if (i[index].equals(t)) {
                        System.out.println("We found it!");
                        break;  //done is improvement into break statement
                    }
                }
            } catch (Exception e)

            System.out.println("Data Loaded.");
            //go to another else if statement
        } else if (args[0].contains("c")) {
            System.out.println("Loading data ...");
            try {
                BufferedReader bufferreader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("students.txt")));
                String D = bufferreader.readLine();
                char a[] = D.toCharArray(); //new variable deceleration charater type
                boolean in_word = false;  //initialize boolean data type
                int count = 0; //initially  zero deceleration
                for (char c : a) {     //working loop statement
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
            } catch (Exception e)

            System.out.println("Data Loaded."); //print the data
        }
        //System.out.println("Invalid number");
    }

}