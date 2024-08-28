package mapped;

public class Class720 implements Runnable {
   private static String[] field3705;
   public final Class9457 field3706;

   public Class720(Class9457 var1) {
      this.field3706 = var1;
   }

   @Override
   public void run() {
      while (true) {
         long var3 = this.field3706.method36398(System.nanoTime());
         if (var3 == -1L) {
            return;
         }

         if (var3 > 0L) {
            long var5 = var3 / 1000000L;
            var3 -= var5 * 1000000L;
            synchronized (this.field3706) {
               try {
                  this.field3706.wait(var5, (int)var3);
               } catch (InterruptedException var10) {
               }
            }
         }
      }
   }
}
