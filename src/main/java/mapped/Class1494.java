package mapped;

public class Class1494 implements Runnable {
   private static String[] field8052;
   public final long field8053;
   public final long field8054;
   public final Class2378 field8055;
   public final boolean field8056;
   public final Class7821 field8057;

   public Class1494(Class7821 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field8057 = var1;
      this.field8053 = var2;
      this.field8054 = var4;
      this.field8055 = var6;
      this.field8056 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7821.method26154(this.field8057), false);

      for (long var4 = this.field8053; var4 < this.field8054; var4++) {
         for (long var6 = 0L; var6 < Class7821.method26154(this.field8057); var6++) {
            var3.method9685(var6, this.field8055.method9651(var6 * Class7821.method26153(this.field8057) + var4));
         }

         Class7821.method26152(this.field8057).method28460(var3, this.field8056);

         for (long var8 = 0L; var8 < Class7821.method26154(this.field8057); var8++) {
            this.field8055.method9685(var8 * Class7821.method26153(this.field8057) + var4, var3.method9651(var8));
         }
      }
   }
}
