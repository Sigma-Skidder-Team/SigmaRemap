package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3331 extends Item {
   private static String[] field18839;

   public Class3331(Properties var1) {
      super(var1);
   }

   @Override
   public boolean onBlockDestroyed(ItemStack var1, World var2, BlockState var3, BlockPos var4, LivingEntity var5) {
      if (!var2.isRemote && !var3.getBlock().isIn(BlockTags.field32798)) {
         var1.damageItem(1, var5, var0 -> var0.sendBreakAnimation(EquipmentSlotType.MAINHAND));
      }

      return !var3.isIn(BlockTags.LEAVES)
            && !var3.isIn(Blocks.COBWEB)
            && !var3.isIn(Blocks.GRASS)
            && !var3.isIn(Blocks.FERN)
            && !var3.isIn(Blocks.DEAD_BUSH)
            && !var3.isIn(Blocks.VINE)
            && !var3.isIn(Blocks.TRIPWIRE)
            && !var3.isIn(BlockTags.field32734)
         ? super.onBlockDestroyed(var1, var2, var3, var4, var5)
         : true;
   }

   @Override
   public boolean canHarvestBlock(BlockState var1) {
      return var1.isIn(Blocks.COBWEB) || var1.isIn(Blocks.REDSTONE_WIRE) || var1.isIn(Blocks.TRIPWIRE);
   }

   @Override
   public float getDestroySpeed(ItemStack var1, BlockState var2) {
      if (!var2.isIn(Blocks.COBWEB) && !var2.isIn(BlockTags.LEAVES)) {
         return !var2.isIn(BlockTags.field32734) ? super.getDestroySpeed(var1, var2) : 5.0F;
      } else {
         return 15.0F;
      }
   }
}
