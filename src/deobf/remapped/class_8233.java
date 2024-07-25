package remapped;

public final class class_8233 implements Runnable {
   private static String[] field_42285;

   public class_8233(long var1, long var3, class_1702 var5, long var6, class_1702 var8, long var9) {
      this.field_42284 = var1;
      this.field_42286 = var3;
      this.field_42283 = var5;
      this.field_42289 = var6;
      this.field_42287 = var8;
      this.field_42288 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_42284; var3 < this.field_42286; var3++) {
         this.field_42283.method_36114(this.field_42289 + var3, this.field_42287.method_36107(this.field_42288 + var3));
      }
   }
}
