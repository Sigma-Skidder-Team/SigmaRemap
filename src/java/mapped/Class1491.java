package mapped;

public class Class1491 implements Runnable {
   private static String[] field8031;
   public final long field8032;
   public final long field8033;
   public final Class2381 field8034;
   public final boolean field8035;
   public final Class9330 field8036;

   public Class1491(Class9330 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8036 = var1;
      this.field8032 = var2;
      this.field8033 = var4;
      this.field8034 = var6;
      this.field8035 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class9330.method35282(this.field8036), false);

      for (long var4 = this.field8032; var4 < this.field8033; var4++) {
         for (long var6 = 0L; var6 < Class9330.method35282(this.field8036); var6++) {
            var3.method9687(var6, this.field8034.method9653(var6 * Class9330.method35281(this.field8036) + var4));
         }

         Class9330.method35280(this.field8036).method38577(var3, this.field8035);

         for (long var8 = 0L; var8 < Class9330.method35282(this.field8036); var8++) {
            this.field8034.method9687(var8 * Class9330.method35281(this.field8036) + var4, var3.method9653(var8));
         }
      }
   }
}
