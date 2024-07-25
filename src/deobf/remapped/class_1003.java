package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class class_1003 extends class_2062 {
   public static final Codec<class_1003> field_5169 = RecordCodecBuilder.create(
      var0 -> method_9635(var0).and(class_3461.method_15933(0, 16, 8).fieldOf("height").forGetter(var0x -> var0x.field_5168)).apply(var0, class_1003::new)
   );
   private final class_3461 field_5168;

   public class_1003(class_3461 var1, class_3461 var2, class_3461 var3) {
      super(var1, var2);
      this.field_5168 = var3;
   }

   @Override
   public class_389<?> method_9633() {
      return class_389.field_1580;
   }

   @Override
   public void method_9627(
      class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<class_1331> var8, int var9, class_9616 var10
   ) {
      int var13 = 0;

      for (int var14 = var9; var14 >= var9 - var6; var14--) {
         this.method_9625(var1, var2, var3, var5.method_36623(), var13, var8, var14, var5.method_36625(), var10);
         if (var13 >= 1 && var14 == var9 - var6 + 1) {
            var13--;
         } else if (var13 < var7 + var5.method_36624()) {
            var13++;
         }
      }
   }

   @Override
   public int method_9632(Random var1, int var2) {
      return super.method_9632(var1, var2) + var1.nextInt(var2 + 1);
   }

   @Override
   public int method_9628(Random var1, int var2, class_1297 var3) {
      return this.field_5168.method_15936(var1);
   }

   @Override
   public boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }
}
