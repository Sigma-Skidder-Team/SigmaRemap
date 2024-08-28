package mapped;

import com.google.common.collect.Lists;
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
   public void method15813(Class9332 var1, Class7733 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      RenderSystem.method27862();
      Class9352 var11 = Class9352.method35409();
      Class5425 var12 = var11.method35411();
      var12.method17063(5, Class9337.field43342);

      for (int var13 = 0; var13 < this.field23335.size(); var13++) {
         BlockPos var14 = this.field23335.get(var13);
         Float var15 = this.field23336.get(var13);
         float var16 = var15 / 2.0F;
         Class264.method900(
            var12,
            (double)((float)var14.method8304() + 0.5F - var16) - var3,
            (double)((float)var14.getY() + 0.5F - var16) - var5,
            (double)((float)var14.method8306() + 0.5F - var16) - var7,
            (double)((float)var14.method8304() + 0.5F + var16) - var3,
            (double)((float)var14.getY() + 0.5F + var16) - var5,
            (double)((float)var14.method8306() + 0.5F + var16) - var7,
            this.field23338.get(var13),
            this.field23339.get(var13),
            this.field23340.get(var13),
            this.field23337.get(var13)
         );
      }

      var11.method35410();
      RenderSystem.method27861();
      RenderSystem.popMatrix();
   }
}
