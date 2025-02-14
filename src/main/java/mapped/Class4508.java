package mapped;

import net.minecraft.client.renderer.RenderHelper;

public class Class4508 extends Class4505 {
   public Class4508(boolean var1) {
      super("diffuse_lighting", () -> {
         if (var1) {
            RenderHelper.enableStandardItemLighting();
         }
      }, () -> {
         if (var1) {
            RenderHelper.disableStandardItemLighting();
         }
      }, var1);
   }
}
