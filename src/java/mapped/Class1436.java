package mapped;

public class Class1436 implements Runnable {
   private static String[] field7708;
   public final int field7709;
   public final int field7710;
   public final int field7711;
   public final double[][] field7712;
   public final boolean field7713;
   public final Class9055 field7714;

   public Class1436(Class9055 var1, int var2, int var3, int var4, double[][] var5, boolean var6) {
      this.field7714 = var1;
      this.field7709 = var2;
      this.field7710 = var3;
      this.field7711 = var4;
      this.field7712 = var5;
      this.field7713 = var6;
   }

   @Override
   public void run() {
      if (this.field7709 != -1) {
         for (int var3 = this.field7710; var3 < Class9055.method33699(this.field7714); var3 += this.field7711) {
            Class9055.method33698(this.field7714).method33660(this.field7712[var3], this.field7713);
         }
      } else {
         for (int var4 = this.field7710; var4 < Class9055.method33699(this.field7714); var4 += this.field7711) {
            Class9055.method33698(this.field7714).method33656(this.field7712[var4], this.field7713);
         }
      }
   }
}
