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
public class ComboboxSlottime {
   
      private static List<String> data = new ArrayList<>();
    public static List<String> getData(){
        data.add("7h-9h");
        data.add("9h-11h");
        data.add("13h-15h");
        data.add("15h-17h");
        data.add("17h-19h");
        return data;
    }

}
