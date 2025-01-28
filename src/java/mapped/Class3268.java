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
      Blocks.ACTIVATOR_RAIL,
      Blocks.COAL_ORE,
      Blocks.COBBLESTONE,
      Blocks.DETECTOR_RAIL,
      Blocks.DIAMOND_BLOCK,
      Blocks.DIAMOND_ORE,
      new Block[]{
         Blocks.POWERED_RAIL,
         Blocks.GOLD_BLOCK,
         Blocks.GOLD_ORE,
         Blocks.NETHER_GOLD_ORE,
         Blocks.ICE,
         Blocks.IRON_BLOCK,
         Blocks.IRON_ORE,
         Blocks.LAPIS_BLOCK,
         Blocks.LAPIS_ORE,
         Blocks.MOSSY_COBBLESTONE,
         Blocks.NETHERRACK,
         Blocks.PACKED_ICE,
         Blocks.BLUE_ICE,
         Blocks.RAIL,
         Blocks.REDSTONE_ORE,
         Blocks.SANDSTONE,
         Blocks.CHISELED_SANDSTONE,
         Blocks.CUT_SANDSTONE,
         Blocks.CHISELED_RED_SANDSTONE,
         Blocks.CUT_RED_SANDSTONE,
         Blocks.RED_SANDSTONE,
         Blocks.STONE,
         Blocks.GRANITE,
         Blocks.POLISHED_GRANITE,
         Blocks.DIORITE,
         Blocks.POLISHED_DIORITE,
         Blocks.ANDESITE,
         Blocks.POLISHED_ANDESITE,
         Blocks.STONE_SLAB,
         Blocks.SMOOTH_STONE_SLAB,
         Blocks.SANDSTONE_SLAB,
         Blocks.PETRIFIED_OAK_SLAB,
         Blocks.COBBLESTONE_SLAB,
         Blocks.BRICK_SLAB,
         Blocks.STONE_BRICK_SLAB,
         Blocks.NETHER_BRICK_SLAB,
         Blocks.QUARTZ_SLAB,
         Blocks.RED_SANDSTONE_SLAB,
         Blocks.PURPUR_SLAB,
         Blocks.SMOOTH_QUARTZ,
         Blocks.SMOOTH_RED_SANDSTONE,
         Blocks.SMOOTH_SANDSTONE,
         Blocks.SMOOTH_STONE,
         Blocks.STONE_BUTTON,
         Blocks.STONE_PRESSURE_PLATE,
         Blocks.POLISHED_GRANITE_SLAB,
         Blocks.SMOOTH_RED_SANDSTONE_SLAB,
         Blocks.MOSSY_STONE_BRICK_SLAB,
         Blocks.POLISHED_DIORITE_SLAB,
         Blocks.MOSSY_COBBLESTONE_SLAB,
         Blocks.END_STONE_BRICK_SLAB,
         Blocks.SMOOTH_SANDSTONE_SLAB,
         Blocks.SMOOTH_QUARTZ_SLAB,
         Blocks.GRANITE_SLAB,
         Blocks.ANDESITE_SLAB,
         Blocks.RED_NETHER_BRICK_SLAB,
         Blocks.POLISHED_ANDESITE_SLAB,
         Blocks.DIORITE_SLAB,
         Blocks.SHULKER_BOX,
         Blocks.BLACK_SHULKER_BOX,
         Blocks.BLUE_SHULKER_BOX,
         Blocks.BROWN_SHULKER_BOX,
         Blocks.CYAN_SHULKER_BOX,
         Blocks.GRAY_SHULKER_BOX,
         Blocks.GREEN_SHULKER_BOX,
         Blocks.LIGHT_BLUE_SHULKER_BOX,
         Blocks.LIGHT_GRAY_SHULKER_BOX,
         Blocks.LIME_SHULKER_BOX,
         Blocks.MAGENTA_SHULKER_BOX,
         Blocks.ORANGE_SHULKER_BOX,
         Blocks.PINK_SHULKER_BOX,
         Blocks.PURPLE_SHULKER_BOX,
         Blocks.RED_SHULKER_BOX,
         Blocks.WHITE_SHULKER_BOX,
         Blocks.YELLOW_SHULKER_BOX,
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
      if (var1.isIn(Blocks.OBSIDIAN)
         || var1.isIn(Blocks.CRYING_OBSIDIAN)
         || var1.isIn(Blocks.NETHERITE_BLOCK)
         || var1.isIn(Blocks.RESPAWN_ANCHOR)
         || var1.isIn(Blocks.ANCIENT_DEBRIS)) {
         return var4 >= 3;
      } else if (var1.isIn(Blocks.DIAMOND_BLOCK)
         || var1.isIn(Blocks.DIAMOND_ORE)
         || var1.isIn(Blocks.EMERALD_ORE)
         || var1.isIn(Blocks.EMERALD_BLOCK)
         || var1.isIn(Blocks.GOLD_BLOCK)
         || var1.isIn(Blocks.GOLD_ORE)
         || var1.isIn(Blocks.REDSTONE_ORE)) {
         return var4 >= 2;
      } else if (!var1.isIn(Blocks.IRON_BLOCK)
         && !var1.isIn(Blocks.IRON_ORE)
         && !var1.isIn(Blocks.LAPIS_BLOCK)
         && !var1.isIn(Blocks.LAPIS_ORE)) {
         Material var5 = var1.getMaterial();
         return var5 == Material.ROCK || var5 == Material.field38967 || var5 == Material.ANVIL || var1.isIn(Blocks.NETHER_GOLD_ORE);
      } else {
         return var4 >= 1;
      }
   }

   @Override
   public float getDestroySpeed(ItemStack stack, BlockState state) {
      Material var5 = state.getMaterial();
      return var5 != Material.field38967 && var5 != Material.ANVIL && var5 != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
   }
}
