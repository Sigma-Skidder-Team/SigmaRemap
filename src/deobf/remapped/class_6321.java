package remapped;

public class class_6321 implements Runnable {
   private static String[] field_32277;

   public class_6321(class_9035 var1, long var2, long var4, long var6, long var8, class_1702 var10, class_1702 var11, long var12) {
      this.field_32275 = var1;
      this.field_32274 = var2;
      this.field_32272 = var4;
      this.field_32278 = var6;
      this.field_32273 = var8;
      this.field_32279 = var10;
      this.field_32271 = var11;
      this.field_32276 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_32274; var3 < this.field_32272; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field_32278; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field_32273 + var9;
            this.field_32279.method_36114(var11, this.field_32271.method_36107(var7 * this.field_32276 + var5));
            this.field_32279.method_36114(var11 + 1L, this.field_32271.method_36107(var7 * this.field_32276 + var5 + 1L));
         }
      }
   }
}
