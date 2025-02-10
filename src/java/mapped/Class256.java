package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class Class256 extends LayerRenderer<PandaEntity, Class2867<PandaEntity>> {
   private static String[] field915;

   public Class256(Class5714<PandaEntity, Class2867<PandaEntity>> var1) {
      super(var1);
   }

   public void render(MatrixStack var1, IRenderTypeBuffer var2, int var3, PandaEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
      if (var4.method5189() && !var4.method5214()) {
         float var14 = -0.6F;
         float var15 = 1.4F;
         if (var4.method5193()) {
            var14 -= 0.2F * MathHelper.sin(var8 * 0.6F) + 0.2F;
            var15 -= 0.09F * MathHelper.sin(var8 * 0.6F);
         }

         var1.push();
         var1.translate(0.1F, (double)var15, (double)var14);
         Minecraft.getInstance().getFirstPersonRenderer().renderItemSide(var4, var13, ItemCameraTransformsTransformType.GROUND, false, var1, var2, var3);
         var1.pop();
      }
   }
}
