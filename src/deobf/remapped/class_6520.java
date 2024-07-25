package remapped;

public class class_6520 extends class_5837 {
   private static String[] field_33200;
   private final class_3254 field_33201;

   private class_6520(class_7279[] var1, class_3254 var2) {
      super(var1);
      this.field_33201 = var2;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26380;
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      var1.method_28017(this.field_33201.method_14868(var2.method_12693()));
      return var1;
   }

   public static class_5363<?> method_29699(class_3254 var0) {
      return method_26628(var1 -> new class_6520(var1, var0));
   }
}
