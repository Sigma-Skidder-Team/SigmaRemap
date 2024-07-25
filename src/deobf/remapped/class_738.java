package remapped;

public class class_738 implements Runnable {
   private static String[] field_4023;

   public class_738(class_3281 var1, int var2, long var3, long var5, class_1702 var7) {
      this.field_4021 = var1;
      this.field_4018 = var2;
      this.field_4019 = var3;
      this.field_4020 = var5;
      this.field_4022 = var7;
   }

   @Override
   public void run() {
      if (this.field_4018 <= 0) {
         for (long var3 = this.field_4019; var3 < this.field_4020; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            double var9 = this.field_4022.method_36107(var5) * class_3281.method_14989(this.field_4021).method_36107(var7)
               + this.field_4022.method_36107(var7) * class_3281.method_14989(this.field_4021).method_36107(var5);
            this.field_4022
               .method_36114(
                  var5,
                  this.field_4022.method_36107(var5) * class_3281.method_14989(this.field_4021).method_36107(var5)
                     - this.field_4022.method_36107(var7) * class_3281.method_14989(this.field_4021).method_36107(var7)
               );
            this.field_4022.method_36114(var7, var9);
         }
      } else {
         for (long var11 = this.field_4019; var11 < this.field_4020; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            double var14 = -this.field_4022.method_36107(var12) * class_3281.method_14989(this.field_4021).method_36107(var13)
               + this.field_4022.method_36107(var13) * class_3281.method_14989(this.field_4021).method_36107(var12);
            this.field_4022
               .method_36114(
                  var12,
                  this.field_4022.method_36107(var12) * class_3281.method_14989(this.field_4021).method_36107(var12)
                     + this.field_4022.method_36107(var13) * class_3281.method_14989(this.field_4021).method_36107(var13)
               );
            this.field_4022.method_36114(var13, var14);
         }
      }
   }
}
