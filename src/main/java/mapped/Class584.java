package mapped;

public class Class584 implements Runnable {
   private static String[] field2862;
   public final int field2863;
   public final int field2864;
   public final int field2865;
   public final float[] field2866;
   public final Class8276 field2867;

   public Class584(Class8276 var1, int var2, int var3, int var4, float[] var5) {
      this.field2867 = var1;
      this.field2863 = var2;
      this.field2864 = var3;
      this.field2865 = var4;
      this.field2866 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field2863 + Class8276.method28932(this.field2867) - 1;

      for (int var4 = this.field2864; var4 < this.field2865; var4++) {
         int var5 = this.field2863 + var4;
         float var6 = this.field2866[var5];
         int var7 = var3 - var4;
         this.field2866[var5] = this.field2866[var7];
         this.field2866[var7] = var6;
      }
   }
}
