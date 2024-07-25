package remapped;

public final class class_5632 implements Runnable {
   private static String[] field_28574;

   public class_5632(long var1, long var3, class_4516 var5, long var6, short[] var8, int var9) {
      this.field_28578 = var1;
      this.field_28572 = var3;
      this.field_28576 = var5;
      this.field_28577 = var6;
      this.field_28575 = var8;
      this.field_28573 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_28578; var3 < this.field_28572; var3++) {
         this.field_28576.method_36129(this.field_28577 + var3, this.field_28575[this.field_28573 + (int)var3]);
      }
   }
}
