package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3331 extends Item {
   private static String[] field18839;

   public Class3331(Class5643 var1) {
      super(var1);
   }

   @Override
   public boolean method11714(ItemStack var1, World var2, BlockState var3, BlockPos var4, LivingEntity var5) {
      if (!var2.isRemote && !var3.getBlock().isIn(BlockTags.field32798)) {
         var1.method32121(1, var5, var0 -> var0.sendBreakAnimation(EquipmentSlotType.field13731));
      }

      return !var3.method23446(BlockTags.field32767)
            && !var3.isIn(Blocks.COBWEB)
            && !var3.isIn(Blocks.GRASS)
            && !var3.isIn(Blocks.FERN)
            && !var3.isIn(Blocks.DEAD_BUSH)
            && !var3.isIn(Blocks.VINE)
            && !var3.isIn(Blocks.TRIPWIRE)
            && !var3.method23446(BlockTags.field32734)
         ? super.method11714(var1, var2, var3, var4, var5)
         : true;
   }

   @Override
   public boolean method11715(BlockState var1) {
      return var1.isIn(Blocks.COBWEB) || var1.isIn(Blocks.REDSTONE_WIRE) || var1.isIn(Blocks.TRIPWIRE);
   }

   @Override
   public float method11708(ItemStack var1, BlockState var2) {
      if (!var2.isIn(Blocks.COBWEB) && !var2.method23446(BlockTags.field32767)) {
         return !var2.method23446(BlockTags.field32734) ? super.method11708(var1, var2) : 5.0F;
      } else {
         return 15.0F;
      }
   }
}
