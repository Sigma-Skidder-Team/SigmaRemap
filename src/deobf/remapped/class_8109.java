package remapped;

public class class_8109 implements Runnable {
   private static String[] field_41539;

   public class_8109(class_3281 var1, long var2, long var4, long var6, long var8, class_1702 var10) {
      this.field_41536 = var1;
      this.field_41535 = var2;
      this.field_41538 = var4;
      this.field_41534 = var6;
      this.field_41537 = var8;
      this.field_41540 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_41535; var3 < this.field_41538; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field_41534 + (this.field_41537 - var5) % this.field_41537;
         this.field_41540.method_36114(var7, this.field_41540.method_36107(this.field_41534 + var5));
         this.field_41540.method_36114(var7 + 1L, -this.field_41540.method_36107(this.field_41534 + var5 + 1L));
      }
   }
}
