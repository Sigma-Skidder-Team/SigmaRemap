package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Class5121 implements Class5119 {
   private static String[] field23295;
   private final Minecraft field23296;
   private double field23297 = Double.MIN_VALUE;
   private List<VoxelShape> field23298 = Collections.<VoxelShape>emptyList();

   public Class5121(Minecraft var1) {
      this.field23296 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      double var11 = (double) Util.nanoTime();
      if (var11 - this.field23297 > 1.0E8) {
         this.field23297 = var11;
         Entity var13 = this.field23296.gameRenderer.getActiveRenderInfo().getRenderViewEntity();
         this.field23298 = var13.world.func_234867_d_(var13, var13.getBoundingBox().grow(6.0), var0 -> true).collect(Collectors.<VoxelShape>toList());
      }

      IVertexBuilder var16 = var2.method25597(RenderType.getLines());

      for (VoxelShape var15 : this.field23298) {
         WorldRenderer.method895(var1, var16, var15, -var3, -var5, -var7, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
