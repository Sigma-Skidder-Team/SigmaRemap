package mapped;

public class Class609 implements Runnable {
   private static String[] field3012;
   public final int field3013;
   public final long field3014;
   public final int field3015;
   public final Class2381 field3016;
   public final boolean field3017;
   public final Class9055 field3018;

   public Class609(Class9055 var1, int var2, long var3, int var5, Class2381 var6, boolean var7) {
      this.field3018 = var1;
      this.field3013 = var2;
      this.field3014 = var3;
      this.field3015 = var5;
      this.field3016 = var6;
      this.field3017 = var7;
   }

   @Override
   public void run() {
      if (this.field3013 != -1) {
         for (long var3 = this.field3014; var3 < (long)Class9055.method33699(this.field3018); var3 += (long)this.field3015) {
            Class9055.method33698(this.field3018).method33663(this.field3016, var3 * Class9055.method33701(this.field3018), this.field3017);
         }
      } else {
         for (long var5 = this.field3014; var5 < Class9055.method33702(this.field3018); var5 += (long)this.field3015) {
            Class9055.method33698(this.field3018).method33659(this.field3016, var5 * Class9055.method33701(this.field3018), this.field3017);
         }
      }
   }
}
