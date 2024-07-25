package remapped;

public class class_8832 implements Runnable {
   private static String[] field_45179;

   public class_8832(class_5298 var1, int var2, long var3, long var5, long var7, class_4330 var9, class_4330 var10) {
      this.field_45177 = var1;
      this.field_45178 = var2;
      this.field_45174 = var3;
      this.field_45173 = var5;
      this.field_45172 = var7;
      this.field_45175 = var9;
      this.field_45176 = var10;
   }

   @Override
   public void run() {
      if (this.field_45178 <= 0) {
         for (long var3 = this.field_45174; var3 < this.field_45173; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field_45172 + var5;
            long var11 = this.field_45172 + var7;
            this.field_45175
               .method_36123(
                  var9,
                  class_5298.method_24218(this.field_45177).method_36133(var5) * this.field_45176.method_36133(var5)
                     + class_5298.method_24218(this.field_45177).method_36133(var7) * this.field_45176.method_36133(var7)
               );
            this.field_45175
               .method_36123(
                  var11,
                  -class_5298.method_24218(this.field_45177).method_36133(var7) * this.field_45176.method_36133(var5)
                     + class_5298.method_24218(this.field_45177).method_36133(var5) * this.field_45176.method_36133(var7)
               );
         }
      } else {
         for (long var13 = this.field_45174; var13 < this.field_45173; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field_45172 + var14;
            long var17 = this.field_45172 + var15;
            this.field_45175
               .method_36123(
                  var16,
                  class_5298.method_24218(this.field_45177).method_36133(var14) * this.field_45176.method_36133(var14)
                     - class_5298.method_24218(this.field_45177).method_36133(var15) * this.field_45176.method_36133(var15)
               );
            this.field_45175
               .method_36123(
                  var17,
                  class_5298.method_24218(this.field_45177).method_36133(var15) * this.field_45176.method_36133(var14)
                     + class_5298.method_24218(this.field_45177).method_36133(var14) * this.field_45176.method_36133(var15)
               );
         }
      }
   }
}
