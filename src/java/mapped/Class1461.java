package mapped;

public class Class1461 implements Runnable {
   private static String[] field7853;
   public final int field7854;
   public final int field7855;
   public final int field7856;
   public final float[][] field7857;
   public final boolean field7858;
   public final Class9533 field7859;

   public Class1461(Class9533 var1, int var2, int var3, int var4, float[][] var5, boolean var6) {
      this.field7859 = var1;
      this.field7854 = var2;
      this.field7855 = var3;
      this.field7856 = var4;
      this.field7857 = var5;
      this.field7858 = var6;
   }

   @Override
   public void run() {
      if (this.field7854 != -1) {
         for (int var3 = this.field7855; var3 < Class9533.method36858(this.field7859); var3 += this.field7856) {
            Class9533.method36857(this.field7859).method29631(this.field7857[var3], this.field7858);
         }
      } else {
         for (int var4 = this.field7855; var4 < Class9533.method36858(this.field7859); var4 += this.field7856) {
            Class9533.method36857(this.field7859).method29627(this.field7857[var4], this.field7858);
         }
      }
   }
}
