package remapped;

import java.util.ArrayList;

public class class_453 extends class_3316 {
   private static String[] field_1880;
   private ArrayList field_1885 = new ArrayList();
   private float field_1884;
   private float field_1881;
   private boolean field_1883;
   private ArrayList field_1882 = new ArrayList();
   private ArrayList field_1886;

   public class_453(float var1, float var2) {
      this.field_1885.add(new float[]{var1, var2});
      this.field_1884 = var1;
      this.field_1881 = var2;
      this.field_16377 = true;
   }

   public void method_2182(float var1, float var2) {
      this.field_1886 = new ArrayList();
      this.field_1882.add(this.field_1886);
   }

   public void method_2181(float var1, float var2) {
      if (this.field_1886 == null) {
         this.field_1885.add(new float[]{var1, var2});
      } else {
         this.field_1886.add(new float[]{var1, var2});
      }

      this.field_1884 = var1;
      this.field_1881 = var2;
      this.field_16377 = true;
   }

   public void method_2180() {
      this.field_1883 = true;
   }

   public void method_2177(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_2178(var1, var2, var3, var4, var5, var6, 10);
   }

   public void method_2178(float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      if (this.field_1884 != var1 || this.field_1881 != var2) {
         class_930 var10 = new class_930(
            new class_1440(this.field_1884, this.field_1881), new class_1440(var3, var4), new class_1440(var5, var6), new class_1440(var1, var2)
         );
         float var11 = 1.0F / (float)var7;

         for (int var12 = 1; var12 < var7 + 1; var12++) {
            float var13 = (float)var12 * var11;
            class_1440 var14 = var10.method_4051(var13);
            if (this.field_1886 == null) {
               this.field_1885.add(new float[]{var14.field_7766, var14.field_7765});
            } else {
               this.field_1886.add(new float[]{var14.field_7766, var14.field_7765});
            }

            this.field_1884 = var14.field_7766;
            this.field_1881 = var14.field_7765;
         }

         this.field_16377 = true;
      }
   }

   @Override
   public void method_15217() {
      this.field_16385 = new float[this.field_1885.size() * 2];

      for (int var3 = 0; var3 < this.field_1885.size(); var3++) {
         float[] var4 = (float[])this.field_1885.get(var3);
         this.field_16385[var3 * 2] = var4[0];
         this.field_16385[var3 * 2 + 1] = var4[1];
      }
   }

   @Override
   public class_3316 method_15207(class_4508 var1) {
      class_453 var4 = new class_453(this.field_1884, this.field_1881);
      var4.field_1885 = this.method_2179(this.field_1885, var1);

      for (int var5 = 0; var5 < this.field_1882.size(); var5++) {
         var4.field_1882.add(this.method_2179((ArrayList)this.field_1882.get(var5), var1));
      }

      var4.field_1883 = this.field_1883;
      return var4;
   }

   private ArrayList method_2179(ArrayList var1, class_4508 var2) {
      float[] var5 = new float[var1.size() * 2];
      float[] var6 = new float[var1.size() * 2];

      for (int var7 = 0; var7 < var1.size(); var7++) {
         var5[var7 * 2] = ((float[])var1.get(var7))[0];
         var5[var7 * 2 + 1] = ((float[])var1.get(var7))[1];
      }

      var2.method_20952(var5, 0, var6, 0, var1.size());
      ArrayList var9 = new ArrayList();

      for (int var8 = 0; var8 < var1.size(); var8++) {
         var9.add(new float[]{var6[var8 * 2], var6[var8 * 2 + 1]});
      }

      return var9;
   }

   @Override
   public boolean method_15232() {
      return this.field_1883;
   }
}
