package remapped;

public class class_9329 implements Runnable {
   private static String[] field_47635;

   public class_9329(class_9035 var1, long var2, long var4, class_1702 var6, long var7, class_1702 var9) {
      this.field_47631 = var1;
      this.field_47630 = var2;
      this.field_47634 = var4;
      this.field_47633 = var6;
      this.field_47632 = var7;
      this.field_47636 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_47630; var3 < this.field_47634; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < class_9035.method_41453(this.field_47631); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * class_9035.method_41456(this.field_47631) + var5;
            this.field_47633.method_36114(var3 * this.field_47632 + var9, this.field_47636.method_36107(var11));
            this.field_47633.method_36114(var3 * this.field_47632 + var9 + 1L, this.field_47636.method_36107(var11 + 1L));
         }

         class_9035.method_41455(this.field_47631).method_15027(this.field_47633, var3 * this.field_47632);
      }
   }
}
