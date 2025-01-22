package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import net.minecraft.block.*;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.palette.UpgradeData;
import net.minecraft.world.IWorld;

import java.util.List;

public enum Class2230 implements Class2234 {
   field14618(
      Blocks.field36895,
      Blocks.NETHER_PORTAL,
      Blocks.field36945,
      Blocks.field36946,
      Blocks.field36947,
      Blocks.field36948,
      Blocks.field36949,
      Blocks.field36950,
      Blocks.field36951,
      Blocks.field36952,
      Blocks.field36953,
      Blocks.field36954,
      Blocks.field36955,
      Blocks.field36956,
      Blocks.field36957,
      Blocks.field36958,
      Blocks.field36959,
      Blocks.field36960,
      Blocks.ANVIL,
      Blocks.CHIPPED_ANVIL,
      Blocks.DAMAGED_ANVIL,
      Blocks.field36652,
      Blocks.GRAVEL,
      Blocks.SAND,
      Blocks.RED_SAND,
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
      Blocks.DARK_OAK_WALL_SIGN
   ) {
      @Override
      public BlockState method8970(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
         return var1;
      }
   },
   field14619() {
      @Override
      public BlockState method8970(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
         return var1.method23439(var2, var4.getBlockState(var6), var4, var5, var6);
      }
   },
   field14620(Blocks.CHEST, Blocks.TRAPPED_CHEST) {
      @Override
      public BlockState method8970(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
         if (var3.isIn(var1.getBlock())
                 && var2.getAxis().isHorizontal()
                 && var1.get(ChestBlock.TYPE) == ChestType.field379
                 && var3.get(ChestBlock.TYPE) == ChestType.field379) {

            Direction var9 = var1.get(ChestBlock.field18865);
            if (var2.getAxis() != var9.getAxis() && var9 == var3.get(ChestBlock.field18865)) {
               ChestType var10 = var2 != var9.rotateY() ? ChestType.RIGHT : ChestType.LEFT;
               var4.setBlockState(var6, var3.with(ChestBlock.TYPE, var10.method308()), 18);
               if (var9 == Direction.NORTH || var9 == Direction.EAST
               ) {
                  TileEntity var11 = var4.getTileEntity(var5);
                  TileEntity var12 = var4.getTileEntity(var6);
                  if (var11 instanceof ChestTileEntity && var12 instanceof ChestTileEntity) {
                     ChestTileEntity.swapContents((ChestTileEntity)var11, (ChestTileEntity)var12);
                  }
               }

               return var1.with(ChestBlock.TYPE, var10);
            }
         }

         return var1;
      }
   },
   field14621(true, Blocks.ACACIA_LEAVES, Blocks.BIRCH_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.JUNGLE_LEAVES, Blocks.OAK_LEAVES, Blocks.SPRUCE_LEAVES) {
      private final ThreadLocal<List<ObjectSet<BlockPos>>> field14625 = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));
      @Override
      public BlockState method8970(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
         BlockState var9 = var1.method23439(var2, var4.getBlockState(var6), var4, var5, var6);
         if (var1 != var9) {
            int var10 = var9.get(BlockStateProperties.DISTANCE);
            List<ObjectSet<BlockPos>> var11 = this.field14625.get();
            if (var11.isEmpty()) {
               for(int var12 = 0; var12 < 7; ++var12) {
                  var11.add(new ObjectOpenHashSet<>());
               }
            }

            var11.get(var10).add(var5.toImmutable());
         }

         return var1;
      }

      @Override
      public void method8971(IWorld var1) {
         BlockPos.Mutable var4 = new BlockPos.Mutable();
         List<ObjectSet<BlockPos>> var5 = this.field14625.get();

         for(int var6 = 2; var6 < var5.size(); ++var6) {
            int var7 = var6 - 1;
            ObjectSet<BlockPos> var8 = var5.get(var7);
            ObjectSet<BlockPos> var9 = var5.get(var6);

             for (BlockPos var11 : var8) {
                 BlockState var12 = var1.getBlockState(var11);
                 if (var12.get(BlockStateProperties.DISTANCE) >= var7) {
                     var1.setBlockState(var11, var12.with(BlockStateProperties.DISTANCE, Integer.valueOf(var7)), 18);
                     if (var6 != 7) {
                         for (Direction var16 : field14623) {
                             var4.method8377(var11, var16);
                             BlockState var17 = var1.getBlockState(var4);
                             if (var17.method23462(BlockStateProperties.DISTANCE) && var12.get(BlockStateProperties.DISTANCE) > var6) {
                                 var9.add(var4.toImmutable());
                             }
                         }
                     }
                 }
             }
         }

         var5.clear();
      }
   },
   field14622(Blocks.MELON_STEM, Blocks.PUMPKIN_STEM) {
      @Override
      public BlockState method8970(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
         if (var1.get(Class3486.field19347) == 7) {
            Class3462 var9 = ((Class3486)var1.getBlock()).method12185();
            if (var3.isIn(var9)) {
               return var9.method12147().getDefaultState().with(HorizontalBlock.HORIZONTAL_FACING, var2);
            }
         }

         return var1;
      }
   };

   public static final Direction[] field14623 = Direction.values();
   private static final Class2230[] field14624 = new Class2230[]{field14618, field14619, field14620, field14621, field14622};

   private Class2230(Block... var3) {
      this(false, var3);
   }

   private Class2230(boolean var3, Block... var4) {
      for (Block var10 : var4) {
         UpgradeData.method32610().put(var10, this);
      }

      if (var3) {
         UpgradeData.method32611().add(this);
      }
   }
}
