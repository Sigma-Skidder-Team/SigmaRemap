package remapped;

public class class_1571 implements Runnable {
   private static String[] field_8250;

   public class_1571(class_1637 var1, long var2, long var4, class_1702 var6, class_1702 var7, long var8, boolean var10) {
      this.field_8254 = var1;
      this.field_8253 = var2;
      this.field_8252 = var4;
      this.field_8251 = var6;
      this.field_8255 = var7;
      this.field_8256 = var8;
      this.field_8249 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_8253; var3 < this.field_8252; var3++) {
         long var5 = var3 * class_1637.method_7342(this.field_8254);

         for (long var7 = 0L; var7 < class_1637.method_7327(this.field_8254); var7++) {
            class_3685.method_17115(
               this.field_8251,
               var5 + var7 * class_1637.method_7303(this.field_8254),
               this.field_8255,
               var3 * class_1637.method_7327(this.field_8254) * this.field_8256 + var7 * this.field_8256,
               class_1637.method_7343(this.field_8254)
            );
            class_1637.method_7310(this.field_8254)
               .method_14996(this.field_8255, var3 * class_1637.method_7327(this.field_8254) * this.field_8256 + var7 * this.field_8256, this.field_8249);
         }
      }
   }
}
