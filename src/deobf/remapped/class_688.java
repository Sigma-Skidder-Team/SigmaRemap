package remapped;

public class class_688 implements Runnable {
   private static String[] field_3783;

   public class_688(class_3281 var1, long var2, long var4, class_1702 var6, long var7, class_1702 var9) {
      this.field_3782 = var1;
      this.field_3787 = var2;
      this.field_3786 = var4;
      this.field_3784 = var6;
      this.field_3785 = var7;
      this.field_3781 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_3787; var3 < this.field_3786; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field_3784
            .method_36114(
               this.field_3785 + var3,
               class_3281.method_15000(this.field_3782).method_36107(var5) * this.field_3781.method_36107(var5)
                  - class_3281.method_15000(this.field_3782).method_36107(var7) * this.field_3781.method_36107(var7)
            );
      }
   }
}
