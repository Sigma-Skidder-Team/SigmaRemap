package remapped;

public class class_106 implements Runnable {
   private static String[] field_259;

   public class_106(class_1637 var1, long var2, long var4, long var6, class_1702 var8, long var9, class_1702 var11, long var12) {
      this.field_253 = var1;
      this.field_258 = var2;
      this.field_252 = var4;
      this.field_256 = var6;
      this.field_260 = var8;
      this.field_255 = var9;
      this.field_254 = var11;
      this.field_257 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_258; var3 < this.field_252; var3++) {
         long var5 = var3 * this.field_256;

         for (long var7 = 0L; var7 < class_1637.method_7327(this.field_253); var7++) {
            class_3685.method_17115(
               this.field_260,
               var3 * class_1637.method_7327(this.field_253) * this.field_255 + var7 * this.field_255,
               this.field_254,
               var5 + var7 * this.field_257,
               this.field_255
            );
         }
      }
   }
}
