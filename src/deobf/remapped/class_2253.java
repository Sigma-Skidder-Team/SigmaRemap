package remapped;

public class class_2253 implements Runnable {
   private static String[] field_11212;

   public class_2253(class_1637 var1, long var2, long var4, long var6, long var8, class_1702 var10, boolean var11, long var12) {
      this.field_11216 = var1;
      this.field_11211 = var2;
      this.field_11219 = var4;
      this.field_11218 = var6;
      this.field_11215 = var8;
      this.field_11213 = var10;
      this.field_11217 = var11;
      this.field_11214 = var12;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_11211);

      for (long var4 = this.field_11219; var4 >= this.field_11218; var4--) {
         long var6 = var4 * class_1637.method_7342(this.field_11216);
         long var8 = var4 * this.field_11215;

         for (long var10 = class_1637.method_7327(this.field_11216) - 1L; var10 >= 0L; var10--) {
            class_3685.method_17115(
               this.field_11213, var6 + var10 * class_1637.method_7303(this.field_11216), var3, 0L, class_1637.method_7343(this.field_11216)
            );
            class_1637.method_7310(this.field_11216).method_14997(var3, this.field_11217);
            class_3685.method_17115(var3, 0L, this.field_11213, var8 + var10 * this.field_11214, this.field_11211);
         }
      }
   }
}
