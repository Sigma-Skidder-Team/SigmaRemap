package remapped;

public class RenderTickCounter {
   private static String[] field_32598;
   public float field_32600;
   public float field_32599;
   private long field_32602;
   private final float field_32601;
   public float field_32603 = 1.0F;

   public RenderTickCounter(float var1, long var2) {
      this.field_32601 = 1000.0F / var1;
      this.field_32602 = var2;
   }

   public int method_29172(long var1) {
      this.field_32599 = (float)(var1 - this.field_32602) / this.field_32601 * this.field_32603;
      this.field_32602 = var1;
      this.field_32600 = this.field_32600 + this.field_32599;
      int var5 = (int)this.field_32600;
      this.field_32600 -= (float)var5;
      return var5;
   }
}
