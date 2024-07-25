package remapped;

import java.io.IOException;

public class class_3906 implements class_6310<class_1243> {
   private static String[] field_18989;
   private class_4756 field_18990;
   private Identifier field_18988;

   public class_3906() {
   }

   public class_3906(class_4756 var1, Identifier var2) {
      this.field_18990 = var1;
      this.field_18988 = var2;
   }

   public static class_3906 method_18083(class_3139 var0) {
      return new class_3906(class_4756.field_23031, var0.method_14520());
   }

   public static class_3906 method_18086() {
      return new class_3906(class_4756.field_23030, (Identifier)null);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_18990 = var1.<class_4756>method_37787(class_4756.class);
      if (this.field_18990 == class_4756.field_23031) {
         this.field_18988 = var1.method_37768();
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_18990);
      if (this.field_18990 == class_4756.field_23031) {
         var1.method_37780(this.field_18988);
      }
   }

   public void method_18088(class_1243 var1) {
      var1.method_5579(this);
   }

   public class_4756 method_18087() {
      return this.field_18990;
   }

   public Identifier method_18085() {
      return this.field_18988;
   }
}
