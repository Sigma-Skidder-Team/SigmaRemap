package mapped;

public class Class154 implements ILootCondition {
   private static String[] field503;
   private final Boolean field504;
   private final Boolean field505;

   public Class154(Boolean var1, Boolean var2) {
      this.field504 = var1;
      this.field505 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38608;
   }

   public boolean test(LootContext var1) {
      ServerWorld var4 = var1.method26090();
      return this.field504 != null && this.field504 != var4.method6795() ? false : this.field505 == null || this.field505 == var4.method6794();
   }

   // $VF: synthetic method
   public static Boolean method465(Class154 var0) {
      return var0.field504;
   }

   // $VF: synthetic method
   public static Boolean method466(Class154 var0) {
      return var0.field505;
   }
}
