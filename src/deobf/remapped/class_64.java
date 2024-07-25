package remapped;

public final class class_64 implements Runnable {
   private static String[] field_63;

   public class_64(long var1, long var3, class_5260 var5, long var6, int[] var8, int var9) {
      this.field_68 = var1;
      this.field_65 = var3;
      this.field_66 = var5;
      this.field_67 = var6;
      this.field_69 = var8;
      this.field_64 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_68; var3 < this.field_65; var3++) {
         this.field_66.method_36092(this.field_67 + var3, this.field_69[this.field_64 + (int)var3]);
      }
   }
}
