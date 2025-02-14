package mapped;

import net.minecraft.client.Minecraft;

public final class Class386 extends Thread {
   private static String[] field1651;

   public Class386(String var1) {
      super(var1);
   }

   @Override
   public void run() {
      Minecraft var3 = Minecraft.getInstance();
      if (var3 != null) {
         IntegratedServer var4 = var3.getIntegratedServer();
         if (var4 != null) {
            var4.initiateShutdown(true);
         }
      }
   }
}
