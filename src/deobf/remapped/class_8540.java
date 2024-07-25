package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class_8540 implements class_2995 {
   private static String[] field_43713;
   private final Map<BlockPos, BlockPos> field_43712 = Maps.newHashMap();
   private final Map<BlockPos, Float> field_43711 = Maps.newHashMap();
   private final List<BlockPos> field_43710 = Lists.newArrayList();

   public void method_39313(BlockPos var1, List<BlockPos> var2, List<Float> var3) {
      for (int var6 = 0; var6 < var2.size(); var6++) {
         this.field_43712.put((BlockPos)var2.get(var6), var1);
         this.field_43711.put((BlockPos)var2.get(var6), (Float)var3.get(var6));
      }

      this.field_43710.add(var1);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      RenderSystem.method_16438();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.method_16354();
      BlockPos var11 = new BlockPos(var3, 0.0, var7);
      class_8042 var12 = class_8042.method_36499();
      class_9633 var13 = var12.method_36501();
      var13.method_44471(5, class_7985.field_40903);

      for (Entry var15 : this.field_43712.entrySet()) {
         BlockPos var16 = (BlockPos)var15.getKey();
         BlockPos var17 = (BlockPos)var15.getValue();
         float var18 = (float)(var17.getX() * 128 % 256) / 256.0F;
         float var19 = (float)(var17.getY() * 128 % 256) / 256.0F;
         float var20 = (float)(var17.getZ() * 128 % 256) / 256.0F;
         float var21 = this.field_43711.get(var16);
         if (var11.method_12171(var16, 160.0)) {
            WorldRenderer.method_20064(
               var13,
               (double)((float)var16.getX() + 0.5F) - var3 - (double)var21,
               (double)((float)var16.getY() + 0.5F) - var5 - (double)var21,
               (double)((float)var16.getZ() + 0.5F) - var7 - (double)var21,
               (double)((float)var16.getX() + 0.5F) - var3 + (double)var21,
               (double)((float)var16.getY() + 0.5F) - var5 + (double)var21,
               (double)((float)var16.getZ() + 0.5F) - var7 + (double)var21,
               var18,
               var19,
               var20,
               0.5F
            );
         }
      }

      for (BlockPos var23 : this.field_43710) {
         if (var11.method_12171(var23, 160.0)) {
            WorldRenderer.method_20064(
               var13,
               (double)var23.getX() - var3,
               (double)var23.getY() - var5,
               (double)var23.getZ() - var7,
               (double)((float)var23.getX() + 1.0F) - var3,
               (double)((float)var23.getY() + 1.0F) - var5,
               (double)((float)var23.getZ() + 1.0F) - var7,
               1.0F,
               1.0F,
               1.0F,
               1.0F
            );
         }
      }

      var12.method_36500();
      RenderSystem.enableDepthTest();
      RenderSystem.method_16432();
      RenderSystem.method_16489();
   }
}
