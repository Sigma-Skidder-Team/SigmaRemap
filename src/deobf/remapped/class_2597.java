package remapped;

public class class_2597 extends class_3333 {
   private static String[] field_12831;

   public class_2597(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_29263(class_6486 var1, class_1331 var2, class_8145 var3, float var4) {
      if (!var3.method_37154()) {
         var3.method_37270(var4, 0.0F);
      } else {
         super.method_29263(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_29297(class_6163 var1, class_8145 var2) {
      if (!var2.method_37154()) {
         this.method_11774(var2);
      } else {
         super.method_29297(var1, var2);
      }
   }

   private void method_11774(class_8145 var1) {
      class_1343 var4 = var1.method_37098();
      if (var4.field_7333 < 0.0) {
         double var5 = !(var1 instanceof class_5834) ? 0.8 : 1.0;
         var1.method_37214(var4.field_7336, -var4.field_7333 * var5, var4.field_7334);
      }
   }

   @Override
   public void method_29286(class_6486 var1, class_1331 var2, class_8145 var3) {
      double var6 = Math.abs(var3.method_37098().field_7333);
      if (var6 < 0.1 && !var3.method_37117()) {
         double var8 = 0.4 + var6 * 0.2;
         var3.method_37215(var3.method_37098().method_6210(var8, 1.0, var8));
      }

      super.method_29286(var1, var2, var3);
   }
}
