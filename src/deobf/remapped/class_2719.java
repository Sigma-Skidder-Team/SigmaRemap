package remapped;

public class class_2719 implements Runnable {
   private static String[] field_13288;

   public class_2719(class_1637 var1, long var2, long var4, long var6, long var8, long var10, class_1702 var12) {
      this.field_13289 = var1;
      this.field_13285 = var2;
      this.field_13286 = var4;
      this.field_13291 = var6;
      this.field_13292 = var8;
      this.field_13290 = var10;
      this.field_13287 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_13285; var3 < this.field_13286; var3++) {
         long var5 = (class_1637.method_7293(this.field_13289) - var3) % class_1637.method_7293(this.field_13289) * this.field_13291;
         long var7 = var3 * this.field_13291;

         for (long var9 = 0L; var9 < class_1637.method_7327(this.field_13289); var9++) {
            long var11 = (class_1637.method_7327(this.field_13289) - var9) % class_1637.method_7327(this.field_13289) * this.field_13292;
            long var13 = var9 * this.field_13292;

            for (long var15 = 1L; var15 < class_1637.method_7343(this.field_13289); var15 += 2L) {
               long var17 = var5 + var11 + this.field_13290 - var15;
               long var19 = var7 + var13 + var15;
               this.field_13287.method_36114(var17, -this.field_13287.method_36107(var19 + 2L));
               this.field_13287.method_36114(var17 - 1L, this.field_13287.method_36107(var19 + 1L));
            }
         }
      }
   }
}
