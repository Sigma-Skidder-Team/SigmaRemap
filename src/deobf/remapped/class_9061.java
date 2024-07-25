package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class class_9061 extends class_6291 {
   public static final Codec<class_9061> field_46378 = Codec.floatRange(0.0F, 1.0F)
      .fieldOf("probability")
      .xmap(class_9061::new, var0 -> var0.field_46376)
      .codec();
   private final float field_46376;

   public class_9061(float var1) {
      this.field_46376 = var1;
   }

   @Override
   public class_8783<?> method_28707() {
      return class_8783.field_44949;
   }

   @Override
   public void method_28703(class_700 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, class_9616 var6) {
      if (!(var2.nextFloat() >= this.field_46376)) {
         Direction var9 = class_4745.method_21912(var2);
         int var10 = var4.isEmpty()
            ? Math.min(((BlockPos)var3.get(0)).getY() + 1 + var2.nextInt(3), ((BlockPos)var3.get(var3.size() - 1)).getY())
            : Math.max(((BlockPos)var4.get(0)).getY() - 1, ((BlockPos)var3.get(0)).getY());
         List var11 = var3.stream().filter(var1x -> var1x.getY() == var10).collect(Collectors.toList());
         if (!var11.isEmpty()) {
            BlockPos var12 = (BlockPos)var11.get(var2.nextInt(var11.size()));
            BlockPos var13 = var12.method_6098(var9);
            if (class_4285.method_19908(var1, var13) && class_4285.method_19908(var1, var13.method_6098(Direction.field_800))) {
               class_2522 var14 = class_4783.field_23611.method_29260().method_10308(class_4745.field_22991, Direction.field_800);
               this.method_28706(var1, var13, var14, var5, var6);
               class_3757 var15 = var1.method_28260(var13);
               if (var15 instanceof class_5354) {
                  class_5354 var16 = (class_5354)var15;
                  int var17 = 2 + var2.nextInt(2);

                  for (int var18 = 0; var18 < var17; var18++) {
                     class_8829 var19 = new class_8829(EntityType.field_34238, var1.method_7066());
                     var16.method_24443(var19, false, var2.nextInt(599));
                  }
               }
            }
         }
      }
   }
}
