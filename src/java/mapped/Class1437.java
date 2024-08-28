package mapped;

public class Class1437 implements Runnable {
   private static String[] field7715;
   public final int field7716;
   public final int field7717;
   public final int field7718;
   public final float[] field7719;
   public final boolean field7720;
   public final Class8682 field7721;

   public Class1437(Class8682 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field7721 = var1;
      this.field7716 = var2;
      this.field7717 = var3;
      this.field7718 = var4;
      this.field7719 = var5;
      this.field7720 = var6;
   }

   @Override
   public void run() {
      if (this.field7716 != -1) {
         for (int var3 = this.field7717; var3 < Class8682.method31247(this.field7721); var3 += this.field7718) {
            Class8682.method31246(this.field7721).method28930(this.field7719, var3 * Class8682.method31245(this.field7721), this.field7720);
         }
      } else {
         for (int var4 = this.field7717; var4 < Class8682.method31247(this.field7721); var4 += this.field7718) {
            Class8682.method31246(this.field7721).method28926(this.field7719, var4 * Class8682.method31245(this.field7721), this.field7720);
         }
      }
   }
}
