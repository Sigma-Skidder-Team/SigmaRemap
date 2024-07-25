package remapped;

import javax.annotation.Nullable;

public class class_3539 extends WaterAvoidingRandomWalkingGoal {
   private static String[] field_17309;

   public class_3539(class_4612 var1, double var2) {
      super(var1, var2);
   }

   @Nullable
   @Override
   public class_1343 method_38233() {
      class_1343 var3 = null;
      if (this.field_42465.method_37285()) {
         var3 = class_3425.method_15834(this.field_42465, 15, 15);
      }

      if (this.field_42465.method_26594().nextFloat() >= this.field_14136) {
         var3 = this.method_16322();
      }

      return var3 != null ? var3 : super.method_38233();
   }

   @Nullable
   private class_1343 method_16322() {
      BlockPos var3 = this.field_42465.method_37075();
      class_2921 var4 = new class_2921();
      class_2921 var5 = new class_2921();

      for (BlockPos var7 : BlockPos.method_6075(
         class_9299.method_42847(this.field_42465.getPosX() - 3.0),
         class_9299.method_42847(this.field_42465.method_37309() - 6.0),
         class_9299.method_42847(this.field_42465.getPosZ() - 3.0),
         class_9299.method_42847(this.field_42465.getPosX() + 3.0),
         class_9299.method_42847(this.field_42465.method_37309() + 6.0),
         class_9299.method_42847(this.field_42465.getPosZ() + 3.0)
      )) {
         if (!var3.equals(var7)) {
            class_6414 var8 = this.field_42465.world.method_28262(var5.method_13371(var7, Direction.field_802)).method_8360();
            boolean var9 = var8 instanceof class_4423 || var8.method_29299(class_2351.field_11730);
            if (var9
               && this.field_42465.world.method_22548(var7)
               && this.field_42465.world.method_22548(var4.method_13371(var7, Direction.field_817))) {
               return class_1343.method_6200(var7);
            }
         }
      }

      return null;
   }
}
