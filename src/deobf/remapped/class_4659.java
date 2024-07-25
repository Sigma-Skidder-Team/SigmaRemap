package remapped;

public class class_4659 implements Runnable {
   private static String[] field_22726;

   public class_4659(class_7963 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_22725 = var1;
      this.field_22724 = var2;
      this.field_22728 = var4;
      this.field_22727 = var6;
      this.field_22729 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_22724; var3 < this.field_22728; var3++) {
         class_7963.method_36036(this.field_22725).method_44813(this.field_22727, var3 * class_7963.method_36037(this.field_22725), this.field_22729);
      }
   }
}
