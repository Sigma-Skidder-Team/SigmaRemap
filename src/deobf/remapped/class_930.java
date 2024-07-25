package remapped;

public class class_930 extends class_3316 {
   private static String[] field_4764;
   private class_1440 field_4767;
   private class_1440 field_4765;
   private class_1440 field_4766;
   private class_1440 field_4768;
   private int field_4769;

   public class_930(class_1440 var1, class_1440 var2, class_1440 var3, class_1440 var4) {
      this(var1, var2, var3, var4, 20);
   }

   public class_930(class_1440 var1, class_1440 var2, class_1440 var3, class_1440 var4, int var5) {
      this.field_4767 = new class_1440(var1);
      this.field_4765 = new class_1440(var2);
      this.field_4766 = new class_1440(var3);
      this.field_4768 = new class_1440(var4);
      this.field_4769 = var5;
      this.field_16377 = true;
   }

   public class_1440 method_4051(float var1) {
      float var4 = 1.0F - var1;
      float var6 = var4 * var4 * var4;
      float var7 = 3.0F * var4 * var4 * var1;
      float var8 = 3.0F * var4 * var1 * var1;
      float var9 = var1 * var1 * var1;
      float var10 = this.field_4767.field_7766 * var6
         + this.field_4765.field_7766 * var7
         + this.field_4766.field_7766 * var8
         + this.field_4768.field_7766 * var9;
      float var11 = this.field_4767.field_7765 * var6
         + this.field_4765.field_7765 * var7
         + this.field_4766.field_7765 * var8
         + this.field_4768.field_7765 * var9;
      return new class_1440(var10, var11);
   }

   @Override
   public void method_15217() {
      float var3 = 1.0F / (float)this.field_4769;
      this.field_16385 = new float[(this.field_4769 + 1) * 2];

      for (int var4 = 0; var4 < this.field_4769 + 1; var4++) {
         float var5 = (float)var4 * var3;
         class_1440 var6 = this.method_4051(var5);
         this.field_16385[var4 * 2] = var6.field_7766;
         this.field_16385[var4 * 2 + 1] = var6.field_7765;
      }
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      float[] var4 = new float[8];
      float[] var5 = new float[8];
      var4[0] = this.field_4767.field_7766;
      var4[1] = this.field_4767.field_7765;
      var4[2] = this.field_4765.field_7766;
      var4[3] = this.field_4765.field_7765;
      var4[4] = this.field_4766.field_7766;
      var4[5] = this.field_4766.field_7765;
      var4[6] = this.field_4768.field_7766;
      var4[7] = this.field_4768.field_7765;
      var1.method_20952(var4, 0, var5, 0, 4);
      return new class_930(
         new class_1440(var5[0], var5[1]), new class_1440(var5[2], var5[3]), new class_1440(var5[4], var5[5]), new class_1440(var5[6], var5[7])
      );
   }

   @Override
   public boolean method_15232() {
      return false;
   }
}
