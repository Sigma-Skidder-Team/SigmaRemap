package remapped;

public final class class_3091 implements Runnable {
   private static String[] field_15393;

   public class_3091(long var1, long var3, class_4330 var5, long var6, float[] var8, int var9) {
      this.field_15392 = var1;
      this.field_15387 = var3;
      this.field_15389 = var5;
      this.field_15390 = var6;
      this.field_15391 = var8;
      this.field_15388 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_15392; var3 < this.field_15387; var3++) {
         this.field_15389.method_36123(this.field_15390 + var3, this.field_15391[this.field_15388 + (int)var3]);
      }
   }
}
