package mapped;

public class Class619 implements Runnable {
   private static String[] field3076;
   public final long field3077;
   public final long field3078;
   public final Class2378 field3079;
   public final boolean field3080;
   public final Class8682 field3081;

   public Class619(Class8682 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field3081 = var1;
      this.field3077 = var2;
      this.field3078 = var4;
      this.field3079 = var6;
      this.field3080 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field3077; var3 < this.field3078; var3++) {
         Class8682.method31246(this.field3081).method28931(this.field3079, var3 * Class8682.method31249(this.field3081), this.field3080);
      }
   }
}
