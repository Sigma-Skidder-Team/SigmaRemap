package mapped;

public class Class1368 implements Runnable {
   private static String[] field7305;
   public final long field7306;
   public final long field7307;
   public final Class2378 field7308;
   public final boolean field7309;
   public final Class7821 field7310;

   public Class1368(Class7821 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field7310 = var1;
      this.field7306 = var2;
      this.field7307 = var4;
      this.field7308 = var6;
      this.field7309 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field7306; var3 < this.field7307; var3++) {
         Class7821.method26150(this.field7310).method28462(this.field7308, var3 * Class7821.method26153(this.field7310), this.field7309);
      }
   }
}
