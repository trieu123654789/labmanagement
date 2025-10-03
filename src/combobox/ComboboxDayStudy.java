/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combobox;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ComboboxDayStudy {
     private static List<String> data1 = new ArrayList<>();
    public static List<String> getData(){
        data1.add("Monday-Wendesday-Friday: theory ; Tuesday-Thurday-Saturday: lab");
        data1.add("Monday-Wednesdy: theory ; Tuesday-Thursday: lab");
        data1.add("Tuesday-Thursday: theory ; Wednesday-Friday: lab");
        data1.add("Wednesday-Friday: theory ; Thursday-Saturday: lab");
        data1.add("Monday-Wendesday: theory ; Friday: lab");
        data1.add("Tuesday-Thursday: theory ; Saturday: lab");
        return data1;
}
}