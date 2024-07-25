package remapped;

public class class_4096 implements Runnable {
   private static String[] field_19952;

   public class_4096(class_4993 var1, int var2, int var3, int var4, float[] var5, int var6, int var7) {
      this.field_19953 = var1;
      this.field_19955 = var2;
      this.field_19954 = var3;
      this.field_19949 = var4;
      this.field_19951 = var5;
      this.field_19950 = var6;
      this.field_19956 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_19955; var3 < this.field_19954; var3++) {
         int var4 = var3 * this.field_19949;
         int var5 = (class_4993.method_22973(this.field_19953) - var3) * this.field_19949;
         int var6 = var4 + class_4993.method_22972(this.field_19953);
         this.field_19951[var6] = this.field_19951[var5 + 1];
         this.field_19951[var6 + 1] = -this.field_19951[var5];
      }

      for (int var9 = this.field_19955; var9 < this.field_19954; var9++) {
         int var11 = var9 * this.field_19949;
         int var15 = (class_4993.method_22973(this.field_19953) - var9 + 1) * this.field_19949;

         for (int var7 = class_4993.method_22972(this.field_19953) + 2; var7 < this.field_19949; var7 += 2) {
            int var13 = var15 - var7;
            int var8 = var11 + var7;
            this.field_19951[var8] = this.field_19951[var13];
            this.field_19951[var8 + 1] = -this.field_19951[var13 + 1];
         }
      }

      for (int var10 = this.field_19950; var10 < this.field_19956; var10++) {
         int var16 = (class_4993.method_22973(this.field_19953) - var10) % class_4993.method_22973(this.field_19953) * this.field_19949;
         int var18 = var10 * this.field_19949;

         for (byte var17 = 0; var17 < this.field_19949; var17 += 2) {
            int var12 = var16 + (this.field_19949 - var17) % this.field_19949;
            int var14 = var18 + var17;
            this.field_19951[var12] = this.field_19951[var14];
            this.field_19951[var12 + 1] = -this.field_19951[var14 + 1];
         }
      }
   }
}
