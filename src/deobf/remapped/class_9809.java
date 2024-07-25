package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class class_9809 extends class_2062 {
   public static final Codec<class_9809> field_49727 = RecordCodecBuilder.create(
      var0 -> method_9635(var0)
            .and(class_3461.method_15933(0, 16, 8).fieldOf("trunk_height").forGetter(var0x -> var0x.field_49729))
            .apply(var0, class_9809::new)
   );
   private final class_3461 field_49729;

   public class_9809(class_3461 var1, class_3461 var2, class_3461 var3) {
      super(var1, var2);
      this.field_49729 = var3;
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1584;
   }

   @Override
   public void method_9627(
           class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, int var9, class_9616 var10
   ) {
      BlockPos var13 = var5.method_36623();
      int var14 = var2.nextInt(2);
      int var15 = 1;
      byte var16 = 0;

      for (int var17 = var9; var17 >= -var6; var17--) {
         this.method_9625(var1, var2, var3, var13, var14, var8, var17, var5.method_36625(), var10);
         if (var14 < var15) {
            var14++;
         } else {
            var14 = var16;
            var16 = 1;
            var15 = Math.min(var15 + 1, var7 + var5.method_36624());
         }
      }
   }

   @Override
   public int method_9628(Random var1, int var2, class_1297 var3) {
      return Math.max(4, var2 - this.field_49729.method_15936(var1));
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }
}
