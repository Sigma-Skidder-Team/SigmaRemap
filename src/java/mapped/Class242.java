package mapped;

import net.minecraft.client.Minecraft;

public class Class242<T extends Class880, M extends Class2827<T> & Class2825> extends Class219<T, M> {
   private static String[] field897;

   public Class242(Class5714<T, M> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var13 = var4.method2967() == Class2205.field14418;
      ItemStack var14 = !var13 ? var4.method3090() : var4.method3091();
      ItemStack var15 = !var13 ? var4.method3091() : var4.method3090();
      if (!var14.isEmpty() || !var15.isEmpty()) {
         var1.push();
         if (this.method825().field17602) {
            float var16 = 0.5F;
            var1.translate(0.0, 0.75, 0.0);
            var1.method35292(0.5F, 0.5F, 0.5F);
         }

         this.method838(var4, var15, Class2327.field15926, Class2205.field14418, var1, var2, var3);
         this.method838(var4, var14, Class2327.field15925, Class2205.field14417, var1, var2, var3);
         var1.method35295();
      }
   }

   private void method838(Class880 var1, ItemStack var2, Class2327 var3, Class2205 var4, MatrixStack var5, Class7733 var6, int var7) {
      if (!var2.isEmpty()) {
         var5.push();
         this.method825().method11010(var4, var5);
         var5.method35293(Class7680.field32898.method25286(-90.0F));
         var5.method35293(Class7680.field32900.method25286(180.0F));
         boolean var10 = var4 == Class2205.field14417;
         var5.translate((double)((float)(!var10 ? 1 : -1) / 16.0F), 0.125, -0.625);
         Minecraft.getInstance().getFirstPersonRenderer().method37580(var1, var2, var3, var10, var5, var6, var7);
         var5.method35295();
      }
   }
}
