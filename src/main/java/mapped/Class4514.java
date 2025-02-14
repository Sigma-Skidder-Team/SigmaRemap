package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.util.Util;

public final class Class4514 extends Class4513 {
   private final int field21785;

   public Class4514(int var1) {
      super("portal_texturing", () -> {
         RenderSystem.matrixMode(5890);
         RenderSystem.pushMatrix();
         RenderSystem.loadIdentity();
         RenderSystem.translatef(0.5F, 0.5F, 0.0F);
         RenderSystem.scalef(0.5F, 0.5F, 1.0F);
         RenderSystem.translatef(17.0F / (float)var1, (2.0F + (float)var1 / 1.5F) * ((float)(Util.milliTime() % 800000L) / 800000.0F), 0.0F);
         RenderSystem.rotatef(((float)(var1 * var1) * 4321.0F + (float)var1 * 9.0F) * 2.0F, 0.0F, 0.0F, 1.0F);
         RenderSystem.scalef(4.5F - (float)var1 / 4.0F, 4.5F - (float)var1 / 4.0F, 1.0F);
         RenderSystem.method27931();
         RenderSystem.matrixMode(5888);
         RenderSystem.method27932();
      }, () -> {
         RenderSystem.matrixMode(5890);
         RenderSystem.popMatrix();
         RenderSystem.matrixMode(5888);
         RenderSystem.method27933();
      });
      this.field21785 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class4514 var4 = (Class4514)var1;
            return this.field21785 == var4.field21785;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.field21785);
   }
}
