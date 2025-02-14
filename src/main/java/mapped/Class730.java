package mapped;

public class Class730 implements Runnable {
   private static String[] field3772;
   public final int field3773;
   public final int field3774;
   public final double[] field3775;
   public final boolean field3776;
   public final Class3612 field3777;

   public Class730(Class3612 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field3777 = var1;
      this.field3773 = var2;
      this.field3774 = var3;
      this.field3775 = var4;
      this.field3776 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3773; var3 < this.field3774; var3++) {
         int var4 = var3 * Class3612.method12220(this.field3777);

         for (int var5 = 0; var5 < Class3612.method12221(this.field3777); var5++) {
            Class3612.method12223(this.field3777).method33662(this.field3775, var4 + var5 * Class3612.method12222(this.field3777), this.field3776);
         }
      }
   }
}
