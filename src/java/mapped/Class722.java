package mapped;

public class Class722 implements Runnable {
   private static String[] field3715;
   public final int field3716;
   public final int field3717;
   public final int field3718;
   public final int field3719;
   public final float[][] field3720;
   public final boolean field3721;
   public final Class8543 field3722;

   public Class722(Class8543 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field3722 = var1;
      this.field3716 = var2;
      this.field3717 = var3;
      this.field3718 = var4;
      this.field3719 = var5;
      this.field3720 = var6;
      this.field3721 = var7;
   }

   @Override
   public void run() {
      if (this.field3716 != 0) {
         if (this.field3717 != 1) {
            for (int var3 = this.field3718; var3 < Class8543.method30435(this.field3722); var3 += this.field3719) {
               Class8543.method30434(this.field3722).method30945(this.field3720[var3], this.field3721);
            }
         } else {
            for (int var4 = this.field3718; var4 < Class8543.method30435(this.field3722); var4 += this.field3719) {
               Class8543.method30434(this.field3722).method30937(this.field3720[var4]);
            }
         }
      } else if (this.field3717 != -1) {
         for (int var5 = this.field3718; var5 < Class8543.method30435(this.field3722); var5 += this.field3719) {
            Class8543.method30434(this.field3722).method30933(this.field3720[var5], this.field3721);
         }
      } else {
         for (int var6 = this.field3718; var6 < Class8543.method30435(this.field3722); var6 += this.field3719) {
            Class8543.method30434(this.field3722).method30929(this.field3720[var6]);
         }
      }
   }
}
