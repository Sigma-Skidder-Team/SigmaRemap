package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class class_9892 extends class_4285<class_946> {
   private static final ImmutableList<class_6414> field_50159 = ImmutableList.of(
      class_4783.field_23433,
      class_4783.field_23484,
      class_4783.field_23587,
      class_4783.field_23204,
      class_4783.field_23522,
      class_4783.field_23471,
      class_4783.field_23617
   );
   private static final Direction[] field_50158 = Direction.values();

   public class_9892(Codec<class_946> var1) {
      super(var1);
   }

   public boolean method_45568(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_946 var5) {
      boolean var8 = false;
      boolean var9 = var3.nextDouble() < 0.9;
      int var10 = !var9 ? 0 : var5.method_4139().method_15936(var3);
      int var11 = !var9 ? 0 : var5.method_4139().method_15936(var3);
      boolean var12 = var9 && var10 != 0 && var11 != 0;
      int var13 = var5.method_4138().method_15936(var3);
      int var14 = var5.method_4138().method_15936(var3);
      int var15 = Math.max(var13, var14);

      for (BlockPos var17 : BlockPos.method_6106(var4, var13, 0, var14)) {
         if (var17.method_12176(var4) > var15) {
            break;
         }

         if (method_45569(var1, var17, var5)) {
            if (var12) {
               var8 = true;
               this.method_19906(var1, var17, var5.method_4136());
            }

            BlockPos var18 = var17.method_6104(var10, 0, var11);
            if (method_45569(var1, var18, var5)) {
               var8 = true;
               this.method_19906(var1, var18, var5.method_4135());
            }
         }
      }

      return var8;
   }

   private static boolean method_45569(class_9379 var0, BlockPos var1, class_946 var2) {
      class_2522 var5 = var0.method_28262(var1);
      if (var5.method_8350(var2.method_4135().method_8360())) {
         return false;
      } else if (field_50159.contains(var5.method_8360())) {
         return false;
      } else {
         for (Direction var9 : field_50158) {
            boolean var10 = var0.method_28262(var1.method_6098(var9)).method_8345();
            if (var10 && var9 != Direction.field_817 || !var10 && var9 == Direction.field_817) {
               return false;
            }
         }

         return true;
      }
   }
}
