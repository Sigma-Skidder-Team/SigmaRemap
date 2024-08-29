package mapped;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Class5121 implements Class5119 {
   private static String[] field23295;
   private final Minecraft field23296;
   private double field23297 = Double.MIN_VALUE;
   private List<Class6408> field23298 = Collections.<Class6408>emptyList();

   public Class5121(Minecraft var1) {
      this.field23296 = var1;
   }

   @Override
   public void method15813(MatrixStack var1, Class7733 var2, double var3, double var5, double var7) {
      double var11 = (double) Util.nanoTime();
      if (var11 - this.field23297 > 1.0E8) {
         this.field23297 = var11;
         Entity var13 = this.field23296.gameRenderer.getActiveRenderInfo().method37509();
         this.field23298 = var13.world.method7047(var13, var13.method3389().method19664(6.0), var0 -> true).collect(Collectors.<Class6408>toList());
      }

      Class5422 var16 = var2.method25597(RenderType.method14345());

      for (Class6408 var15 : this.field23298) {
         WorldRenderer.method895(var1, var16, var15, -var3, -var5, -var7, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
