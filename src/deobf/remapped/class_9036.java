package remapped;

import java.util.HashMap;

public class class_9036 {
   private HashMap<Integer, class_4057> field_46235 = new HashMap<Integer, class_4057>();
   private byte field_46234 = 100;
   private String field_46232 = "";

   public HashMap<Integer, class_4057> method_41484() {
      return this.field_46235;
   }

   public void method_41487(HashMap<Integer, class_4057> var1) {
      this.field_46235 = var1;
   }

   public String method_41482() {
      return this.field_46232;
   }

   public void method_41486(String var1) {
      this.field_46232 = var1;
   }

   public class_4057 method_41485(int var1) {
      return this.field_46235.get(var1);
   }

   public void method_41480(int var1, class_4057 var2) {
      this.field_46235.put(var1, var2);
   }

   public byte method_41481() {
      return this.field_46234;
   }

   public void method_41483(byte var1) {
      this.field_46234 = var1;
   }
}
