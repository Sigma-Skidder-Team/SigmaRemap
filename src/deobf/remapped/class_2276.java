package remapped;

public class class_2276 implements Runnable {
   private static String[] field_11302;

   public class_2276(class_4560 var1, long var2, long var4, long var6, class_4330 var8, class_4330 var9) {
      this.field_11301 = var1;
      this.field_11298 = var2;
      this.field_11303 = var4;
      this.field_11304 = var6;
      this.field_11299 = var8;
      this.field_11300 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_11298; var3 < this.field_11303; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field_11304 + var3;
         this.field_11299
            .method_36123(
               var7,
               class_4560.method_21128(this.field_11301).method_36133(var5) * this.field_11300.method_36133(var5)
                  - class_4560.method_21128(this.field_11301).method_36133(var5 + 1L) * this.field_11300.method_36133(var5 + 1L)
            );
      }
   }
}
