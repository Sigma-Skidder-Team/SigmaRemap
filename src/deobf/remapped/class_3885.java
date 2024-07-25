package remapped;

public class class_3885 {
   private static String[] field_18912;
   private int field_18906;
   private int field_18914;
   private int field_18913;
   private double field_18908;
   private double field_18907;
   private double field_18911;
   private byte[] field_18910 = new byte[0];
   private boolean field_18909;

   public class_3885() {
      this.field_18906 = 0;
      this.field_18914 = 0;
      this.field_18913 = 0;
      this.field_18909 = true;
   }

   public byte[] method_17971() {
      return this.field_18910;
   }

   public int method_17970() {
      return this.field_18906;
   }

   public int method_17962() {
      return this.field_18914;
   }

   public int method_17969() {
      return this.field_18913;
   }

   public double method_17964() {
      return this.field_18908;
   }

   public double method_17963() {
      return this.field_18907;
   }

   public double method_17972() {
      return this.field_18911;
   }

   public boolean method_17967() {
      return this.field_18909;
   }

   public void method_17968(boolean var1) {
      if (var1 != this.field_18909) {
         for (byte var4 = 0; var4 < this.field_18910.length; var4 += 2) {
            byte var5 = this.field_18910[var4];
            this.field_18910[var4] = this.field_18910[var4 + 1];
            this.field_18910[var4 + 1] = var5;
         }

         this.field_18909 = var1;
      }
   }

   public void method_17965(byte[] var1, int var2, int var3, int var4, int var5) {
      this.field_18910 = var1;
      this.field_18906 = var2;
      this.field_18914 = var3;
      this.field_18913 = var4;
      if (var2 != 0) {
         int var8 = var4 / 8;
         int var9 = var1.length / (var8 * var3);
         this.field_18908 = (double)var9 / (double)var2;
         this.field_18907 = (double)(var9 * var4 * var3) / this.field_18908;
         this.field_18911 = (double)var5 / this.field_18908;
      } else {
         this.field_18908 = 0.0;
         this.field_18907 = 0.0;
         this.field_18911 = 0.0;
      }
   }
}
