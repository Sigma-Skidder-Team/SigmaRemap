package remapped;

public class class_3243 implements Runnable {
   private static String[] field_16115;

   public class_3243(class_3281 var1, long var2, long var4, long var6, class_1702 var8, long var9, class_1702 var11) {
      this.field_16113 = var1;
      this.field_16117 = var2;
      this.field_16119 = var4;
      this.field_16114 = var6;
      this.field_16118 = var8;
      this.field_16120 = var9;
      this.field_16116 = var11;
   }

   @Override
   public void run() {
      if (this.field_16117 <= 0L) {
         for (long var3 = this.field_16119; var3 < this.field_16114; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            this.field_16118
               .method_36114(
                  this.field_16120 + var5,
                  class_3281.method_15000(this.field_16113).method_36107(var5) * this.field_16116.method_36107(var5)
                     + class_3281.method_15000(this.field_16113).method_36107(var7) * this.field_16116.method_36107(var7)
               );
            this.field_16118
               .method_36114(
                  this.field_16120 + var7,
                  -class_3281.method_15000(this.field_16113).method_36107(var7) * this.field_16116.method_36107(var5)
                     + class_3281.method_15000(this.field_16113).method_36107(var5) * this.field_16116.method_36107(var7)
               );
         }
      } else {
         for (long var9 = this.field_16119; var9 < this.field_16114; var9++) {
            long var10 = 2L * var9;
            long var11 = var10 + 1L;
            this.field_16118
               .method_36114(
                  this.field_16120 + var10,
                  class_3281.method_15000(this.field_16113).method_36107(var10) * this.field_16116.method_36107(var10)
                     - class_3281.method_15000(this.field_16113).method_36107(var11) * this.field_16116.method_36107(var11)
               );
            this.field_16118
               .method_36114(
                  this.field_16120 + var11,
                  class_3281.method_15000(this.field_16113).method_36107(var11) * this.field_16116.method_36107(var10)
                     + class_3281.method_15000(this.field_16113).method_36107(var10) * this.field_16116.method_36107(var11)
               );
         }
      }
   }
}
