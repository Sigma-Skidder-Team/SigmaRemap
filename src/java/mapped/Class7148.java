package mapped;

public class Class7148 extends Effect {
   private static String[] field30714;
   public final double field30715;

   public Class7148(EffectType var1, int var2, double var3) {
      super(var1, var2);
      this.field30715 = var3;
   }

   @Override
   public double method22302(int var1, AttributeModifier var2) {
      return this.field30715 * (double)(var1 + 1);
   }
}
