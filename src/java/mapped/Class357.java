package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.main.Main;

public final class Class357 extends Thread {
   public final Minecraft field1585;

   public Class357(String var1, Minecraft var2) {
      super(var1);
      this.field1585 = var2;
   }

   @Override
   public void run() {
      try {
         RenderSystem.method27805(true);
         this.field1585.run();
      } catch (Throwable var4) {
         Main.getLogger().error("Exception in client thread", var4);
      }
   }
}
