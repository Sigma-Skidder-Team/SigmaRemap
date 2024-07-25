package remapped;

public class class_8276 implements Runnable {
   private static String[] field_42441;

   public class_8276(class_3281 var1, long var2, long var4, long var6, class_1702 var8) {
      this.field_42445 = var1;
      this.field_42446 = var2;
      this.field_42444 = var4;
      this.field_42443 = var6;
      this.field_42442 = var8;
   }

   @Override
   public void run() {
      if (this.field_42446 <= 0L) {
         for (long var3 = this.field_42444; var3 < this.field_42443; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            double var9 = this.field_42442.method_36107(var5) * class_3281.method_14989(this.field_42445).method_36107(var7)
               + this.field_42442.method_36107(var7) * class_3281.method_14989(this.field_42445).method_36107(var5);
            this.field_42442
               .method_36114(
                  var5,
                  this.field_42442.method_36107(var5) * class_3281.method_14989(this.field_42445).method_36107(var5)
                     - this.field_42442.method_36107(var7) * class_3281.method_14989(this.field_42445).method_36107(var7)
               );
            this.field_42442.method_36114(var7, var9);
         }
      } else {
         for (long var11 = this.field_42444; var11 < this.field_42443; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            double var14 = -this.field_42442.method_36107(var12) * class_3281.method_14989(this.field_42445).method_36107(var13)
               + this.field_42442.method_36107(var13) * class_3281.method_14989(this.field_42445).method_36107(var12);
            this.field_42442
               .method_36114(
                  var12,
                  this.field_42442.method_36107(var12) * class_3281.method_14989(this.field_42445).method_36107(var12)
                     + this.field_42442.method_36107(var13) * class_3281.method_14989(this.field_42445).method_36107(var13)
               );
            this.field_42442.method_36114(var13, var14);
         }
      }
   }
}
