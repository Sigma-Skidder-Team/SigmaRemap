package remapped;

public class class_8937 implements Runnable {
   private static String[] field_45791;

   public class_8937(class_9035 var1, int var2, int var3, int var4, double[] var5, int var6, int var7) {
      this.field_45788 = var1;
      this.field_45790 = var2;
      this.field_45792 = var3;
      this.field_45794 = var4;
      this.field_45793 = var5;
      this.field_45795 = var6;
      this.field_45789 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_45790; var3 < this.field_45792; var3++) {
         int var4 = var3 * this.field_45794;
         int var5 = (class_9035.method_41470(this.field_45788) - var3) * this.field_45794;
         int var6 = var4 + class_9035.method_41431(this.field_45788);
         this.field_45793[var6] = this.field_45793[var5 + 1];
         this.field_45793[var6 + 1] = -this.field_45793[var5];
      }

      for (int var9 = this.field_45790; var9 < this.field_45792; var9++) {
         int var11 = var9 * this.field_45794;
         int var15 = (class_9035.method_41470(this.field_45788) - var9 + 1) * this.field_45794;

         for (int var7 = class_9035.method_41431(this.field_45788) + 2; var7 < this.field_45794; var7 += 2) {
            int var13 = var15 - var7;
            int var8 = var11 + var7;
            this.field_45793[var8] = this.field_45793[var13];
            this.field_45793[var8 + 1] = -this.field_45793[var13 + 1];
         }
      }

      for (int var10 = this.field_45795; var10 < this.field_45789; var10++) {
         int var16 = (class_9035.method_41470(this.field_45788) - var10) % class_9035.method_41470(this.field_45788) * this.field_45794;
         int var18 = var10 * this.field_45794;

         for (byte var17 = 0; var17 < this.field_45794; var17 += 2) {
            int var12 = var16 + (this.field_45794 - var17) % this.field_45794;
            int var14 = var18 + var17;
            this.field_45793[var12] = this.field_45793[var14];
            this.field_45793[var12 + 1] = -this.field_45793[var14 + 1];
         }
      }
   }
}
