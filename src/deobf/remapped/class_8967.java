package remapped;

import java.util.Random;

public class class_8967 implements class_5256<class_2427> {
   private static String[] field_45937;
   private final class_6571 field_45938;

   public class_8967(class_6571 var1) {
      this.field_45938 = var1;
   }

   public class_9733 method_41135(class_2427 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Random var17 = var2.field_33033;
      double var18 = var17.nextGaussian() * 1.0E-6F;
      double var20 = var17.nextGaussian() * 1.0E-4F;
      double var22 = var17.nextGaussian() * 1.0E-6F;
      class_6019 var24 = new class_6019(var2, var3, var5, var7, var18, var20, var22, null);
      var24.method_40053(this.field_45938);
      var24.method_44953(0.9F, 0.4F, 0.5F);
      return var24;
   }
}
