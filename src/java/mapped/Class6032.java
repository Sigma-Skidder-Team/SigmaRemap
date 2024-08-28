package mapped;

import java.lang.Thread.UncaughtExceptionHandler;

public class Class6032 implements UncaughtExceptionHandler {
   private static String[] field26230;
   public final Class340 field26231;
   public final Class359 field26232;

   public Class6032(Class359 var1, Class340 var2) {
      this.field26232 = var1;
      this.field26231 = var2;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      var2.printStackTrace();
   }
}
