package mapped;

import java.util.List;

public class Class3151 implements Class2982 {
   private static String[] field18378;
   public final Class4047 field18379;

   public Class3151(Class4047 var1) {
      this.field18379 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(Class4750.field22526, 0);
      byte var5 = 0;
      if (var4 == 37 || var4 == 38 || var4 == 46) {
         var5 = 1;
      } else if (var4 == 36) {
         var5 = 2;
      }

      Integer[] var6 = new Integer[var5];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = var1.<Integer>method30559(Class4750.field22544);
      }

      Class8600 var13 = Class6966.method21489(var4, var6);
      if (var13 != null && var13.method30771() != -1) {
         if (var13.method30771() == 11) {
            int var8 = var1.<Integer>method30555(Class4750.field22526, 1);
            float var9 = var1.<Float>method30555(Class4750.field22532, 6);
            if (var8 == 0) {
               var1.method30558(Class4750.field22526, 1, 1);
               var1.method30558(Class4750.field22532, 6, 0.0F);
               List var10 = var13.method30773();

               for (int var11 = 0; var11 < 3; var11++) {
                  float var12 = var1.<Float>method30555(Class4750.field22532, var11 + 3) * var9;
                  if (var12 == 0.0F && var11 == 0) {
                     var12 = 1.0F;
                  }

                  ((Class9231)var10.get(var11)).method34723(var12);
                  var1.method30558(Class4750.field22532, var11 + 3, 0.0F);
               }
            }
         }

         var1.method30558(Class4750.field22526, 0, var13.method30771());

         for (Class9231 var15 : var13.method30773()) {
            var1.method30560(var15.method34719(), var15.method34721());
         }
      } else {
         var1.method30578();
      }
   }
}
