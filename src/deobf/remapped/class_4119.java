package remapped;

public final class class_4119 implements Runnable {
   private static String[] field_20079;

   public class_4119(long var1, long var3, class_8720 var5, long var6, boolean[] var8, int var9) {
      this.field_20080 = var1;
      this.field_20076 = var3;
      this.field_20081 = var5;
      this.field_20077 = var6;
      this.field_20078 = var8;
      this.field_20075 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_20080; var3 < this.field_20076; var3++) {
         this.field_20081.method_36109(this.field_20077 + var3, this.field_20078[this.field_20075 + (int)var3]);
      }
   }
}
