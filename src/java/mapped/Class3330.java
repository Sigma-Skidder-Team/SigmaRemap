package mapped;

import net.minecraft.util.ActionResultType;

public class Class3330 extends Item {
   private static String[] field18838;

   public Class3330(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, Class880 var3, Hand var4) {
      if (var3 instanceof Class1069 && var3.isAlive()) {
         Class1069 var7 = (Class1069)var3;
         if (!var7.method4943() && var7.method4901()) {
            if (!var2.world.isRemote) {
               var7.method4942(Class2266.field14734);
               var1.method32182(1);
            }

            return ActionResultType.method9002(var2.world.isRemote);
         }
      }

      return ActionResultType.field14820;
   }
}
