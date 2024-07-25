package remapped;

public class class_3070 {
   private static String[] field_15084;
   private final Identifier field_15086;

   public class_3070(class_8261 var1, Identifier var2, class_6414 var3) {
      this.field_15085 = var1;
      this.field_15086 = class_9590.field_48844.method_34878(var2, class_1685.method_7543(var3), class_8261.method_38027(var1));
   }

   public class_3070 method_14030(class_6414... var1) {
      for (class_6414 var7 : var1) {
         class_8261.method_37929(this.field_15085).accept(class_8261.method_38041(var7, this.field_15086));
      }

      return this;
   }

   public class_3070 method_14032(class_6414... var1) {
      for (class_6414 var7 : var1) {
         class_8261.method_38079(this.field_15085, var7);
      }

      return this.method_14030(var1);
   }

   public class_3070 method_14031(class_7701 var1, class_6414... var2) {
      for (class_6414 var8 : var2) {
         var1.method_34878(class_6856.method_31450(var8.method_10803()), class_1685.method_7543(var8), class_8261.method_38027(this.field_15085));
      }

      return this.method_14030(var2);
   }
}
