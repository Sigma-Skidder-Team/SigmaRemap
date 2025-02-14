package mapped;

public class Class636 implements Runnable {
   private static String[] field3174;
   public final long field3175;
   public final long field3176;
   public final long field3177;
   public final Class2378 field3178;
   public final long field3179;
   public final Class2378 field3180;
   public final long field3181;
   public final Class8026 field3182;

   public Class636(Class8026 var1, long var2, long var4, long var6, Class2378 var8, long var9, Class2378 var11, long var12) {
      this.field3182 = var1;
      this.field3175 = var2;
      this.field3176 = var4;
      this.field3177 = var6;
      this.field3178 = var8;
      this.field3179 = var9;
      this.field3180 = var11;
      this.field3181 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field3175; var3 < this.field3176; var3++) {
         long var5 = var3 * this.field3177;

         for (long var7 = 0L; var7 < Class8026.method27521(this.field3182); var7++) {
            Class8133.method28175(
               this.field3178,
               var3 * Class8026.method27521(this.field3182) * this.field3179 + var7 * this.field3179,
               this.field3180,
               var5 + var7 * this.field3181,
               this.field3179
            );
         }
      }
   }
}
