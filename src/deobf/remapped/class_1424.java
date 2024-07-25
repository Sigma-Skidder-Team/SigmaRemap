package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_1424 extends class_6291 {
   public static final Codec<class_1424> field_7702 = Codec.floatRange(0.0F, 1.0F)
      .fieldOf("probability")
      .xmap(class_1424::new, var0 -> var0.field_7704)
      .codec();
   private final float field_7704;

   public class_1424(float var1) {
      this.field_7704 = var1;
   }

   @Override
   public class_8783<?> method_28707() {
      return class_8783.field_44944;
   }

   @Override
   public void method_28703(class_700 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, class_9616 var6) {
      if (!(var2.nextFloat() >= this.field_7704)) {
         int var9 = ((BlockPos)var3.get(0)).method_12165();
         var3.stream()
            .filter(var1x -> var1x.method_12165() - var9 <= 2)
            .forEach(
               var5x -> {
                  for (Direction var9x : class_9594.field_48893) {
                     if (var2.nextFloat() <= 0.25F) {
                        Direction var10 = var9x.method_1046();
                        BlockPos var11 = var5x.method_6104(var10.method_1041(), 0, var10.method_1034());
                        if (class_4285.method_19908(var1, var11)) {
                           class_2522 var12 = class_4783.field_23666
                              .method_29260()
                              .method_10308(class_2808.field_13783, Integer.valueOf(var2.nextInt(3)))
                              .method_10308(class_2808.field_1543, var9x);
                           this.method_28706(var1, var11, var12, var5, var6);
                        }
                     }
                  }
               }
            );
      }
   }
}
