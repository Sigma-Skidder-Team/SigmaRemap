package remapped;

import java.util.function.IntSupplier;

public class class_3284 implements IntSupplier {
   private static String[] field_16261;
   private int field_16260;
   private int field_16259;

   public class_3284(class_4770 var1) {
      this.field_16258 = var1;
      this.field_16260 = 0;
      this.field_16259 = 1;
   }

   @Override
   public int getAsInt() {
      int var3 = this.field_16260 + this.field_16259;
      this.field_16260 = this.field_16259;
      this.field_16259 = var3;
      return this.field_16260;
   }
}
