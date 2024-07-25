package remapped;

import java.lang.Thread.UncaughtExceptionHandler;

public class class_8098 implements UncaughtExceptionHandler {
   private static String[] field_41487;

   private class_8098() {
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      var2.printStackTrace();
   }
}
