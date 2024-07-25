package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class class_3953 extends class_2062 {
   public static final Codec<class_3953> field_19175 = RecordCodecBuilder.create(
      var0 -> method_9635(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.field_19176)).apply(var0, class_3953::new)
   );
   public final int field_19176;

   public class_3953(class_3461 var1, class_3461 var2, int var3) {
      super(var1, var2);
      this.field_19176 = var3;
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1588;
   }

   @Override
   public void method_9627(
           class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, int var9, class_9616 var10
   ) {
      int var13 = !var5.method_36625() ? 1 + var2.nextInt(2) : var6;

      for (int var14 = var9; var14 >= var9 - var13; var14--) {
         int var15 = var7 + var5.method_36624() + 1 - var14;
         this.method_9625(var1, var2, var3, var5.method_36623(), var15, var8, var14, var5.method_36625(), var10);
      }
   }

   @Override
   public int method_9628(Random var1, int var2, class_1297 var3) {
      return this.field_19176;
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 < 7 ? var2 * var2 + var4 * var4 > var5 * var5 : true;
   }
}
