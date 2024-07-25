package remapped;

public class class_1830 extends class_2833 {
   private static String[] field_9282;
   private final class_7272 field_9283;
   private double field_9281;

   public class_1830(class_7272 var1) {
      super(var1);
      this.field_9283 = var1;
   }

   @Override
   public void method_12883() {
      if (this.field_9283.field_41726 && !this.field_9283.field_29654 && !((class_3143)class_7272.method_33230(this.field_9283)).method_14532()) {
         this.field_9283.method_33227(0.0);
      } else if (this.method_12877()) {
         this.field_9283.method_33227(this.field_9281);
      }

      super.method_12883();
   }

   @Override
   public void method_12879(double var1, double var3, double var5, double var7) {
      if (this.field_9283.method_37285()) {
         var7 = 1.5;
      }

      super.method_12879(var1, var3, var5, var7);
      if (var7 > 0.0) {
         this.field_9281 = var7;
      }
   }
}
