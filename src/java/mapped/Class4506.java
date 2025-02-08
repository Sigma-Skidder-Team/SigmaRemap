package mapped;

import net.minecraft.client.Minecraft;

public class Class4506 extends Class4505 {
   public Class4506(boolean var1) {
      super("lightmap", () -> {
         if (var1) {
            Minecraft.getInstance().gameRenderer.method769().enableLightmap();
         }
      }, () -> {
         if (var1) {
            Minecraft.getInstance().gameRenderer.method769().disableLightmap();
         }
      }, var1);
   }
}
