package mapped;

public class Class546 implements Runnable {
   private static String[] field2616;
   public final int field2617;
   public final int field2618;
   public final float[][] field2619;
   public final boolean field2620;
   public final Class7821 field2621;

   public Class546(Class7821 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field2621 = var1;
      this.field2617 = var2;
      this.field2618 = var3;
      this.field2619 = var4;
      this.field2620 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2617; var3 < this.field2618; var3++) {
         Class7821.method26150(this.field2621).method28459(this.field2619[var3], this.field2620);
      }
   }
}
