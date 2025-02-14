package mapped;

public class Class1405 implements Runnable {
   private static String[] field7520;
   public final long field7521;
   public final long field7522;
   public final long field7523;
   public final long field7524;
   public final Class2378 field7525;
   public final long field7526;
   public final Class8026 field7527;

   public Class1405(Class8026 var1, long var2, long var4, long var6, long var8, Class2378 var10, long var11) {
      this.field7527 = var1;
      this.field7521 = var2;
      this.field7522 = var4;
      this.field7523 = var6;
      this.field7524 = var8;
      this.field7525 = var10;
      this.field7526 = var11;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field7521);

      for (long var4 = this.field7522; var4 >= this.field7523; var4--) {
         long var6 = var4 * Class8026.method27520(this.field7527);
         long var8 = var4 * this.field7524;

         for (long var10 = Class8026.method27521(this.field7527) - 1L; var10 >= 0L; var10--) {
            Class8133.method28175(this.field7525, var6 + var10 * Class8026.method27522(this.field7527), var3, 0L, Class8026.method27523(this.field7527));
            Class8026.method27515(this.field7527).method30942(var3);
            Class8133.method28175(var3, 0L, this.field7525, var8 + var10 * this.field7526, this.field7521);
         }
      }
   }
}
