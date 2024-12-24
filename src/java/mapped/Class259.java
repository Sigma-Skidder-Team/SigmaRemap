package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class Class259 extends Class219<DolphinEntity, Class2805<DolphinEntity>> {
   private static String[] field919;

   public Class259(Class5714<DolphinEntity, Class2805<DolphinEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, DolphinEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var13 = var4.getPrimaryHand() == HandSide.RIGHT;
      var1.push();
      float var14 = 1.0F;
      float var15 = -1.0F;
      float var16 = MathHelper.method37771(var4.rotationPitch) / 60.0F;
      if (!(var4.rotationPitch < 0.0F)) {
         var1.translate(0.0, (double)(1.0F + var16 * 0.8F), (double)(-1.0F + var16 * 0.2F));
      } else {
         var1.translate(0.0, (double)(1.0F - var16 * 0.5F), (double)(-1.0F + var16 * 0.5F));
      }

      ItemStack var17 = !var13 ? var4.getHeldItemOffhand() : var4.getHeldItemMainhand();
      Minecraft.getInstance().getFirstPersonRenderer().renderItemSide(var4, var17, ItemCameraTransformsTransformType.GROUND, false, var1, var2, var3);
      var1.pop();
   }
}
