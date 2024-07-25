package remapped;

public class class_3415 implements Runnable {
   private static String[] field_16809;

   public class_3415(class_3281 var1, long var2, long var4, long var6, class_1702 var8, class_1702 var9) {
      this.field_16810 = var1;
      this.field_16807 = var2;
      this.field_16813 = var4;
      this.field_16812 = var6;
      this.field_16811 = var8;
      this.field_16808 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_16807; var3 < this.field_16813; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field_16812 + var3;
         this.field_16811.method_36114(var5, this.field_16808.method_36107(var9) * class_3281.method_15000(this.field_16810).method_36107(var5));
         this.field_16811.method_36114(var7, this.field_16808.method_36107(var9) * class_3281.method_15000(this.field_16810).method_36107(var7));
      }
   }
}
