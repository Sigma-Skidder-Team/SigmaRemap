package mapped;

import net.minecraft.entity.LivingEntity;

public final class Class7182 {
   public static String method22535(Class2023 var0, float var1) {
      if (!var0.method8642()) {
         int var4 = MathHelper.method37767((float)var0.method8628() * var1);
         return Class9001.method33254(var4);
      } else {
         return "**:**";
      }
   }

   public static boolean method22536(LivingEntity var0) {
      return var0.method3033(Effects.HASTE) || var0.method3033(Effects.CONDUIT_POWER);
   }

   public static int method22537(LivingEntity var0) {
      int var3 = 0;
      int var4 = 0;
      if (var0.method3033(Effects.HASTE)) {
         var3 = var0.method3034(Effects.HASTE).method8629();
      }

      if (var0.method3033(Effects.CONDUIT_POWER)) {
         var4 = var0.method3034(Effects.CONDUIT_POWER).method8629();
      }

      return Math.max(var3, var4);
   }

   public static boolean method22538(LivingEntity var0) {
      return var0.method3033(Effects.WATER_BREATHING) || var0.method3033(Effects.CONDUIT_POWER);
   }
}
