package mapped;

import net.minecraft.util.ActionResultType;

public class Class3302 extends Class3292 {
   private static String[] field18808;

   public Class3302(Block var1, Class5643 var2) {
      super(var1, var2);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      return ActionResultType.field14820;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      BlockRayTraceResult var6 = method11735(var1, var2, Class1985.field12963);
      BlockRayTraceResult var7 = var6.method31422(var6.getPos().up());
      ActionResultType var8 = super.method11707(new Class5911(var2, var3, var7));
      return new Class6794<ItemStack>(var8, var2.getHeldItem(var3));
   }
}
