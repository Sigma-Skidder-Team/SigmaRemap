package remapped;

public class class_1417 implements Runnable {
   private static String[] field_7687;

   public class_1417(class_7963 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_7685 = var1;
      this.field_7682 = var2;
      this.field_7684 = var4;
      this.field_7686 = var6;
      this.field_7683 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_7682; var3 < this.field_7684; var3++) {
         class_7963.method_36036(this.field_7685).method_44818(this.field_7686, var3 * class_7963.method_36037(this.field_7685), this.field_7683);
      }
   }
}
