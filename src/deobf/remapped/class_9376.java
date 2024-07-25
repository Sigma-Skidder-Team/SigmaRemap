package remapped;

public final class class_9376 implements Runnable {
   private static String[] field_47932;

   public class_9376(long var1, long var3, class_6949 var5, long var6, String[] var8, int var9) {
      this.field_47930 = var1;
      this.field_47931 = var3;
      this.field_47929 = var5;
      this.field_47927 = var6;
      this.field_47928 = var8;
      this.field_47933 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_47930; var3 < this.field_47931; var3++) {
         this.field_47929.method_36122(this.field_47927 + var3, this.field_47928[this.field_47933 + (int)var3]);
      }
   }
}
