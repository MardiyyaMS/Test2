/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mardiyya S
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        static String name, id, age, allergies, symptoms;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Test2.name = name;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Test2.id = id;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        Test2.age = age;
    }

    public static String getAllergies() {
        return allergies;
    }

    public static void setAllergies(String allergies) {
        Test2.allergies = allergies;
    }

    public static String getSymptoms() {
        return symptoms;
    }

    public static void setSymptoms(String symptoms) {
        Test2.symptoms = symptoms;
    }
     public static void writeFile() throws IOException
    {
     BufferedWriter myBF = new BufferedWriter (new FileWriter("Test2Record.txt",true));  
     myBF.write(getName() + " " + getid() + " " + getage() +" " + getallergies() +" " + getsymptoms());
     myBF.newLine();
     myBF.close();
    }

    private static String getid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static char[] getsymptoms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setname(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setage(String age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String getallergies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setallergies(String allergies) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setsymptoms(String symptoms) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
