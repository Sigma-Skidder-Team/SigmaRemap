package remapped;

public class class_5515 implements Runnable {
   private static String[] field_28076;

   public class_5515(class_8467 var1) {
      this.field_28077 = var1;
   }

   @Override
   public void run() {
      while (true) {
         long var3 = this.field_28077.method_38946(System.nanoTime());
         if (var3 == -1L) {
            return;
         }

         if (var3 > 0L) {
            long var5 = var3 / 1000000L;
            var3 -= var5 * 1000000L;
            synchronized (this.field_28077) {
               try {
                  this.field_28077.wait(var5, (int)var3);
               } catch (InterruptedException var10) {
               }
            }
         }
      }
   }
}
