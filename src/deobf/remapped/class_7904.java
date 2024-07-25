package remapped;

public class class_7904 extends class_8374<class_1437> {
   private static String[] field_40419;

   public class_7904(class_3231 var1, MinecraftClient var2) {
      super(var2, var1.field_941, var1.field_940, 32, var1.field_940 - 64, 36);
      this.field_40420 = var1;

      for (class_6629 var6 : class_8669.field_44400) {
         if (class_3231.method_14804(var1).method_19276(class_6234.field_31832.method_43790(var6)) > 0
            || class_3231.method_14804(var1).method_19276(class_6234.field_31834.method_43790(var6)) > 0) {
            this.method_36202(new class_1437(this, var6));
         }
      }
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_40420.method_1183(var1);
   }
}
