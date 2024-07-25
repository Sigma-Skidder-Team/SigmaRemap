package remapped;

public class class_5342 implements Runnable {
   private static String[] field_27238;

   public class_5342(class_5298 var1, long var2, long var4, long var6, class_4330 var8, long var9, class_4330 var11) {
      this.field_27234 = var1;
      this.field_27231 = var2;
      this.field_27236 = var4;
      this.field_27233 = var6;
      this.field_27237 = var8;
      this.field_27232 = var9;
      this.field_27235 = var11;
   }

   @Override
   public void run() {
      if (this.field_27231 <= 0L) {
         for (long var3 = this.field_27236; var3 < this.field_27233; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            this.field_27237
               .method_36123(
                  this.field_27232 + var5,
                  class_5298.method_24218(this.field_27234).method_36133(var5) * this.field_27235.method_36133(var5)
                     + class_5298.method_24218(this.field_27234).method_36133(var7) * this.field_27235.method_36133(var7)
               );
            this.field_27237
               .method_36123(
                  this.field_27232 + var7,
                  -class_5298.method_24218(this.field_27234).method_36133(var7) * this.field_27235.method_36133(var5)
                     + class_5298.method_24218(this.field_27234).method_36133(var5) * this.field_27235.method_36133(var7)
               );
         }
      } else {
         for (long var9 = this.field_27236; var9 < this.field_27233; var9++) {
            long var10 = 2L * var9;
            long var11 = var10 + 1L;
            this.field_27237
               .method_36123(
                  this.field_27232 + var10,
                  class_5298.method_24218(this.field_27234).method_36133(var10) * this.field_27235.method_36133(var10)
                     - class_5298.method_24218(this.field_27234).method_36133(var11) * this.field_27235.method_36133(var11)
               );
            this.field_27237
               .method_36123(
                  this.field_27232 + var11,
                  class_5298.method_24218(this.field_27234).method_36133(var11) * this.field_27235.method_36133(var10)
                     + class_5298.method_24218(this.field_27234).method_36133(var10) * this.field_27235.method_36133(var11)
               );
         }
      }
   }
}
