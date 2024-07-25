package remapped;

public class class_7568 implements Runnable {
   private static String[] field_38562;

   public class_7568(class_3281 var1, long var2, long var4, class_1702 var6) {
      this.field_38566 = var1;
      this.field_38563 = var2;
      this.field_38564 = var4;
      this.field_38565 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_38563; var3 < this.field_38564; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         double var9 = this.field_38565.method_36107(var5) * class_3281.method_14989(this.field_38566).method_36107(var7)
            + this.field_38565.method_36107(var7) * class_3281.method_14989(this.field_38566).method_36107(var5);
         this.field_38565
            .method_36114(
               var5,
               this.field_38565.method_36107(var5) * class_3281.method_14989(this.field_38566).method_36107(var5)
                  - this.field_38565.method_36107(var7) * class_3281.method_14989(this.field_38566).method_36107(var7)
            );
         this.field_38565.method_36114(var7, var9);
      }
   }
}
