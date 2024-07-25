package remapped;

import java.util.ArrayList;

public class class_7283 implements Runnable {
   private static String[] field_37278;
   private ArrayList<class_4809> field_37279;

   public class_7283(class_7369 var1) {
      this.field_37277 = var1;
      this.field_37279 = new ArrayList<class_4809>();
   }

   @Override
   public void run() {
      this.field_37279.clear();

      try {
         this.field_37279.addAll(this.field_37277.method_33573());
         long var3 = (long)((double)System.nanoTime() - (double)class_7369.method_33571(this.field_37277) * 1.5);

         for (class_4809 var6 : this.field_37279) {
            class_7369.method_33570(this.field_37277, var6, var3);
         }
      } catch (Exception var8) {
      }

      this.field_37279.clear();
   }
}
