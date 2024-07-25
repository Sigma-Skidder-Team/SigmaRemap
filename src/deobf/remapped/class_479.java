package remapped;

public class class_479 implements Runnable {
   private static String[] field_2972;

   public class_479(class_3281 var1, int var2, long var3, long var5, long var7, class_1702 var9, class_1702 var10) {
      this.field_2975 = var1;
      this.field_2970 = var2;
      this.field_2968 = var3;
      this.field_2969 = var5;
      this.field_2974 = var7;
      this.field_2973 = var9;
      this.field_2971 = var10;
   }

   @Override
   public void run() {
      if (this.field_2970 <= 0) {
         for (long var3 = this.field_2968; var3 < this.field_2969; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field_2974 + var5;
            long var11 = this.field_2974 + var7;
            this.field_2973
               .method_36114(
                  var9,
                  class_3281.method_15000(this.field_2975).method_36107(var5) * this.field_2971.method_36107(var5)
                     + class_3281.method_15000(this.field_2975).method_36107(var7) * this.field_2971.method_36107(var7)
               );
            this.field_2973
               .method_36114(
                  var11,
                  -class_3281.method_15000(this.field_2975).method_36107(var7) * this.field_2971.method_36107(var5)
                     + class_3281.method_15000(this.field_2975).method_36107(var5) * this.field_2971.method_36107(var7)
               );
         }
      } else {
         for (long var13 = this.field_2968; var13 < this.field_2969; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field_2974 + var14;
            long var17 = this.field_2974 + var15;
            this.field_2973
               .method_36114(
                  var16,
                  class_3281.method_15000(this.field_2975).method_36107(var14) * this.field_2971.method_36107(var14)
                     - class_3281.method_15000(this.field_2975).method_36107(var15) * this.field_2971.method_36107(var15)
               );
            this.field_2973
               .method_36114(
                  var17,
                  class_3281.method_15000(this.field_2975).method_36107(var15) * this.field_2971.method_36107(var14)
                     + class_3281.method_15000(this.field_2975).method_36107(var14) * this.field_2971.method_36107(var15)
               );
         }
      }
   }
}
