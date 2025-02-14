package mapped;

public class Class633 implements Runnable {
   private static String[] field3157;
   public final long field3158;
   public final long field3159;
   public final Class2378 field3160;
   public final boolean field3161;
   public final Class8543 field3162;

   public Class633(Class8543 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field3162 = var1;
      this.field3158 = var2;
      this.field3159 = var4;
      this.field3160 = var6;
      this.field3161 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field3158; var3 < this.field3159; var3++) {
         Class8543.method30434(this.field3162).method30954(this.field3160, var3 * Class8543.method30439(this.field3162), this.field3161);
      }
   }
}
