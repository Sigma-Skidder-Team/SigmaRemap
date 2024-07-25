package remapped;

public class class_470 implements Runnable {
   private static String[] field_2941;

   public class_470(class_3381 var1, long var2, long var4, long var6, long var8, long var10, class_4330 var12) {
      this.field_2936 = var1;
      this.field_2938 = var2;
      this.field_2939 = var4;
      this.field_2940 = var6;
      this.field_2943 = var8;
      this.field_2937 = var10;
      this.field_2942 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_2938; var3 < this.field_2939; var3++) {
         long var5 = (class_3381.method_15636(this.field_2936) - var3) % class_3381.method_15636(this.field_2936) * this.field_2940;
         long var7 = var3 * this.field_2940;

         for (long var9 = 0L; var9 < class_3381.method_15624(this.field_2936); var9++) {
            long var11 = (class_3381.method_15624(this.field_2936) - var9) % class_3381.method_15624(this.field_2936) * this.field_2943;
            long var13 = var9 * this.field_2943;

            for (long var15 = 1L; var15 < class_3381.method_15582(this.field_2936); var15 += 2L) {
               long var17 = var5 + var11 + this.field_2937 - var15;
               long var19 = var7 + var13 + var15;
               this.field_2942.method_36123(var17, -this.field_2942.method_36133(var19 + 2L));
               this.field_2942.method_36123(var17 - 1L, this.field_2942.method_36133(var19 + 1L));
            }
         }
      }
   }
}
