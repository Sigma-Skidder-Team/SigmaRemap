package mapped;

public class Class1467 implements Runnable {
   private static String[] field7886;
   public final long field7887;
   public final long field7888;
   public final Class2378 field7889;
   public final boolean field7890;
   public final Class7824 field7891;

   public Class1467(Class7824 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field7891 = var1;
      this.field7887 = var2;
      this.field7888 = var4;
      this.field7889 = var6;
      this.field7890 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field7887; var3 < this.field7888; var3++) {
         long var5 = var3 * Class7824.method26187(this.field7891);

         for (long var7 = 0L; var7 < Class7824.method26188(this.field7891); var7++) {
            Class7824.method26182(this.field7891).method29634(this.field7889, var5 + var7 * Class7824.method26189(this.field7891), this.field7890);
         }
      }
   }
}
