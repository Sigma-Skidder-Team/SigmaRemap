package remapped;

import java.util.Date;
import java.util.TreeMap;

public class class_4828 {
   public TreeMap<Date, String> field_24104 = new TreeMap<Date, String>();

   public class_4828() {
      System.out.println("new");
   }

   public void method_22220(Long var1, String var2) {
      while (this.field_24104.containsKey(new Date(var1))) {
         var1 = var1 + 1L;
      }

      this.field_24104.put(new Date(var1), var2);
   }

   public class_1293 method_22218() {
      return new class_1293(this.field_24104);
   }
}
