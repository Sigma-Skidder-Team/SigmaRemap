package mapped;

import java.lang.Thread.UncaughtExceptionHandler;

public class Class6033 implements UncaughtExceptionHandler {
   private static String[] field26233;

   public Class6033() {
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      var2.printStackTrace();
   }
}
