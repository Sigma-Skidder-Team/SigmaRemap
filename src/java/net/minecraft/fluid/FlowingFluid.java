package net.minecraft.fluid;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class FlowingFluid extends Fluid {
   public static final BooleanProperty field32712 = BlockStateProperties.field39690;
   public static final IntegerProperty field32713 = BlockStateProperties.field39753;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8570>> field32714 = ThreadLocal.<Object2ByteLinkedOpenHashMap<Class8570>>withInitial(
      () -> {
         Class2361 var2 = new Class2361(200);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );
   private final Map<FluidState, VoxelShape> field32715 = Maps.newIdentityHashMap();

   @Override
   public void method25046(StateContainer.Builder<Fluid, FluidState> var1) {
      var1.add(field32712);
   }

   @Override
   public Vector3d method25056(IBlockReader var1, BlockPos var2, FluidState var3) {
      double var6 = 0.0;
      double var8 = 0.0;
      BlockPos.Mutable var10 = new BlockPos.Mutable();

      for (Direction var12 : Direction.Plane.HORIZONTAL) {
         var10.method8377(var2, var12);
         FluidState var13 = var1.getFluidState(var10);
         if (this.method25069(var13)) {
            float var14 = var13.method23476();
            float var15 = 0.0F;
            if (var14 != 0.0F) {
               if (var14 > 0.0F) {
                  var15 = var3.method23476() - var14;
               }
            } else if (!var1.getBlockState(var10).getMaterial().blocksMovement()) {
               BlockPos var16 = var10.down();
               FluidState var17 = var1.getFluidState(var16);
               if (this.method25069(var17)) {
                  var14 = var17.method23476();
                  if (var14 > 0.0F) {
                     var15 = var3.method23476() - (var14 - 0.8888889F);
                  }
               }
            }

            if (var15 != 0.0F) {
               var6 += (double)((float)var12.getXOffset() * var15);
               var8 += (double)((float)var12.getZOffset() * var15);
            }
         }
      }

      Vector3d var18 = new Vector3d(var6, 0.0, var8);
      if (var3.<Boolean>get(field32712)) {
         for (Direction var20 : Direction.Plane.HORIZONTAL) {
            var10.method8377(var2, var20);
            if (this.method25070(var1, var10, var20) || this.method25070(var1, var10.up(), var20)) {
               var18 = var18.method11333().add(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return var18.method11333();
   }

   private boolean method25069(FluidState var1) {
      return var1.isEmpty() || var1.getFluid().method25066(this);
   }

   public boolean method25070(IBlockReader var1, BlockPos var2, Direction var3) {
      BlockState var6 = var1.getBlockState(var2);
      FluidState var7 = var1.getFluidState(var2);
      if (!var7.getFluid().method25066(this)) {
         if (var3 != Direction.UP) {
            return var6.getMaterial() != Material.field38964 ? var6.method23454(var1, var2, var3) : false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public void method25071(IWorld var1, BlockPos var2, FluidState var3) {
      if (!var3.isEmpty()) {
         BlockState var6 = var1.getBlockState(var2);
         BlockPos var7 = var2.down();
         BlockState var8 = var1.getBlockState(var7);
         FluidState var9 = this.method25073(var1, var7, var8);
         if (!this.method25091(var1, var2, var6, Direction.DOWN, var7, var8, var1.getFluidState(var7), var9.getFluid())) {
            if (var3.isSource() || !this.method25084(var1, var9.getFluid(), var2, var6, var7, var8)) {
               this.method25072(var1, var2, var3, var6);
            }
         } else {
            this.method25080(var1, var7, var8, Direction.DOWN, var9);
            if (this.method25088(var1, var2) >= 3) {
               this.method25072(var1, var2, var3, var6);
            }
         }
      }
   }

   private void method25072(IWorld var1, BlockPos var2, FluidState var3, BlockState var4) {
      int var7 = var3.method23477() - this.method25092(var1);
      if (var3.<Boolean>get(field32712)) {
         var7 = 7;
      }

      if (var7 > 0) {
         Map<Direction, FluidState> var8 = this.method25089(var1, var2, var4);

         for (Entry<Direction, FluidState> var10 : var8.entrySet()) {
            Direction var11 = var10.getKey();
            FluidState var12 = var10.getValue();
            BlockPos var13 = var2.offset(var11);
            BlockState var14 = var1.getBlockState(var13);
            if (this.method25091(var1, var2, var4, var11, var13, var14, var1.getFluidState(var13), var12.getFluid())) {
               this.method25080(var1, var13, var14, var11, var12);
            }
         }
      }
   }

   public FluidState method25073(IWorldReader var1, BlockPos var2, BlockState var3) {
      int var6 = 0;
      int var7 = 0;

      for (Direction var9 : Direction.Plane.HORIZONTAL) {
         BlockPos var10 = var2.offset(var9);
         BlockState var11 = var1.getBlockState(var10);
         FluidState var12 = var11.method23449();
         if (var12.getFluid().method25066(this) && this.method25074(var9, var1, var2, var3, var10, var11)) {
            if (var12.isSource()) {
               var7++;
            }

            var6 = Math.max(var6, var12.method23477());
         }
      }

      if (this.method25079() && var7 >= 2) {
         BlockState var13 = var1.getBlockState(var2.down());
         FluidState var15 = var13.method23449();
         if (var13.getMaterial().isSolid() || this.method25086(var15)) {
            return this.getStillFluidState(false);
         }
      }

      BlockPos var14 = var2.up();
      BlockState var16 = var1.getBlockState(var14);
      FluidState var17 = var16.method23449();
      if (!var17.isEmpty() && var17.getFluid().method25066(this) && this.method25074(Direction.UP, var1, var2, var3, var14, var16)) {
         return this.method25076(8, true);
      } else {
         int var18 = var6 - this.method25092(var1);
         return var18 > 0 ? this.method25076(var18, false) : Fluids.EMPTY.method25049();
      }
   }

   private boolean method25074(Direction var1, IBlockReader var2, BlockPos var3, BlockState var4, BlockPos var5, BlockState var6) {
      Object2ByteLinkedOpenHashMap var9;
      if (!var4.getBlock().method11582() && !var6.getBlock().method11582()) {
         var9 = field32714.get();
      } else {
         var9 = null;
      }

      Class8570 var10;
      if (var9 == null) {
         var10 = null;
      } else {
         var10 = new Class8570(var4, var6, var1);
         byte var11 = var9.getAndMoveToFirst(var10);
         if (var11 != 127) {
            return var11 != 0;
         }
      }

      VoxelShape var14 = var4.method23414(var2, var3);
      VoxelShape var12 = var6.method23414(var2, var5);
      boolean var13 = ! VoxelShapes.method27443(var14, var12, var1);
      if (var9 != null) {
         if (var9.size() == 200) {
            var9.removeLastByte();
         }

         var9.putAndMoveToFirst(var10, (byte)(!var13 ? 0 : 1));
      }

      return var13;
   }

   public abstract Fluid method25075();

   public FluidState method25076(int var1, boolean var2) {
      return this.method25075().method25049().with(field32713, Integer.valueOf(var1)).with(field32712, Boolean.valueOf(var2));
   }

   public abstract Fluid method25077();

   public FluidState getStillFluidState(boolean var1) {
      return this.method25077().method25049().with(field32712, Boolean.valueOf(var1));
   }

   public abstract boolean method25079();

   public void method25080(IWorld var1, BlockPos var2, BlockState var3, Direction var4, FluidState var5) {
      if (!(var3.getBlock() instanceof Class3449)) {
         if (!var3.isAir()) {
            this.method25081(var1, var2, var3);
         }

         var1.setBlockState(var2, var5.getBlockState(), 3);
      } else {
         ((Class3449)var3.getBlock()).method11532(var1, var2, var3, var5);
      }
   }

   public abstract void method25081(IWorld var1, BlockPos var2, BlockState var3);

   private static short method25082(BlockPos var0, BlockPos var1) {
      int var4 = var1.getX() - var0.getX();
      int var5 = var1.getZ() - var0.getZ();
      return (short)((var4 + 128 & 0xFF) << 8 | var5 + 128 & 0xFF);
   }

   public int method25083(
      IWorldReader var1,
      BlockPos var2,
      int var3,
      Direction var4,
      BlockState var5,
      BlockPos var6,
      Short2ObjectMap<Pair<BlockState, FluidState>> var7,
      Short2BooleanMap var8
   ) {
      int var11 = 1000;

      for (Direction var13 : Direction.Plane.HORIZONTAL) {
         if (var13 != var4) {
            BlockPos var14 = var2.offset(var13);
            short var15 = method25082(var6, var14);
            Pair var16 = (Pair)var7.computeIfAbsent(var15, var2x -> {
               BlockState var5x = var1.getBlockState(var14);
               return Pair.of(var5x, var5x.method23449());
            });
            BlockState var17 = (BlockState)var16.getFirst();
            FluidState var18 = (FluidState)var16.getSecond();
            if (this.method25085(var1, this.method25075(), var2, var5, var13, var14, var17, var18)) {
               boolean var19 = var8.computeIfAbsent(var15, var4x -> {
                  BlockPos var7x = var14.down();
                  BlockState var8x = var1.getBlockState(var7x);
                  return this.method25084(var1, this.method25075(), var14, var17, var7x, var8x);
               });
               if (var19) {
                  return var3;
               }

               if (var3 < this.method25087(var1)) {
                  int var20 = this.method25083(var1, var14, var3 + 1, var13.getOpposite(), var17, var6, var7, var8);
                  if (var20 < var11) {
                     var11 = var20;
                  }
               }
            }
         }
      }

      return var11;
   }

   private boolean method25084(IBlockReader var1, Fluid var2, BlockPos var3, BlockState var4, BlockPos var5, BlockState var6) {
      if (this.method25074(Direction.DOWN, var1, var3, var4, var5, var6)) {
         return !var6.method23449().getFluid().method25066(this) ? this.method25090(var1, var5, var6, var2) : true;
      } else {
         return false;
      }
   }

   private boolean method25085(IBlockReader var1, Fluid var2, BlockPos var3, BlockState var4, Direction var5, BlockPos var6, BlockState var7, FluidState var8) {
      return !this.method25086(var8) && this.method25074(var5, var1, var3, var4, var6, var7) && this.method25090(var1, var6, var7, var2);
   }

   private boolean method25086(FluidState var1) {
      return var1.getFluid().method25066(this) && var1.isSource();
   }

   public abstract int method25087(IWorldReader var1);

   private int method25088(IWorldReader var1, BlockPos var2) {
      int var5 = 0;

      for (Direction var7 : Direction.Plane.HORIZONTAL) {
         BlockPos var8 = var2.offset(var7);
         FluidState var9 = var1.getFluidState(var8);
         if (this.method25086(var9)) {
            var5++;
         }
      }

      return var5;
   }

   public Map<Direction, FluidState> method25089(IWorldReader var1, BlockPos var2, BlockState var3) {
      int var6 = 1000;
      EnumMap var7 = Maps.newEnumMap(Direction.class);
      Short2ObjectOpenHashMap var8 = new Short2ObjectOpenHashMap();
      Short2BooleanOpenHashMap var9 = new Short2BooleanOpenHashMap();

      for (Direction var11 : Direction.Plane.HORIZONTAL) {
         BlockPos var12 = var2.offset(var11);
         short var13 = method25082(var2, var12);
         Pair var14 = (Pair)var8.computeIfAbsent(var13, var2x -> {
            BlockState var5 = var1.getBlockState(var12);
            return Pair.of(var5, var5.method23449());
         });
         BlockState var15 = (BlockState)var14.getFirst();
         FluidState var16 = (FluidState)var14.getSecond();
         FluidState var17 = this.method25073(var1, var12, var15);
         if (this.method25085(var1, var17.getFluid(), var2, var3, var11, var12, var15, var16)) {
            BlockPos var18 = var12.down();
            boolean var19 = var9.computeIfAbsent(var13, var5 -> {
               BlockState var8x = var1.getBlockState(var18);
               return this.method25084(var1, this.method25075(), var12, var15, var18, var8x);
            });
            int var20;
            if (!var19) {
               var20 = this.method25083(var1, var12, 1, var11.getOpposite(), var15, var2, var8, var9);
            } else {
               var20 = 0;
            }

            if (var20 < var6) {
               var7.clear();
            }

            if (var20 <= var6) {
               var7.put(var11, var17);
               var6 = var20;
            }
         }
      }

      return var7;
   }

   private boolean method25090(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      Block var7 = var3.getBlock();
      if (!(var7 instanceof Class3449)) {
         if (!(var7 instanceof DoorBlock)
            && !var7.isIn(BlockTags.field32790)
            && var7 != Blocks.LADDER
            && var7 != Blocks.SUGAR_CANE
            && var7 != Blocks.field37013) {
            Material var8 = var3.getMaterial();
            return var8 != Material.field38934 && var8 != Material.field38933 && var8 != Material.field38937 && var8 != Material.field38940
               ? !var8.blocksMovement()
               : false;
         } else {
            return false;
         }
      } else {
         return ((Class3449)var7).method11531(var1, var2, var3, var4);
      }
   }

   public boolean method25091(IBlockReader var1, BlockPos var2, BlockState var3, Direction var4, BlockPos var5, BlockState var6, FluidState var7, Fluid var8) {
      return var7.method23488(var1, var5, var8, var4) && this.method25074(var4, var1, var2, var3, var5, var6) && this.method25090(var1, var5, var6, var8);
   }

   public abstract int method25092(IWorldReader var1);

   public int method25093(World var1, BlockPos var2, FluidState var3, FluidState var4) {
      return this.getTickRate(var1);
   }

   @Override
   public void method25052(World var1, BlockPos var2, FluidState var3) {
      if (!var3.isSource()) {
         FluidState var6 = this.method25073(var1, var2, var1.getBlockState(var2));
         int var7 = this.method25093(var1, var2, var3, var6);
         if (!var6.isEmpty()) {
            if (!var6.equals(var3)) {
               var3 = var6;
               BlockState var8 = var6.getBlockState();
               var1.setBlockState(var2, var8, 2);
               var1.getPendingFluidTicks().scheduleTick(var2, var6.getFluid(), var7);
               var1.notifyNeighborsOfStateChange(var2, var8.getBlock());
            }
         } else {
            var3 = var6;
            var1.setBlockState(var2, Blocks.AIR.getDefaultState(), 3);
         }
      }

      this.method25071(var1, var2, var3);
   }

   public static int method25094(FluidState var0) {
      return !var0.isSource() ? 8 - Math.min(var0.method23477(), 8) + (!var0.<Boolean>get(field32712) ? 0 : 8) : 0;
   }

   private static boolean method25095(FluidState var0, IBlockReader var1, BlockPos var2) {
      return var0.getFluid().method25066(var1.getFluidState(var2.up()).getFluid());
   }

   @Override
   public float method25061(FluidState var1, IBlockReader var2, BlockPos var3) {
      return !method25095(var1, var2, var3) ? var1.method23476() : 1.0F;
   }

   @Override
   public float method25062(FluidState var1) {
      return (float)var1.method23477() / 9.0F;
   }

   @Override
   public VoxelShape method25068(FluidState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23477() == 9 && method25095(var1, var2, var3)
         ? VoxelShapes.method27426()
         : this.field32715.computeIfAbsent(var1, var2x -> VoxelShapes.create(0.0, 0.0, 0.0, 1.0, (double)var2x.method23475(var2, var3), 1.0));
   }
}
