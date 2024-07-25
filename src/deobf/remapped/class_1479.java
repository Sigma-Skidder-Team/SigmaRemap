package remapped;

public class class_1479 extends class_1859 {
   private static String[] field_7929;
   private float field_7926;
   private float field_7925;
   private class_2816 field_7928;
   private class_2440 field_7927;

   public static float method_6825(float var0, float var1, float var2) {
      return (var2 - var0) / (var1 - var0);
   }

   public static float method_6820(float var0, float var1, float var2, float var3, int var4) {
      float var7 = Math.abs(var2 - var1) / var3;
      float var8 = var1 + var0 * var7 * var3;
      return (float)Math.round((double)var8 * Math.pow(10.0, (double)var4)) / (float)Math.pow(10.0, (double)var4);
   }

   public class_1479(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_6821();
   }

   public class_1479(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
      this.method_6821();
   }

   public class_1479(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.method_6821();
   }

   public class_1479(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      this.method_6821();
   }

   private void method_6821() {
      this.method_32148(this.field_7928 = new class_2816(this, this.method_32137()));
      this.field_7926 = -1.0F;
      this.field_7927 = new class_2440(114, 114, class_4043.field_19618);
   }

   @Override
   public void method_32145(int var1, int var2) {
      this.field_7927
         .method_11119(
            !this.method_32183() && !this.field_7928.method_32183() && !this.method_32185() && !this.field_7928.method_1535()
               ? class_4043.field_19618
               : class_4043.field_19620
         );
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      byte var4 = 3;
      byte var5 = 6;
      int var6 = this.method_32137() / 4;
      int var7 = this.method_32109() - this.field_7928.method_32109() / 2 - 3;
      int var8 = this.method_32132() + this.field_7928.method_32109() / 4 + 3;
      int var9 = this.method_32173() + this.method_32137() / 2 - var6 / 2;
      int var10 = this.field_7928.method_32132() + this.field_7928.method_32109() / 2 - 6;
      class_73.method_108(
         (float)var8, (float)var9, (float)var10, (float)var6, (float)(var6 / 2), class_314.method_1444(this.field_36272.method_2764(), var1 * var1 * var1)
      );
      class_73.method_108(
         (float)(var8 + var10),
         (float)var9,
         (float)(var7 - var10),
         (float)var6,
         (float)(var6 / 2),
         class_314.method_1444(class_314.method_1455(this.field_36272.method_2764(), 0.8F), var1 * var1 * var1)
      );
      if (this.method_32165() != null) {
         int var11 = Math.max(0, 9 - this.field_7928.method_32132());
         class_73.method_87(
            class_5320.field_27138,
            (float)(var8 - class_5320.field_27138.method_18547(this.method_32165()) - 10 - var11),
            (float)(var9 - 5),
            this.method_32165(),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.5F * this.field_7927.method_11123() * var1)
         );
      }

      super.method_32178(var1);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (!super.method_29508(var1, var2, var3)) {
         this.field_7928.method_1536(true);
         return false;
      } else {
         return true;
      }
   }

   public class_2816 method_6824() {
      return this.field_7928;
   }

   @Override
   public void method_29510(float var1) {
      if (!this.method_32183() && !this.field_7928.method_32183()) {
      }

      super.method_29510(var1);
   }

   public float method_6822() {
      return this.field_7925;
   }

   public void method_6826(float var1) {
      this.method_6827(var1, true);
   }

   public void method_6827(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field_7925;
      this.field_7925 = var1;
      this.field_7928.method_32175((int)((float)(this.method_32109() - this.field_7928.method_32109()) * var1 + 0.5F));
      if (var2 && var5 != var1) {
         this.method_8235();
      }
   }

   public boolean method_6823() {
      return this.field_7926 >= 0.0F && this.field_7926 <= 1.0F;
   }

   public float method_6819() {
      return this.field_7926;
   }

   public void method_6818(float var1) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      this.field_7926 = var1;
   }
}
