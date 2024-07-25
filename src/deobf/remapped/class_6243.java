package remapped;

import java.lang.Thread.UncaughtExceptionHandler;

public class class_6243 implements UncaughtExceptionHandler {
   private static String[] field_31947;

   public class_6243(class_2788 var1, class_2264 var2) {
      this.field_31948 = var1;
      this.field_31946 = var2;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      var2.printStackTrace();
   }
}
