package remapped;

public final class class_7189 implements Runnable {
   private static String[] field_36969;

   public class_7189(long var1, long var3, class_6949 var5, long var6, class_6949 var8, long var9) {
      this.field_36970 = var1;
      this.field_36974 = var3;
      this.field_36973 = var5;
      this.field_36971 = var6;
      this.field_36968 = var8;
      this.field_36972 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_36970; var3 < this.field_36974; var3++) {
         this.field_36973.method_36122(this.field_36971 + var3, this.field_36968.method_31787(this.field_36972 + var3));
      }
   }
}
