package mapped;

public class Class3240 extends Class3241 implements Class3235 {
   private static String[] field18691;

   public Class3240(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class112 method11637() {
      return Class112.field386;
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class950();
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      if (!var2.field9020) {
         Class944 var9 = var2.method6759(var3);
         if (var9 instanceof Class950) {
            var4.method2766((Class950)var9);
            var4.method2911(Class8876.field40148);
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public void method11563(World var1, BlockPos var2, Class7380 var3, Class880 var4, ItemStack var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class950) {
            ((Class950)var8).method3826(var5.method32149());
         }
      }
   }
}
