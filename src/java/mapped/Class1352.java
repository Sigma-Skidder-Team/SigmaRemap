package mapped;

public class Class1352 implements Runnable {
   private static String[] field7205;
   public final long field7206;
   public final long field7207;
   public final long field7208;
   public final long field7209;
   public final Class2378 field7210;
   public final Class8026 field7211;

   public Class1352(Class8026 var1, long var2, long var4, long var6, long var8, Class2378 var10) {
      this.field7211 = var1;
      this.field7206 = var2;
      this.field7207 = var4;
      this.field7208 = var6;
      this.field7209 = var8;
      this.field7210 = var10;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27524(this.field7211), false);

      for (long var4 = this.field7206; var4 < this.field7207; var4++) {
         long var6 = var4 * this.field7208;

         for (long var8 = 0L; var8 < Class8026.method27523(this.field7211); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27524(this.field7211); var12++) {
               long var14 = 2L * var12;
               long var16 = var12 * this.field7209 + var6 + var10;
               var3.method9685(var14, this.field7210.method9651(var16));
               var3.method9685(var14 + 1L, this.field7210.method9651(var16 + 1L));
            }

            Class8026.method27519(this.field7211).method30930(var3);

            for (long var18 = 0L; var18 < Class8026.method27524(this.field7211); var18++) {
               long var19 = 2L * var18;
               long var20 = var18 * this.field7209 + var6 + var10;
               this.field7210.method9685(var20, var3.method9651(var19));
               this.field7210.method9685(var20 + 1L, var3.method9651(var19 + 1L));
            }
         }
      }
   }
}
