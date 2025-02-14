package mapped;

public class Class1542 implements Runnable {
   private static String[] field8364;
   public final int field8365;
   public final int field8366;
   public final float[] field8367;
   public final int field8368;
   public final boolean field8369;
   public final Class8543 field8370;

   public Class1542(Class8543 var1, int var2, int var3, float[] var4, int var5, boolean var6) {
      this.field8370 = var1;
      this.field8365 = var2;
      this.field8366 = var3;
      this.field8367 = var4;
      this.field8368 = var5;
      this.field8369 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field8365; var3 < this.field8366; var3++) {
         Class8543.method30434(this.field8370).method30935(this.field8367, var3 * this.field8368, this.field8369);
      }
   }
}
