package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Class7198 extends Class7194 {
   public Class7198(Codec<Class4728> var1) {
      super(var1, 256);
      this.field30897 = ImmutableSet.of(
         Class8487.field36388,
         Class8487.field36389,
         Class8487.field36391,
         Class8487.field36393,
         Class8487.field36396,
         Class8487.field36397,
         new Class3209[]{
            Class8487.field36398,
            Class8487.field36395,
            Class8487.field36794,
            Class8487.field36730,
            Class8487.field36731,
            Class8487.field36732,
            Class8487.field36733,
            Class8487.field36734,
            Class8487.field36735,
            Class8487.field36736,
            Class8487.field36737,
            Class8487.field36738,
            Class8487.field36739,
            Class8487.field36740,
            Class8487.field36741,
            Class8487.field36742,
            Class8487.field36743,
            Class8487.field36744,
            Class8487.field36745,
            Class8487.field36458,
            Class8487.field36835,
            Class8487.field36640,
            Class8487.field36571,
            Class8487.field36415,
            Class8487.field36417,
            Class8487.field36413,
            Class8487.field36414,
            Class8487.field36527,
            Class8487.field36387,
            Class8487.field37012,
            Class8487.field36796
         }
      );
   }

   @Override
   public boolean method22611(Class1670 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      return false;
   }

   @Override
   public boolean method22596(
      Class1670 var1,
      Function<BlockPos, Class8907> var2,
      BitSet var3,
      Random var4,
      Mutable var5,
      Mutable var6,
      Mutable var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      MutableBoolean var16
   ) {
      return method22615(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   public static boolean method22615(
      Class7195<?> var0,
      Class1670 var1,
      BitSet var2,
      Random var3,
      Mutable var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12
   ) {
      if (var11 >= var5) {
         return false;
      } else {
         int var15 = var10 | var12 << 4 | var11 << 8;
         if (var2.get(var15)) {
            return false;
         } else {
            var2.set(var15);
            var4.method8372(var8, var11, var9);
            Class7380 var16 = var1.method6738(var4);
            if (!var0.method22609(var16)) {
               return false;
            } else if (var11 == 10) {
               float var22 = var3.nextFloat();
               if (!((double)var22 < 0.25)) {
                  var1.method7061(var4, Class8487.field36527.method11579(), false);
               } else {
                  var1.method7061(var4, Class8487.field36890.method11579(), false);
                  var1.method7089().method20726(var4, Class8487.field36890, 0);
               }

               return true;
            } else if (var11 < 10) {
               var1.method7061(var4, Class8487.field36414.method11579(), false);
               return false;
            } else {
               boolean var17 = false;

               for (Direction var19 : Class76.field161) {
                  int var20 = var8 + var19.method539();
                  int var21 = var9 + var19.method541();
                  if (var20 >> 4 != var6 || var21 >> 4 != var7 || var1.method6738(var4.method8372(var20, var11, var21)).method23393()) {
                     var1.method7061(var4, field30895.method23484(), false);
                     var1.method7090().method20726(var4, field30895.method23472(), 0);
                     var17 = true;
                     break;
                  }
               }

               var4.method8372(var8, var11, var9);
               if (var17) {
                  return true;
               } else {
                  var1.method7061(var4, field30895.method23484(), false);
                  return true;
               }
            }
         }
      }
   }
}
