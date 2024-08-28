package mapped;

public class Class1455 implements Runnable {
   private static String[] field7822;
   public final long field7823;
   public final long field7824;
   public final Class2381 field7825;
   public final boolean field7826;
   public final Class9186 field7827;

   public Class1455(Class9186 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field7827 = var1;
      this.field7823 = var2;
      this.field7824 = var4;
      this.field7825 = var6;
      this.field7826 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field7823; var3 < this.field7824; var3++) {
         Class9186.method34382(this.field7827).method33653(this.field7825, var3 * Class9186.method34385(this.field7827), this.field7826);
      }
   }
}
