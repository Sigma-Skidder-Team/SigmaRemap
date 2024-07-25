package remapped;

import java.util.concurrent.ThreadFactory;

public final class class_3063 implements ThreadFactory {
   private static String[] field_15061;

   public class_3063(String var1, boolean var2) {
      this.field_15062 = var1;
      this.field_15060 = var2;
   }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var4 = new Thread(var1, this.field_15062);
      var4.setDaemon(this.field_15060);
      return var4;
   }
}
