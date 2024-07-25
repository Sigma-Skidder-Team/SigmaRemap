package remapped;

import java.util.Random;

public final class class_3952 extends class_9446 {
   private static String[] field_19173;

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_240 var5 = var1.method_40141().<class_240>method_10313(class_6451.field_32900);
      class_66 var6 = class_6451.method_29411(var1);
      double var7 = var6.method_61() + (double)((float)var5.method_1041() * 0.3F);
      double var9 = var6.method_60() + (double)((float)var5.method_1054() * 0.3F);
      double var11 = var6.method_62() + (double)((float)var5.method_1034() * 0.3F);
      class_6331 var13 = var1.method_40140();
      Random var14 = var13.field_33033;
      double var15 = var14.nextGaussian() * 0.05 + (double)var5.method_1041();
      double var17 = var14.nextGaussian() * 0.05 + (double)var5.method_1054();
      double var19 = var14.nextGaussian() * 0.05 + (double)var5.method_1034();
      var13.method_7509(class_9665.<class_8145>method_44659(new class_1593(var13, var7, var9, var11, var15, var17, var19), var1x -> var1x.method_11601(var2)));
      var2.method_27970(1);
      return var2;
   }

   @Override
   public void method_43687(class_8743 var1) {
      var1.method_40140().method_43364(1018, var1.method_40142(), 0);
   }
}
