package remapped;

import java.util.List;

public class class_2953 {
   private static String[] field_14427;
   public int field_14430;
   public int field_14429;
   public List<BlockPos> field_14428;

   public class_2953(int var1, int var2, List<BlockPos> var3) {
      this.field_14430 = var1;
      this.field_14429 = var2;
      this.field_14428 = var3;
   }

   public boolean method_13515(class_2034 var1) {
      return var1.field_10328 == this.field_14430 && var1.field_10327 == this.field_14429;
   }

   public int method_13514(class_2034 var1) {
      return (int)Math.sqrt(
         (double)(
            (var1.field_10328 - this.field_14430) * (var1.field_10328 - this.field_14430)
               + (var1.field_10327 - this.field_14429) * (var1.field_10327 - this.field_14429)
         )
      );
   }

   public class_2034 method_13513() {
      return new class_2034(this.field_14430, this.field_14429);
   }
}
