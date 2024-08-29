package mapped;

public class Class3259 extends Item implements Class3260 {
   private static String[] field18745;

   public Class3259(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (var2.field4930 == null) {
         var1.method6743(
            (PlayerEntity)null,
            var2.getPosX(),
            var2.getPosY(),
            var2.getPosZ(),
            Sounds.field26586,
            Class2266.field14734,
            0.5F,
            0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
         );
         if (!var1.field9020) {
            int var7 = Class7858.method26329(var6);
            int var8 = Class7858.method26328(var6);
            var1.method6916(new Class904(var2, var1, var8, var7));
         }

         var2.method2913(Class8876.field40098.method172(this));
      } else {
         if (!var1.field9020) {
            int var9 = var2.field4930.method3542(var6);
            var6.method32121(var9, var2, var1x -> var1x.method3185(var3));
         }

         var1.method6743(
            (PlayerEntity)null,
            var2.getPosX(),
            var2.getPosY(),
            var2.getPosZ(),
            Sounds.field26584,
            Class2266.field14734,
            1.0F,
            0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
         );
      }

      return Class6794.<ItemStack>method20700(var6, var1.method6714());
   }

   @Override
   public int method11736() {
      return 1;
   }
}
