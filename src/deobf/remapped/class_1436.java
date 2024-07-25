package remapped;

public class class_1436 implements class_1084 {
   private static String[] field_7752;
   private class_1440 field_7750;
   private float field_7751;
   private class_1993 field_7749;
   private class_3316 field_7748;

   public class_1436(class_3316 var1, class_4508 var2, class_1993 var3) {
      this.field_7749 = var3;
      this.field_7751 = var3.method_9255();
      float var6 = var3.method_9244();
      float var7 = var3.method_9243();
      float[] var8 = new float[]{var6, var7};
      var3.method_9250().method_20952(var8, 0, var8, 0, 1);
      var2.method_20952(var8, 0, var8, 0, 1);
      float[] var9 = new float[]{var6, var7 - this.field_7751};
      var3.method_9250().method_20952(var9, 0, var9, 0, 1);
      var2.method_20952(var9, 0, var9, 0, 1);
      this.field_7750 = new class_1440(var8[0], var8[1]);
      class_1440 var10 = new class_1440(var9[0], var9[1]);
      this.field_7751 = var10.method_6598(this.field_7750);
   }

   @Override
   public class_1440 method_4761(float var1, float var2) {
      float var5 = this.field_7750.method_6598(new class_1440(var1, var2));
      var5 /= this.field_7751;
      if (var5 > 0.99F) {
         var5 = 0.99F;
      }

      return new class_1440(var5, 0.0F);
   }
}
