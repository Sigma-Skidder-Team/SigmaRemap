package mapped;

import com.mojang.blaze3d.systems.RenderSystem;

public class Class4507 extends Class4505 {
   public Class4507(boolean var1) {
      super("cull", () -> {
         if (!var1) {
            RenderSystem.disableCull();
         }
      }, () -> {
         if (!var1) {
            RenderSystem.enableCull();
         }
      }, var1);
   }
}
