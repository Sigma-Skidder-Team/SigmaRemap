package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class_1501 extends class_4107 {
   public class_1501(Codec<class_4080> var1) {
      super(var1, 128);
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
            class_4783.field_23700,
            class_4783.field_23784,
            class_4783.field_23531,
            class_4783.field_23598,
            class_4783.field_23209,
            class_4783.field_23273,
            class_4783.field_23490,
            class_4783.field_23788,
            class_4783.field_23785
         }
      );
      this.field_31010 = ImmutableSet.of(class_8532.field_43675, class_8532.field_43674);
   }

   @Override
   public int method_19029() {
      return 10;
   }

   @Override
   public float method_19032(Random var1) {
      return (var1.nextFloat() * 2.0F + var1.nextFloat()) * 2.0F;
   }

   @Override
   public double method_19030() {
      return 5.0;
   }

   @Override
   public int method_19033(Random var1) {
      return var1.nextInt(this.field_31011);
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
      int var19 = var13 | var15 << 4 | var14 << 8;
      if (!var3.get(var19)) {
         var3.set(var19);
         var5.method_13362(var11, var14, var12);
         if (!this.method_27731(var1.method_28262(var5))) {
            return false;
         } else {
            class_2522 var20;
            if (var14 > 31) {
               var20 = field_31009;
            } else {
               var20 = field_31008.method_22006();
            }

            var1.method_27348(var5, var20, false);
            return true;
         }
      } else {
         return false;
      }
   }
}
