package remapped;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Random;
import java.util.Set;

public class class_2540 extends class_2062 {
   public static final Codec<class_2540> field_12592 = RecordCodecBuilder.create(var0 -> method_11570(var0).apply(var0, class_2540::new));
   public final int field_12591;

   public static <P extends class_2540> P3<Mu<P>, class_3461, class_3461, Integer> method_11570(Instance<P> var0) {
      return method_9635(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.field_12591));
   }

   public class_2540(class_3461 var1, class_3461 var2, int var3) {
      super(var1, var2);
      this.field_12591 = var3;
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1581;
   }

   @Override
   public void method_9627(
      class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<class_1331> var8, int var9, class_9616 var10
   ) {
      for (int var13 = var9; var13 >= var9 - var6; var13--) {
         int var14 = Math.max(var7 + var5.method_36624() - 1 - var13 / 2, 0);
         this.method_9625(var1, var2, var3, var5.method_36623(), var14, var8, var13, var5.method_36625(), var10);
      }
   }

   @Override
   public int method_9628(Random var1, int var2, class_1297 var3) {
      return this.field_12591;
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && (var1.nextInt(2) == 0 || var3 == 0);
   }
}
