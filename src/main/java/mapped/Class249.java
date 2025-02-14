package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

public class Class249 extends LayerRenderer<SheepEntity, Class2869<SheepEntity>> {
   private static final ResourceLocation field905 = new ResourceLocation("textures/entity/sheep/sheep_fur.png");
   public Class2868<SheepEntity> field906 = new Class2868<SheepEntity>();

   public Class249(Class5714<SheepEntity, Class2869<SheepEntity>> var1) {
      super(var1);
   }

   public void render(MatrixStack var1, IRenderTypeBuffer var2, int var3, SheepEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method4519() && !var4.isInvisible()) {
         float var14;
         float var15;
         float var16;
         if (var4.method3381() && "jeb_".equals(var4.getName().getUnformattedComponentText())) {
            int var17 = var4.ticksExisted / 25 + var4.getEntityId();
            int var18 = DyeColor.values().length;
            int var19 = var17 % var18;
            int var20 = (var17 + 1) % var18;
            float var21 = ((float)(var4.ticksExisted % 25) + var7) / 25.0F;
            float[] var22 = SheepEntity.method4511(DyeColor.method315(var19));
            float[] var23 = SheepEntity.method4511(DyeColor.method315(var20));
            if (Config.method26911()) {
               var22 = Class9680.method37884(DyeColor.method315(var19), var22);
               var23 = Class9680.method37884(DyeColor.method315(var20), var23);
            }

            var14 = var22[0] * (1.0F - var21) + var23[0] * var21;
            var15 = var22[1] * (1.0F - var21) + var23[1] * var21;
            var16 = var22[2] * (1.0F - var21) + var23[2] * var21;
         } else {
            float[] var13 = SheepEntity.method4511(var4.method4517());
            if (Config.method26911()) {
               var13 = Class9680.method37884(var4.method4517(), var13);
            }

            var14 = var13[0];
            var15 = var13[1];
            var16 = var13[2];
         }

         method823(this.method825(), this.field906, field905, var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var14, var15, var16);
      }
   }
}
