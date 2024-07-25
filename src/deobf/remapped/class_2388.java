package remapped;

public final class class_2388 implements Runnable {
   private static String[] field_11910;

   public class_2388(long var1, long var3, class_1702 var5, long var6, double[] var8, int var9) {
      this.field_11909 = var1;
      this.field_11908 = var3;
      this.field_11913 = var5;
      this.field_11914 = var6;
      this.field_11911 = var8;
      this.field_11912 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_11909; var3 < this.field_11908; var3++) {
         this.field_11913.method_36114(this.field_11914 + var3, this.field_11911[this.field_11912 + (int)var3]);
      }
   }
}
