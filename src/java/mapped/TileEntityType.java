package mapped;

import com.mojang.datafixers.types.Type;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Util;
import net.minecraft.tileentity.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.TypeReferences;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.function.Supplier;

public class TileEntityType<T extends TileEntity> {
   private static final Logger field21420 = LogManager.getLogger();
   public static final TileEntityType<Class986> field21421 = method13794("furnace", Class9785.<Class986>method38569(Class986::new, Blocks.FURNACE));
   public static final TileEntityType<ChestTileEntity> CHEST = method13794("chest", Class9785.<ChestTileEntity>method38569(ChestTileEntity::new, Blocks.CHEST));
   public static final TileEntityType<Class970> field21423 = method13794("trapped_chest", Class9785.<Class970>method38569(Class970::new, Blocks.TRAPPED_CHEST));
   public static final TileEntityType<Class943> field21424 = method13794("ender_chest", Class9785.<Class943>method38569(Class943::new, Blocks.ENDER_CHEST));
   public static final TileEntityType<Class947> field21425 = method13794("jukebox", Class9785.<Class947>method38569(Class947::new, Blocks.JUKEBOX));
   public static final TileEntityType<Class971> field21426 = method13794("dispenser", Class9785.<Class971>method38569(Class971::new, Blocks.DISPENSER));
   public static final TileEntityType<Class972> field21427 = method13794("dropper", Class9785.<Class972>method38569(Class972::new, Blocks.DROPPER));
   public static final TileEntityType<Class954> field21428 = method13794(
      "sign",
      Class9785.<Class954>method38569(
         Class954::new,
         Blocks.OAK_SIGN,
         Blocks.SPRUCE_SIGN,
         Blocks.BIRCH_SIGN,
         Blocks.ACACIA_SIGN,
         Blocks.JUNGLE_SIGN,
         Blocks.DARK_OAK_SIGN,
         Blocks.OAK_WALL_SIGN,
         Blocks.SPRUCE_WALL_SIGN,
         Blocks.BIRCH_WALL_SIGN,
         Blocks.ACACIA_WALL_SIGN,
         Blocks.JUNGLE_WALL_SIGN,
         Blocks.DARK_OAK_WALL_SIGN,
         Blocks.CRIMSON_SIGN,
         Blocks.CRIMSON_WALL_SIGN,
         Blocks.WARPED_SIGN,
         Blocks.WARPED_WALL_SIGN
      )
   );
   public static final TileEntityType<Class960> field21429 = method13794("mob_spawner", Class9785.<Class960>method38569(Class960::new, Blocks.SPAWNER));
   public static final TileEntityType<Class955> field21430 = method13794("piston", Class9785.<Class955>method38569(Class955::new, Blocks.MOVING_PISTON));
   public static final TileEntityType<Class931> field21431 = method13794("brewing_stand", Class9785.<Class931>method38569(Class931::new, Blocks.BREWING_STAND));
   public static final TileEntityType<Class934> field21432 = method13794("enchanting_table", Class9785.<Class934>method38569(Class934::new, Blocks.ENCHANTING_TABLE));
   public static final TileEntityType<Class956> field21433 = method13794("end_portal", Class9785.<Class956>method38569(Class956::new, Blocks.END_PORTAL));
   public static final TileEntityType<Class950> field21434 = method13794("beacon", Class9785.<Class950>method38569(Class950::new, Blocks.BEACON));
   public static final TileEntityType<SkullTileEntity> field21435 = method13794(
      "skull",
      Class9785.<SkullTileEntity>method38569(
         SkullTileEntity::new,
         Blocks.SKELETON_SKULL,
         Blocks.SKELETON_WALL_SKULL,
         Blocks.CREEPER_HEAD,
         Blocks.CREEPER_WALL_HEAD,
         Blocks.HEAD,
         Blocks.DRAGON_WALL_HEAD,
         Blocks.ZOMBIE_HEAD,
         Blocks.ZOMBIE_WALL_HEAD,
         Blocks.WITHER_SKELETON_SKULL,
         Blocks.WITHER_SKELETON_WALL_SKULL,
         Blocks.PLAYER_HEAD,
         Blocks.PLAYER_WALL_HEAD
      )
   );
   public static final TileEntityType<Class961> field21436 = method13794("daylight_detector", Class9785.<Class961>method38569(Class961::new, Blocks.DAYLIGHT_DETECTOR));
   public static final TileEntityType<Class936> field21437 = method13794("hopper", Class9785.<Class936>method38569(Class936::new, Blocks.HOPPER));
   public static final TileEntityType<Class963> field21438 = method13794("comparator", Class9785.<Class963>method38569(Class963::new, Blocks.COMPARATOR));
   public static final TileEntityType<BannerTileEntity> field21439 = method13794(
      "banner",
      Class9785.<BannerTileEntity>method38569(
         BannerTileEntity::new,
         Blocks.WHITE_BANNER,
         Blocks.ORANGE_BANNER,
         Blocks.MAGENTA_BANNER,
         Blocks.LIGHT_BLUE_BANNER,
         Blocks.YELLOW_BANNER,
         Blocks.LIME_BANNER,
         Blocks.PINK_BANNER,
         Blocks.GRAY_BANNER,
         Blocks.LIGHT_GRAY_BANNER,
         Blocks.CYAN_BANNER,
         Blocks.PURPLE_BANNER,
         Blocks.BLUE_BANNER,
         Blocks.BROWN_BANNER,
         Blocks.GREEN_BANNER,
         Blocks.RED_BANNER,
         Blocks.BLACK_BANNER,
         Blocks.WHITE_WALL_BANNER,
         Blocks.ORANGE_WALL_BANNER,
         Blocks.MAGENTA_WALL_BANNER,
         Blocks.LIGHT_BLUE_WALL_BANNER,
         Blocks.YELLOW_WALL_BANNER,
         Blocks.LIME_WALL_BANNER,
         Blocks.PINK_WALL_BANNER,
         Blocks.GRAY_WALL_BANNER,
         Blocks.LIGHT_GRAY_WALL_BANNER,
         Blocks.CYAN_WALL_BANNER,
         Blocks.PURPLE_WALL_BANNER,
         Blocks.BLUE_WALL_BANNER,
         Blocks.BROWN_WALL_BANNER,
         Blocks.GREEN_WALL_BANNER,
         Blocks.RED_WALL_BANNER,
         Blocks.BLACK_WALL_BANNER
      )
   );
   public static final TileEntityType<Class964> field21440 = method13794("structure_block", Class9785.<Class964>method38569(Class964::new, Blocks.STRUCTURE_BLOCK));
   public static final TileEntityType<Class957> field21441 = method13794("end_gateway", Class9785.<Class957>method38569(Class957::new, Blocks.END_GATEWAY));
   public static final TileEntityType<CommandBlockTileEntity> COMMAND_BLOCK = method13794(
      "command_block", Class9785.<CommandBlockTileEntity>method38569(CommandBlockTileEntity::new, Blocks.COMMAND_BLOCK, Blocks.CHAIN_COMMAND_BLOCK, Blocks.REPEATING_COMMAND_BLOCK)
   );
   public static final TileEntityType<Class940> field21443 = method13794(
      "shulker_box",
      Class9785.<Class940>method38569(
         Class940::new,
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
         Blocks.YELLOW_SHULKER_BOX
      )
   );
   public static final TileEntityType<Class967> field21444 = method13794(
      "bed",
      Class9785.<Class967>method38569(
         Class967::new,
         Blocks.RED_BED,
         Blocks.BLACK_BED,
         Blocks.BLUE_BED,
         Blocks.BROWN_RED,
         Blocks.CYAN_BED,
         Blocks.GRAY_BED,
         Blocks.GREEN_BED,
         Blocks.LIGHT_BLUE_BED,
         Blocks.LIGHT_GRAY_BED,
         Blocks.LIME_BED,
         Blocks.MAGENTA_BED,
         Blocks.ORANGE_BED,
         Blocks.PINK_BED,
         Blocks.PURPLE_BED,
         Blocks.WHITE_BED,
         Blocks.YELLOW_BED
      )
   );
   public static final TileEntityType<Class959> field21445 = method13794("conduit", Class9785.<Class959>method38569(Class959::new, Blocks.field37007));
   public static final TileEntityType<Class973> field21446 = method13794("barrel", Class9785.<Class973>method38569(Class973::new, Blocks.BARREL));
   public static final TileEntityType<Class985> field21447 = method13794("smoker", Class9785.<Class985>method38569(Class985::new, Blocks.SMOKER));
   public static final TileEntityType<Class987> field21448 = method13794("blast_furnace", Class9785.<Class987>method38569(Class987::new, Blocks.BLAST_FURNACE));
   public static final TileEntityType<Class948> field21449 = method13794("lectern", Class9785.<Class948>method38569(Class948::new, Blocks.LECTERN));
   public static final TileEntityType<Class966> field21450 = method13794("bell", Class9785.<Class966>method38569(Class966::new, Blocks.BELL));
   public static final TileEntityType<JigsawTileEntity> field21451 = method13794("jigsaw", Class9785.<JigsawTileEntity>method38569(JigsawTileEntity::new, Blocks.JIGSAW));
   public static final TileEntityType<Class945> field21452 = method13794(
      "campfire", Class9785.<Class945>method38569(Class945::new, Blocks.CAMPFIRE, Blocks.SOUL_CAMPFIRE)
   );
   public static final TileEntityType<BeehiveTileEntity> field21453 = method13794(
      "beehive", Class9785.<BeehiveTileEntity>method38569(BeehiveTileEntity::new, Blocks.BEE_NEST, Blocks.BEEHIVE)
   );
   private final Supplier<? extends T> field21454;
   private final Set<Block> field21455;
   private final Type<?> field21456;

   @Nullable
   public static ResourceLocation method13793(TileEntityType<?> var0) {
      return Registry.field16078.getKey(var0);
   }

   private static <T extends TileEntity> TileEntityType<T> method13794(String var0, Class9785<T> var1) {
      if (Class9785.method38571(var1).isEmpty()) {
         field21420.warn("Block entity type {} requires at least one valid block to be defined!", var0);
      }

      Type var4 = Util.attemptDataFix(TypeReferences.BLOCK_ENTITY, var0);
      return Registry.<TileEntityType<T>>register(Registry.field16078, var0, var1.method38570(var4));
   }

   public TileEntityType(Supplier<? extends T> var1, Set<Block> var2, Type<?> var3) {
      this.field21454 = var1;
      this.field21455 = var2;
      this.field21456 = var3;
   }

   @Nullable
   public T method13795() {
      return (T)this.field21454.get();
   }

   public boolean method13796(Block var1) {
      return this.field21455.contains(var1);
   }

   @Nullable
   public T method13797(IBlockReader var1, BlockPos var2) {
      TileEntity var5 = var1.getTileEntity(var2);
      return (T)(var5 != null && var5.method3786() == this ? var5 : null);
   }
}
