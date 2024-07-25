package remapped;

import java.util.Map;

public class class_7080 extends Thread {
   private static String[] field_36565;
   private String field_36561;
   private Map field_36563;
   private byte[] field_36562;
   private class_3621 field_36564;

   public class_7080(String var1, Map var2, byte[] var3, class_3621 var4) {
      this.field_36561 = var1;
      this.field_36563 = var2;
      this.field_36562 = var3;
      this.field_36564 = var4;
   }

   @Override
   public void run() {
      try {
         class_6014.method_27452(this.field_36561, this.field_36563, this.field_36562);
         this.field_36564.method_16867(this.field_36561, this.field_36562, (Throwable)null);
      } catch (Exception var4) {
         this.field_36564.method_16867(this.field_36561, this.field_36562, var4);
      }
   }

   public String method_32582() {
      return this.field_36561;
   }

   public byte[] method_32579() {
      return this.field_36562;
   }

   public class_3621 method_32580() {
      return this.field_36564;
   }
}
