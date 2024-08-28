package mapped;

public class Class1572 implements Runnable {
   private static String[] field8504;
   public final long field8505;
   public final long field8506;
   public final Class2378 field8507;
   public final boolean field8508;
   public final Class8682 field8509;

   public Class1572(Class8682 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field8509 = var1;
      this.field8505 = var2;
      this.field8506 = var4;
      this.field8507 = var6;
      this.field8508 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class8682.method31250(this.field8509), false);

      for (long var4 = this.field8505; var4 < this.field8506; var4++) {
         for (long var6 = 0L; var6 < Class8682.method31250(this.field8509); var6++) {
            var3.method9685(var6, this.field8507.method9651(var6 * Class8682.method31249(this.field8509) + var4));
         }

         Class8682.method31248(this.field8509).method28929(var3, this.field8508);

         for (long var8 = 0L; var8 < Class8682.method31250(this.field8509); var8++) {
            this.field8507.method9685(var8 * Class8682.method31249(this.field8509) + var4, var3.method9651(var8));
         }
      }
   }
}
