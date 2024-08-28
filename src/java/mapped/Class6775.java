package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6775 extends Class6773 {
   private static final Class7380 field29495 = Class8487.field36730.method11579();
   private static final Class7380 field29549 = Class8487.field36731.method11579();
   private static final Class7380 field29550 = Class8487.field36794.method11579();

   public Class6775(Codec<Class8278> var1) {
      super(var1);
   }

   @Override
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
      int var17 = var4 & 15;
      int var18 = var5 & 15;
      Class7380 var19 = field29495;
      Class8277 var20 = var3.method32507().method24283();
      Class7380 var21 = var20.method28935();
      Class7380 var22 = var20.method28934();
      Class7380 var23 = var21;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var25 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var26 = -1;
      boolean var27 = false;
      int var28 = 0;
      Mutable var29 = new Mutable();

      for (int var30 = var6; var30 >= 0; var30--) {
         if (var28 < 15) {
            var29.method8372(var17, var30, var18);
            Class7380 var31 = var2.method6738(var29);
            if (!var31.method23393()) {
               if (var31.method23448(var9.method23383())) {
                  if (var26 != -1) {
                     if (var26 > 0) {
                        var26--;
                        if (!var27) {
                           var2.method7061(var29, this.method20660(var4, var30, var5), false);
                        } else {
                           var2.method7061(var29, field29549, false);
                        }
                     }
                  } else {
                     var27 = false;
                     if (var24 > 0) {
                        if (var30 >= var11 - 4 && var30 <= var11 + 1) {
                           var19 = field29495;
                           var23 = var21;
                        }
                     } else {
                        var19 = Class8487.field36387.method11579();
                        var23 = var9;
                     }

                     if (var30 < var11 && (var19 == null || var19.method23393())) {
                        var19 = var10;
                     }

                     var26 = var24 + Math.max(0, var30 - var11);
                     if (var30 < var11 - 1) {
                        var2.method7061(var29, var23, false);
                        if (var23 == field29495) {
                           var2.method7061(var29, field29549, false);
                        }
                     } else if (var30 <= 86 + var24 * 2) {
                        if (var30 <= var11 + 3 + var24) {
                           var2.method7061(var29, var22, false);
                           var27 = true;
                        } else {
                           Class7380 var32;
                           if (var30 < 64 || var30 > 127) {
                              var32 = field29549;
                           } else if (!var25) {
                              var32 = this.method20660(var4, var30, var5);
                           } else {
                              var32 = field29550;
                           }

                           var2.method7061(var29, var32, false);
                        }
                     } else if (!var25) {
                        var2.method7061(var29, Class8487.field36395.method11579(), false);
                     } else {
                        var2.method7061(var29, Class8487.field36397.method11579(), false);
                     }
                  }

                  var28++;
               }
            } else {
               var26 = -1;
            }
         }
      }
   }
}
