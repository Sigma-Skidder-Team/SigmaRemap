package remapped;

public class class_2861 implements class_5256<class_2427> {
   private static String[] field_14007;
   private final class_6571 field_14008;

   public class_2861(class_6571 var1) {
      this.field_14008 = var1;
   }

   public class_9733 method_13104(class_2427 var1, class_174 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      double var17 = (double)var2.field_33033.nextFloat() * -1.9 * (double)var2.field_33033.nextFloat() * 0.1;
      class_6019 var19 = new class_6019(var2, var3, var5, var7, 0.0, var17, 0.0, null);
      var19.method_40053(this.field_14008);
      var19.method_44953(0.1F, 0.1F, 0.3F);
      var19.method_44955(0.001F, 0.001F);
      return var19;
   }
}
