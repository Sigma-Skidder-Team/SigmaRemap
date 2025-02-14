package mapped;

public class Class736 implements Runnable {
   private static String[] field3811;
   public final long field3812;
   public final long field3813;
   public final long field3814;
   public final Class2381 field3815;
   public final long field3816;
   public final Class2381 field3817;
   public final long field3818;
   public final Class7274 field3819;

   public Class736(Class7274 var1, long var2, long var4, long var6, Class2381 var8, long var9, Class2381 var11, long var12) {
      this.field3819 = var1;
      this.field3812 = var2;
      this.field3813 = var4;
      this.field3814 = var6;
      this.field3815 = var8;
      this.field3816 = var9;
      this.field3817 = var11;
      this.field3818 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field3812; var3 < this.field3813; var3++) {
         long var5 = var3 * this.field3814;

         for (long var7 = 0L; var7 < Class7274.method22903(this.field3819); var7++) {
            Class8133.method28177(
               this.field3815,
               var3 * Class7274.method22903(this.field3819) * this.field3816 + var7 * this.field3816,
               this.field3817,
               var5 + var7 * this.field3818,
               this.field3816
            );
         }
      }
   }
}
