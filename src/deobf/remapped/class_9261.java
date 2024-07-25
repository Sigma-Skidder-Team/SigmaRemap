package remapped;

public final class class_9261 implements Runnable {
   private static String[] field_47257;

   public class_9261(long var1, long var3, class_4330 var5, float var6) {
      this.field_47256 = var1;
      this.field_47258 = var3;
      this.field_47254 = var5;
      this.field_47255 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_47256; var3 < this.field_47258; var3++) {
         this.field_47254.method_36114(var3, this.field_47254.method_36107(var3) * (double)this.field_47255);
      }
   }
}
