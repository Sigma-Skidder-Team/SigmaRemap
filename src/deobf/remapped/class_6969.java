package remapped;

public class class_6969 implements class_1084 {
   private static String[] field_35815;
   private class_1440 field_35813;
   private class_1440 field_35814;
   private class_1993 field_35812;
   private class_7133 field_35816;
   private class_3316 field_35811;

   public class_6969(class_3316 var1, class_4508 var2, class_1993 var3) {
      this.field_35812 = var3;
      float var6 = var3.method_9244();
      float var7 = var3.method_9243();
      float var8 = var3.method_9246();
      float var9 = var3.method_9258();
      float var10 = var9 - var7;
      float var11 = var8 - var6;
      float[] var12 = new float[]{var6, var7 + var10 / 2.0F};
      var3.method_9250().method_20952(var12, 0, var12, 0, 1);
      var2.method_20952(var12, 0, var12, 0, 1);
      float[] var13 = new float[]{var6 + var11, var7 + var10 / 2.0F};
      var3.method_9250().method_20952(var13, 0, var13, 0, 1);
      var2.method_20952(var13, 0, var13, 0, 1);
      this.field_35813 = new class_1440(var12[0], var12[1]);
      this.field_35814 = new class_1440(var13[0], var13[1]);
      this.field_35816 = new class_7133(this.field_35813, this.field_35814);
   }

   @Override
   public class_1440 method_4761(float var1, float var2) {
      class_1440 var5 = new class_1440();
      this.field_35816.method_32772(new class_1440(var1, var2), var5);
      float var6 = var5.method_6598(this.field_35813);
      var6 /= this.field_35816.method_32768();
      return new class_1440(var6, 0.0F);
   }
}
