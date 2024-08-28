package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2919 extends Class2898<Class4712> {
   public Class2919(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      if (var4.getY() > var1.method6776() - 1) {
         return false;
      } else if (!var1.method6738(var4).method23448(Blocks.WATER) && !var1.method6738(var4.method8313()).method23448(Blocks.WATER)) {
         return false;
      } else {
         boolean var8 = false;

         for (Direction var12 : Direction.values()) {
            if (var12 != Direction.field672 && var1.method6738(var4.method8349(var12)).method23448(Blocks.field36796)) {
               var8 = true;
               break;
            }
         }

         if (!var8) {
            return false;
         } else {
            var1.method6725(var4, Blocks.field37006.method11579(), 2);

            for (int var19 = 0; var19 < 200; var19++) {
               int var20 = var3.nextInt(5) - var3.nextInt(6);
               int var21 = 3;
               if (var20 < 2) {
                  var21 += var20 / 2;
               }

               if (var21 >= 1) {
                  BlockPos var22 = var4.method8336(var3.nextInt(var21) - var3.nextInt(var21), var20, var3.nextInt(var21) - var3.nextInt(var21));
                  Class7380 var13 = var1.method6738(var22);
                  if (var13.method23384() == Class8649.field38932
                     || var13.method23448(Blocks.WATER)
                     || var13.method23448(Blocks.field36796)
                     || var13.method23448(Blocks.ICE)) {
                     for (Direction var17 : Direction.values()) {
                        Class7380 var18 = var1.method6738(var22.method8349(var17));
                        if (var18.method23448(Blocks.field37006)) {
                           var1.method6725(var22, Blocks.field37006.method11579(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
