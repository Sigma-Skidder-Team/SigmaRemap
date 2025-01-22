package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;

import java.util.Set;

public class Class3268 extends ToolItem {
   private static String[] field18763;
   private static final Set<Block> field18764 = ImmutableSet.of(
      Blocks.field36728,
      Blocks.field36420,
      Blocks.COBBLESTONE,
      Blocks.DETECTOR_RAIL,
      Blocks.field36537,
      Blocks.field36536,
      new Block[]{
         Blocks.POWERED_RAIL,
         Blocks.field36521,
         Blocks.field36418,
         Blocks.field36421,
         Blocks.ICE,
         Blocks.field36522,
         Blocks.field36419,
         Blocks.field36456,
         Blocks.field36455,
         Blocks.field36526,
         Blocks.NETHERRACK,
         Blocks.PACKED_ICE,
         Blocks.field37006,
         Blocks.RAIL,
         Blocks.REDSTONE_ORE,
         Blocks.SANDSTONE,
         Blocks.CHISELED_SANDSTONE,
         Blocks.CUT_SANDSTONE,
         Blocks.field36836,
         Blocks.field36837,
         Blocks.field36835,
         Blocks.STONE,
         Blocks.GRANITE,
         Blocks.POLISHED_GRANITE,
         Blocks.DIORITE,
         Blocks.POLISHED_DIORITE,
         Blocks.ANDESITE,
         Blocks.POLISHED_ANDESITE,
         Blocks.field36845,
         Blocks.field36846,
         Blocks.field36847,
         Blocks.field36849,
         Blocks.field36850,
         Blocks.field36851,
         Blocks.field36852,
         Blocks.field36853,
         Blocks.field36854,
         Blocks.field36855,
         Blocks.field36857,
         Blocks.field36860,
         Blocks.field36861,
         Blocks.field36859,
         Blocks.field36858,
         Blocks.STONE_BUTTON,
         Blocks.field36559,
         Blocks.field37028,
         Blocks.field37029,
         Blocks.field37030,
         Blocks.field37031,
         Blocks.field37032,
         Blocks.field37033,
         Blocks.field37034,
         Blocks.field37035,
         Blocks.field37036,
         Blocks.field37037,
         Blocks.field37038,
         Blocks.field37039,
         Blocks.field37040,
         Blocks.field36896,
         Blocks.field36912,
         Blocks.field36908,
         Blocks.field36909,
         Blocks.field36906,
         Blocks.field36904,
         Blocks.field36910,
         Blocks.field36900,
         Blocks.field36905,
         Blocks.field36902,
         Blocks.field36899,
         Blocks.field36898,
         Blocks.field36903,
         Blocks.field36907,
         Blocks.field36911,
         Blocks.field36897,
         Blocks.field36901,
         Blocks.PISTON,
         Blocks.STICKY_PISTON,
         Blocks.PISTON_HEAD
      }
   );

   public Class3268(IItemTier var1, int var2, float var3, Properties var4) {
      super((float)var2, var3, var1, field18764, var4);
   }

   @Override
   public boolean canHarvestBlock(BlockState var1) {
      int var4 = this.method11783().method9013();
      if (var1.isIn(Blocks.field36527)
         || var1.isIn(Blocks.CRYING_OBSIDIAN)
         || var1.isIn(Blocks.NETHERITE_BLOCK)
         || var1.isIn(Blocks.RESPAWN_ANCHOR)
         || var1.isIn(Blocks.ANCIENT_DEBRIS)) {
         return var4 >= 3;
      } else if (var1.isIn(Blocks.field36537)
         || var1.isIn(Blocks.field36536)
         || var1.isIn(Blocks.EMERALD_ORE)
         || var1.isIn(Blocks.EMERALD_BLOCK)
         || var1.isIn(Blocks.field36521)
         || var1.isIn(Blocks.field36418)
         || var1.isIn(Blocks.REDSTONE_ORE)) {
         return var4 >= 2;
      } else if (!var1.isIn(Blocks.field36522)
         && !var1.isIn(Blocks.field36419)
         && !var1.isIn(Blocks.field36456)
         && !var1.isIn(Blocks.field36455)) {
         Material var5 = var1.getMaterial();
         return var5 == Material.STONE || var5 == Material.field38967 || var5 == Material.ANVIL || var1.isIn(Blocks.field36421);
      } else {
         return var4 >= 1;
      }
   }

   @Override
   public float getDestroySpeed(ItemStack stack, BlockState state) {
      Material var5 = state.getMaterial();
      return var5 != Material.field38967 && var5 != Material.ANVIL && var5 != Material.STONE ? super.getDestroySpeed(stack, state) : this.efficiency;
   }
}
