package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;

import java.util.*;

public class Class2903 extends Class2898<Class4733> {
   public Class2903(Codec<Class4733> var1) {
      super(var1);
   }

   public static boolean method11226(Class1680 var0, BlockPos var1) {
      return method11233(var0, var1) || var0.method6815(var1, var0x -> var0x.method23446(Class7645.field32751));
   }

   private static boolean method11227(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> var0x.method23448(Blocks.VINE));
   }

   private static boolean method11228(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> var0x.method23448(Blocks.WATER));
   }

   public static boolean method11229(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> var0x.method23393() || var0x.method23446(Class7645.field32767));
   }

   private static boolean method11230(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> {
         Block var3 = var0x.method23383();
         return method11219(var3) || var3 == Blocks.FARMLAND;
      });
   }

   private static boolean method11231(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> {
         Class8649 var3 = var0x.method23384();
         return var3 == Class8649.field38938;
      });
   }

   public static void method11232(Class1681 var0, BlockPos var1, Class7380 var2) {
      var0.method6725(var1, var2, 19);
   }

   public static boolean method11233(Class1680 var0, BlockPos var1) {
      return method11229(var0, var1) || method11231(var0, var1) || method11228(var0, var1);
   }

   private boolean method11234(Class1679 var1, Random var2, BlockPos var3, Set<BlockPos> var4, Set<BlockPos> var5, Class9764 var6, Class4733 var7) {
      int var10 = var7.field22416.method21066(var2);
      int var11 = var7.field22415.method20788(var2, var10, var7);
      int var12 = var10 - var11;
      int var13 = var7.field22415.method20787(var2, var12);
      BlockPos var14;
      if (var7.field22414) {
         var14 = var3;
      } else {
         int var15 = var1.method7006(Class101.field298, var3).getY();
         int var16 = var1.method7006(Class101.field296, var3).getY();
         if (var16 - var15 > var7.field22418) {
            return false;
         }

         int var17;
         if (var7.field22420 != Class101.field298) {
            if (var7.field22420 != Class101.field296) {
               var17 = var1.method7006(var7.field22420, var3).getY();
            } else {
               var17 = var16;
            }
         } else {
            var17 = var15;
         }

         var14 = new BlockPos(var3.method8304(), var17, var3.method8306());
      }

      if (var14.getY() < 1 || var14.getY() + var10 + 1 > 256) {
         return false;
      } else if (!method11230(var1, var14.method8313())) {
         return false;
      } else {
         OptionalInt var18 = var7.field22417.method24959();
         int var19 = this.method11235(var1, var10, var14, var7);
         if (var19 < var10 && (!var18.isPresent() || var19 < var18.getAsInt())) {
            return false;
         } else {
            List<Class9359> var20 = var7.field22416.method21065(var1, var2, var19, var14, var4, var6, var7);
            var20.forEach(var8 -> var7.field22415.method20793(var1, var2, var7, var19, var8, var11, var13, var5, var6));
            return true;
         }
      }
   }

   private int method11235(Class1680 var1, int var2, BlockPos var3, Class4733 var4) {
      Mutable var7 = new Mutable();

      for (int var8 = 0; var8 <= var2 + 1; var8++) {
         int var9 = var4.field22417.method24953(var2, var8);

         for (int var10 = -var9; var10 <= var9; var10++) {
            for (int var11 = -var9; var11 <= var9; var11++) {
               var7.method8378(var3, var10, var8, var11);
               if (!method11226(var1, var7) || !var4.field22419 && method11227(var1, var7)) {
                  return var8 - 2;
               }
            }
         }
      }

      return var2;
   }

   @Override
   public void method11217(Class1681 var1, BlockPos var2, Class7380 var3) {
      method11232(var1, var2, var3);
   }

   public final boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4733 var5) {
      HashSet var8 = Sets.newHashSet();
      HashSet var9 = Sets.newHashSet();
      HashSet var10 = Sets.newHashSet();
      Class9764 var11 = Class9764.method38386();
      boolean var12 = this.method11234(var1, var3, var4, var8, var9, var11, var5);
      if (var11.field45678 <= var11.field45681 && var12 && !var8.isEmpty()) {
         if (!var5.field22413.isEmpty()) {
            ArrayList var13 = Lists.newArrayList(var8);
            ArrayList var14 = Lists.newArrayList(var9);
            var13.sort(Comparator.comparingInt(Class1998::getY));
            var14.sort(Comparator.comparingInt(Class1998::getY));
            var5.field22413.forEach(var6 -> var6.method22269(var1, var3, var13, var14, var10, var11));
         }

         Class7938 var15 = this.method11236(var1, var11, var8, var10);
         Class8969.method32900(var1, 3, var15, var11.field45678, var11.field45679, var11.field45680);
         return true;
      } else {
         return false;
      }
   }

   private Class7938 method11236(Class1660 var1, Class9764 var2, Set<BlockPos> var3, Set<BlockPos> var4) {
      ArrayList var7 = Lists.newArrayList();
      Class7937 var8 = new Class7937(var2.method38398(), var2.method38399(), var2.method38400());
      byte var9 = 6;

      for (int var10 = 0; var10 < 6; var10++) {
         var7.add(Sets.newHashSet());
      }

      Mutable var23 = new Mutable();

      for (BlockPos var12 : Lists.newArrayList(var4)) {
         if (var2.method38396(var12)) {
            var8.method26718(var12.method8304() - var2.field45678, var12.getY() - var2.field45679, var12.method8306() - var2.field45680, true, true);
         }
      }

      for (BlockPos var26 : Lists.newArrayList(var3)) {
         if (var2.method38396(var26)) {
            var8.method26718(var26.method8304() - var2.field45678, var26.getY() - var2.field45679, var26.method8306() - var2.field45680, true, true);
         }

         for (Direction var16 : Direction.values()) {
            var23.method8377(var26, var16);
            if (!var3.contains(var23)) {
               Class7380 var17 = var1.method6738(var23);
               if (var17.method23462(Class8820.field39747)) {
                  ((Set)var7.get(0)).add(var23.method8353());
                  method11232(var1, var23, var17.method23465(Class8820.field39747, Integer.valueOf(1)));
                  if (var2.method38396(var23)) {
                     var8.method26718(
                        var23.method8304() - var2.field45678, var23.getY() - var2.field45679, var23.method8306() - var2.field45680, true, true
                     );
                  }
               }
            }
         }
      }

      for (int var25 = 1; var25 < 6; var25++) {
         Set<BlockPos> var27 = (Set<BlockPos>) var7.get(var25 - 1);
         Set var28 = (Set)var7.get(var25);

         for (BlockPos var30 : var27) {
            if (var2.method38396(var30)) {
               var8.method26718(var30.method8304() - var2.field45678, var30.getY() - var2.field45679, var30.method8306() - var2.field45680, true, true);
            }

            for (Direction var19 : Direction.values()) {
               var23.method8377(var30, var19);
               if (!var27.contains(var23) && !var28.contains(var23)) {
                  Class7380 var20 = var1.method6738(var23);
                  if (var20.method23462(Class8820.field39747)) {
                     int var21 = var20.<Integer>method23463(Class8820.field39747);
                     if (var21 > var25 + 1) {
                        Class7380 var22 = var20.method23465(Class8820.field39747, Integer.valueOf(var25 + 1));
                        method11232(var1, var23, var22);
                        if (var2.method38396(var23)) {
                           var8.method26718(
                              var23.method8304() - var2.field45678, var23.getY() - var2.field45679, var23.method8306() - var2.field45680, true, true
                           );
                        }

                        var28.add(var23.method8353());
                     }
                  }
               }
            }
         }
      }

      return var8;
   }
}