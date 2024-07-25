package remapped;

public class class_5847 implements Runnable {
   private static String[] field_29702;

   public class_5847(class_8751 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_29707 = var1;
      this.field_29705 = var2;
      this.field_29706 = var4;
      this.field_29703 = var6;
      this.field_29704 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_29705; var3 < this.field_29706; var3++) {
         class_8751.method_40165(this.field_29707).method_21129(this.field_29703, var3 * class_8751.method_40171(this.field_29707), this.field_29704);
      }
   }
}
