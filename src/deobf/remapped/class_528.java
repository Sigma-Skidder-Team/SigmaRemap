package remapped;

public class class_528 implements Runnable {
   private static String[] field_3220;

   public class_528(class_5298 var1, long var2, long var4, long var6, class_4330 var8, class_4330 var9) {
      this.field_3216 = var1;
      this.field_3218 = var2;
      this.field_3217 = var4;
      this.field_3219 = var6;
      this.field_3222 = var8;
      this.field_3221 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_3218; var3 < this.field_3217; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field_3219 + var3;
         this.field_3222.method_36123(var5, this.field_3221.method_36133(var9) * class_5298.method_24218(this.field_3216).method_36133(var5));
         this.field_3222.method_36123(var7, this.field_3221.method_36133(var9) * class_5298.method_24218(this.field_3216).method_36133(var7));
      }
   }
}
