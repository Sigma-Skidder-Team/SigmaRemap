package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

public class Class5136 implements Class5119 {
   private static String[] field23344;
   private final Map<BlockPos, Class9180> field23345 = Maps.newHashMap();

   public void method15907(BlockPos var1, int var2, String var3, int var4) {
      this.field23345.put(var1, new Class9180(var2, var3, Util.milliTime() + (long)var4));
   }

   @Override
   public void method15814() {
      this.field23345.clear();
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      long var11 = Util.milliTime();
      this.field23345.entrySet().removeIf(var2x -> var11 > var2x.getValue().field42161);
      this.field23345.forEach(this::method15908);
   }

   private void method15908(BlockPos var1, Class9180 var2) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.field15997, DestFactor.field12932, GlStateManager.SourceFactor.field15990, DestFactor.field12936);
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.disableTexture();
      DebugRenderer.method27456(var1, 0.02F, var2.method34331(), var2.method34332(), var2.method34333(), var2.method34334());
      if (!var2.field42160.isEmpty()) {
         double var5 = (double)var1.getX() + 0.5;
         double var7 = (double)var1.getY() + 1.2;
         double var9 = (double)var1.getZ() + 0.5;
         DebugRenderer.method27462(var2.field42160, var5, var7, var9, -1, 0.01F, true, 0.0F, true);
      }

      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }
}
