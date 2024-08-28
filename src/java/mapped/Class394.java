package mapped;

public class Class394 implements Runnable {
   private static String[] field1677;
   public final long field1678;
   public final long field1679;
   public final Class2378 field1680;
   public final boolean field1681;
   public final Class8682 field1682;

   public Class394(Class8682 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field1682 = var1;
      this.field1678 = var2;
      this.field1679 = var4;
      this.field1680 = var6;
      this.field1681 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class8682.method31250(this.field1682), false);

      for (long var4 = this.field1678; var4 < this.field1679; var4++) {
         for (long var6 = 0L; var6 < Class8682.method31250(this.field1682); var6++) {
            var3.method9685(var6, this.field1680.method9651(var6 * Class8682.method31249(this.field1682) + var4));
         }

         Class8682.method31248(this.field1682).method28925(var3, this.field1681);

         for (long var8 = 0L; var8 < Class8682.method31250(this.field1682); var8++) {
            this.field1680.method9685(var8 * Class8682.method31249(this.field1682) + var4, var3.method9651(var8));
         }
      }
   }
}
