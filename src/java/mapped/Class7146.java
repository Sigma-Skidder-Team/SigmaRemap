package mapped;

public class Class7146 extends Effect {
   private static String[] field30712;

   public Class7146(EffectType var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean isInstant() {
      return true;
   }

   @Override
   public boolean isReady(int var1, int var2) {
      return var1 >= 1;
   }
}
