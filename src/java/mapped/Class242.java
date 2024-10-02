package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;

public class Class242<T extends LivingEntity, M extends Class2827<T> & IHasArm> extends Class219<T, M> {
   private static String[] field897;

   public Class242(Class5714<T, M> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var13 = var4.getPrimaryHand() == HandSide.RIGHT;
      ItemStack var14 = !var13 ? var4.getHeldItemMainhand() : var4.getHeldItemOffhand();
      ItemStack var15 = !var13 ? var4.getHeldItemOffhand() : var4.getHeldItemMainhand();
      if (!var14.isEmpty() || !var15.isEmpty()) {
         var1.push();
         if (this.method825().field17602) {
            float var16 = 0.5F;
            var1.translate(0.0, 0.75, 0.0);
            var1.scale(0.5F, 0.5F, 0.5F);
         }

         this.method838(var4, var15, ItemCameraTransformsTransformType.THIRD_PERSON_RIGHT_HAND, HandSide.RIGHT, var1, var2, var3);
         this.method838(var4, var14, ItemCameraTransformsTransformType.THIRD_PERSON_LEFT_HAND, HandSide.LEFT, var1, var2, var3);
         var1.pop();
      }
   }

   private void method838(LivingEntity var1, ItemStack var2, ItemCameraTransformsTransformType var3, HandSide var4, MatrixStack var5, Class7733 var6, int var7) {
      if (!var2.isEmpty()) {
         var5.push();
         this.method825().translateHand(var4, var5);
         var5.rotate(Vector3f.XP.rotationDegrees(-90.0F));
         var5.rotate(Vector3f.YP.rotationDegrees(180.0F));
         boolean var10 = var4 == HandSide.LEFT;
         var5.translate((double)((float)(!var10 ? 1 : -1) / 16.0F), 0.125, -0.625);
         Minecraft.getInstance().getFirstPersonRenderer().renderItemSide(var1, var2, var3, var10, var5, var6, var7);
         var5.pop();
      }
   }
}
