package remapped;

public class class_5159 implements class_5256<class_2427> {
   private static String[] field_26568;
   private final class_6571 field_26569;

   public class_5159(class_6571 var1) {
      this.field_26569 = var1;
   }

   public class_9733 method_23648(class_2427 var1, ClientWorld var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      class_4176 var17 = new class_4176(var2, var3, var5, var7, var9, var11, var13, this.field_26569, null);
      float var18 = var2.field_33033.nextFloat() * 0.5F + 0.35F;
      var17.method_44953(1.0F * var18, 0.0F * var18, 1.0F * var18);
      return var17;
   }
}
