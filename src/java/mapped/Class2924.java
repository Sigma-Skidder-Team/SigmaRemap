package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2924 extends Class2898<Class4712> {
   private static final Class166 field17998 = Class166.method497(Blocks.SAND);
   private final Class7380 field17999 = Blocks.field36847.method11579();
   private final Class7380 field18000 = Blocks.SANDSTONE.method11579();
   private final Class7380 field18001 = Blocks.WATER.method11579();

   public Class2924(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      var4 = var4.method8311();

      while (var1.method7007(var4) && var4.getY() > 2) {
         var4 = var4.method8313();
      }

      if (!field17998.test(var1.method6738(var4))) {
         return false;
      } else {
         for (int var8 = -2; var8 <= 2; var8++) {
            for (int var9 = -2; var9 <= 2; var9++) {
               if (var1.method7007(var4.method8336(var8, -1, var9)) && var1.method7007(var4.method8336(var8, -2, var9))) {
                  return false;
               }
            }
         }

         for (int var12 = -1; var12 <= 0; var12++) {
            for (int var17 = -2; var17 <= 2; var17++) {
               for (int var10 = -2; var10 <= 2; var10++) {
                  var1.method6725(var4.method8336(var17, var12, var10), this.field18000, 2);
               }
            }
         }

         var1.method6725(var4, this.field18001, 2);

         for (Direction var18 : Class76.field161) {
            var1.method6725(var4.method8349(var18), this.field18001, 2);
         }

         for (int var14 = -2; var14 <= 2; var14++) {
            for (int var19 = -2; var19 <= 2; var19++) {
               if (var14 == -2 || var14 == 2 || var19 == -2 || var19 == 2) {
                  var1.method6725(var4.method8336(var14, 1, var19), this.field18000, 2);
               }
            }
         }

         var1.method6725(var4.method8336(2, 1, 0), this.field17999, 2);
         var1.method6725(var4.method8336(-2, 1, 0), this.field17999, 2);
         var1.method6725(var4.method8336(0, 1, 2), this.field17999, 2);
         var1.method6725(var4.method8336(0, 1, -2), this.field17999, 2);

         for (int var15 = -1; var15 <= 1; var15++) {
            for (int var20 = -1; var20 <= 1; var20++) {
               if (var15 == 0 && var20 == 0) {
                  var1.method6725(var4.method8336(var15, 4, var20), this.field18000, 2);
               } else {
                  var1.method6725(var4.method8336(var15, 4, var20), this.field17999, 2);
               }
            }
         }

         for (int var16 = 1; var16 <= 3; var16++) {
            var1.method6725(var4.method8336(-1, var16, -1), this.field18000, 2);
            var1.method6725(var4.method8336(-1, var16, 1), this.field18000, 2);
            var1.method6725(var4.method8336(1, var16, -1), this.field18000, 2);
            var1.method6725(var4.method8336(1, var16, 1), this.field18000, 2);
         }

         return true;
      }
   }
}
