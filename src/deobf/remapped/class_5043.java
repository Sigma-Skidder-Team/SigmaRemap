package remapped;

public class class_5043 extends class_1856 {
   private static String[] field_26071;
   private final class_4876 field_26073;
   private final class_1735 field_26072;
   private class_4926 field_26070;

   public class_5043(class_7641 var1, class_6041 var2) {
      super(var1, var2);
      class_7641 var5 = var1.method_34607(1835297121L);
      class_7641 var6 = var5.method_34607(1835626086L);
      this.field_26073 = (class_4876)var6.method_34607(1936549988L);
      class_7641 var7 = var6.method_34607(1937007212L);
      class_8519 var8 = (class_8519)var7.method_34607(1937011556L);
      if (!(var8.method_34611().get(0) instanceof class_1735)) {
         this.field_26072 = null;
         this.field_26070 = class_3040.field_14914;
      } else {
         this.field_26072 = (class_1735)var8.method_34611().get(0);
         long var9 = this.field_26072.method_34615();
         if (!this.field_26072.method_34608(1702061171L)) {
            this.field_9412 = class_8626.method_39618((class_2159)this.field_26072.method_34611().get(0));
         } else {
            this.method_8205((class_6507)this.field_26072.method_34607(1702061171L));
         }

         if (var9 != 1701733217L && var9 != 1685220723L) {
            this.field_26070 = class_3040.method_13885(this.field_26072.method_34615());
         } else {
            this.method_8205((class_6507)this.field_26072.method_34607(1702061171L));
            this.field_9404 = class_623.method_2906(this.field_26072.method_34607(1936289382L));
            this.field_26070 = this.field_9404.method_2907();
         }
      }
   }

   @Override
   public class_4923 method_8214() {
      return class_4923.field_25480;
   }

   @Override
   public class_4926 method_8217() {
      return this.field_26070;
   }

   public double method_23219() {
      return this.field_26073.method_22389();
   }

   public int method_23218() {
      return this.field_26072.method_7743();
   }

   public int method_23221() {
      return this.field_26072.method_7744();
   }

   public int method_23222() {
      return this.field_26072.method_7742();
   }

   public double method_23220() {
      return this.field_9406.method_44092();
   }
}
