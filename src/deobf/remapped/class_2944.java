package remapped;

import java.io.PrintStream;

public class class_2944 extends Exception {
   private static String[] field_14366;
   private Throwable field_14365;

   public class_2944() {
   }

   public class_2944(String var1) {
      super(var1);
   }

   public class_2944(String var1, Throwable var2) {
      super(var1);
      this.field_14365 = var2;
   }

   public Throwable method_13472() {
      return this.field_14365;
   }

   @Override
   public void printStackTrace() {
      this.printStackTrace(System.err);
   }

   @Override
   public void printStackTrace(PrintStream var1) {
      if (this.field_14365 != null) {
         this.field_14365.printStackTrace();
      } else {
         super.printStackTrace(var1);
      }
   }
}
