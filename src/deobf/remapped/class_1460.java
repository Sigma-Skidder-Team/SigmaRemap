package remapped;

public class class_1460 implements class_7279 {
   private static String[] field_7865;
   private final Boolean field_7864;
   private final Boolean field_7866;

   private class_1460(Boolean var1, Boolean var2) {
      this.field_7864 = var1;
      this.field_7866 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26360;
   }

   public boolean test(class_2792 var1) {
      class_6331 var4 = var1.method_12694();
      return this.field_7864 != null && this.field_7864 != var4.method_29561() ? false : this.field_7866 == null || this.field_7866 == var4.method_29570();
   }
}
