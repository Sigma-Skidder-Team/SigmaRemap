package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6770 extends Class6768<Class8278> {
   public Class6770(Codec<Class8278> var1) {
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
      double var17 = Class8907.field40314.method25315((double)var4 * 0.25, (double)var5 * 0.25, false);
      if (var17 > 0.0) {
         int var19 = var4 & 15;
         int var20 = var5 & 15;
         Mutable var21 = new Mutable();

         for (int var22 = var6; var22 >= 0; var22--) {
            var21.method8372(var19, var22, var20);
            if (!var2.method6738(var21).method23393()) {
               if (var22 == 62 && !var2.method6738(var21).method23448(var10.method23383())) {
                  var2.method7061(var21, var10, false);
               }
               break;
            }
         }
      }

      Class6768.field29523.method20654(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, var14);
   }
}
