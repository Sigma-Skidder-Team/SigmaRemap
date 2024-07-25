package remapped;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;

public class class_8482 extends Thread {
   private static String[] field_43459;
   private static final Logger field_43458 = Logger.getLogger(class_8482.class.getName());
   private static final ThreadFactory field_43457 = new class_8102();
   private static class_8482 field_43460;
   private static ExecutorService field_43461;
   private static int field_43462 = 0;

   private class_8482(Runnable var1) {
      super(var1);
   }

   public static boolean method_39074() {
      return currentThread() == field_43460;
   }

   public static void method_39073(Runnable var0) {
      if (!method_39074()) {
         method_39080(var0);
      } else {
         var0.run();
      }
   }

   public static void method_39080(Runnable var0) {
      ExecutorService var4;
      synchronized (class_8482.class) {
         field_43462++;
         if (field_43461 == null) {
            field_43461 = Executors.newSingleThreadExecutor(field_43457);
         }

         var4 = field_43461;
      }

      var4.execute(new class_4126(var0));
   }
}
