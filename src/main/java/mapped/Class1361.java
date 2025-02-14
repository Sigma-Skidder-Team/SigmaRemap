package mapped;

public class Class1361 implements Runnable {
   private static String[] field7263;
   public final long field7264;
   public final long field7265;
   public final Class2381 field7266;
   public final boolean field7267;
   public final Class8832 field7268;

   public Class1361(Class8832 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field7268 = var1;
      this.field7264 = var2;
      this.field7265 = var4;
      this.field7266 = var6;
      this.field7267 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field7264; var3 < this.field7265; var3++) {
         long var5 = var3 * Class8832.method31966(this.field7268);

         for (long var7 = 0L; var7 < Class8832.method31963(this.field7268); var7++) {
            Class8832.method31958(this.field7268).method33653(this.field7266, var5 + var7 * Class8832.method31967(this.field7268), this.field7267);
         }
      }
   }
}
