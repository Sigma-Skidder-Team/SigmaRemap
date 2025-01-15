package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.PistonType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import java.util.Iterator;
import java.util.List;

public class Class955 extends TileEntity implements ITickableTileEntity {
   private BlockState field5361;
   private Direction field5362;
   private boolean field5363;
   private boolean field5364;
   private static final ThreadLocal<Direction> field5365 = ThreadLocal.<Direction>withInitial(() -> null);
   private float field5366;
   private float field5367;
   private long field5368;
   private int field5369;

   public Class955() {
      super(TileEntityType.field21430);
   }

   public Class955(BlockState var1, Direction var2, boolean var3, boolean var4) {
      this();
      this.field5361 = var1;
      this.field5362 = var2;
      this.field5363 = var3;
      this.field5364 = var4;
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   public boolean method3846() {
      return this.field5363;
   }

   public Direction method3847() {
      return this.field5362;
   }

   public boolean method3848() {
      return this.field5364;
   }

   public float method3849(float var1) {
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return MathHelper.lerp(var1, this.field5367, this.field5366);
   }

   public float method3850(float var1) {
      return (float)this.field5362.getXOffset() * this.method3853(this.method3849(var1));
   }

   public float method3851(float var1) {
      return (float)this.field5362.getYOffset() * this.method3853(this.method3849(var1));
   }

   public float method3852(float var1) {
      return (float)this.field5362.getZOffset() * this.method3853(this.method3849(var1));
   }

   private float method3853(float var1) {
      return !this.field5363 ? 1.0F - var1 : var1 - 1.0F;
   }

   private BlockState method3854() {
      return !this.method3846() && this.method3848() && this.field5361.getBlock() instanceof Class3435
         ? Blocks.PISTON_HEAD
            .getDefaultState()
            .with(Class3436.field19212, Boolean.valueOf(this.field5366 > 0.25F))
            .with(Class3436.field19211, !this.field5361.isIn(Blocks.STICKY_PISTON) ? PistonType.field638 : PistonType.field639)
            .with(Class3436.field19198, this.field5361.<Direction>get(Class3435.field19198))
         : this.field5361;
   }

   private void method3855(float var1) {
      Direction var4 = this.method3860();
      double var5 = (double)(var1 - this.field5366);
      VoxelShape var7 = this.method3854().method23414(this.world, this.getPos());
      if (!var7.isEmpty()) {
         AxisAlignedBB var8 = this.method3862(var7.getBoundingBox());
         List var9 = this.world.method7181((Entity)null, Class7769.method25747(var8, var4, var5).method19666(var8));
         if (!var9.isEmpty()) {
            List<AxisAlignedBB> var10 = var7.method19521();
            boolean var11 = this.field5361.isIn(Blocks.field36764);
            Iterator var12 = var9.iterator();

            while (true) {
               Entity var13;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  var13 = (Entity)var12.next();
                  if (var13.method3422() != PushReaction.field15865) {
                     if (!var11) {
                        break;
                     }

                     if (!(var13 instanceof ServerPlayerEntity)) {
                        Vector3d var14 = var13.getMotion();
                        double var15 = var14.x;
                        double var17 = var14.y;
                        double var19 = var14.z;
                        switch (Class8024.field34486[var4.getAxis().ordinal()]) {
                           case 1:
                              var15 = (double)var4.getXOffset();
                              break;
                           case 2:
                              var17 = (double)var4.getYOffset();
                              break;
                           case 3:
                              var19 = (double)var4.getZOffset();
                        }

                        var13.setMotion(var15, var17, var19);
                        break;
                     }
                  }
               }

               double var21 = 0.0;

               for (AxisAlignedBB var24 : var10) {
                  AxisAlignedBB var25 = Class7769.method25747(this.method3862(var24), var4, var5);
                  AxisAlignedBB var26 = var13.getBoundingBox();
                  if (var25.method19670(var26)) {
                     var21 = Math.max(var21, method3861(var25, var4, var26));
                     if (var21 >= var5) {
                        break;
                     }
                  }
               }

               if (!(var21 <= 0.0)) {
                  var21 = Math.min(var21, var5) + 0.01;
                  method3856(var4, var13, var21, var4);
                  if (!this.field5363 && this.field5364) {
                     this.method3863(var13, var4, var5);
                  }
               }
            }
         }
      }
   }

   private static void method3856(Direction var0, Entity var1, double var2, Direction var4) {
      field5365.set(var0);
      var1.move(MoverType.field13744, new Vector3d(var2 * (double)var4.getXOffset(), var2 * (double)var4.getYOffset(), var2 * (double)var4.getZOffset()));
      field5365.set((Direction)null);
   }

   private void method3857(float var1) {
      if (this.method3859()) {
         Direction var4 = this.method3860();
         if (var4.getAxis().isHorizontal()) {
            double var5 = this.field5361.method23414(this.world, this.pos).getEnd(Direction.Axis.Y);
            AxisAlignedBB var7 = this.method3862(new AxisAlignedBB(0.0, var5, 0.0, 1.0, 1.5000000999999998, 1.0));
            double var8 = (double)(var1 - this.field5366);

            for (Entity var11 : this.world.getEntitiesInAABBexcluding((Entity)null, var7, var1x -> method3858(var7, var1x))) {
               method3856(var4, var11, var8, var4);
            }
         }
      }
   }

   private static boolean method3858(AxisAlignedBB var0, Entity var1) {
      return var1.method3422() == PushReaction.field15862
         && var1.isOnGround()
         && var1.getPosX() >= var0.minX
         && var1.getPosX() <= var0.maxX
         && var1.getPosZ() >= var0.minZ
         && var1.getPosZ() <= var0.maxZ;
   }

   private boolean method3859() {
      return this.field5361.isIn(Blocks.field37119);
   }

   public Direction method3860() {
      return !this.field5363 ? this.field5362.getOpposite() : this.field5362;
   }

   private static double method3861(AxisAlignedBB var0, Direction var1, AxisAlignedBB var2) {
      switch (Class8024.field34487[var1.ordinal()]) {
         case 1:
            return var0.maxX - var2.minX;
         case 2:
            return var2.maxX - var0.minX;
         case 3:
         default:
            return var0.maxY - var2.minY;
         case 4:
            return var2.maxY - var0.minY;
         case 5:
            return var0.maxZ - var2.minZ;
         case 6:
            return var2.maxZ - var0.minZ;
      }
   }

   private AxisAlignedBB method3862(AxisAlignedBB var1) {
      double var4 = (double)this.method3853(this.field5366);
      return var1.offset(
         (double)this.pos.getX() + var4 * (double)this.field5362.getXOffset(),
         (double)this.pos.getY() + var4 * (double)this.field5362.getYOffset(),
         (double)this.pos.getZ() + var4 * (double)this.field5362.getZOffset()
      );
   }

   private void method3863(Entity var1, Direction var2, double var3) {
      AxisAlignedBB var7 = var1.getBoundingBox();
      AxisAlignedBB var8 = VoxelShapes.method27426().getBoundingBox().method19668(this.pos);
      if (var7.method19670(var8)) {
         Direction var9 = var2.getOpposite();
         double var10 = method3861(var8, var9, var7) + 0.01;
         double var12 = method3861(var8, var9, var7.method19665(var8)) + 0.01;
         if (Math.abs(var10 - var12) < 0.01) {
            var10 = Math.min(var10, var3) + 0.01;
            method3856(var2, var1, var10, var9);
         }
      }
   }

   public BlockState method3864() {
      return this.field5361;
   }

   public void method3865() {
      if (this.world != null && (this.field5367 < 1.0F || this.world.isRemote)) {
         this.field5366 = 1.0F;
         this.field5367 = this.field5366;
         this.world.method6762(this.pos);
         this.method3765();
         if (this.world.getBlockState(this.pos).isIn(Blocks.MOVING_PISTON)) {
            BlockState var3;
            if (!this.field5364) {
               var3 = Block.method11542(this.field5361, this.world, this.pos);
            } else {
               var3 = Blocks.AIR.getDefaultState();
            }

            this.world.setBlockState(this.pos, var3, 3);
            this.world.neighborChanged(this.pos, var3.getBlock(), this.pos);
         }
      }
   }

   @Override
   public void tick() {
      this.field5368 = this.world.getGameTime();
      this.field5367 = this.field5366;
      if (!(this.field5367 >= 1.0F)) {
         float var3 = this.field5366 + 0.5F;
         this.method3855(var3);
         this.method3857(var3);
         this.field5366 = var3;
         if (this.field5366 >= 1.0F) {
            this.field5366 = 1.0F;
         }
      } else if (this.world.isRemote && this.field5369 < 5) {
         this.field5369++;
      } else {
         this.world.method6762(this.pos);
         this.method3765();
         if (this.field5361 != null && this.world.getBlockState(this.pos).isIn(Blocks.MOVING_PISTON)) {
            BlockState var4 = Block.method11542(this.field5361, this.world, this.pos);
            if (!var4.isAir()) {
               if (var4.method23462(BlockStateProperties.WATERLOGGED) && var4.<Boolean>get(BlockStateProperties.WATERLOGGED)) {
                  var4 = var4.with(BlockStateProperties.WATERLOGGED, Boolean.valueOf(false));
               }

               this.world.setBlockState(this.pos, var4, 67);
               this.world.neighborChanged(this.pos, var4.getBlock(), this.pos);
            } else {
               this.world.setBlockState(this.pos, this.field5361, 84);
               Block.method11543(this.field5361, var4, this.world, this.pos, 3);
            }
         }
      }
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5361 = NBTUtil.readBlockState(var2.getCompound("blockState"));
      this.field5362 = Direction.byIndex(var2.getInt("facing"));
      this.field5366 = var2.getFloat("progress");
      this.field5367 = this.field5366;
      this.field5363 = var2.getBoolean("extending");
      this.field5364 = var2.getBoolean("source");
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.put("blockState", NBTUtil.writeBlockState(this.field5361));
      var1.putInt("facing", this.field5362.getIndex());
      var1.putFloat("progress", this.field5367);
      var1.putBoolean("extending", this.field5363);
      var1.putBoolean("source", this.field5364);
      return var1;
   }

   public VoxelShape method3866(IBlockReader var1, BlockPos var2) {
      VoxelShape var5;
      if (!this.field5363 && this.field5364) {
         var5 = this.field5361.with(Class3435.field19202, Boolean.valueOf(true)).method23414(var1, var2);
      } else {
         var5 = VoxelShapes.empty();
      }

      Direction var6 = field5365.get();
      if ((double)this.field5366 < 1.0 && var6 == this.method3860()) {
         return var5;
      } else {
         BlockState var7;
         if (!this.method3848()) {
            var7 = this.field5361;
         } else {
            var7 = Blocks.PISTON_HEAD
               .getDefaultState()
               .with(Class3436.field19198, this.field5362)
               .with(Class3436.field19212, Boolean.valueOf(this.field5363 != 1.0F - this.field5366 < 0.25F));
         }

         float var8 = this.method3853(this.field5366);
         double var9 = (double)((float)this.field5362.getXOffset() * var8);
         double var11 = (double)((float)this.field5362.getYOffset() * var8);
         double var13 = (double)((float)this.field5362.getZOffset() * var8);
         return VoxelShapes.or(var5, var7.method23414(var1, var2).withOffset(var9, var11, var13));
      }
   }

   public long method3867() {
      return this.field5368;
   }

   @Override
   public double method3773() {
      return 68.0;
   }
}
