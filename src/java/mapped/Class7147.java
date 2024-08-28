package mapped;

public final class Class7147 extends Class7144 {
   private static String[] field30713;

   public Class7147(Class2146 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean method22291(int var1, int var2) {
      return true;
   }

   @Override
   public void method22289(Class880 var1, int var2) {
      if (var1 instanceof ServerPlayerEntity && !var1.method2800()) {
         ServerPlayerEntity var5 = (ServerPlayerEntity)var1;
         ServerWorld var6 = var5.getServerWorld();
         if (var6.method6997() == Class2197.field14351) {
            return;
         }

         if (var6.method6952(var1.method3432())) {
            var6.method6956().method24613(var5);
         }
      }
   }
}
