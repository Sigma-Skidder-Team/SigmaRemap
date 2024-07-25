package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class class_3561 extends class_2540 {
   private static String[] field_17442;
   public static final Codec<class_3561> field_17441 = RecordCodecBuilder.create(var0 -> method_11570(var0).apply(var0, class_3561::new));

   public class_3561(class_3461 var1, class_3461 var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1587;
   }

   @Override
   public void method_9627(
           class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, int var9, class_9616 var10
   ) {
      for (int var13 = var9; var13 >= var9 - var6; var13--) {
         int var14 = var7 + var5.method_36624() - 1 - var13;
         this.method_9625(var1, var2, var3, var5.method_36623(), var14, var8, var13, var5.method_36625(), var10);
      }
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var1.nextInt(2) == 0;
   }
}
