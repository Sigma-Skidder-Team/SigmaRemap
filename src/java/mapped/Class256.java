package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

public class Class256 extends Class219<Class1097, Class2867<Class1097>> {
   private static String[] field915;

   public Class256(Class5714<Class1097, Class2867<Class1097>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, Class1097 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.method2943(Class2106.field13731);
      if (var4.method5189() && !var4.method5214()) {
         float var14 = -0.6F;
         float var15 = 1.4F;
         if (var4.method5193()) {
            var14 -= 0.2F * MathHelper.sin(var8 * 0.6F) + 0.2F;
            var15 -= 0.09F * MathHelper.sin(var8 * 0.6F);
         }

         var1.push();
         var1.translate(0.1F, (double)var15, (double)var14);
         Minecraft.getInstance().getFirstPersonRenderer().method37580(var4, var13, Class2327.field15931, false, var1, var2, var3);
         var1.pop();
      }
   }
}
