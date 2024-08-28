package mapped;

public class Class8917 {
   private static String[] field40355;
   public float field40356;
   public float field40357;
   private long field40358;
   private final float field40359;
   public float field40360 = 1.0F;

   public Class8917(float var1, long var2) {
      this.field40359 = 1000.0F / var1;
      this.field40358 = var2;
   }

   public int method32590(long var1) {
      this.field40357 = (float)(var1 - this.field40358) / this.field40359 * this.field40360;
      this.field40358 = var1;
      this.field40356 = this.field40356 + this.field40357;
      int var5 = (int)this.field40356;
      this.field40356 -= (float)var5;
      return var5;
   }
}
