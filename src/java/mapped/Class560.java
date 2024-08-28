package mapped;

public class Class560 implements Runnable {
   private static String[] field2702;
   public final int field2703;
   public final int field2704;
   public final int field2705;
   public final int field2706;
   public final float[] field2707;
   public final boolean field2708;
   public final Class8543 field2709;

   public Class560(Class8543 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field2709 = var1;
      this.field2703 = var2;
      this.field2704 = var3;
      this.field2705 = var4;
      this.field2706 = var5;
      this.field2707 = var6;
      this.field2708 = var7;
   }

   @Override
   public void run() {
      if (this.field2703 != 0) {
         if (this.field2704 != 1) {
            for (int var3 = this.field2705; var3 < Class8543.method30435(this.field2709); var3 += this.field2706) {
               Class8543.method30434(this.field2709).method30953(this.field2707, var3 * Class8543.method30438(this.field2709), this.field2708);
            }
         } else {
            for (int var4 = this.field2705; var4 < Class8543.method30435(this.field2709); var4 += this.field2706) {
               Class8543.method30434(this.field2709).method30939(this.field2707, var4 * Class8543.method30438(this.field2709));
            }
         }
      } else if (this.field2704 != -1) {
         for (int var5 = this.field2705; var5 < Class8543.method30435(this.field2709); var5 += this.field2706) {
            Class8543.method30434(this.field2709).method30935(this.field2707, var5 * Class8543.method30438(this.field2709), this.field2708);
         }
      } else {
         for (int var6 = this.field2705; var6 < Class8543.method30435(this.field2709); var6 += this.field2706) {
            Class8543.method30434(this.field2709).method30931(this.field2707, var6 * Class8543.method30438(this.field2709));
         }
      }
   }
}
