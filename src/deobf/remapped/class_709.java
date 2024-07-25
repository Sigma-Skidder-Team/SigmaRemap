package remapped;

public class class_709 implements Runnable {
   private static String[] field_3900;

   public class_709(class_6842 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_3898 = var1;
      this.field_3897 = var2;
      this.field_3901 = var4;
      this.field_3896 = var6;
      this.field_3899 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_3897; var3 < this.field_3901; var3++) {
         class_6842.method_31356(this.field_3898).method_31292(this.field_3896, var3 * class_6842.method_31357(this.field_3898), this.field_3899);
      }
   }
}
