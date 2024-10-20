package mapped;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;

import java.util.Map;

public class Class8928 {
   private static String[] field40406;
   private static final Map<Block, RenderType> field40407 = Util.<Map<Block, RenderType>>make(Maps.newHashMap(), var0 -> {
      RenderType var3 = RenderType.method14343();
      var0.put(Blocks.TRIPWIRE, var3);
      RenderType var4 = RenderType.method14301();
      var0.put(Blocks.GRASS_BLOCK, var4);
      var0.put(Blocks.IRON_BARS, var4);
      var0.put(Blocks.GLASS_PANE, var4);
      var0.put(Blocks.TRIPWIRE_HOOK, var4);
      var0.put(Blocks.HOPPER, var4);
      var0.put(Blocks.CHAIN, var4);
      var0.put(Blocks.field36449, var4);
      var0.put(Blocks.field36446, var4);
      var0.put(Blocks.field36447, var4);
      var0.put(Blocks.field36450, var4);
      var0.put(Blocks.field36448, var4);
      var0.put(Blocks.field36451, var4);
      RenderType var5 = RenderType.method14302();
      var0.put(Blocks.field36406, var5);
      var0.put(Blocks.SPRUCE_SAPLING, var5);
      var0.put(Blocks.BIRCH_SAPLING, var5);
      var0.put(Blocks.JUNGLE_SAPLING, var5);
      var0.put(Blocks.ACACIA_SAPLING, var5);
      var0.put(Blocks.DARK_OAK_SAPLING, var5);
      var0.put(Blocks.field36454, var5);
      var0.put(Blocks.WHITE_BED, var5);
      var0.put(Blocks.ORANGE_BED, var5);
      var0.put(Blocks.MAGENTA_BED, var5);
      var0.put(Blocks.LIGHT_BLUE_BED, var5);
      var0.put(Blocks.YELLOW_BED, var5);
      var0.put(Blocks.LIME_BED, var5);
      var0.put(Blocks.PINK_BED, var5);
      var0.put(Blocks.GRAY_BED, var5);
      var0.put(Blocks.LIGHT_GRAY_BED, var5);
      var0.put(Blocks.CYAN_BED, var5);
      var0.put(Blocks.PURPLE_BED, var5);
      var0.put(Blocks.BLUE_BED, var5);
      var0.put(Blocks.BROWN_RED, var5);
      var0.put(Blocks.GREEN_BED, var5);
      var0.put(Blocks.RED_BED, var5);
      var0.put(Blocks.BLACK_BED, var5);
      var0.put(Blocks.POWERED_RAIL, var5);
      var0.put(Blocks.DETECTOR_RAIL, var5);
      var0.put(Blocks.COBWEB, var5);
      var0.put(Blocks.GRASS, var5);
      var0.put(Blocks.FERN, var5);
      var0.put(Blocks.DEAD_BUSH, var5);
      var0.put(Blocks.SEAGRASS, var5);
      var0.put(Blocks.TALL_SEAGRASS, var5);
      var0.put(Blocks.DANDELION, var5);
      var0.put(Blocks.POPPY, var5);
      var0.put(Blocks.BLUE_ORCHID, var5);
      var0.put(Blocks.ALLIUM, var5);
      var0.put(Blocks.AZURE_BLUET, var5);
      var0.put(Blocks.RED_TULIP, var5);
      var0.put(Blocks.ORANGE_TULIP, var5);
      var0.put(Blocks.WHITE_TULIP, var5);
      var0.put(Blocks.PINK_TULIP, var5);
      var0.put(Blocks.OXEYE_DAISY, var5);
      var0.put(Blocks.CORNFLOWER, var5);
      var0.put(Blocks.WITHER_ROSE, var5);
      var0.put(Blocks.LILY_OF_THE_VALLEY, var5);
      var0.put(Blocks.BROWN_MUSHROOM, var5);
      var0.put(Blocks.RED_MUSHROOM, var5);
      var0.put(Blocks.TORCH, var5);
      var0.put(Blocks.WALL_TORCH, var5);
      var0.put(Blocks.field36585, var5);
      var0.put(Blocks.field36586, var5);
      var0.put(Blocks.FIRE, var5);
      var0.put(Blocks.field36531, var5);
      var0.put(Blocks.field36532, var5);
      var0.put(Blocks.REDSTONE_WIRE, var5);
      var0.put(Blocks.field36539, var5);
      var0.put(Blocks.OAK_DOOR, var5);
      var0.put(Blocks.LADDER, var5);
      var0.put(Blocks.RAIL, var5);
      var0.put(Blocks.IRON_DOOR, var5);
      var0.put(Blocks.field36568, var5);
      var0.put(Blocks.field36569, var5);
      var0.put(Blocks.CACTUS, var5);
      var0.put(Blocks.SUGAR_CANE, var5);
      var0.put(Blocks.REPEATER, var5);
      var0.put(Blocks.field36609, var5);
      var0.put(Blocks.field36610, var5);
      var0.put(Blocks.field36611, var5);
      var0.put(Blocks.field36612, var5);
      var0.put(Blocks.ACACIA_TRAPDOOR, var5);
      var0.put(Blocks.field36614, var5);
      var0.put(Blocks.field37099, var5);
      var0.put(Blocks.field37100, var5);
      var0.put(Blocks.ATTACHED_PUMPKIN_STEM, var5);
      var0.put(Blocks.ATTACHED_MELON_STEM, var5);
      var0.put(Blocks.PUMPKIN_STEM, var5);
      var0.put(Blocks.MELON_STEM, var5);
      var0.put(Blocks.VINE, var5);
      var0.put(Blocks.LILY_PAD, var5);
      var0.put(Blocks.NETHER_WART, var5);
      var0.put(Blocks.field36647, var5);
      var0.put(Blocks.COCOA, var5);
      var0.put(Blocks.BEACON, var5);
      var0.put(Blocks.FLOWER_POT, var5);
      var0.put(Blocks.POTTED_OAK_SAPLING, var5);
      var0.put(Blocks.POTTED_SPRUCE_SAPLING, var5);
      var0.put(Blocks.POTTED_BIRCH_SAPLING, var5);
      var0.put(Blocks.POTTED_JUNGLE_SAPLING, var5);
      var0.put(Blocks.field36673, var5);
      var0.put(Blocks.POTTED_DARK_OAK_SAPLING, var5);
      var0.put(Blocks.field36675, var5);
      var0.put(Blocks.field36676, var5);
      var0.put(Blocks.field36677, var5);
      var0.put(Blocks.field36678, var5);
      var0.put(Blocks.field36679, var5);
      var0.put(Blocks.field36680, var5);
      var0.put(Blocks.field36681, var5);
      var0.put(Blocks.field36682, var5);
      var0.put(Blocks.field36683, var5);
      var0.put(Blocks.field36684, var5);
      var0.put(Blocks.field36685, var5);
      var0.put(Blocks.field36686, var5);
      var0.put(Blocks.field36687, var5);
      var0.put(Blocks.field36688, var5);
      var0.put(Blocks.field36689, var5);
      var0.put(Blocks.field36690, var5);
      var0.put(Blocks.field36691, var5);
      var0.put(Blocks.field36692, var5);
      var0.put(Blocks.field36693, var5);
      var0.put(Blocks.field36694, var5);
      var0.put(Blocks.COMPARATOR, var5);
      var0.put(Blocks.field36728, var5);
      var0.put(Blocks.field36766, var5);
      var0.put(Blocks.SUNFLOWER, var5);
      var0.put(Blocks.LILAC, var5);
      var0.put(Blocks.ROSE_BUSH, var5);
      var0.put(Blocks.field36800, var5);
      var0.put(Blocks.TALL_GRASS, var5);
      var0.put(Blocks.field36802, var5);
      var0.put(Blocks.field36872, var5);
      var0.put(Blocks.field36873, var5);
      var0.put(Blocks.field36874, var5);
      var0.put(Blocks.field36875, var5);
      var0.put(Blocks.field36876, var5);
      var0.put(Blocks.field36877, var5);
      var0.put(Blocks.field36878, var5);
      var0.put(Blocks.field36879, var5);
      var0.put(Blocks.field36884, var5);
      var0.put(Blocks.field36961, var5);
      var0.put(Blocks.field36962, var5);
      var0.put(Blocks.field36964, var5);
      var0.put(Blocks.field36975, var5);
      var0.put(Blocks.field36976, var5);
      var0.put(Blocks.field36977, var5);
      var0.put(Blocks.field36978, var5);
      var0.put(Blocks.field36979, var5);
      var0.put(Blocks.field36980, var5);
      var0.put(Blocks.field36981, var5);
      var0.put(Blocks.field36982, var5);
      var0.put(Blocks.field36983, var5);
      var0.put(Blocks.field36984, var5);
      var0.put(Blocks.field36985, var5);
      var0.put(Blocks.field36986, var5);
      var0.put(Blocks.field36987, var5);
      var0.put(Blocks.field36988, var5);
      var0.put(Blocks.field36989, var5);
      var0.put(Blocks.field36990, var5);
      var0.put(Blocks.field36991, var5);
      var0.put(Blocks.field36992, var5);
      var0.put(Blocks.field36993, var5);
      var0.put(Blocks.field36994, var5);
      var0.put(Blocks.field36995, var5);
      var0.put(Blocks.field36996, var5);
      var0.put(Blocks.field36997, var5);
      var0.put(Blocks.field36998, var5);
      var0.put(Blocks.field36999, var5);
      var0.put(Blocks.field37000, var5);
      var0.put(Blocks.field37001, var5);
      var0.put(Blocks.field37002, var5);
      var0.put(Blocks.field37003, var5);
      var0.put(Blocks.field37004, var5);
      var0.put(Blocks.field37005, var5);
      var0.put(Blocks.field37007, var5);
      var0.put(Blocks.field37008, var5);
      var0.put(Blocks.field37009, var5);
      var0.put(Blocks.field37010, var5);
      var0.put(Blocks.field37053, var5);
      var0.put(Blocks.STONECUTTER, var5);
      var0.put(Blocks.LANTERN, var5);
      var0.put(Blocks.SOUL_LANTERN, var5);
      var0.put(Blocks.field37067, var5);
      var0.put(Blocks.field37068, var5);
      var0.put(Blocks.field37069, var5);
      var0.put(Blocks.field37086, var5);
      var0.put(Blocks.field37087, var5);
      var0.put(Blocks.field37088, var5);
      var0.put(Blocks.field37089, var5);
      var0.put(Blocks.field37078, var5);
      var0.put(Blocks.field37084, var5);
      var0.put(Blocks.field37075, var5);
      var0.put(Blocks.field37090, var5);
      var0.put(Blocks.field37077, var5);
      var0.put(Blocks.field37125, var5);
      var0.put(Blocks.field37126, var5);
      var0.put(Blocks.field37127, var5);
      var0.put(Blocks.field37128, var5);
      var0.put(Blocks.field37107, var5);
      var0.put(Blocks.field37108, var5);
      RenderType var6 = RenderType.method14304();
      var0.put(Blocks.ICE, var6);
      var0.put(Blocks.field36588, var6);
      var0.put(Blocks.field36593, var6);
      var0.put(Blocks.field36594, var6);
      var0.put(Blocks.field36595, var6);
      var0.put(Blocks.field36596, var6);
      var0.put(Blocks.field36597, var6);
      var0.put(Blocks.field36598, var6);
      var0.put(Blocks.field36599, var6);
      var0.put(Blocks.field36600, var6);
      var0.put(Blocks.field36601, var6);
      var0.put(Blocks.field36602, var6);
      var0.put(Blocks.field36603, var6);
      var0.put(Blocks.field36604, var6);
      var0.put(Blocks.field36605, var6);
      var0.put(Blocks.field36606, var6);
      var0.put(Blocks.field36607, var6);
      var0.put(Blocks.field36608, var6);
      var0.put(Blocks.field36746, var6);
      var0.put(Blocks.field36747, var6);
      var0.put(Blocks.field36748, var6);
      var0.put(Blocks.field36749, var6);
      var0.put(Blocks.field36750, var6);
      var0.put(Blocks.field36751, var6);
      var0.put(Blocks.field36752, var6);
      var0.put(Blocks.field36753, var6);
      var0.put(Blocks.field36754, var6);
      var0.put(Blocks.field36755, var6);
      var0.put(Blocks.field36756, var6);
      var0.put(Blocks.field36757, var6);
      var0.put(Blocks.field36758, var6);
      var0.put(Blocks.field36759, var6);
      var0.put(Blocks.field36760, var6);
      var0.put(Blocks.field36761, var6);
      var0.put(Blocks.field36764, var6);
      var0.put(Blocks.field37119, var6);
      var0.put(Blocks.field36889, var6);
      var0.put(Blocks.field37013, var6);
   });
   private static final Map<Fluid, RenderType> field40408 = Util.<Map<Fluid, RenderType>>make(Maps.newHashMap(), var0 -> {
      RenderType var3 = RenderType.method14304();
      var0.put(Fluids.FLOWING_WATER, var3);
      var0.put(Fluids.WATER, var3);
   });
   private static boolean field40409;

   public static RenderType method32630(BlockState var0) {
      Block var3 = var0.getBlock();
      if (!(var3 instanceof Class3465)) {
         RenderType var4 = field40407.get(var3);
         return var4 == null ? RenderType.method14300() : var4;
      } else {
         return !field40409 ? RenderType.method14300() : RenderType.method14301();
      }
   }

   public static RenderType method32631(BlockState var0) {
      Block var3 = var0.getBlock();
      if (!(var3 instanceof Class3465)) {
         RenderType var4 = field40407.get(var3);
         if (var4 == null) {
            return RenderType.method14300();
         } else {
            return var4 != RenderType.method14304() ? var4 : RenderType.method14306();
         }
      } else {
         return !field40409 ? RenderType.method14300() : RenderType.method14301();
      }
   }

   public static RenderType method32632(BlockState var0, boolean var1) {
      RenderType var4 = method32630(var0);
      if (var4 != RenderType.method14304()) {
         return Class8624.method30907();
      } else if (Minecraft.isFabulousGraphicsEnabled()) {
         return !var1 ? Class8624.method30908() : Class8624.method30909();
      } else {
         return Class8624.method30909();
      }
   }

   public static RenderType method32633(ItemStack var0, boolean var1) {
      Item var4 = var0.getItem();
      if (!(var4 instanceof BlockItem)) {
         return !var1 ? Class8624.method30908() : Class8624.method30909();
      } else {
         Block var5 = ((BlockItem)var4).method11845();
         return method32632(var5.getDefaultState(), var1);
      }
   }

   public static RenderType method32634(FluidState var0) {
      RenderType var3 = field40408.get(var0.getFluid());
      return var3 == null ? RenderType.method14300() : var3;
   }

   public static void method32635(boolean var0) {
      field40409 = var0;
   }
}
