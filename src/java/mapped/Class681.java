package mapped;

public class Class681 implements Runnable {
   private static String[] field3459;
   public final int field3460;
   public final int field3461;
   public final int field3462;
   public final int field3463;
   public final double[][] field3464;
   public final boolean field3465;
   public final Class9615 field3466;

   public Class681(Class9615 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field3466 = var1;
      this.field3460 = var2;
      this.field3461 = var3;
      this.field3462 = var4;
      this.field3463 = var5;
      this.field3464 = var6;
      this.field3465 = var7;
   }

   @Override
   public void run() {
      if (this.field3460 != 0) {
         if (this.field3461 != 1) {
            for (int var3 = this.field3462; var3 < Class9615.method37424(this.field3466); var3 += this.field3463) {
               Class9615.method37423(this.field3466).method27178(this.field3464[var3], this.field3465);
            }
         } else {
            for (int var4 = this.field3462; var4 < Class9615.method37424(this.field3466); var4 += this.field3463) {
               Class9615.method37423(this.field3466).method27170(this.field3464[var4]);
            }
         }
      } else if (this.field3461 != -1) {
         for (int var5 = this.field3462; var5 < Class9615.method37424(this.field3466); var5 += this.field3463) {
            Class9615.method37423(this.field3466).method27166(this.field3464[var5], this.field3465);
         }
      } else {
         for (int var6 = this.field3462; var6 < Class9615.method37424(this.field3466); var6 += this.field3463) {
            Class9615.method37423(this.field3466).method27162(this.field3464[var6]);
         }
      }
   }
}
