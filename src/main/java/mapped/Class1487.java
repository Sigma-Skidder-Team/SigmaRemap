package mapped;

import java.util.ArrayList;

public class Class1487 implements Runnable {
   private static String[] field8004;
   private ArrayList<Class345> field8005;
   public final Class341 field8006;

   public Class1487(Class341 var1) {
      this.field8006 = var1;
      this.field8005 = new ArrayList<Class345>();
   }

   @Override
   public void run() {
      this.field8005.clear();

      try {
         this.field8005.addAll(this.field8006.method1662());
         long var3 = (long)((double)System.nanoTime() - (double)Class341.method1726(this.field8006) * 1.5);

         for (Class345 var6 : this.field8005) {
            Class341.method1727(this.field8006, var6, var3);
         }
      } catch (Exception var8) {
      }

      this.field8005.clear();
   }
}
