package mapped;

import java.util.Objects;
import java.util.Optional;

public class Class3336 extends Class3257 {
   private static String[] field18843;

   public Class3336(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockPos var6 = var5.method8349(var1.method18354());
      if (!method11883(var1.method18357(), var4, var5)) {
         Class7380 var7 = var4.method6738(var5);
         boolean var8 = var7.method23454(var4, var5, var1.method18354());
         if (var8 && method11884(var1.method18357(), var4, var6, var1.method18354())) {
            if (!var4.field9020) {
               var4.method6999(2005, var6, 0);
            }

            return Class2274.method9002(var4.field9020);
         } else {
            return Class2274.field14820;
         }
      } else {
         if (!var4.field9020) {
            var4.method6999(2005, var5, 0);
         }

         return Class2274.method9002(var4.field9020);
      }
   }

   public static boolean method11883(ItemStack var0, Class1655 var1, BlockPos var2) {
      Class7380 var5 = var1.method6738(var2);
      if (var5.method23383() instanceof Class3196) {
         Class3196 var6 = (Class3196)var5.method23383();
         if (var6.method11486(var1, var2, var5, var1.field9020)) {
            if (var1 instanceof ServerWorld) {
               if (var6.method11487(var1, var1.field9016, var2, var5)) {
                  var6.method11488((ServerWorld)var1, var1.field9016, var2, var5);
               }

               var0.method32182(1);
            }

            return true;
         }
      }

      return false;
   }

   public static boolean method11884(ItemStack var0, Class1655 var1, BlockPos var2, Direction var3) {
      if (var1.method6738(var2).method23448(Blocks.WATER) && var1.method6739(var2).method23477() == 8) {
         if (!(var1 instanceof ServerWorld)) {
            return true;
         } else {
            label110:
            for (int var6 = 0; var6 < 128; var6++) {
               BlockPos var7 = var2;
               Class7380 var8 = Blocks.SEAGRASS.method11579();

               for (int var9 = 0; var9 < var6 / 16; var9++) {
                  var7 = var7.method8336(field18735.nextInt(3) - 1, (field18735.nextInt(3) - 1) * field18735.nextInt(3) / 2, field18735.nextInt(3) - 1);
                  if (var1.method6738(var7).method23456(var1, var7)) {
                     continue label110;
                  }
               }

               Optional var11 = var1.method7178(var7);
               if (Objects.equals(var11, Optional.<Class8705<Class8907>>of(Class9495.field44165))
                  || Objects.equals(var11, Optional.<Class8705<Class8907>>of(Class9495.field44168))) {
                  if (var6 == 0 && var3 != null && var3.method544().method324()) {
                     var8 = Class7645.field32784.method24919(var1.field9016).method11579().method23465(Class3229.field18669, var3);
                  } else if (field18735.nextInt(4) == 0) {
                     var8 = Class7645.field32782.method24919(field18735).method11579();
                  }
               }

               if (var8.method23383().method11540(Class7645.field32784)) {
                  for (int var10 = 0; !var8.method23443(var1, var7) && var10 < 4; var10++) {
                     var8 = var8.method23465(Class3229.field18669, Class76.field161.method247(field18735));
                  }
               }

               if (var8.method23443(var1, var7)) {
                  Class7380 var12 = var1.method6738(var7);
                  if (var12.method23448(Blocks.WATER) && var1.method6739(var7).method23477() == 8) {
                     var1.method6725(var7, var8, 3);
                  } else if (var12.method23448(Blocks.SEAGRASS) && field18735.nextInt(10) == 0) {
                     ((Class3196) Blocks.SEAGRASS).method11488((ServerWorld)var1, field18735, var7, var12);
                  }
               }
            }

            var0.method32182(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void method11885(Class1660 var0, BlockPos var1, int var2) {
      if (var2 == 0) {
         var2 = 15;
      }

      Class7380 var5 = var0.method6738(var1);
      if (!var5.method23393()) {
         double var6 = 0.5;
         double var8;
         if (!var5.method23448(Blocks.WATER)) {
            if (!var5.method23409(var0, var1)) {
               var8 = var5.method23412(var0, var1).method19513(Class113.field414);
            } else {
               var1 = var1.method8311();
               var2 *= 3;
               var6 = 3.0;
               var8 = 1.0;
            }
         } else {
            var2 *= 3;
            var8 = 1.0;
            var6 = 3.0;
         }

         var0.method6746(Class7940.field34078, (double)var1.method8304() + 0.5, (double)var1.getY() + 0.5, (double)var1.method8306() + 0.5, 0.0, 0.0, 0.0);

         for (int var10 = 0; var10 < var2; var10++) {
            double var11 = field18735.nextGaussian() * 0.02;
            double var13 = field18735.nextGaussian() * 0.02;
            double var15 = field18735.nextGaussian() * 0.02;
            double var17 = 0.5 - var6;
            double var19 = (double)var1.method8304() + var17 + field18735.nextDouble() * var6 * 2.0;
            double var21 = (double)var1.getY() + field18735.nextDouble() * var8;
            double var23 = (double)var1.method8306() + var17 + field18735.nextDouble() * var6 * 2.0;
            if (!var0.method6738(new BlockPos(var19, var21, var23).method8313()).method23393()) {
               var0.method6746(Class7940.field34078, var19, var21, var23, var11, var13, var15);
            }
         }
      }
   }
}
