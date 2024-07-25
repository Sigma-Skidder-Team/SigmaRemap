package remapped;

import java.util.function.Consumer;

public class class_147 {
   private static String[] field_422;
   private final ClientPlayNetHandler field_424;
   private int field_425 = -1;
   private Consumer<CompoundNBT> field_423;

   public class_147(ClientPlayNetHandler var1) {
      this.field_424 = var1;
   }

   public boolean method_568(int var1, CompoundNBT var2) {
      if (this.field_425 == var1 && this.field_423 != null) {
         this.field_423.accept(var2);
         this.field_423 = null;
         return true;
      } else {
         return false;
      }
   }

   private int method_570(Consumer<CompoundNBT> var1) {
      this.field_423 = var1;
      return ++this.field_425;
   }

   public void method_572(int var1, Consumer<CompoundNBT> var2) {
      int var5 = this.method_570(var2);
      this.field_424.method_4813(new class_6187(var5, var1));
   }

   public void method_571(BlockPos var1, Consumer<CompoundNBT> var2) {
      int var5 = this.method_570(var2);
      this.field_424.method_4813(new class_7825(var5, var1));
   }
}
