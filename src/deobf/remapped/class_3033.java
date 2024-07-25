package remapped;

public class class_3033 implements Runnable {
   private static String[] field_14858;

   public class_3033(class_1637 var1, long var2, long var4, long var6, long var8, long var10, long var12, class_1702 var14) {
      this.field_14857 = var1;
      this.field_14864 = var2;
      this.field_14861 = var4;
      this.field_14862 = var6;
      this.field_14863 = var8;
      this.field_14856 = var10;
      this.field_14859 = var12;
      this.field_14860 = var14;
   }

   @Override
   public void run() {
      for (long var3 = this.field_14864; var3 < this.field_14861; var3++) {
         long var5 = (class_1637.method_7293(this.field_14857) - var3) % class_1637.method_7293(this.field_14857);
         long var7 = var5 * this.field_14862;
         long var9 = var3 * this.field_14862;

         for (long var11 = 1L; var11 < this.field_14863; var11++) {
            long var13 = class_1637.method_7327(this.field_14857) - var11;
            long var15 = var13 * this.field_14856;
            long var17 = var11 * this.field_14856;
            long var19 = var7 + var15;

            for (long var21 = 0L; var21 < class_1637.method_7343(this.field_14857); var21++) {
               long var23 = 2L * var21;
               long var25 = this.field_14859 - var23;
               long var27 = var9 + var17 + var23;
               this.field_14860.method_36114(var19 + var25 % this.field_14859, this.field_14860.method_36107(var27));
               this.field_14860.method_36114(var19 + (var25 + 1L) % this.field_14859, -this.field_14860.method_36107(var27 + 1L));
            }
         }
      }
   }
}
