package remapped;

public class class_4602 implements Runnable {
   private static String[] field_22381;

   public class_4602(class_3281 var1, long var2, long var4, long var6, long var8, class_1702 var10) {
      this.field_22379 = var1;
      this.field_22380 = var2;
      this.field_22382 = var4;
      this.field_22378 = var6;
      this.field_22376 = var8;
      this.field_22377 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_22380; var3 < this.field_22382; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field_22378 + (this.field_22376 - var5) % this.field_22376;
         this.field_22377.method_36114(var7, this.field_22377.method_36107(this.field_22378 + var5));
         this.field_22377.method_36114(var7 + 1L, -this.field_22377.method_36107(this.field_22378 + var5 + 1L));
      }
   }
}
