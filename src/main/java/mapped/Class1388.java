package mapped;

public class Class1388 implements Runnable {
   private static String[] field7413;
   public final int field7414;
   public final int field7415;
   public final int field7416;
   public final int field7417;
   public final double[][] field7418;
   public final boolean field7419;
   public final Class9615 field7420;

   public Class1388(Class9615 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field7420 = var1;
      this.field7414 = var2;
      this.field7415 = var3;
      this.field7416 = var4;
      this.field7417 = var5;
      this.field7418 = var6;
      this.field7419 = var7;
   }

   @Override
   public void run() {
      if (this.field7414 != 0) {
         if (this.field7415 != 1) {
            for (int var3 = this.field7416; var3 < Class9615.method37424(this.field7420); var3 += this.field7417) {
               Class9615.method37423(this.field7420).method27186(this.field7418[var3], 0, this.field7419);
            }
         } else {
            for (int var4 = this.field7416; var4 < Class9615.method37424(this.field7420); var4 += this.field7417) {
               Class9615.method37423(this.field7420).method27170(this.field7418[var4]);
            }
         }
      } else if (this.field7415 != -1) {
         for (int var5 = this.field7416; var5 < Class9615.method37424(this.field7420); var5 += this.field7417) {
            Class9615.method37423(this.field7420).method27166(this.field7418[var5], this.field7419);
         }
      } else {
         for (int var6 = this.field7416; var6 < Class9615.method37424(this.field7420); var6 += this.field7417) {
            Class9615.method37423(this.field7420).method27162(this.field7418[var6]);
         }
      }
   }
}
