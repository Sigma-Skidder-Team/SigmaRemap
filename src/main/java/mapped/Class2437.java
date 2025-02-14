package mapped;

import java.io.PrintStream;

public class Class2437 extends Exception {
   private static String[] field16477;
   private Throwable field16478;

   public Class2437() {
   }

   public Class2437(String var1) {
      super(var1);
   }

   public Class2437(String var1, Throwable var2) {
      super(var1);
      this.field16478 = var2;
   }

   public Throwable method10418() {
      return this.field16478;
   }

   @Override
   public void printStackTrace() {
      this.printStackTrace(System.err);
   }

   @Override
   public void printStackTrace(PrintStream var1) {
      if (this.field16478 != null) {
         this.field16478.printStackTrace();
      } else {
         super.printStackTrace(var1);
      }
   }
}
