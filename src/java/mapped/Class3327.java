package mapped;

import net.minecraft.util.ActionResultType;

public class Class3327 extends Item {
   private static String[] field18835;

   public Class3327(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, Class880 var3, Hand var4) {
      if (var1.method32152() && !(var3 instanceof PlayerEntity)) {
         if (!var2.world.isRemote && var3.isAlive()) {
            var3.method3379(var1.method32149());
            if (var3 instanceof Class1006) {
               ((Class1006)var3).method4278();
            }

            var1.method32182(1);
         }

         return ActionResultType.method9002(var2.world.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }
}
