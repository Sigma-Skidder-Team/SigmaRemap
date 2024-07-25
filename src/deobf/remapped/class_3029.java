package remapped;

public class class_3029 implements class_5704 {
   private static String[] field_14841;
   private final class_6414 field_14843;
   private class_1827 field_14842 = class_1827.field_9269;

   public class_3029(class_6414 var1) {
      this.field_14843 = var1;
   }

   public class_3029 method_13828(class_7344 var1) {
      this.field_14842 = var1.method_33476();
      return this;
   }

   @Override
   public class_7279 method_25791() {
      return new class_5805(this.field_14843, this.field_14842, null);
   }
}
