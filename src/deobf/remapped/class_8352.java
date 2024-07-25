package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class class_8352 extends class_2062 {
   private static String[] field_42768;
   public static final Codec<class_8352> field_42767 = RecordCodecBuilder.create(var0 -> method_9635(var0).apply(var0, class_8352::new));

   public class_8352(class_3461 var1, class_3461 var2) {
      super(var1, var2);
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1582;
   }

   @Override
   public void method_9627(
           class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, int var9, class_9616 var10
   ) {
      BlockPos var13 = var5.method_36623().method_6082(var9);
      boolean var14 = var5.method_36625();
      if (!var14) {
         this.method_9625(var1, var2, var3, var13, var7 + 2, var8, -1, var14, var10);
         this.method_9625(var1, var2, var3, var13, var7 + 1, var8, 0, var14, var10);
      } else {
         this.method_9625(var1, var2, var3, var13, var7 + 2, var8, -1, var14, var10);
         this.method_9625(var1, var2, var3, var13, var7 + 3, var8, 0, var14, var10);
         this.method_9625(var1, var2, var3, var13, var7 + 2, var8, 1, var14, var10);
         if (var2.nextBoolean()) {
            this.method_9625(var1, var2, var3, var13, var7, var8, 2, var14, var10);
         }
      }
   }

   @Override
   public int method_9628(Random var1, int var2, class_1297 var3) {
      return 4;
   }

   @Override
   public boolean method_9626(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 == 0 && var6 && (var2 == -var5 || var2 >= var5) && (var4 == -var5 || var4 >= var5)
         ? true
         : super.method_9626(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var3 == -1 && !var6) {
         return var2 == var5 && var4 == var5;
      } else {
         return var3 != 1 ? false : var2 + var4 > var5 * 2 - 2;
      }
   }
}
