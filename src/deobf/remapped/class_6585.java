package remapped;

import javax.annotation.Nullable;

public class class_6585 extends class_8285 {
   private static String[] field_33578;

   public class_6585(class_4612 var1, double var2, int var4) {
      super(var1, var2, var4);
   }

   @Nullable
   @Override
   public Vector3d method_38233() {
      Vector3d var3 = class_3425.method_15845(this.field_42465, 10, 7);
      int var4 = 0;

      while (
         var3 != null
            && !this.field_42465
               .world
               .method_28262(new BlockPos(var3))
               .method_8319(this.field_42465.world, new BlockPos(var3), class_2929.field_14272)
            && var4++ < 10
      ) {
         var3 = class_3425.method_15845(this.field_42465, 10, 7);
      }

      return var3;
   }
}
