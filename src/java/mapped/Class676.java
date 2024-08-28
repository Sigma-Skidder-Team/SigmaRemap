package mapped;

public class Class676 implements Runnable {
   private static String[] field3423;
   public final int field3424;
   public final int field3425;
   public final int field3426;
   public final double[][] field3427;
   public final boolean field3428;
   public final Class9330 field3429;

   public Class676(Class9330 var1, int var2, int var3, int var4, double[][] var5, boolean var6) {
      this.field3429 = var1;
      this.field3424 = var2;
      this.field3425 = var3;
      this.field3426 = var4;
      this.field3427 = var5;
      this.field3428 = var6;
   }

   @Override
   public void run() {
      if (this.field3424 != -1) {
         for (int var3 = this.field3425; var3 < Class9330.method35279(this.field3429); var3 += this.field3426) {
            Class9330.method35278(this.field3429).method38580(this.field3427[var3], this.field3428);
         }
      } else {
         for (int var4 = this.field3425; var4 < Class9330.method35279(this.field3429); var4 += this.field3426) {
            Class9330.method35278(this.field3429).method38576(this.field3427[var4], this.field3428);
         }
      }
   }
}
