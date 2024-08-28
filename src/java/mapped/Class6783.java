package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6783 extends Class6768<Class8278> {
   public Class6783(Codec<Class8278> var1) {
      super(var1);
   }

   public void method20654(
      Random var1,
      Class1670 var2,
      Class8907 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      Class7380 var9,
      Class7380 var10,
      int var11,
      long var12,
      Class8278 var14
   ) {
      this.method20667(var1, var2, var3, var4, var5, var6, var7, var9, var10, var14.method28934(), var14.method28935(), var14.method28936(), var11);
   }

   public void method20667(
      Random var1,
      Class1670 var2,
      Class8907 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      Class7380 var9,
      Class7380 var10,
      Class7380 var11,
      Class7380 var12,
      Class7380 var13,
      int var14
   ) {
      Class7380 var17 = var11;
      Class7380 var18 = var12;
      Mutable var19 = new Mutable();
      int var20 = -1;
      int var21 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var22 = var4 & 15;
      int var23 = var5 & 15;

      for (int var24 = var6; var24 >= 0; var24--) {
         var19.method8372(var22, var24, var23);
         Class7380 var25 = var2.method6738(var19);
         if (!var25.method23393()) {
            if (var25.method23448(var9.method23383())) {
               if (var20 != -1) {
                  if (var20 > 0) {
                     var20--;
                     var2.method7061(var19, var18, false);
                     if (var20 == 0 && var18.method23448(Class8487.field36415) && var21 > 1) {
                        var20 = var1.nextInt(4) + Math.max(0, var24 - 63);
                        var18 = !var18.method23448(Class8487.field36416) ? Class8487.field36458.method11579() : Class8487.field36835.method11579();
                     }
                  }
               } else {
                  if (var21 > 0) {
                     if (var24 >= var14 - 4 && var24 <= var14 + 1) {
                        var17 = var11;
                        var18 = var12;
                     }
                  } else {
                     var17 = Class8487.field36387.method11579();
                     var18 = var9;
                  }

                  if (var24 < var14 && (var17 == null || var17.method23393())) {
                     if (!(var3.method32503(var19.method8372(var4, var24, var5)) < 0.15F)) {
                        var17 = var10;
                     } else {
                        var17 = Class8487.field36572.method11579();
                     }

                     var19.method8372(var22, var24, var23);
                  }

                  var20 = var21;
                  if (var24 < var14 - 1) {
                     if (var24 >= var14 - 7 - var21) {
                        var2.method7061(var19, var18, false);
                     } else {
                        var17 = Class8487.field36387.method11579();
                        var18 = var9;
                        var2.method7061(var19, var13, false);
                     }
                  } else {
                     var2.method7061(var19, var17, false);
                  }
               }
            }
         } else {
            var20 = -1;
         }
      }
   }
}
