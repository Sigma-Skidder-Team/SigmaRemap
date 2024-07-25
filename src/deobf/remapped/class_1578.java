package remapped;

public class class_1578 extends class_3757 {
   private static String[] field_8276;
   private class_9077 field_8275;

   public class_1578() {
      super(class_133.field_374);
   }

   public class_1578(class_9077 var1) {
      this();
      this.method_7116(var1);
   }

   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 11, this.method_17414());
   }

   public class_9077 method_7117() {
      if (this.field_8275 == null) {
         this.field_8275 = ((class_3633)this.method_17403().method_8360()).method_16935();
      }

      return this.field_8275;
   }

   public void method_7116(class_9077 var1) {
      this.field_8275 = var1;
   }
}
