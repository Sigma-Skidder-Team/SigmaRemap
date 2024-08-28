package mapped;

public class Class1366 implements Runnable {
   private static String[] field7294;
   public final long field7295;
   public final long field7296;
   public final Class2378 field7297;
   public final Class7821 field7298;

   public Class1366(Class7821 var1, long var2, long var4, Class2378 var6) {
      this.field7298 = var1;
      this.field7295 = var2;
      this.field7296 = var4;
      this.field7297 = var6;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7821.method26154(this.field7298), false);

      for (long var4 = this.field7295; var4 < this.field7296; var4++) {
         for (long var6 = 0L; var6 < Class7821.method26154(this.field7298); var6++) {
            var3.method9685(var6, this.field7297.method9651(var6 * Class7821.method26153(this.field7298) + var4));
         }

         Class7821.method26152(this.field7298).method28456(var3);

         for (long var8 = 0L; var8 < Class7821.method26154(this.field7298); var8++) {
            this.field7297.method9685(var8 * Class7821.method26153(this.field7298) + var4, var3.method9651(var8));
         }
      }
   }
}
