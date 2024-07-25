package remapped;

import java.util.Random;

public class class_8152 implements class_5256<class_2427> {
   private static String[] field_41793;
   private final class_6571 field_41792;

   public class_8152(class_6571 var1) {
      this.field_41792 = var1;
   }

   public class_9733 method_37415(class_2427 var1, class_174 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Random var17 = var2.field_33033;
      double var18 = (double)var17.nextFloat() * -1.9 * (double)var17.nextFloat() * 0.1;
      double var20 = (double)var17.nextFloat() * -0.5 * (double)var17.nextFloat() * 0.1 * 5.0;
      double var22 = (double)var17.nextFloat() * -1.9 * (double)var17.nextFloat() * 0.1;
      return new class_7221(var2, var3, var5, var7, var18, var20, var22, 1.0F, this.field_41792);
   }
}
