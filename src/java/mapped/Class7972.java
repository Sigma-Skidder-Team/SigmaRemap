package mapped;

import net.minecraft.entity.LivingEntity;

public class Class7972 {
   private static String[] field34265;

   public static void method27105(Class7219 var0, Class7219 var1, Class7219 var2, boolean var3) {
      Class7219 var6 = !var3 ? var1 : var0;
      Class7219 var7 = !var3 ? var0 : var1;
      var6.field31036 = (!var3 ? 0.3F : -0.3F) + var2.field31036;
      var7.field31036 = (!var3 ? -0.6F : 0.6F) + var2.field31036;
      var6.field31035 = (float) (-Math.PI / 2) + var2.field31035 + 0.1F;
      var7.field31035 = -1.5F + var2.field31035;
   }

   public static void method27106(Class7219 var0, Class7219 var1, LivingEntity var2, boolean var3) {
      Class7219 var6 = !var3 ? var1 : var0;
      Class7219 var7 = !var3 ? var0 : var1;
      var6.field31036 = !var3 ? 0.8F : -0.8F;
      var6.field31035 = -0.97079635F;
      var7.field31035 = var6.field31035;
      float var8 = (float)Class3261.method11767(var2.method3158());
      float var9 = MathHelper.clamp((float)var2.method3160(), 0.0F, var8);
      float var10 = var9 / var8;
      var7.field31036 = MathHelper.lerp(var10, 0.4F, 0.85F) * (float)(!var3 ? -1 : 1);
      var7.field31035 = MathHelper.lerp(var10, var7.field31035, (float) (-Math.PI / 2));
   }

   public static <T extends Class1006> void method27107(Class7219 var0, Class7219 var1, T var2, float var3, float var4) {
      float var7 = MathHelper.sin(var3 * (float) Math.PI);
      float var8 = MathHelper.sin((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var0.field31037 = 0.0F;
      var1.field31037 = 0.0F;
      var0.field31036 = (float) (Math.PI / 20);
      var1.field31036 = (float) (-Math.PI / 20);
      if (var2.method2967() != Class2205.field14418) {
         var0.field31035 = -0.0F + MathHelper.cos(var4 * 0.19F) * 0.5F;
         var1.field31035 = -1.8849558F + MathHelper.cos(var4 * 0.09F) * 0.15F;
         var0.field31035 += var7 * 1.2F - var8 * 0.4F;
         var1.field31035 += var7 * 2.2F - var8 * 0.4F;
      } else {
         var0.field31035 = -1.8849558F + MathHelper.cos(var4 * 0.09F) * 0.15F;
         var1.field31035 = -0.0F + MathHelper.cos(var4 * 0.19F) * 0.5F;
         var0.field31035 += var7 * 2.2F - var8 * 0.4F;
         var1.field31035 += var7 * 1.2F - var8 * 0.4F;
      }

      method27108(var0, var1, var4);
   }

   public static void method27108(Class7219 var0, Class7219 var1, float var2) {
      var0.field31037 = var0.field31037 + MathHelper.cos(var2 * 0.09F) * 0.05F + 0.05F;
      var1.field31037 = var1.field31037 - (MathHelper.cos(var2 * 0.09F) * 0.05F + 0.05F);
      var0.field31035 = var0.field31035 + MathHelper.sin(var2 * 0.067F) * 0.05F;
      var1.field31035 = var1.field31035 - MathHelper.sin(var2 * 0.067F) * 0.05F;
   }

   public static void method27109(Class7219 var0, Class7219 var1, boolean var2, float var3, float var4) {
      float var7 = MathHelper.sin(var3 * (float) Math.PI);
      float var8 = MathHelper.sin((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var1.field31037 = 0.0F;
      var0.field31037 = 0.0F;
      var1.field31036 = -(0.1F - var7 * 0.6F);
      var0.field31036 = 0.1F - var7 * 0.6F;
      float var9 = (float) -Math.PI / (!var2 ? 2.25F : 1.5F);
      var1.field31035 = var9;
      var0.field31035 = var9;
      var1.field31035 += var7 * 1.2F - var8 * 0.4F;
      var0.field31035 += var7 * 1.2F - var8 * 0.4F;
      method27108(var1, var0, var4);
   }
}
