package mapped;

public class Class1433 implements Runnable {
   private static String[] field7689;
   public final long field7690;
   public final long field7691;
   public final Class2378 field7692;
   public final Class2378 field7693;
   public final long field7694;
   public final boolean field7695;
   public final Class8026 field7696;

   public Class1433(Class8026 var1, long var2, long var4, Class2378 var6, Class2378 var7, long var8, boolean var10) {
      this.field7696 = var1;
      this.field7690 = var2;
      this.field7691 = var4;
      this.field7692 = var6;
      this.field7693 = var7;
      this.field7694 = var8;
      this.field7695 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field7690; var3 < this.field7691; var3++) {
         long var5 = var3 * Class8026.method27520(this.field7696);

         for (long var7 = 0L; var7 < Class8026.method27521(this.field7696); var7++) {
            Class8133.method28175(
               this.field7692,
               var5 + var7 * Class8026.method27522(this.field7696),
               this.field7693,
               var3 * Class8026.method27521(this.field7696) * this.field7694 + var7 * this.field7694,
               Class8026.method27523(this.field7696)
            );
            Class8026.method27515(this.field7696)
               .method30952(this.field7693, var3 * Class8026.method27521(this.field7696) * this.field7694 + var7 * this.field7694, this.field7695);
         }
      }
   }
}
