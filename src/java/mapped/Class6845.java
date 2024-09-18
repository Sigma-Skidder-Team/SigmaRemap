package mapped;

import com.mojang.blaze3d.systems.RenderSystem;

public final class Class6845 implements Class6843 {
   @Override
   public void method20824(BufferBuilder var1, TextureManager var2) {
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   @Override
   public void method20825(Tessellator var1) {
   }

   @Override
   public String toString() {
      return "CUSTOM";
   }
}
