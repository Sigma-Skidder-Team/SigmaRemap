package mapped;

public class Class610 implements Runnable {
   private static String[] field3019;
   public final int field3020;
   public final int field3021;
   public final int field3022;
   public final double[][] field3023;
   public final boolean field3024;
   public final Class9186 field3025;

   public Class610(Class9186 var1, int var2, int var3, int var4, double[][] var5, boolean var6) {
      this.field3025 = var1;
      this.field3020 = var2;
      this.field3021 = var3;
      this.field3022 = var4;
      this.field3023 = var5;
      this.field3024 = var6;
   }

   @Override
   public void run() {
      if (this.field3020 != -1) {
         for (int var3 = this.field3021; var3 < Class9186.method34383(this.field3025); var3 += this.field3022) {
            Class9186.method34382(this.field3025).method33650(this.field3023[var3], this.field3024);
         }
      } else {
         for (int var4 = this.field3021; var4 < Class9186.method34383(this.field3025); var4 += this.field3022) {
            Class9186.method34382(this.field3025).method33646(this.field3023[var4]);
         }
      }
   }
}
