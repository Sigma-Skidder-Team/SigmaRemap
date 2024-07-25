package remapped;

public class class_4894 implements Runnable {
   private static String[] field_24319;

   public class_4894(class_5298 var1, long var2, long var4, class_4330 var6, long var7, class_4330 var9) {
      this.field_24318 = var1;
      this.field_24315 = var2;
      this.field_24313 = var4;
      this.field_24317 = var6;
      this.field_24314 = var7;
      this.field_24316 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_24315; var3 < this.field_24313; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field_24317
            .method_36123(
               this.field_24314 + var3,
               class_5298.method_24218(this.field_24318).method_36133(var5) * this.field_24316.method_36133(var5)
                  - class_5298.method_24218(this.field_24318).method_36133(var7) * this.field_24316.method_36133(var7)
            );
      }
   }
}
