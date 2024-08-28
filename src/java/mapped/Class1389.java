package mapped;

public class Class1389 implements Runnable {
   private static String[] field7421;
   public final long field7422;
   public final long field7423;
   public final Class2381 field7424;
   public final Class9615 field7425;

   public Class1389(Class9615 var1, long var2, long var4, Class2381 var6) {
      this.field7425 = var1;
      this.field7422 = var2;
      this.field7423 = var4;
      this.field7424 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field7422; var3 < this.field7423; var3++) {
         Class9615.method37423(this.field7425).method27173(this.field7424, var3 * Class9615.method37428(this.field7425));
      }
   }
}
