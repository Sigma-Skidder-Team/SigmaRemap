package remapped;

public class class_8262 implements Runnable {
   private static String[] field_42382;

   public class_8262(class_4993 var1, int var2, int var3, float[][] var4, int var5, int var6, int var7) {
      this.field_42387 = var1;
      this.field_42383 = var2;
      this.field_42381 = var3;
      this.field_42388 = var4;
      this.field_42385 = var5;
      this.field_42384 = var6;
      this.field_42386 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_42383; var3 < this.field_42381; var3++) {
         int var4 = class_4993.method_22973(this.field_42387) - var3;
         this.field_42388[var3][class_4993.method_22972(this.field_42387)] = this.field_42388[var4][1];
         this.field_42388[var3][class_4993.method_22972(this.field_42387) + 1] = -this.field_42388[var4][0];
      }

      for (int var7 = this.field_42383; var7 < this.field_42381; var7++) {
         int var9 = class_4993.method_22973(this.field_42387) - var7;

         for (int var5 = class_4993.method_22972(this.field_42387) + 2; var5 < this.field_42385; var5 += 2) {
            int var6 = this.field_42385 - var5;
            this.field_42388[var7][var5] = this.field_42388[var9][var6];
            this.field_42388[var7][var5 + 1] = -this.field_42388[var9][var6 + 1];
         }
      }

      for (int var8 = this.field_42384; var8 < this.field_42386; var8++) {
         int var10 = (class_4993.method_22973(this.field_42387) - var8) % class_4993.method_22973(this.field_42387);

         for (byte var11 = 0; var11 < this.field_42385; var11 += 2) {
            int var12 = (this.field_42385 - var11) % this.field_42385;
            this.field_42388[var10][var12] = this.field_42388[var8][var11];
            this.field_42388[var10][var12 + 1] = -this.field_42388[var8][var11 + 1];
         }
      }
   }
}
