package mapped;

import net.minecraft.client.Minecraft;

public class Class4509 extends Class4505 {
   public Class4509(boolean var1) {
      super("overlay", () -> {
         if (var1) {
            Minecraft.getInstance().gameRenderer.method770().method727();
         }
      }, () -> {
         if (var1) {
            Minecraft.getInstance().gameRenderer.method770().method732();
         }
      }, var1);
   }
}
