package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class class_4434 extends class_2062 {
   public static final Codec<class_4434> field_21643 = RecordCodecBuilder.create(
      var0 -> method_9635(var0)
            .and(class_3461.method_15933(0, 16, 8).fieldOf("crown_height").forGetter(var0x -> var0x.field_21645))
            .apply(var0, class_4434::new)
   );
   private final class_3461 field_21645;

   public class_4434(class_3461 var1, class_3461 var2, class_3461 var3) {
      super(var1, var2);
      this.field_21645 = var3;
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1586;
   }

   @Override
   public void method_9627(
           class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, int var9, class_9616 var10
   ) {
      BlockPos var13 = var5.method_36623();
      int var14 = 0;

      for (int var15 = var13.method_12165() - var6 + var9; var15 <= var13.method_12165() + var9; var15++) {
         int var16 = var13.method_12165() - var15;
         int var17 = var7 + var5.method_36624() + class_9299.method_42848((float)var16 / (float)var6 * 3.5F);
         int var18;
         if (var16 > 0 && var17 == var14 && (var15 & 1) == 0) {
            var18 = var17 + 1;
         } else {
            var18 = var17;
         }

         this.method_9625(var1, var2, var3, new BlockPos(var13.method_12173(), var15, var13.method_12185()), var18, var8, 0, var5.method_36625(), var10);
         var14 = var17;
      }
   }

   @Override
   public int method_9628(Random var1, int var2, class_1297 var3) {
      return this.field_21645.method_15936(var1);
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 < 7 ? var2 * var2 + var4 * var4 > var5 * var5 : true;
   }
}
