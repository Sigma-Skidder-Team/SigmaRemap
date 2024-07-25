package remapped;

public class class_2020 implements Runnable {
   private static String[] field_10239;

   public class_2020(class_4993 var1, long var2, long var4, long var6, long var8, class_4330 var10) {
      this.field_10240 = var1;
      this.field_10241 = var2;
      this.field_10238 = var4;
      this.field_10242 = var6;
      this.field_10237 = var8;
      this.field_10243 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_10241; var3 < this.field_10238; var3++) {
         long var5 = var3 * this.field_10242;
         long var7 = (class_4993.method_22978(this.field_10240) - var3 + 1L) * this.field_10242;

         for (long var9 = this.field_10237; var9 < class_4993.method_23002(this.field_10240); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (class_4993.method_23002(this.field_10240) - var9);
            this.field_10243.method_36114(var11, (double)this.field_10243.method_36133(var13));
            this.field_10243.method_36114(var11 + 1L, (double)(-this.field_10243.method_36133(var13 + 1L)));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field_10243.method_36114(var15, (double)this.field_10243.method_36133(var17));
            this.field_10243.method_36114(var15 + 1L, (double)(-this.field_10243.method_36133(var17 + 1L)));
         }
      }
   }
}
