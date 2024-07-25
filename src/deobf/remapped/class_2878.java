package remapped;

public class class_2878 extends class_9446 {
   private static String[] field_14092;
   private final class_9446 field_14093 = new class_9446();
   private final class_3837 field_14094;

   public class_2878(class_3837 var1) {
      this.field_14094 = var1;
   }

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_240 var5 = var1.method_40141().<class_240>method_10313(class_6451.field_32900);
      class_6331 var6 = var1.method_40140();
      double var7 = var1.method_61() + (double)((float)var5.method_1041() * 1.125F);
      double var9 = var1.method_60() + (double)((float)var5.method_1054() * 1.125F);
      double var11 = var1.method_62() + (double)((float)var5.method_1034() * 1.125F);
      class_1331 var13 = var1.method_40142().method_6098(var5);
      double var14;
      if (!var6.method_28258(var13).method_22007(class_6503.field_33094)) {
         if (!var6.method_28262(var13).method_8345() || !var6.method_28258(var13.method_6100()).method_22007(class_6503.field_33094)) {
            return this.field_14093.method_28324(var1, var2);
         }

         var14 = 0.0;
      } else {
         var14 = 1.0;
      }

      class_9149 var16 = new class_9149(var6, var7, var9 + var14, var11);
      var16.method_42101(this.field_14094);
      var16.field_41701 = var5.method_1028();
      var6.method_7509(var16);
      var2.method_27970(1);
      return var2;
   }

   @Override
   public void method_43687(class_8743 var1) {
      var1.method_40140().method_43364(1000, var1.method_40142(), 0);
   }
}
