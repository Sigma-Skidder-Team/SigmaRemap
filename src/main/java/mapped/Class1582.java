package mapped;

public class Class1582 implements Runnable {
   private static String[] field8566;
   public final long field8567;
   public final long field8568;
   public final Class2378 field8569;
   public final Class8162 field8570;

   public Class1582(Class8162 var1, long var2, long var4, Class2378 var6) {
      this.field8570 = var1;
      this.field8567 = var2;
      this.field8568 = var4;
      this.field8569 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field8567; var3 < this.field8568; var3++) {
         long var5 = var3 * (long)Class8162.method28392(this.field8570);

         for (long var7 = 0L; var7 < Class8162.method28400(this.field8570); var7++) {
            Class8162.method28395(this.field8570).method28458(this.field8569, var5 + var7 * (long)Class8162.method28394(this.field8570));
         }
      }
   }
}
