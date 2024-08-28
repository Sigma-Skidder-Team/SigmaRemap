package mapped;

public class Class1505 implements Runnable {
   private static String[] field8124;
   public final int field8125;
   public final int field8126;
   public final int field8127;
   public final int field8128;
   public final float[] field8129;
   public final boolean field8130;
   public final Class8543 field8131;

   public Class1505(Class8543 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field8131 = var1;
      this.field8125 = var2;
      this.field8126 = var3;
      this.field8127 = var4;
      this.field8128 = var5;
      this.field8129 = var6;
      this.field8130 = var7;
   }

   @Override
   public void run() {
      if (this.field8125 != 0) {
         if (this.field8126 != 1) {
            for (int var3 = this.field8127; var3 < Class8543.method30435(this.field8131); var3 += this.field8128) {
               Class8543.method30434(this.field8131).method30947(this.field8129, var3 * Class8543.method30438(this.field8131), this.field8130);
            }
         } else {
            for (int var4 = this.field8127; var4 < Class8543.method30435(this.field8131); var4 += this.field8128) {
               Class8543.method30434(this.field8131).method30939(this.field8129, var4 * Class8543.method30438(this.field8131));
            }
         }
      } else if (this.field8126 != -1) {
         for (int var5 = this.field8127; var5 < Class8543.method30435(this.field8131); var5 += this.field8128) {
            Class8543.method30434(this.field8131).method30935(this.field8129, var5 * Class8543.method30438(this.field8131), this.field8130);
         }
      } else {
         for (int var6 = this.field8127; var6 < Class8543.method30435(this.field8131); var6 += this.field8128) {
            Class8543.method30434(this.field8131).method30931(this.field8129, var6 * Class8543.method30438(this.field8131));
         }
      }
   }
}
