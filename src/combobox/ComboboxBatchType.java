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
public class ComboboxBatchType {
      private static List<String> data = new ArrayList<>();
    public static List<String> getData(){
        data.add("Fast Track");
        data.add("Normal Track");
        data.add("Slow Track");
        return data;
    }
}
