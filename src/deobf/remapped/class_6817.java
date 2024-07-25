package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_6817 extends class_3239 {
   private static String[] field_35159;
   public static final Codec<class_6817> field_35158 = RecordCodecBuilder.create(var0 -> method_4972(var0).apply(var0, class_6817::new));

   public class_6817(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_7027<?> method_4970() {
      return class_7027.field_36196;
   }

   @Override
   public List<class_8070> method_4966(class_6755 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, class_9616 var6, class_1297 var7) {
      ArrayList var10 = Lists.newArrayList();
      var10.addAll(super.method_4966(var1, var2, var3, var4, var5, var6, var7));

      for (int var11 = var3 - 2 - var2.nextInt(4); var11 > var3 / 2; var11 -= 2 + var2.nextInt(4)) {
         float var12 = var2.nextFloat() * (float) (Math.PI * 2);
         int var13 = 0;
         int var14 = 0;

         for (int var15 = 0; var15 < 5; var15++) {
            var13 = (int)(1.5F + class_9299.method_42840(var12) * (float)var15);
            var14 = (int)(1.5F + class_9299.method_42818(var12) * (float)var15);
            BlockPos var16 = var4.method_6104(var13, var11 - 3 + var15 / 2, var14);
            method_4974(var1, var2, var16, var5, var6, var7);
         }

         var10.add(new class_8070(var4.method_6104(var13, var11, var14), -2, false));
      }

      return var10;
   }
}
