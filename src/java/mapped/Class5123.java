package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Map;

public class Class5123 implements Class5119 {
   private static String[] field23301;
   private final Minecraft field23302;
   private final Map<Integer, List<Class4231>> field23303 = Maps.newHashMap();

   @Override
   public void method15814() {
      this.field23303.clear();
   }

   public void method15822(int var1, List<Class4231> var2) {
      this.field23303.put(var1, var2);
   }

   public Class5123(Minecraft var1) {
      this.field23302 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      ActiveRenderInfo var11 = this.field23302.gameRenderer.getActiveRenderInfo();
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      BlockPos var12 = new BlockPos(var11.getPos().x, 0.0, var11.getPos().z);
      this.field23303.forEach((var1x, var2x) -> {
         for (int var5x = 0; var5x < var2x.size(); var5x++) {
            Class4231 var6 = var2x.get(var5x);
            if (var12.withinDistance(var6.field20563, 160.0)) {
               double var7x = (double)var6.field20563.getX() + 0.5;
               double var9 = (double)var6.field20563.getY() + 2.0 + (double)var5x * 0.25;
               double var11x = (double)var6.field20563.getZ() + 0.5;
               int var13 = !var6.field20566 ? -3355444 : -16711936;
               DebugRenderer.method27460(var6.field20565, var7x, var9, var11x, var13);
            }
         }
      });
      RenderSystem.enableDepthTest();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
