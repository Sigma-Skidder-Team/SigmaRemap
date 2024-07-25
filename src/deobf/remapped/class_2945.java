package remapped;

import net.minecraft.client.main.Main;

public final class class_2945 extends Thread {
   public class_2945(String var1, MinecraftClient var2) {
      super(var1);
      this.field_14368 = var2;
   }

   @Override
   public void run() {
      try {
         RenderSystem.method_16390(true);
         this.field_14368.run();
      } catch (Throwable var4) {
         Main.method_5().error("Exception in client thread", var4);
      }
   }
}
