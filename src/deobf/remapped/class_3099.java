package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class_3099 extends class_9686 {
   public class_3099(Codec<class_4080> var1) {
      super(var1);
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
            class_4783.field_23765
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
      Function<BlockPos, class_6325> var2,
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
      return class_1943.method_8991(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }
}
