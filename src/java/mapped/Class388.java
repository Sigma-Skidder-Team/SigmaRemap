package mapped;

public final class Class388 extends Thread {
   public Class388() {
      super("Okio Watchdog");
      this.setDaemon(true);
   }

   @Override
   public void run() {
      while (true) {
         try {
            Class4918 var4;
            synchronized (Class4918.class) {
               var4 = Class4918.method15230();
               if (var4 == null) {
                  continue;
               }

               if (var4 == Class4918.field22817) {
                  Class4918.field22817 = null;
                  return;
               }
            }

            var4.method15224();
         } catch (InterruptedException var7) {
         }
      }
   }
}
