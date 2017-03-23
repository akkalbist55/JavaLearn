import java.io.*;

import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.*;

public class WriteToFile{
    public static void main(String[] args) {
        try
        {
            String filename = "students.txt";
            FileWriter fw = new FileWriter(filename, true); //the true will append the new data

           Console console = System.console();
            Scanner scanner = new Scanner(System.in);

           try{
                if(Integer.parseInt(args[0]) == 1){
                    int rollno;
                    String name;
                    String address;
                    System.out.print("Roll No. : ");
                    rollno = scanner.nextInt();

                   name = console.readLine("Student's Full Name: ");
                    console.flush();
                    address = console.readLine("Address: ");

                   fw.write(rollno + "-" + name + "-" + address + "\n");
                    fw.close();
                }

           } catch(Exception e){
                e.printStackTrace();
            } finally {
                fw.close();
            }

           listStudents();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

   public static void listStudents(){
        try{
            List<String> lines = Files.readAllLines(Paths.get("./students.txt"));
            System.out.println("Roll no" + "|" + "Name" + "|" + "Address");
            for(String line: lines){
              for (String value: line.split("-")) {
                 System.out.print(value + "\t" + "|");
              }
              System.out.print("\n");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
