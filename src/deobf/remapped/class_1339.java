package remapped;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class class_1339 implements ThreadFactory {
   private static String[] field_7328;
   private static final ThreadFactory field_7327 = Executors.defaultThreadFactory();
   private final UncaughtExceptionHandler field_7329;

   public class_1339(UncaughtExceptionHandler var1) {
      this.field_7329 = var1;
   }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var4 = field_7327.newThread(var1);
      var4.setUncaughtExceptionHandler(this.field_7329);
      return var4;
   }
}
