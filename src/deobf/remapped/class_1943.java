package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class_1943 extends class_4107 {
   public class_1943(Codec<class_4080> var1) {
      super(var1, 256);
      this.field_31004 = ImmutableSet.of(
         class_4783.field_23644,
         class_4783.field_23695,
         class_4783.field_23440,
         class_4783.field_23271,
         class_4783.field_23592,
         class_4783.field_23577,
         new class_6414[]{
            class_4783.field_23201,
            class_4783.field_23259,
            class_4783.field_23344,
            class_4783.field_23264,
            class_4783.field_23486,
            class_4783.field_23908,
            class_4783.field_23840,
            class_4783.field_23243,
            class_4783.field_23857,
            class_4783.field_23625,
            class_4783.field_23198,
            class_4783.field_23229,
            class_4783.field_23387,
            class_4783.field_23816,
            class_4783.field_23793,
            class_4783.field_23330,
            class_4783.field_23773,
            class_4783.field_23659,
            class_4783.field_23711,
            class_4783.field_23459,
            class_4783.field_23160,
            class_4783.field_23162,
            class_4783.field_23552,
            class_4783.field_23216,
            class_4783.field_23709,
            class_4783.field_23900,
            class_4783.field_23811,
            class_4783.field_23881,
            class_4783.field_23184,
            class_4783.field_23765,
            class_4783.field_23829
         }
      );
   }

   @Override
   public boolean method_27723(class_5990 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      return false;
   }

   @Override
   public boolean method_27719(
      class_5990 var1,
      Function<class_1331, class_6325> var2,
      BitSet var3,
      Random var4,
      class_2921 var5,
      class_2921 var6,
      class_2921 var7,
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
      return method_8991(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   public static boolean method_8991(
      class_6062<?> var0,
      class_5990 var1,
      BitSet var2,
      Random var3,
      class_2921 var4,
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
            var4.method_13362(var8, var11, var9);
            class_2522 var16 = var1.method_28262(var4);
            if (!var0.method_27731(var16)) {
               return false;
            } else if (var11 == 10) {
               float var22 = var3.nextFloat();
               if (!((double)var22 < 0.25)) {
                  var1.method_27348(var4, class_4783.field_23881.method_29260(), false);
               } else {
                  var1.method_27348(var4, class_4783.field_23215.method_29260(), false);
                  var1.method_27335().method_14011(var4, class_4783.field_23215, 0);
               }

               return true;
            } else if (var11 < 10) {
               var1.method_27348(var4, class_4783.field_23811.method_29260(), false);
               return false;
            } else {
               boolean var17 = false;

               for (Direction var19 : class_9594.field_48893) {
                  int var20 = var8 + var19.method_1041();
                  int var21 = var9 + var19.method_1034();
                  if (var20 >> 4 != var6 || var21 >> 4 != var7 || var1.method_28262(var4.method_13362(var20, var11, var21)).method_8345()) {
                     var1.method_27348(var4, field_31006.method_22006(), false);
                     var1.method_27336().method_14011(var4, field_31006.method_22005(), 0);
                     var17 = true;
                     break;
                  }
               }

               var4.method_13362(var8, var11, var9);
               if (var17) {
                  return true;
               } else {
                  var1.method_27348(var4, field_31006.method_22006(), false);
                  return true;
               }
            }
         }
      }
   }
}
