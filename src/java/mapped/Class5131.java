package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class5131 implements Class5119 {
   private static String[] field23322;
   private final Map<BlockPos, BlockPos> field23323 = Maps.newHashMap();
   private final Map<BlockPos, Float> field23324 = Maps.newHashMap();
   private final List<BlockPos> field23325 = Lists.newArrayList();

   public void method15868(BlockPos var1, List<BlockPos> var2, List<Float> var3) {
      for (int var6 = 0; var6 < var2.size(); var6++) {
         this.field23323.put((BlockPos)var2.get(var6), var1);
         this.field23324.put((BlockPos)var2.get(var6), (Float)var3.get(var6));
      }

      this.field23325.add(var1);
   }

   @Override
   public void method15813(Class9332 var1, Class7733 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      RenderSystem.method27862();
      BlockPos var11 = new BlockPos(var3, 0.0, var7);
      Class9352 var12 = Class9352.method35409();
      Class5425 var13 = var12.method35411();
      var13.method17063(5, Class9337.field43342);

      for (Entry var15 : this.field23323.entrySet()) {
         BlockPos var16 = (BlockPos)var15.getKey();
         BlockPos var17 = (BlockPos)var15.getValue();
         float var18 = (float)(var17.method8304() * 128 % 256) / 256.0F;
         float var19 = (float)(var17.getY() * 128 % 256) / 256.0F;
         float var20 = (float)(var17.method8306() * 128 % 256) / 256.0F;
         float var21 = this.field23324.get(var16);
         if (var11.method8316(var16, 160.0)) {
            Class264.method900(
               var13,
               (double)((float)var16.method8304() + 0.5F) - var3 - (double)var21,
               (double)((float)var16.getY() + 0.5F) - var5 - (double)var21,
               (double)((float)var16.method8306() + 0.5F) - var7 - (double)var21,
               (double)((float)var16.method8304() + 0.5F) - var3 + (double)var21,
               (double)((float)var16.getY() + 0.5F) - var5 + (double)var21,
               (double)((float)var16.method8306() + 0.5F) - var7 + (double)var21,
               var18,
               var19,
               var20,
               0.5F
            );
         }
      }

      for (BlockPos var23 : this.field23325) {
         if (var11.method8316(var23, 160.0)) {
            Class264.method900(
               var13,
               (double)var23.method8304() - var3,
               (double)var23.getY() - var5,
               (double)var23.method8306() - var7,
               (double)((float)var23.method8304() + 1.0F) - var3,
               (double)((float)var23.getY() + 1.0F) - var5,
               (double)((float)var23.method8306() + 1.0F) - var7,
               1.0F,
               1.0F,
               1.0F,
               1.0F
            );
         }
      }

      var12.method35410();
      RenderSystem.enableDepthTest();
      RenderSystem.method27861();
      RenderSystem.popMatrix();
   }
}
