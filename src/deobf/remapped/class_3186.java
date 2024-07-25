package remapped;

import javax.annotation.concurrent.Immutable;

@Immutable
public class class_3186 {
   public static final class_3186 field_15912 = new class_3186("");
   private final String field_15914;

   public class_3186(String var1) {
      this.field_15914 = var1;
   }

   public boolean method_14663(ItemStack var1) {
      return this.field_15914.isEmpty() || !var1.method_28022() && var1.method_28018() && this.field_15914.equals(var1.method_28008().getString());
   }

   public void method_14666(CompoundNBT var1) {
      if (!this.field_15914.isEmpty()) {
         var1.method_25941("Lock", this.field_15914);
      }
   }

   public static class_3186 method_14664(CompoundNBT var0) {
      return !var0.method_25939("Lock", 8) ? field_15912 : new class_3186(var0.method_25965("Lock"));
   }
}
