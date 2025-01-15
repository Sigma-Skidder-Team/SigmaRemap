package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.pathfinding.PathType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import java.util.EnumSet;
import javax.annotation.Nullable;

public class Class6762 extends Class6764 {
   private static String[] field29471;
   public float field29472;
   private final Long2ObjectMap<PathNodeType> field29473 = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<AxisAlignedBB> field29474 = new Object2BooleanOpenHashMap();

   @Override
   public void method20613(Class1667 var1, MobEntity var2) {
      super.method20613(var1, var2);
      this.field29472 = var2.method4223(PathNodeType.WATER);
   }

   @Override
   public void method20614() {
      this.field29476.method4224(PathNodeType.WATER, this.field29472);
      this.field29473.clear();
      this.field29474.clear();
      super.method20614();
   }

   @Override
   public Class7176 method20615() {
      BlockPos.Mutable var3 = new BlockPos.Mutable();
      int var4 = MathHelper.floor(this.field29476.getPosY());
      BlockState var5 = this.field29475.getBlockState(var3.method8373(this.field29476.getPosX(), (double)var4, this.field29476.getPosZ()));
      if (!this.field29476.method3107(var5.getFluidState().getFluid())) {
         if (this.method20649() && this.field29476.isInWater()) {
            while (true) {
               if (var5.getBlock() != Blocks.WATER && var5.getFluidState() != Fluids.WATER.getStillFluidState(false)) {
                  var4--;
                  break;
               }

               var5 = this.field29475.getBlockState(var3.method8373(this.field29476.getPosX(), (double)(++var4), this.field29476.getPosZ()));
            }
         } else if (!this.field29476.isOnGround()) {
            BlockPos var6 = this.field29476.getPosition();

            while (
               (this.field29475.getBlockState(var6).isAir() || this.field29475.getBlockState(var6).method23440(this.field29475, var6, PathType.field12614))
                  && var6.getY() > 0
            ) {
               var6 = var6.down();
            }

            var4 = var6.up().getY();
         } else {
            var4 = MathHelper.floor(this.field29476.getPosY() + 0.5);
         }
      } else {
         while (this.field29476.method3107(var5.getFluidState().getFluid())) {
            var5 = this.field29475.getBlockState(var3.method8373(this.field29476.getPosX(), (double)(++var4), this.field29476.getPosZ()));
         }

         var4--;
      }

      BlockPos var11 = this.field29476.getPosition();
      PathNodeType var7 = this.method20632(this.field29476, var11.getX(), var4, var11.getZ());
      if (this.field29476.method4223(var7) < 0.0F) {
         AxisAlignedBB var8 = this.field29476.getBoundingBox();
         if (this.method20622(var3.method8373(var8.minX, (double)var4, var8.minZ))
            || this.method20622(var3.method8373(var8.minX, (double)var4, var8.maxZ))
            || this.method20622(var3.method8373(var8.maxX, (double)var4, var8.minZ))
            || this.method20622(var3.method8373(var8.maxX, (double)var4, var8.maxZ))) {
            Class7176 var9 = this.method20643(var3);
            var9.field30859 = this.method20631(this.field29476, var9.method22531());
            var9.field30858 = this.field29476.method4223(var9.field30859);
            return var9;
         }
      }

      Class7176 var12 = this.method20641(var11.getX(), var4, var11.getZ());
      var12.field30859 = this.method20631(this.field29476, var12.method22531());
      var12.field30858 = this.field29476.method4223(var12.field30859);
      return var12;
   }

   private boolean method20622(BlockPos var1) {
      PathNodeType var4 = this.method20631(this.field29476, var1);
      return this.field29476.method4223(var4) >= 0.0F;
   }

   @Override
   public Class7175 method20616(double var1, double var3, double var5) {
      return new Class7175(this.method20641(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5)));
   }

   @Override
   public int method20617(Class7176[] var1, Class7176 var2) {
      int var5 = 0;
      int var6 = 0;
      PathNodeType var7 = this.method20632(this.field29476, var2.field30847, var2.field30848 + 1, var2.field30849);
      PathNodeType var8 = this.method20632(this.field29476, var2.field30847, var2.field30848, var2.field30849);
      if (this.field29476.method4223(var7) >= 0.0F && var8 != PathNodeType.STICKY_HONEY) {
         var6 = MathHelper.floor(Math.max(1.0F, this.field29476.stepHeight));
      }

      double var9 = method20626(this.field29475, new BlockPos(var2.field30847, var2.field30848, var2.field30849));
      Class7176 var11 = this.method20627(var2.field30847, var2.field30848, var2.field30849 + 1, var6, var9, Direction.SOUTH, var8);
      if (this.method20623(var11, var2)) {
         var1[var5++] = var11;
      }

      Class7176 var12 = this.method20627(var2.field30847 - 1, var2.field30848, var2.field30849, var6, var9, Direction.WEST, var8);
      if (this.method20623(var12, var2)) {
         var1[var5++] = var12;
      }

      Class7176 var13 = this.method20627(var2.field30847 + 1, var2.field30848, var2.field30849, var6, var9, Direction.EAST, var8);
      if (this.method20623(var13, var2)) {
         var1[var5++] = var13;
      }

      Class7176 var14 = this.method20627(var2.field30847, var2.field30848, var2.field30849 - 1, var6, var9, Direction.NORTH, var8);
      if (this.method20623(var14, var2)) {
         var1[var5++] = var14;
      }

      Class7176 var15 = this.method20627(var2.field30847 - 1, var2.field30848, var2.field30849 - 1, var6, var9, Direction.NORTH, var8);
      if (this.method20624(var2, var12, var14, var15)) {
         var1[var5++] = var15;
      }

      Class7176 var16 = this.method20627(var2.field30847 + 1, var2.field30848, var2.field30849 - 1, var6, var9, Direction.NORTH, var8);
      if (this.method20624(var2, var13, var14, var16)) {
         var1[var5++] = var16;
      }

      Class7176 var17 = this.method20627(var2.field30847 - 1, var2.field30848, var2.field30849 + 1, var6, var9, Direction.SOUTH, var8);
      if (this.method20624(var2, var12, var11, var17)) {
         var1[var5++] = var17;
      }

      Class7176 var18 = this.method20627(var2.field30847 + 1, var2.field30848, var2.field30849 + 1, var6, var9, Direction.SOUTH, var8);
      if (this.method20624(var2, var13, var11, var18)) {
         var1[var5++] = var18;
      }

      return var5;
   }

   private boolean method20623(Class7176 var1, Class7176 var2) {
      return var1 != null && !var1.field30856 && (var1.field30858 >= 0.0F || var2.field30858 < 0.0F);
   }

   private boolean method20624(Class7176 var1, Class7176 var2, Class7176 var3, Class7176 var4) {
      if (var4 == null || var3 == null || var2 == null) {
         return false;
      } else if (var4.field30856) {
         return false;
      } else if (var3.field30848 > var1.field30848 || var2.field30848 > var1.field30848) {
         return false;
      } else if (var2.field30859 != PathNodeType.WALKABLE_DOOR && var3.field30859 != PathNodeType.WALKABLE_DOOR && var4.field30859 != PathNodeType.WALKABLE_DOOR) {
         boolean var7 = var3.field30859 == PathNodeType.FENCE && var2.field30859 == PathNodeType.FENCE && (double)this.field29476.getWidth() < 0.5;
         return var4.field30858 >= 0.0F
            && (var3.field30848 < var1.field30848 || var3.field30858 >= 0.0F || var7)
            && (var2.field30848 < var1.field30848 || var2.field30858 >= 0.0F || var7);
      } else {
         return false;
      }
   }

   private boolean method20625(Class7176 var1) {
      Vector3d var4 = new Vector3d(
         (double)var1.field30847 - this.field29476.getPosX(),
         (double)var1.field30848 - this.field29476.getPosY(),
         (double)var1.field30849 - this.field29476.getPosZ()
      );
      AxisAlignedBB var5 = this.field29476.getBoundingBox();
      int var6 = MathHelper.method37774(var4.length() / var5.getAverageEdgeLength());
      var4 = var4.scale((double)(1.0F / (float)var6));

      for (int var7 = 1; var7 <= var6; var7++) {
         var5 = var5.offset(var4);
         if (this.method20628(var5)) {
            return false;
         }
      }

      return true;
   }

   public static double method20626(IBlockReader var0, BlockPos var1) {
      BlockPos var4 = var1.down();
      VoxelShape var5 = var0.getBlockState(var4).method23414(var0, var4);
      return (double)var4.getY() + (!var5.isEmpty() ? var5.getEnd(Direction.Axis.Y) : 0.0);
   }

   @Nullable
   private Class7176 method20627(int var1, int var2, int var3, int var4, double var5, Direction var7, PathNodeType var8) {
      Class7176 var11 = null;
      BlockPos.Mutable var12 = new BlockPos.Mutable();
      double var13 = method20626(this.field29475, var12.setPos(var1, var2, var3));
      if (!(var13 - var5 > 1.125)) {
         PathNodeType var15 = this.method20632(this.field29476, var1, var2, var3);
         float var16 = this.field29476.method4223(var15);
         double var17 = (double)this.field29476.getWidth() / 2.0;
         if (var16 >= 0.0F) {
            var11 = this.method20641(var1, var2, var3);
            var11.field30859 = var15;
            var11.field30858 = Math.max(var11.field30858, var16);
         }

         if (var8 == PathNodeType.FENCE && var11 != null && var11.field30858 >= 0.0F && !this.method20625(var11)) {
            var11 = null;
         }

         if (var15 == PathNodeType.WALKABLE) {
            return var11;
         } else {
            if ((var11 == null || var11.field30858 < 0.0F)
               && var4 > 0
               && var15 != PathNodeType.FENCE
               && var15 != PathNodeType.UNPASSABLE_RAIL
               && var15 != PathNodeType.TRAPDOOR) {
               var11 = this.method20627(var1, var2 + 1, var3, var4 - 1, var5, var7, var8);
               if (var11 != null
                  && (var11.field30859 == PathNodeType.OPEN || var11.field30859 == PathNodeType.WALKABLE)
                  && this.field29476.getWidth() < 1.0F) {
                  double var19 = (double)(var1 - var7.getXOffset()) + 0.5;
                  double var21 = (double)(var3 - var7.getZOffset()) + 0.5;
                  AxisAlignedBB var23 = new AxisAlignedBB(
                     var19 - var17,
                     method20626(this.field29475, var12.method8373(var19, (double)(var2 + 1), var21)) + 0.001,
                     var21 - var17,
                     var19 + var17,
                     (double)this.field29476.getHeight()
                        + method20626(this.field29475, var12.method8373((double)var11.field30847, (double)var11.field30848, (double)var11.field30849))
                        - 0.002,
                     var21 + var17
                  );
                  if (this.method20628(var23)) {
                     var11 = null;
                  }
               }
            }

            if (var15 == PathNodeType.WATER && !this.method20649()) {
               if (this.method20632(this.field29476, var1, var2 - 1, var3) != PathNodeType.WATER) {
                  return var11;
               }

               while (var2 > 0) {
                  var15 = this.method20632(this.field29476, var1, --var2, var3);
                  if (var15 != PathNodeType.WATER) {
                     return var11;
                  }

                  var11 = this.method20641(var1, var2, var3);
                  var11.field30859 = var15;
                  var11.field30858 = Math.max(var11.field30858, this.field29476.method4223(var15));
               }
            }

            if (var15 == PathNodeType.OPEN) {
               int var24 = 0;
               int var25 = var2;

               while (var15 == PathNodeType.OPEN) {
                  if (--var2 < 0) {
                     Class7176 var29 = this.method20641(var1, var25, var3);
                     var29.field30859 = PathNodeType.BLOCKED;
                     var29.field30858 = -1.0F;
                     return var29;
                  }

                  if (var24++ >= this.field29476.getMaxFallHeight()) {
                     Class7176 var28 = this.method20641(var1, var2, var3);
                     var28.field30859 = PathNodeType.BLOCKED;
                     var28.field30858 = -1.0F;
                     return var28;
                  }

                  var15 = this.method20632(this.field29476, var1, var2, var3);
                  var16 = this.field29476.method4223(var15);
                  if (var15 != PathNodeType.OPEN && var16 >= 0.0F) {
                     var11 = this.method20641(var1, var2, var3);
                     var11.field30859 = var15;
                     var11.field30858 = Math.max(var11.field30858, var16);
                     break;
                  }

                  if (var16 < 0.0F) {
                     Class7176 var26 = this.method20641(var1, var2, var3);
                     var26.field30859 = PathNodeType.BLOCKED;
                     var26.field30858 = -1.0F;
                     return var26;
                  }
               }
            }

            if (var15 == PathNodeType.FENCE) {
               var11 = this.method20641(var1, var2, var3);
               var11.field30856 = true;
               var11.field30859 = var15;
               var11.field30858 = var15.getPriority();
            }

            return var11;
         }
      } else {
         return null;
      }
   }

   private boolean method20628(AxisAlignedBB var1) {
      return (Boolean)this.field29474.computeIfAbsent(var1, var2 -> !this.field29475.hasNoCollisions(this.field29476, var1));
   }

   @Override
   public PathNodeType method20629(IBlockReader var1, int var2, int var3, int var4, MobEntity var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet<PathNodeType> var13 = EnumSet.noneOf(PathNodeType.class);
      PathNodeType var14 = PathNodeType.BLOCKED;
      BlockPos var15 = var5.getPosition();
      var14 = this.method20630(var1, var2, var3, var4, var6, var7, var8, var9, var10, var13, var14, var15);
      if (var13.contains(PathNodeType.FENCE)) {
         return PathNodeType.FENCE;
      } else if (var13.contains(PathNodeType.UNPASSABLE_RAIL)) {
         return PathNodeType.UNPASSABLE_RAIL;
      } else {
         PathNodeType var16 = PathNodeType.BLOCKED;

         for (PathNodeType var18 : var13) {
            if (var5.method4223(var18) < 0.0F) {
               return var18;
            }

            if (var5.method4223(var18) >= var5.method4223(var16)) {
               var16 = var18;
            }
         }

         return var14 == PathNodeType.OPEN && var5.method4223(var16) == 0.0F && var6 <= 1 ? PathNodeType.OPEN : var16;
      }
   }

   public PathNodeType method20630(
      IBlockReader var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      boolean var8,
      boolean var9,
      EnumSet<PathNodeType> var10,
      PathNodeType var11,
      BlockPos var12
   ) {
      for (int var15 = 0; var15 < var5; var15++) {
         for (int var16 = 0; var16 < var6; var16++) {
            for (int var17 = 0; var17 < var7; var17++) {
               int var18 = var15 + var2;
               int var19 = var16 + var3;
               int var20 = var17 + var4;
               PathNodeType var21 = this.method20621(var1, var18, var19, var20);
               var21 = this.method20620(var1, var8, var9, var12, var21);
               if (var15 == 0 && var16 == 0 && var17 == 0) {
                  var11 = var21;
               }

               var10.add(var21);
            }
         }
      }

      return var11;
   }

   public PathNodeType method20620(IBlockReader var1, boolean var2, boolean var3, BlockPos var4, PathNodeType var5) {
      if (var5 == PathNodeType.DOOR_WOOD_CLOSED && var2 && var3) {
         var5 = PathNodeType.WALKABLE_DOOR;
      }

      if (var5 == PathNodeType.DOOR_OPEN && !var3) {
         var5 = PathNodeType.BLOCKED;
      }

      if (var5 == PathNodeType.RAIL
         && !(var1.getBlockState(var4).getBlock() instanceof Class3429)
         && !(var1.getBlockState(var4.down()).getBlock() instanceof Class3429)) {
         var5 = PathNodeType.UNPASSABLE_RAIL;
      }

      if (var5 == PathNodeType.LEAVES) {
         var5 = PathNodeType.BLOCKED;
      }

      return var5;
   }

   private PathNodeType method20631(MobEntity var1, BlockPos var2) {
      return this.method20632(var1, var2.getX(), var2.getY(), var2.getZ());
   }

   private PathNodeType method20632(MobEntity var1, int var2, int var3, int var4) {
      return (PathNodeType)this.field29473
         .computeIfAbsent(
            BlockPos.pack(var2, var3, var4),
            var5 -> this.method20629(
                  this.field29475, var2, var3, var4, var1, this.field29478, this.field29479, this.field29480, this.method20648(), this.method20647()
               )
         );
   }

   @Override
   public PathNodeType method20621(IBlockReader var1, int var2, int var3, int var4) {
      return method20633(var1, new BlockPos.Mutable(var2, var3, var4));
   }

   public static PathNodeType method20633(IBlockReader var0, BlockPos.Mutable var1) {
      int var4 = var1.getX();
      int var5 = var1.getY();
      int var6 = var1.getZ();
      PathNodeType var7 = method20635(var0, var1);
      if (var7 == PathNodeType.OPEN && var5 >= 1) {
         PathNodeType var8 = method20635(var0, var1.setPos(var4, var5 - 1, var6));
         var7 = var8 != PathNodeType.WALKABLE && var8 != PathNodeType.OPEN && var8 != PathNodeType.WATER && var8 != PathNodeType.LAVA
            ? PathNodeType.WALKABLE
            : PathNodeType.OPEN;
         if (var8 == PathNodeType.DAMAGE_FIRE) {
            var7 = PathNodeType.DAMAGE_FIRE;
         }

         if (var8 == PathNodeType.DAMAGE_CACTUS) {
            var7 = PathNodeType.DAMAGE_CACTUS;
         }

         if (var8 == PathNodeType.DAMAGE_OTHER) {
            var7 = PathNodeType.DAMAGE_OTHER;
         }

         if (var8 == PathNodeType.STICKY_HONEY) {
            var7 = PathNodeType.STICKY_HONEY;
         }
      }

      if (var7 == PathNodeType.WALKABLE) {
         var7 = method20634(var0, var1.setPos(var4, var5, var6), var7);
      }

      return var7;
   }

   public static PathNodeType method20634(IBlockReader var0, BlockPos.Mutable var1, PathNodeType var2) {
      int var5 = var1.getX();
      int var6 = var1.getY();
      int var7 = var1.getZ();

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            for (int var10 = -1; var10 <= 1; var10++) {
               if (var8 != 0 || var10 != 0) {
                  var1.setPos(var5 + var8, var6 + var9, var7 + var10);
                  BlockState var11 = var0.getBlockState(var1);
                  if (var11.isIn(Blocks.CACTUS)) {
                     return PathNodeType.DANGER_CACTUS;
                  }

                  if (var11.isIn(Blocks.SWEET_BERRY_BUSH)) {
                     return PathNodeType.DANGER_OTHER;
                  }

                  if (method20636(var11)) {
                     return PathNodeType.DANGER_FIRE;
                  }

                  if (var0.getFluidState(var1).method23486(FluidTags.field40469)) {
                     return PathNodeType.WATER_BORDER;
                  }
               }
            }
         }
      }

      return var2;
   }

   public static PathNodeType method20635(IBlockReader var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      Block var5 = var4.getBlock();
      Material var6 = var4.getMaterial();
      if (var4.isAir()) {
         return PathNodeType.OPEN;
      } else if (var4.isIn(BlockTags.field32768) || var4.isIn(Blocks.LILY_PAD)) {
         return PathNodeType.TRAPDOOR;
      } else if (var4.isIn(Blocks.CACTUS)) {
         return PathNodeType.DAMAGE_CACTUS;
      } else if (var4.isIn(Blocks.SWEET_BERRY_BUSH)) {
         return PathNodeType.DAMAGE_OTHER;
      } else if (var4.isIn(Blocks.field37119)) {
         return PathNodeType.STICKY_HONEY;
      } else if (var4.isIn(Blocks.COCOA)) {
         return PathNodeType.COCOA;
      } else {
         FluidState var7 = var0.getFluidState(var1);
         if (var7.method23486(FluidTags.field40469)) {
            return PathNodeType.WATER;
         } else if (var7.method23486(FluidTags.field40470)) {
            return PathNodeType.LAVA;
         } else if (method20636(var4)) {
            return PathNodeType.DAMAGE_FIRE;
         } else if (DoorBlock.method12145(var4) && !var4.<Boolean>get(DoorBlock.OPEN)) {
            return PathNodeType.DOOR_WOOD_CLOSED;
         } else if (var5 instanceof DoorBlock && var6 == Material.field38967 && !var4.<Boolean>get(DoorBlock.OPEN)) {
            return PathNodeType.DOOR_IRON_CLOSED;
         } else if (var5 instanceof DoorBlock && var4.<Boolean>get(DoorBlock.OPEN)) {
            return PathNodeType.DOOR_OPEN;
         } else if (var5 instanceof Class3429) {
            return PathNodeType.RAIL;
         } else if (var5 instanceof Class3465) {
            return PathNodeType.LEAVES;
         } else if (!var5.isIn(BlockTags.field32771)
            && !var5.isIn(BlockTags.field32764)
            && (!(var5 instanceof FenceGateBlock) || var4.<Boolean>get(FenceGateBlock.OPEN))) {
            return var4.method23440(var0, var1, PathType.field12614) ? PathNodeType.OPEN : PathNodeType.BLOCKED;
         } else {
            return PathNodeType.FENCE;
         }
      }
   }

   private static boolean method20636(BlockState var0) {
      return var0.isIn(BlockTags.field32798)
         || var0.isIn(Blocks.LAVA)
         || var0.isIn(Blocks.field36890)
         || Class3244.method11655(var0);
   }
}
