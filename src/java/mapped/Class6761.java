package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class Class6761 extends Class6762 {
   private static String[] field29468;
   private float field29469;
   private float field29470;

   @Override
   public void method20613(Class1667 var1, MobEntity var2) {
      super.method20613(var1, var2);
      var2.method4224(PathNodeType.WATER, 0.0F);
      this.field29469 = var2.method4223(PathNodeType.WALKABLE);
      var2.method4224(PathNodeType.WALKABLE, 6.0F);
      this.field29470 = var2.method4223(PathNodeType.WATER_BORDER);
      var2.method4224(PathNodeType.WATER_BORDER, 4.0F);
   }

   @Override
   public void method20614() {
      this.field29476.method4224(PathNodeType.WALKABLE, this.field29469);
      this.field29476.method4224(PathNodeType.WATER_BORDER, this.field29470);
      super.method20614();
   }

   @Override
   public Class7176 method20615() {
      return this.method20641(
         MathHelper.floor(this.field29476.getBoundingBox().minX),
         MathHelper.floor(this.field29476.getBoundingBox().minY + 0.5),
         MathHelper.floor(this.field29476.getBoundingBox().minZ)
      );
   }

   @Override
   public Class7175 method20616(double var1, double var3, double var5) {
      return new Class7175(this.method20641(MathHelper.floor(var1), MathHelper.floor(var3 + 0.5), MathHelper.floor(var5)));
   }

   @Override
   public int method20617(Class7176[] var1, Class7176 var2) {
      int var5 = 0;
      boolean var6 = true;
      BlockPos var7 = new BlockPos(var2.field30847, var2.field30848, var2.field30849);
      double var8 = this.method20618(var7);
      Class7176 var10 = this.method20619(var2.field30847, var2.field30848, var2.field30849 + 1, 1, var8);
      Class7176 var11 = this.method20619(var2.field30847 - 1, var2.field30848, var2.field30849, 1, var8);
      Class7176 var12 = this.method20619(var2.field30847 + 1, var2.field30848, var2.field30849, 1, var8);
      Class7176 var13 = this.method20619(var2.field30847, var2.field30848, var2.field30849 - 1, 1, var8);
      Class7176 var14 = this.method20619(var2.field30847, var2.field30848 + 1, var2.field30849, 0, var8);
      Class7176 var15 = this.method20619(var2.field30847, var2.field30848 - 1, var2.field30849, 1, var8);
      if (var10 != null && !var10.field30856) {
         var1[var5++] = var10;
      }

      if (var11 != null && !var11.field30856) {
         var1[var5++] = var11;
      }

      if (var12 != null && !var12.field30856) {
         var1[var5++] = var12;
      }

      if (var13 != null && !var13.field30856) {
         var1[var5++] = var13;
      }

      if (var14 != null && !var14.field30856) {
         var1[var5++] = var14;
      }

      if (var15 != null && !var15.field30856) {
         var1[var5++] = var15;
      }

      boolean var16 = var13 == null || var13.field30859 == PathNodeType.OPEN || var13.field30858 != 0.0F;
      boolean var17 = var10 == null || var10.field30859 == PathNodeType.OPEN || var10.field30858 != 0.0F;
      boolean var18 = var12 == null || var12.field30859 == PathNodeType.OPEN || var12.field30858 != 0.0F;
      boolean var19 = var11 == null || var11.field30859 == PathNodeType.OPEN || var11.field30858 != 0.0F;
      if (var16 && var19) {
         Class7176 var20 = this.method20619(var2.field30847 - 1, var2.field30848, var2.field30849 - 1, 1, var8);
         if (var20 != null && !var20.field30856) {
            var1[var5++] = var20;
         }
      }

      if (var16 && var18) {
         Class7176 var21 = this.method20619(var2.field30847 + 1, var2.field30848, var2.field30849 - 1, 1, var8);
         if (var21 != null && !var21.field30856) {
            var1[var5++] = var21;
         }
      }

      if (var17 && var19) {
         Class7176 var22 = this.method20619(var2.field30847 - 1, var2.field30848, var2.field30849 + 1, 1, var8);
         if (var22 != null && !var22.field30856) {
            var1[var5++] = var22;
         }
      }

      if (var17 && var18) {
         Class7176 var23 = this.method20619(var2.field30847 + 1, var2.field30848, var2.field30849 + 1, 1, var8);
         if (var23 != null && !var23.field30856) {
            var1[var5++] = var23;
         }
      }

      return var5;
   }

   private double method20618(BlockPos var1) {
      if (this.field29476.isInWater()) {
         return (double)var1.getY() + 0.5;
      } else {
         BlockPos var4 = var1.down();
         VoxelShape var5 = this.field29475.getBlockState(var4).method23414(this.field29475, var4);
         return (double)var4.getY() + (!var5.isEmpty() ? var5.getEnd(Direction.Axis.Y) : 0.0);
      }
   }

   @Nullable
   private Class7176 method20619(int var1, int var2, int var3, int var4, double var5) {
      Class7176 var9 = null;
      BlockPos var10 = new BlockPos(var1, var2, var3);
      double var11 = this.method20618(var10);
      if (!(var11 - var5 > 1.125)) {
         PathNodeType var13 = this.method20629(this.field29475, var1, var2, var3, this.field29476, this.field29478, this.field29479, this.field29480, false, false);
         float var14 = this.field29476.method4223(var13);
         double var15 = (double)this.field29476.getWidth() / 2.0;
         if (var14 >= 0.0F) {
            var9 = this.method20641(var1, var2, var3);
            var9.field30859 = var13;
            var9.field30858 = Math.max(var9.field30858, var14);
         }

         if (var13 != PathNodeType.WATER && var13 != PathNodeType.WALKABLE) {
            if (var9 == null && var4 > 0 && var13 != PathNodeType.FENCE && var13 != PathNodeType.UNPASSABLE_RAIL && var13 != PathNodeType.TRAPDOOR) {
               var9 = this.method20619(var1, var2 + 1, var3, var4 - 1, var5);
            }

            if (var13 == PathNodeType.OPEN) {
               AxisAlignedBB var17 = new AxisAlignedBB(
                  (double)var1 - var15 + 0.5,
                  (double)var2 + 0.001,
                  (double)var3 - var15 + 0.5,
                  (double)var1 + var15 + 0.5,
                  (double)((float)var2 + this.field29476.getHeight()),
                  (double)var3 + var15 + 0.5
               );
               if (!this.field29476.world.hasNoCollisions(this.field29476, var17)) {
                  return null;
               }

               PathNodeType var18 = this.method20629(
                  this.field29475, var1, var2 - 1, var3, this.field29476, this.field29478, this.field29479, this.field29480, false, false
               );
               if (var18 == PathNodeType.BLOCKED) {
                  var9 = this.method20641(var1, var2, var3);
                  var9.field30859 = PathNodeType.WALKABLE;
                  var9.field30858 = Math.max(var9.field30858, var14);
                  return var9;
               }

               if (var18 == PathNodeType.WATER) {
                  var9 = this.method20641(var1, var2, var3);
                  var9.field30859 = PathNodeType.WATER;
                  var9.field30858 = Math.max(var9.field30858, var14);
                  return var9;
               }

               int var19 = 0;

               while (var2 > 0 && var13 == PathNodeType.OPEN) {
                  var2--;
                  if (var19++ >= this.field29476.getMaxFallHeight()) {
                     return null;
                  }

                  var13 = this.method20629(this.field29475, var1, var2, var3, this.field29476, this.field29478, this.field29479, this.field29480, false, false);
                  var14 = this.field29476.method4223(var13);
                  if (var13 != PathNodeType.OPEN && var14 >= 0.0F) {
                     var9 = this.method20641(var1, var2, var3);
                     var9.field30859 = var13;
                     var9.field30858 = Math.max(var9.field30858, var14);
                     break;
                  }

                  if (var14 < 0.0F) {
                     return null;
                  }
               }
            }

            return var9;
         } else {
            if (var2 < this.field29476.world.getSeaLevel() - 10 && var9 != null) {
               var9.field30858++;
            }

            return var9;
         }
      } else {
         return null;
      }
   }

   @Override
   public PathNodeType method20620(IBlockReader var1, boolean var2, boolean var3, BlockPos var4, PathNodeType var5) {
      if (var5 == PathNodeType.RAIL
         && !(var1.getBlockState(var4).getBlock() instanceof Class3429)
         && !(var1.getBlockState(var4.down()).getBlock() instanceof Class3429)) {
         var5 = PathNodeType.UNPASSABLE_RAIL;
      }

      if (var5 == PathNodeType.DOOR_OPEN || var5 == PathNodeType.DOOR_WOOD_CLOSED || var5 == PathNodeType.DOOR_IRON_CLOSED) {
         var5 = PathNodeType.BLOCKED;
      }

      if (var5 == PathNodeType.LEAVES) {
         var5 = PathNodeType.BLOCKED;
      }

      return var5;
   }

   @Override
   public PathNodeType method20621(IBlockReader var1, int var2, int var3, int var4) {
      BlockPos.Mutable var7 = new BlockPos.Mutable();
      PathNodeType var8 = method20635(var1, var7.setPos(var2, var3, var4));
      if (var8 != PathNodeType.WATER) {
         if (var8 == PathNodeType.OPEN && var3 >= 1) {
            BlockState var14 = var1.getBlockState(new BlockPos(var2, var3 - 1, var4));
            PathNodeType var15 = method20635(var1, var7.setPos(var2, var3 - 1, var4));
            if (var15 != PathNodeType.WALKABLE && var15 != PathNodeType.OPEN && var15 != PathNodeType.LAVA) {
               var8 = PathNodeType.WALKABLE;
            } else {
               var8 = PathNodeType.OPEN;
            }

            if (var15 == PathNodeType.DAMAGE_FIRE || var14.isIn(Blocks.MAGMA_BLOCK) || var14.isIn(BlockTags.field32809)) {
               var8 = PathNodeType.DAMAGE_FIRE;
            }

            if (var15 == PathNodeType.DAMAGE_CACTUS) {
               var8 = PathNodeType.DAMAGE_CACTUS;
            }

            if (var15 == PathNodeType.DAMAGE_OTHER) {
               var8 = PathNodeType.DAMAGE_OTHER;
            }
         }

         if (var8 == PathNodeType.WALKABLE) {
            var8 = method20634(var1, var7.setPos(var2, var3, var4), var8);
         }

         return var8;
      } else {
         for (Direction var12 : Direction.values()) {
            PathNodeType var13 = method20635(var1, var7.setPos(var2, var3, var4).method8379(var12));
            if (var13 == PathNodeType.BLOCKED) {
               return PathNodeType.WATER_BORDER;
            }
         }

         return PathNodeType.WATER;
      }
   }
}
