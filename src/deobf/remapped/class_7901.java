package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class class_7901 extends class_2062 {
   private static String[] field_40397;
   public static final Codec<class_7901> field_40398 = RecordCodecBuilder.create(var0 -> method_9635(var0).apply(var0, class_7901::new));

   public class_7901(class_3461 var1, class_3461 var2) {
      super(var1, var2);
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1583;
   }

   @Override
   public void method_9627(
           class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, int var9, class_9616 var10
   ) {
      boolean var13 = var5.method_36625();
      BlockPos var14 = var5.method_36623().method_6082(var9);
      this.method_9625(var1, var2, var3, var14, var7 + var5.method_36624(), var8, -1 - var6, var13, var10);
      this.method_9625(var1, var2, var3, var14, var7 - 1, var8, -var6, var13, var10);
      this.method_9625(var1, var2, var3, var14, var7 + var5.method_36624() - 1, var8, 0, var13, var10);
   }

   @Override
   public int method_9628(Random var1, int var2, class_1297 var3) {
      return 0;
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 != 0 ? var2 == var5 && var4 == var5 && var5 > 0 : (var2 > 1 || var4 > 1) && var2 != 0 && var4 != 0;
   }
}
