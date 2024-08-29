package mapped;

import net.minecraft.client.util.Util;

public final class Class371 extends Thread {
   public Class371(String var1) {
      super(var1);
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var4) {
            Util.method38542().warn("Timer hack thread interrupted, that really should not happen");
            return;
         }
      }
   }
}
