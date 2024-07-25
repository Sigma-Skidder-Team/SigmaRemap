package remapped;

public class class_6330 implements Runnable {
   private static String[] field_32317;

   public class_6330(class_1637 var1, long var2, long var4, long var6, long var8, long var10, class_1702 var12) {
      this.field_32319 = var1;
      this.field_32322 = var2;
      this.field_32323 = var4;
      this.field_32324 = var6;
      this.field_32321 = var8;
      this.field_32318 = var10;
      this.field_32320 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_32322; var3 < this.field_32323; var3++) {
         long var5 = (class_1637.method_7293(this.field_32319) - var3) % class_1637.method_7293(this.field_32319) * this.field_32324;
         long var7 = var3 * this.field_32324;

         for (long var9 = 1L; var9 < this.field_32321; var9++) {
            long var11 = var5 + (class_1637.method_7327(this.field_32319) - var9) * this.field_32318;
            long var13 = var7 + var9 * this.field_32318;
            this.field_32320.method_36114(var11, this.field_32320.method_36107(var13));
            this.field_32320.method_36114(var11 + 1L, -this.field_32320.method_36107(var13 + 1L));
         }
      }
   }
}
