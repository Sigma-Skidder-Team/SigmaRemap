package mapped;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Class7074 implements ThreadFactory {
   private static String[] field30459;
   private static final ThreadFactory field30460 = Executors.defaultThreadFactory();
   private final UncaughtExceptionHandler field30461;

   public Class7074(UncaughtExceptionHandler var1) {
      this.field30461 = var1;
   }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var4 = field30460.newThread(var1);
      var4.setUncaughtExceptionHandler(this.field30461);
      return var4;
   }
}
