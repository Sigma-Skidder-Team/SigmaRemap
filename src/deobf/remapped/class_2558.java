package remapped;

public class class_2558 implements Runnable {
   private static String[] field_12656;

   public class_2558(class_1637 var1, long var2, long var4, long var6, long var8, long var10, long var12, class_1702 var14) {
      this.field_12660 = var1;
      this.field_12657 = var2;
      this.field_12655 = var4;
      this.field_12658 = var6;
      this.field_12652 = var8;
      this.field_12659 = var10;
      this.field_12653 = var12;
      this.field_12654 = var14;
   }

   @Override
   public void run() {
      for (long var3 = this.field_12657; var3 < this.field_12655; var3++) {
         long var5 = (class_1637.method_7293(this.field_12660) - var3) % class_1637.method_7293(this.field_12660);
         long var7 = var5 * this.field_12658;
         long var9 = var3 * this.field_12658;

         for (long var11 = 1L; var11 < this.field_12652; var11++) {
            long var13 = class_1637.method_7327(this.field_12660) - var11;
            long var15 = var13 * this.field_12659;
            long var17 = var11 * this.field_12659;
            long var19 = var7 + var15;

            for (long var21 = 0L; var21 < class_1637.method_7343(this.field_12660); var21++) {
               long var23 = 2L * var21;
               long var25 = this.field_12653 - var23;
               long var27 = var9 + var17 + var23;
               this.field_12654.method_36114(var19 + var25 % this.field_12653, this.field_12654.method_36107(var27));
               this.field_12654.method_36114(var19 + (var25 + 1L) % this.field_12653, -this.field_12654.method_36107(var27 + 1L));
            }
         }
      }
   }
}
