package mapped;

public class Class1631 implements Runnable {
   private static String[] field8842;
   public final int field8843;
   public final int field8844;
   public final int field8845;
   public final float[][] field8846;
   public final boolean field8847;
   public final Class7821 field8848;

   public Class1631(Class7821 var1, int var2, int var3, int var4, float[][] var5, boolean var6) {
      this.field8848 = var1;
      this.field8843 = var2;
      this.field8844 = var3;
      this.field8845 = var4;
      this.field8846 = var5;
      this.field8847 = var6;
   }

   @Override
   public void run() {
      if (this.field8843 != -1) {
         for (int var3 = this.field8844; var3 < Class7821.method26151(this.field8848); var3 += this.field8845) {
            Class7821.method26150(this.field8848).method28459(this.field8846[var3], this.field8847);
         }
      } else {
         for (int var4 = this.field8844; var4 < Class7821.method26151(this.field8848); var4 += this.field8845) {
            Class7821.method26150(this.field8848).method28455(this.field8846[var4]);
         }
      }
   }
}
