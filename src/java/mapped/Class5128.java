package mapped;

import com.google.common.collect.Lists;
import java.util.Collection;

public class Class5128 implements Class5119 {
   private final Minecraft field23316;
   private Collection<BlockPos> field23317 = Lists.newArrayList();

   public Class5128(Minecraft var1) {
      this.field23316 = var1;
   }

   public void method15863(Collection<BlockPos> var1) {
      this.field23317 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      BlockPos var11 = this.method15866().method37505();

      for (BlockPos var13 : this.field23317) {
         if (var11.method8316(var13, 160.0)) {
            method15864(var13);
         }
      }
   }

   private static void method15864(BlockPos var0) {
      DebugRenderer.method27455(var0.method8335(-0.5, -0.5, -0.5), var0.method8335(1.5, 1.5, 1.5), 1.0F, 0.0F, 0.0F, 0.15F);
      method15865("Raid center", var0, -65536);
   }

   private static void method15865(String var0, BlockPos var1, int var2) {
      double var5 = (double)var1.getX() + 0.5;
      double var7 = (double)var1.getY() + 1.3;
      double var9 = (double)var1.getZ() + 0.5;
      DebugRenderer.method27462(var0, var5, var7, var9, var2, 0.04F, true, 0.0F, true);
   }

   private Class9624 method15866() {
      return this.field23316.gameRenderer.getActiveRenderInfo();
   }
}
