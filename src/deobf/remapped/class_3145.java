package remapped;

public class class_3145 implements Runnable {
   private static String[] field_15642;

   public class_3145(class_3281 var1, long var2, long var4, long var6, class_1702 var8, class_1702 var9) {
      this.field_15644 = var1;
      this.field_15646 = var2;
      this.field_15643 = var4;
      this.field_15640 = var6;
      this.field_15645 = var8;
      this.field_15641 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_15646; var3 < this.field_15643; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field_15640 + var3;
         this.field_15645.method_36114(var5, this.field_15641.method_36107(var9) * class_3281.method_15000(this.field_15644).method_36107(var5));
         this.field_15645.method_36114(var7, -this.field_15641.method_36107(var9) * class_3281.method_15000(this.field_15644).method_36107(var7));
      }
   }
}
