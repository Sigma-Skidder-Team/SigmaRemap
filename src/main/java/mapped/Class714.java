package mapped;

public class Class714 implements Runnable {
   private static String[] field3663;
   public final long field3664;
   public final int field3665;
   public final int field3666;
   public final int field3667;
   public final Class2378 field3668;
   public final boolean field3669;
   public final Class8543 field3670;

   public Class714(Class8543 var1, long var2, int var4, int var5, int var6, Class2378 var7, boolean var8) {
      this.field3670 = var1;
      this.field3664 = var2;
      this.field3665 = var4;
      this.field3666 = var5;
      this.field3667 = var6;
      this.field3668 = var7;
      this.field3669 = var8;
   }

   @Override
   public void run() {
      if (this.field3664 != 0L) {
         if (this.field3665 != 1) {
            for (long var3 = (long)this.field3666; var3 < Class8543.method30437(this.field3670); var3 += (long)this.field3667) {
               Class8543.method30434(this.field3670).method30948(this.field3668, var3 * Class8543.method30439(this.field3670), this.field3669);
            }
         } else {
            for (long var5 = (long)this.field3666; var5 < Class8543.method30437(this.field3670); var5 += (long)this.field3667) {
               Class8543.method30434(this.field3670).method30940(this.field3668, var5 * Class8543.method30439(this.field3670));
            }
         }
      } else if (this.field3665 != -1) {
         for (long var6 = (long)this.field3666; var6 < Class8543.method30437(this.field3670); var6 += (long)this.field3667) {
            Class8543.method30434(this.field3670).method30936(this.field3668, var6 * Class8543.method30439(this.field3670), this.field3669);
         }
      } else {
         for (long var7 = (long)this.field3666; var7 < Class8543.method30437(this.field3670); var7 += (long)this.field3667) {
            Class8543.method30434(this.field3670).method30932(this.field3668, var7 * Class8543.method30439(this.field3670));
         }
      }
   }
}
