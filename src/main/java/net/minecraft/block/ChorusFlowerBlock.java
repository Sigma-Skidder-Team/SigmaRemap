package net.minecraft.block;

import mapped.ChorusPlantBlock;
import mapped.EntityTypeTags;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class ChorusFlowerBlock extends Block {
   private static String[] field18618;
   public static final IntegerProperty field18619 = BlockStateProperties.AGE4;
   private final ChorusPlantBlock field18620;

   public ChorusFlowerBlock(ChorusPlantBlock var1, Properties var2) {
      super(var2);
      this.field18620 = var1;
      this.setDefaultState(this.stateContainer.getBaseState().with(field18619, Integer.valueOf(0)));
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.isValidPosition(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.<Integer>get(field18619) < 5;
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.up();
      if (var2.method7007(var7) && var7.getY() < 256) {
         int var8 = var1.<Integer>get(field18619);
         if (var8 < 5) {
            boolean var9 = false;
            boolean var10 = false;
            BlockState var11 = var2.getBlockState(var3.down());
            Block var12 = var11.getBlock();
            if (var12 == Blocks.END_STONE) {
               var9 = true;
            } else if (var12 != this.field18620) {
               if (var11.isAir()) {
                  var9 = true;
               }
            } else {
               int var13 = 1;

               for (int var14 = 0; var14 < 4; var14++) {
                  Block var15 = var2.getBlockState(var3.method8340(var13 + 1)).getBlock();
                  if (var15 != this.field18620) {
                     if (var15 == Blocks.END_STONE) {
                        var10 = true;
                     }
                     break;
                  }

                  var13++;
               }

               if (var13 < 2 || var13 <= var4.nextInt(!var10 ? 4 : 5)) {
                  var9 = true;
               }
            }

            if (var9 && method11592(var2, var7, (Direction)null) && var2.method7007(var3.up(2))) {
               var2.setBlockState(var3, this.field18620.method12004(var2, var3), 2);
               this.method11590(var2, var7, var8);
            } else if (var8 >= 4) {
               this.method11591(var2, var3);
            } else {
               int var18 = var4.nextInt(4);
               if (var10) {
                  var18++;
               }

               boolean var19 = false;

               for (int var20 = 0; var20 < var18; var20++) {
                  Direction var16 = Direction.Plane.HORIZONTAL.method247(var4);
                  BlockPos var17 = var3.offset(var16);
                  if (var2.method7007(var17) && var2.method7007(var17.down()) && method11592(var2, var17, var16.getOpposite())) {
                     this.method11590(var2, var17, var8 + 1);
                     var19 = true;
                  }
               }

               if (!var19) {
                  this.method11591(var2, var3);
               } else {
                  var2.setBlockState(var3, this.field18620.method12004(var2, var3), 2);
               }
            }
         }
      }
   }

   private void method11590(World var1, BlockPos var2, int var3) {
      var1.setBlockState(var2, this.getDefaultState().with(field18619, Integer.valueOf(var3)), 2);
      var1.playEvent(1033, var2, 0);
   }

   private void method11591(World var1, BlockPos var2) {
      var1.setBlockState(var2, this.getDefaultState().with(field18619, Integer.valueOf(5)), 2);
      var1.playEvent(1034, var2, 0);
   }

   private static boolean method11592(IWorldReader var0, BlockPos var1, Direction var2) {
      for (Direction var6 : Direction.Plane.HORIZONTAL) {
         if (var6 != var2 && !var0.method7007(var1.offset(var6))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2 != Direction.UP && !var1.isValidPosition(var4, var5)) {
         var4.getBlockTickScheduler().scheduleTick(var5, this, 1);
      }

      return super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      if (var6.getBlock() != this.field18620 && !var6.isIn(Blocks.END_STONE)) {
         if (var6.isAir()) {
            boolean var7 = false;

            for (Direction var9 : Direction.Plane.HORIZONTAL) {
               BlockState var10 = var2.getBlockState(var3.offset(var9));
               if (!var10.isIn(this.field18620)) {
                  if (!var10.isAir()) {
                     return false;
                  }
               } else {
                  if (var7) {
                     return false;
                  }

                  var7 = true;
               }
            }

            return var7;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18619);
   }

   public static void method11593(IWorld var0, BlockPos var1, Random var2, int var3) {
      var0.setBlockState(var1, ((ChorusPlantBlock) Blocks.CHORUS_PLANT).method12004(var0, var1), 2);
      method11594(var0, var1, var2, var1, var3, 0);
   }

   private static void method11594(IWorld var0, BlockPos var1, Random var2, BlockPos var3, int var4, int var5) {
      ChorusPlantBlock var8 = (ChorusPlantBlock) Blocks.CHORUS_PLANT;
      int var9 = var2.nextInt(4) + 1;
      if (var5 == 0) {
         var9++;
      }

      for (int var10 = 0; var10 < var9; var10++) {
         BlockPos var11 = var1.up(var10 + 1);
         if (!method11592(var0, var11, (Direction)null)) {
            return;
         }

         var0.setBlockState(var11, var8.method12004(var0, var11), 2);
         var0.setBlockState(var11.down(), var8.method12004(var0, var11.down()), 2);
      }

      boolean var15 = false;
      if (var5 < 4) {
         int var16 = var2.nextInt(4);
         if (var5 == 0) {
            var16++;
         }

         for (int var12 = 0; var12 < var16; var12++) {
            Direction var13 = Direction.Plane.HORIZONTAL.method247(var2);
            BlockPos var14 = var1.up(var9).offset(var13);
            if (Math.abs(var14.getX() - var3.getX()) < var4
               && Math.abs(var14.getZ() - var3.getZ()) < var4
               && var0.method7007(var14)
               && var0.method7007(var14.down())
               && method11592(var0, var14, var13.getOpposite())) {
               var15 = true;
               var0.setBlockState(var14, var8.method12004(var0, var14), 2);
               var0.setBlockState(var14.offset(var13.getOpposite()), var8.method12004(var0, var14.offset(var13.getOpposite())), 2);
               method11594(var0, var14, var2, var3, var4, var5 + 1);
            }
         }
      }

      if (!var15) {
         var0.setBlockState(var1.up(var9), Blocks.CHORUS_FLOWER.getDefaultState().with(field18619, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
      if (var4.getType().method33228(EntityTypeTags.field38738)) {
         BlockPos var7 = var3.getPos();
         var1.destroyBlock(var7, true, var4);
      }
   }
}
