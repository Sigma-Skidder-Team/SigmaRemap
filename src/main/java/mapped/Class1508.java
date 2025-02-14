package mapped;

public class Class1508 implements Runnable {
   private static String[] field8148;
   public final long field8149;
   public final long field8150;
   public final long field8151;
   public final long field8152;
   public final Class2378 field8153;
   public final Class8026 field8154;

   public Class1508(Class8026 var1, long var2, long var4, long var6, long var8, Class2378 var10) {
      this.field8154 = var1;
      this.field8149 = var2;
      this.field8150 = var4;
      this.field8151 = var6;
      this.field8152 = var8;
      this.field8153 = var10;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27521(this.field8154), false);

      for (long var4 = this.field8149; var4 < this.field8150; var4++) {
         long var6 = var4 * this.field8151;

         for (long var8 = 0L; var8 < Class8026.method27523(this.field8154); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27521(this.field8154); var12++) {
               long var14 = var6 + var12 * this.field8152 + var10;
               long var16 = 2L * var12;
               var3.method9685(var16, this.field8153.method9651(var14));
               var3.method9685(var16 + 1L, this.field8153.method9651(var14 + 1L));
            }

            Class8026.method27517(this.field8154).method30930(var3);

            for (long var18 = 0L; var18 < Class8026.method27521(this.field8154); var18++) {
               long var19 = var6 + var18 * this.field8152 + var10;
               long var20 = 2L * var18;
               this.field8153.method9685(var19, var3.method9651(var20));
               this.field8153.method9685(var19 + 1L, var3.method9651(var20 + 1L));
            }
         }
      }
   }
}
