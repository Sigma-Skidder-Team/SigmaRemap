package remapped;

public final class class_9217 extends Thread {
   public class_9217() {
      super("Okio Watchdog");
      this.setDaemon(true);
   }

   @Override
   public void run() {
      while (true) {
         try {
            class_1353 var4;
            synchronized (class_1353.class) {
               var4 = class_1353.method_6244();
               if (var4 == null) {
                  continue;
               }

               if (var4 == class_1353.field_7380) {
                  class_1353.field_7380 = null;
                  return;
               }
            }

            var4.method_6242();
         } catch (InterruptedException var7) {
         }
      }
   }
}
