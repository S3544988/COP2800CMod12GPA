// PalmerPenguins.java
// Julio Colon
// 4/7/2026
// Wraps and stores any data type

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
   private T value;

   // Constructor
   public DataWrapper(T value) {
      this.value = value;
   }

   // Getter
   public T getValue() {
      return value;
   }

   // Static display method
   public static <T> void displayList(List<DataWrapper<T>> list) {
      for (DataWrapper<T> element : list) {
         System.out.println(element.getValue());
      }
   }
}
