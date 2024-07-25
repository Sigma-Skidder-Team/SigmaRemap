package remapped;

import java.util.Random;

public class class_6766 extends class_3599 {
   private static String[] field_34922;
   private final class_912 field_34923;

   public class_6766(class_912 var1) {
      this.field_34923 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_34923.method_3913() != null) {
         return this.field_34923.world.method_29537().method_1285(class_291.field_1047) ? this.field_34923.method_26594().nextInt(2000) == 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void method_16794() {
      Random var3 = this.field_34923.method_26594();
      World var4 = this.field_34923.world;
      int var5 = class_9299.method_42847(this.field_34923.getPosX() - 1.0 + var3.nextDouble() * 2.0);
      int var6 = class_9299.method_42847(this.field_34923.method_37309() + var3.nextDouble() * 2.0);
      int var7 = class_9299.method_42847(this.field_34923.getPosZ() - 1.0 + var3.nextDouble() * 2.0);
      BlockPos var8 = new BlockPos(var5, var6, var7);
      class_2522 var9 = var4.method_28262(var8);
      BlockPos var10 = var8.method_6100();
      class_2522 var11 = var4.method_28262(var10);
      class_2522 var12 = this.field_34923.method_3913();
      if (var12 != null) {
         var12 = class_6414.method_29274(var12, this.field_34923.world, var8);
         if (this.method_31020(var4, var8, var12, var9, var11, var10)) {
            var4.method_7513(var8, var12, 3);
            this.field_34923.method_3915((class_2522)null);
         }
      }
   }

   private boolean method_31020(World var1, BlockPos var2, class_2522 var3, class_2522 var4, class_2522 var5, BlockPos var6) {
      return var4.method_8345()
         && !var5.method_8345()
         && !var5.method_8350(class_4783.field_23433)
         && var5.method_8306(var1, var6)
         && var3.method_8309(var1, var2)
         && var1.method_25870(this.field_34923, class_4092.method_18911(class_1343.method_6205(var2))).isEmpty();
   }
}
