package remapped;

public class class_9458 implements Runnable {
   private static String[] field_48258;

   public class_9458(class_1637 var1, long var2, long var4, long var6, long var8, long var10, class_1702 var12) {
      this.field_48262 = var1;
      this.field_48259 = var2;
      this.field_48264 = var4;
      this.field_48265 = var6;
      this.field_48261 = var8;
      this.field_48260 = var10;
      this.field_48263 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_48259; var3 < this.field_48264; var3++) {
         long var5 = (class_1637.method_7293(this.field_48262) - var3) % class_1637.method_7293(this.field_48262) * this.field_48265;
         long var7 = var3 * this.field_48265;

         for (long var9 = 1L; var9 < this.field_48261; var9++) {
            long var11 = var7 + (class_1637.method_7327(this.field_48262) - var9) * this.field_48260;
            long var13 = var5 + var9 * this.field_48260 + class_1637.method_7343(this.field_48262);
            long var15 = var11 + class_1637.method_7343(this.field_48262);
            long var17 = var11 + 1L;
            this.field_48263.method_36114(var13, this.field_48263.method_36107(var17));
            this.field_48263.method_36114(var15, this.field_48263.method_36107(var17));
            this.field_48263.method_36114(var13 + 1L, -this.field_48263.method_36107(var11));
            this.field_48263.method_36114(var15 + 1L, this.field_48263.method_36107(var11));
         }
      }
   }
}
