package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class5134 implements Class5119 {
   private static String[] field23334;
   private final List<BlockPos> field23335 = Lists.newArrayList();
   private final List<Float> field23336 = Lists.newArrayList();
   private final List<Float> field23337 = Lists.newArrayList();
   private final List<Float> field23338 = Lists.newArrayList();
   private final List<Float> field23339 = Lists.newArrayList();
   private final List<Float> field23340 = Lists.newArrayList();

   public void method15901(BlockPos var1, float var2, float var3, float var4, float var5, float var6) {
      this.field23335.add(var1);
      this.field23336.add(var2);
      this.field23337.add(var6);
      this.field23338.add(var3);
      this.field23339.add(var4);
      this.field23340.add(var5);
   }

   @Override
   public void method15813(MatrixStack var1, IRenderTypeBuffer var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      Tessellator var11 = Tessellator.getInstance();
      BufferBuilder var12 = var11.getBuffer();
      var12.begin(5, DefaultVertexFormats.POSITION_COLOR);

      for (int var13 = 0; var13 < this.field23335.size(); var13++) {
         BlockPos var14 = this.field23335.get(var13);
         Float var15 = this.field23336.get(var13);
         float var16 = var15 / 2.0F;
         WorldRenderer.method900(
            var12,
            (double)((float)var14.getX() + 0.5F - var16) - var3,
            (double)((float)var14.getY() + 0.5F - var16) - var5,
            (double)((float)var14.getZ() + 0.5F - var16) - var7,
            (double)((float)var14.getX() + 0.5F + var16) - var3,
            (double)((float)var14.getY() + 0.5F + var16) - var5,
            (double)((float)var14.getZ() + 0.5F + var16) - var7,
            this.field23338.get(var13),
            this.field23339.get(var13),
            this.field23340.get(var13),
            this.field23337.get(var13)
         );
      }

      var11.draw();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
