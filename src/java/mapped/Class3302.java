package mapped;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.world.World;

public class Class3302 extends BlockItem {
   private static String[] field18808;

   public Class3302(Block var1, Properties var2) {
      super(var1, var2);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      return ActionResultType.field14820;
   }

   @Override
   public ActionResult<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      BlockRayTraceResult var6 = method11735(var1, var2, RayTraceContext.FluidMode.SOURCE_ONLY);
      BlockRayTraceResult var7 = var6.method31422(var6.getPos().up());
      ActionResultType var8 = super.onItemUse(new ItemUseContext(var2, var3, var7));
      return new ActionResult<ItemStack>(var8, var2.getHeldItem(var3));
   }
}
