package mapped;

public class Class1609 implements Runnable {
   private static String[] field8720;
   public final int field8721;
   public final int field8722;
   public final double[][] field8723;
   public final boolean field8724;
   public final Class9055 field8725;

   public Class1609(Class9055 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field8725 = var1;
      this.field8721 = var2;
      this.field8722 = var3;
      this.field8723 = var4;
      this.field8724 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9055.method33699(this.field8725)];

      for (int var4 = this.field8721; var4 < this.field8722; var4++) {
         for (int var5 = 0; var5 < Class9055.method33699(this.field8725); var5++) {
            var3[var5] = this.field8723[var5][var4];
         }

         Class9055.method33700(this.field8725).method33660(var3, this.field8724);

         for (int var6 = 0; var6 < Class9055.method33699(this.field8725); var6++) {
            this.field8723[var6][var4] = var3[var6];
         }
      }
   }
}
