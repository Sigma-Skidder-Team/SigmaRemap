package remapped;

public class class_6052 implements Runnable {
   private static String[] field_30956;

   public class_6052(class_1637 var1, long var2, long var4, class_1702 var6, class_1702 var7, long var8) {
      this.field_30955 = var1;
      this.field_30952 = var2;
      this.field_30957 = var4;
      this.field_30951 = var6;
      this.field_30954 = var7;
      this.field_30953 = var8;
   }

   @Override
   public void run() {
      for (long var3 = this.field_30952; var3 < this.field_30957; var3++) {
         long var5 = var3 * class_1637.method_7342(this.field_30955);

         for (long var7 = 0L; var7 < class_1637.method_7327(this.field_30955); var7++) {
            class_3685.method_17115(
               this.field_30951,
               var5 + var7 * class_1637.method_7303(this.field_30955),
               this.field_30954,
               var3 * class_1637.method_7327(this.field_30955) * this.field_30953 + var7 * this.field_30953,
               class_1637.method_7343(this.field_30955)
            );
            class_1637.method_7310(this.field_30955)
               .method_14980(this.field_30954, var3 * class_1637.method_7327(this.field_30955) * this.field_30953 + var7 * this.field_30953);
         }
      }
   }
}
