package mapped;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Class3399 extends AbstractFireBlock {
   private static String[] field19037;
   public static final Class8554 field19038 = Class8820.field39743;
   public static final Class8551 field19039 = Class3392.field19019;
   public static final Class8551 field19040 = Class3392.field19020;
   public static final Class8551 field19041 = Class3392.field19021;
   public static final Class8551 field19042 = Class3392.field19022;
   public static final Class8551 field19043 = Class3392.field19023;
   private static final Map<Direction, Class8551> field19044 = Class3392.field19025
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey() != Direction.DOWN)
      .collect(Util.<Direction, Class8551>method38484());
   private static final VoxelShape field19045 = Block.method11539(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final VoxelShape field19046 = Block.method11539(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final VoxelShape field19047 = Block.method11539(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final VoxelShape field19048 = Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final VoxelShape field19049 = Block.method11539(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<BlockState, VoxelShape> field19050;
   private final Object2IntMap<Block> field19051 = new Object2IntOpenHashMap();
   private final Object2IntMap<Block> field19052 = new Object2IntOpenHashMap();

   public Class3399(AbstractBlock var1) {
      super(var1, 1.0F);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19038, Integer.valueOf(0))
            .method23465(field19039, Boolean.valueOf(false))
            .method23465(field19040, Boolean.valueOf(false))
            .method23465(field19041, Boolean.valueOf(false))
            .method23465(field19042, Boolean.valueOf(false))
            .method23465(field19043, Boolean.valueOf(false))
      );
      this.field19050 = ImmutableMap.copyOf(
         this.field18612
            .getValidStates()
            .stream()
            .filter(var0 -> var0.<Integer>method23463(field19038) == 0)
            .collect(Collectors.toMap(Function.<BlockState>identity(), Class3399::method12015))
      );
   }

   private static VoxelShape method12015(BlockState var0) {
      VoxelShape var3 = VoxelShapes.method27425();
      if (var0.<Boolean>method23463(field19043)) {
         var3 = field19045;
      }

      if (var0.<Boolean>method23463(field19039)) {
         var3 = VoxelShapes.method27431(var3, field19048);
      }

      if (var0.<Boolean>method23463(field19041)) {
         var3 = VoxelShapes.method27431(var3, field19049);
      }

      if (var0.<Boolean>method23463(field19040)) {
         var3 = VoxelShapes.method27431(var3, field19047);
      }

      if (var0.<Boolean>method23463(field19042)) {
         var3 = VoxelShapes.method27431(var3, field19046);
      }

      return !var3.method19516() ? var3 : field19035;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !this.method11492(var1, var4, var5) ? Blocks.AIR.method11579() : this.method12021(var4, var5, var1.<Integer>method23463(field19038));
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return this.field19050.get(var1.method23465(field19038, Integer.valueOf(0)));
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method12016(var1.method18360(), var1.method18345());
   }

   public BlockState method12016(Class1665 var1, BlockPos var2) {
      BlockPos var5 = var2.down();
      BlockState var6 = var1.getBlockState(var5);
      if (!this.method12010(var6) && !var6.method23454(var1, var5, Direction.field673)) {
         BlockState var7 = this.method11579();

         for (Direction var11 : Direction.values()) {
            Class8551 var12 = field19044.get(var11);
            if (var12 != null) {
               var7 = var7.method23465(var12, Boolean.valueOf(this.method12010(var1.getBlockState(var2.method8349(var11)))));
            }
         }

         return var7;
      } else {
         return this.method11579();
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      return var2.getBlockState(var6).method23454(var2, var6, Direction.field673) || this.method12022(var2, var3);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      var2.method6860().method20726(var3, this, method12024(var2.rand));
      if (var2.method6789().method17135(Class5462.field24223)) {
         if (!var1.method23443(var2, var3)) {
            var2.removeBlock(var3, false);
         }

         BlockState var7 = var2.getBlockState(var3.down());
         boolean var8 = var7.method23446(var2.method6812().isInfiniBurn());
         int var9 = var1.<Integer>method23463(field19038);
         if (!var8 && var2.method6795() && this.method12017(var2, var3) && var4.nextFloat() < 0.2F + (float)var9 * 0.03F) {
            var2.removeBlock(var3, false);
         } else {
            int var10 = Math.min(15, var9 + var4.nextInt(3) / 2);
            if (var9 != var10) {
               var1 = var1.method23465(field19038, Integer.valueOf(var10));
               var2.setBlockState(var3, var1, 4);
            }

            if (!var8) {
               if (!this.method12022(var2, var3)) {
                  BlockPos var22 = var3.down();
                  if (!var2.getBlockState(var22).method23454(var2, var22, Direction.field673) || var9 > 3) {
                     var2.removeBlock(var3, false);
                  }

                  return;
               }

               if (var9 == 15 && var4.nextInt(4) == 0 && !this.method12010(var2.getBlockState(var3.down()))) {
                  var2.removeBlock(var3, false);
                  return;
               }
            }

            boolean var11 = var2.method6797(var3);
            int var12 = !var11 ? 0 : -50;
            this.method12020(var2, var3.east(), 300 + var12, var4, var9);
            this.method12020(var2, var3.west(), 300 + var12, var4, var9);
            this.method12020(var2, var3.down(), 250 + var12, var4, var9);
            this.method12020(var2, var3.up(), 250 + var12, var4, var9);
            this.method12020(var2, var3.north(), 300 + var12, var4, var9);
            this.method12020(var2, var3.south(), 300 + var12, var4, var9);
            Mutable var13 = new Mutable();

            for (int var14 = -1; var14 <= 1; var14++) {
               for (int var15 = -1; var15 <= 1; var15++) {
                  for (int var16 = -1; var16 <= 4; var16++) {
                     if (var14 != 0 || var16 != 0 || var15 != 0) {
                        int var17 = 100;
                        if (var16 > 1) {
                           var17 += (var16 - 1) * 100;
                        }

                        var13.method8378(var3, var14, var16, var15);
                        int var18 = this.method12023(var2, var13);
                        if (var18 > 0) {
                           int var19 = (var18 + 40 + var2.method6997().getId() * 7) / (var9 + 30);
                           if (var11) {
                              var19 /= 2;
                           }

                           if (var19 > 0 && var4.nextInt(var17) <= var19 && (!var2.method6795() || !this.method12017(var2, var13))) {
                              int var20 = Math.min(15, var9 + var4.nextInt(5) / 4);
                              var2.setBlockState(var13, this.method12021(var2, var13, var20), 3);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean method12017(World var1, BlockPos var2) {
      return var1.method6796(var2)
         || var1.method6796(var2.west())
         || var1.method6796(var2.east())
         || var1.method6796(var2.north())
         || var1.method6796(var2.south());
   }

   private int method12018(BlockState var1) {
      return var1.method23462(Class8820.field39710) && var1.<Boolean>method23463(Class8820.field39710) ? 0 : this.field19052.getInt(var1.getBlock());
   }

   private int method12019(BlockState var1) {
      return var1.method23462(Class8820.field39710) && var1.<Boolean>method23463(Class8820.field39710) ? 0 : this.field19051.getInt(var1.getBlock());
   }

   private void method12020(World var1, BlockPos var2, int var3, Random var4, int var5) {
      int var8 = this.method12018(var1.getBlockState(var2));
      if (var4.nextInt(var3) < var8) {
         BlockState var9 = var1.getBlockState(var2);
         if (var4.nextInt(var5 + 10) < 5 && !var1.method6796(var2)) {
            int var10 = Math.min(var5 + var4.nextInt(5) / 4, 15);
            var1.setBlockState(var2, this.method12021(var1, var2, var10), 3);
         } else {
            var1.removeBlock(var2, false);
         }

         Block var12 = var9.getBlock();
         if (var12 instanceof Class3458) {
            Class3458 var11 = (Class3458)var12;
            Class3458.method12131(var1, var2);
         }
      }
   }

   private BlockState method12021(Class1660 var1, BlockPos var2, int var3) {
      BlockState var6 = method12009(var1, var2);
      return !var6.method23448(Blocks.FIRE) ? var6 : var6.method23465(field19038, Integer.valueOf(var3));
   }

   private boolean method12022(Class1665 var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         if (this.method12010(var1.getBlockState(var2.method8349(var8)))) {
            return true;
         }
      }

      return false;
   }

   private int method12023(Class1662 var1, BlockPos var2) {
      if (!var1.method7007(var2)) {
         return 0;
      } else {
         int var5 = 0;

         for (Direction var9 : Direction.values()) {
            BlockState var10 = var1.getBlockState(var2.method8349(var9));
            var5 = Math.max(this.method12019(var10), var5);
         }

         return var5;
      }
   }

   @Override
   public boolean method12010(BlockState var1) {
      return this.method12019(var1) > 0;
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      super.method11589(var1, var2, var3, var4, var5);
      var2.method6860().method20726(var3, this, method12024(var2.rand));
   }

   private static int method12024(Random var0) {
      return 30 + var0.nextInt(10);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19038, field19039, field19040, field19041, field19042, field19043);
   }

   private void method12025(Block var1, int var2, int var3) {
      this.field19051.put(var1, var2);
      this.field19052.put(var1, var3);
   }

   public static void method12026() {
      Class3399 var2 = (Class3399) Blocks.FIRE;
      var2.method12025(Blocks.field36400, 5, 20);
      var2.method12025(Blocks.field36401, 5, 20);
      var2.method12025(Blocks.field36402, 5, 20);
      var2.method12025(Blocks.field36403, 5, 20);
      var2.method12025(Blocks.field36404, 5, 20);
      var2.method12025(Blocks.field36405, 5, 20);
      var2.method12025(Blocks.field36839, 5, 20);
      var2.method12025(Blocks.field36840, 5, 20);
      var2.method12025(Blocks.field36841, 5, 20);
      var2.method12025(Blocks.field36842, 5, 20);
      var2.method12025(Blocks.field36843, 5, 20);
      var2.method12025(Blocks.field36844, 5, 20);
      var2.method12025(Blocks.OAK_FENCE_GATE, 5, 20);
      var2.method12025(Blocks.field36862, 5, 20);
      var2.method12025(Blocks.field36863, 5, 20);
      var2.method12025(Blocks.field36864, 5, 20);
      var2.method12025(Blocks.field36866, 5, 20);
      var2.method12025(Blocks.field36865, 5, 20);
      var2.method12025(Blocks.OAK_FENCE, 5, 20);
      var2.method12025(Blocks.field36867, 5, 20);
      var2.method12025(Blocks.field36868, 5, 20);
      var2.method12025(Blocks.field36869, 5, 20);
      var2.method12025(Blocks.field36871, 5, 20);
      var2.method12025(Blocks.field36870, 5, 20);
      var2.method12025(Blocks.field36533, 5, 20);
      var2.method12025(Blocks.field36662, 5, 20);
      var2.method12025(Blocks.SPRUCE_STAIRS, 5, 20);
      var2.method12025(Blocks.field36663, 5, 20);
      var2.method12025(Blocks.field36762, 5, 20);
      var2.method12025(Blocks.field36763, 5, 20);
      var2.method12025(Blocks.field36422, 5, 5);
      var2.method12025(Blocks.field36423, 5, 5);
      var2.method12025(Blocks.field36424, 5, 5);
      var2.method12025(Blocks.field36425, 5, 5);
      var2.method12025(Blocks.field36426, 5, 5);
      var2.method12025(Blocks.field36427, 5, 5);
      var2.method12025(Blocks.field36433, 5, 5);
      var2.method12025(Blocks.field36428, 5, 5);
      var2.method12025(Blocks.field36429, 5, 5);
      var2.method12025(Blocks.field36430, 5, 5);
      var2.method12025(Blocks.field36431, 5, 5);
      var2.method12025(Blocks.field36432, 5, 5);
      var2.method12025(Blocks.field36440, 5, 5);
      var2.method12025(Blocks.field36441, 5, 5);
      var2.method12025(Blocks.field36442, 5, 5);
      var2.method12025(Blocks.field36443, 5, 5);
      var2.method12025(Blocks.field36444, 5, 5);
      var2.method12025(Blocks.field36445, 5, 5);
      var2.method12025(Blocks.field36434, 5, 5);
      var2.method12025(Blocks.field36435, 5, 5);
      var2.method12025(Blocks.field36436, 5, 5);
      var2.method12025(Blocks.field36437, 5, 5);
      var2.method12025(Blocks.field36438, 5, 5);
      var2.method12025(Blocks.field36439, 5, 5);
      var2.method12025(Blocks.field36446, 30, 60);
      var2.method12025(Blocks.field36447, 30, 60);
      var2.method12025(Blocks.field36448, 30, 60);
      var2.method12025(Blocks.field36449, 30, 60);
      var2.method12025(Blocks.field36450, 30, 60);
      var2.method12025(Blocks.field36451, 30, 60);
      var2.method12025(Blocks.field36525, 30, 20);
      var2.method12025(Blocks.TNT, 15, 100);
      var2.method12025(Blocks.GRASS, 60, 100);
      var2.method12025(Blocks.FERN, 60, 100);
      var2.method12025(Blocks.DEAD_BUSH, 60, 100);
      var2.method12025(Blocks.SUNFLOWER, 60, 100);
      var2.method12025(Blocks.LILAC, 60, 100);
      var2.method12025(Blocks.ROSE_BUSH, 60, 100);
      var2.method12025(Blocks.field36800, 60, 100);
      var2.method12025(Blocks.TALL_GRASS, 60, 100);
      var2.method12025(Blocks.field36802, 60, 100);
      var2.method12025(Blocks.DANDELION, 60, 100);
      var2.method12025(Blocks.POPPY, 60, 100);
      var2.method12025(Blocks.BLUE_ORCHID, 60, 100);
      var2.method12025(Blocks.ALLIUM, 60, 100);
      var2.method12025(Blocks.AZURE_BLUET, 60, 100);
      var2.method12025(Blocks.RED_TULIP, 60, 100);
      var2.method12025(Blocks.ORANGE_TULIP, 60, 100);
      var2.method12025(Blocks.WHITE_TULIP, 60, 100);
      var2.method12025(Blocks.PINK_TULIP, 60, 100);
      var2.method12025(Blocks.OXEYE_DAISY, 60, 100);
      var2.method12025(Blocks.CORNFLOWER, 60, 100);
      var2.method12025(Blocks.LILY_OF_THE_VALLEY, 60, 100);
      var2.method12025(Blocks.WITHER_ROSE, 60, 100);
      var2.method12025(Blocks.WHITE_WOOL, 30, 60);
      var2.method12025(Blocks.ORANGE_WOOL, 30, 60);
      var2.method12025(Blocks.MAGENTA_WOOL, 30, 60);
      var2.method12025(Blocks.LIGHT_BLUE_WOOL, 30, 60);
      var2.method12025(Blocks.YELLOW_WOOL, 30, 60);
      var2.method12025(Blocks.LIME_WOOL, 30, 60);
      var2.method12025(Blocks.PINK_WOOL, 30, 60);
      var2.method12025(Blocks.GRAY_WOOL, 30, 60);
      var2.method12025(Blocks.LIGHT_GRAY_WOOL, 30, 60);
      var2.method12025(Blocks.CYAN_WOOL, 30, 60);
      var2.method12025(Blocks.PURPLE_WOOL, 30, 60);
      var2.method12025(Blocks.BLUE_WOOL, 30, 60);
      var2.method12025(Blocks.BROWN_WOOL, 30, 60);
      var2.method12025(Blocks.GREEN_WOOL, 30, 60);
      var2.method12025(Blocks.RED_WOOL, 30, 60);
      var2.method12025(Blocks.BLACK_WOOL, 30, 60);
      var2.method12025(Blocks.VINE, 15, 100);
      var2.method12025(Blocks.field36795, 5, 5);
      var2.method12025(Blocks.field36777, 60, 20);
      var2.method12025(Blocks.field37116, 15, 20);
      var2.method12025(Blocks.WHITE_CARPET, 60, 20);
      var2.method12025(Blocks.ORANGE_CARPET, 60, 20);
      var2.method12025(Blocks.MAGENTA_CARPET, 60, 20);
      var2.method12025(Blocks.LIGHT_BLUE_CARPET, 60, 20);
      var2.method12025(Blocks.YELLOW_CARPET, 60, 20);
      var2.method12025(Blocks.LIME_CARPET, 60, 20);
      var2.method12025(Blocks.PINK_CARPET, 60, 20);
      var2.method12025(Blocks.GRAY_CARPET, 60, 20);
      var2.method12025(Blocks.LIGHT_GRAY_CARPET, 60, 20);
      var2.method12025(Blocks.CYAN_CARPET, 60, 20);
      var2.method12025(Blocks.PURPLE_CARPET, 60, 20);
      var2.method12025(Blocks.BLUE_CARPET, 60, 20);
      var2.method12025(Blocks.BROWN_CARPET, 60, 20);
      var2.method12025(Blocks.GREEN_CARPET, 60, 20);
      var2.method12025(Blocks.RED_CARPET, 60, 20);
      var2.method12025(Blocks.BLACK_CARPET, 60, 20);
      var2.method12025(Blocks.field36963, 30, 60);
      var2.method12025(Blocks.field37009, 60, 60);
      var2.method12025(Blocks.field37053, 60, 60);
      var2.method12025(Blocks.field37061, 30, 20);
      var2.method12025(Blocks.field37115, 5, 20);
      var2.method12025(Blocks.field37069, 60, 100);
      var2.method12025(Blocks.field37118, 5, 20);
      var2.method12025(Blocks.field37117, 30, 20);
   }
}
