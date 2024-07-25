package remapped;

public final class class_6584 implements Runnable {
   private static String[] field_33574;

   public class_6584(long var1, long var3, long var5, class_4330 var7, class_4330 var8, long var9) {
      this.field_33572 = var1;
      this.field_33576 = var3;
      this.field_33577 = var5;
      this.field_33571 = var7;
      this.field_33573 = var8;
      this.field_33575 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field_33572 + this.field_33576;
      long var5 = this.field_33577;

      while (var5 > 512L) {
         var5 >>= 2;
         class_2751.method_12523(var5, this.field_33571, var3 - var5, this.field_33573, this.field_33575 - (var5 >> 1));
      }

      class_2751.method_12541(var5, 1L, this.field_33571, var3 - var5, this.field_33575, this.field_33573);
      long var7 = 0L;
      long var9 = this.field_33572 - var5;

      for (long var11 = this.field_33576 - var5; var11 > 0L; var11 -= var5) {
         long var13 = class_2751.method_12413(var5, var11, ++var7, this.field_33571, this.field_33572, this.field_33575, this.field_33573);
         class_2751.method_12541(var5, var13, this.field_33571, var9 + var11, this.field_33575, this.field_33573);
      }
   }
}
