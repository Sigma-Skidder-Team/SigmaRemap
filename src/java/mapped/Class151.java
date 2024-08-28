package mapped;

public class Class151 implements ILootCondition {
   private static String[] field497;
   private final float field498;

   public Class151(float var1) {
      this.field498 = var1;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38597;
   }

   public boolean test(LootContext var1) {
      return var1.method26088().nextFloat() < this.field498;
   }

   public static Class7519 method456(float var0) {
      return () -> new Class151(var0);
   }

   // $VF: synthetic method
   public static float method458(Class151 var0) {
      return var0.field498;
   }
}
