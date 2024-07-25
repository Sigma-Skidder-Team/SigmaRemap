package remapped;

public final class class_7237 implements Runnable {
   private static String[] field_37130;

   public class_7237(int var1, int var2, float[] var3, float var4) {
      this.field_37133 = var1;
      this.field_37129 = var2;
      this.field_37131 = var3;
      this.field_37132 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_37133; var3 < this.field_37129; var3++) {
         this.field_37131[var3] = this.field_37131[var3] * this.field_37132;
      }
   }
}
