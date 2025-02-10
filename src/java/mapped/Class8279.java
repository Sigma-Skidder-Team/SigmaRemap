package mapped;

public class Class8279 extends Class8280 {
   private static String[] field35573;
   private JavaFFT field35574;

   public Class8279() {
   }

   @Override
   public synchronized Class7897 method28941(int var1) {
      if (this.field35574 != null && JavaFFT.method26470(this.field35574) == var1) {
         return this.field35574;
      } else {
         this.field35574 = new JavaFFT(var1);
         return this.field35574;
      }
   }
}
