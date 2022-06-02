package myapp.core;

import java.io.*;  

public class AssignmentReader {  
    public static void main(String[] args) {  
        try {  
            Reader reader = new FileReader("/Users/irfaniman/downloads/exams.csv");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);
                str = str.replaceAll(",","");  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    }  
}  

str = str.replaceAll(",","");