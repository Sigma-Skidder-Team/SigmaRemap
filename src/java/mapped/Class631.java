package mapped;

public class Class631 implements Runnable {
   private static String[] field3143;
   public final int field3144;
   public final long field3145;
   public final int field3146;
   public final Class2378 field3147;
   public final boolean field3148;
   public final Class8682 field3149;

   public Class631(Class8682 var1, int var2, long var3, int var5, Class2378 var6, boolean var7) {
      this.field3149 = var1;
      this.field3144 = var2;
      this.field3145 = var3;
      this.field3146 = var5;
      this.field3147 = var6;
      this.field3148 = var7;
   }

   @Override
   public void run() {
      if (this.field3144 != -1) {
         for (long var3 = this.field3145; var3 < (long)Class8682.method31247(this.field3149); var3 += (long)this.field3146) {
            Class8682.method31246(this.field3149).method28931(this.field3147, var3 * Class8682.method31249(this.field3149), this.field3148);
         }
      } else {
         for (long var5 = this.field3145; var5 < Class8682.method31250(this.field3149); var5 += (long)this.field3146) {
            Class8682.method31246(this.field3149).method28927(this.field3147, var5 * Class8682.method31249(this.field3149), this.field3148);
         }
      }
   }
}
