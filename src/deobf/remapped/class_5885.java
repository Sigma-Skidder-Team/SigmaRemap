package remapped;

public class class_5885 {
   private static String[] field_29895;
   private double field_29896;
   private double field_29897;
   private long field_29894;

   private class_5885() {
   }

   private boolean method_26836(long var1) {
      return this.field_29894 != var1;
   }

   private void method_26835(long var1, double var3) {
      this.field_29894 = var1;
      double var7 = var3 - this.field_29896;
      var7 = MathHelper.positiveModulo(var7 + 0.5, 1.0) - 0.5;
      this.field_29897 += var7 * 0.1;
      this.field_29897 *= 0.8;
      this.field_29896 = MathHelper.positiveModulo(this.field_29896 + this.field_29897, 1.0);
   }
}
