package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Iterator;
import java.util.List;

public class Class955 extends TileEntity implements Class935 {
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
      return (float)this.field5362.method539() * this.method3853(this.method3849(var1));
   }

   public float method3851(float var1) {
      return (float)this.field5362.method540() * this.method3853(this.method3849(var1));
   }

   public float method3852(float var1) {
      return (float)this.field5362.method541() * this.method3853(this.method3849(var1));
   }

   private float method3853(float var1) {
      return !this.field5363 ? 1.0F - var1 : var1 - 1.0F;
   }

   private BlockState method3854() {
      return !this.method3846() && this.method3848() && this.field5361.getBlock() instanceof Class3435
         ? Blocks.PISTON_HEAD
            .method11579()
            .method23465(Class3436.field19212, Boolean.valueOf(this.field5366 > 0.25F))
            .method23465(Class3436.field19211, !this.field5361.method23448(Blocks.STICKY_PISTON) ? Class180.field638 : Class180.field639)
            .method23465(Class3436.field19198, this.field5361.<Direction>method23463(Class3435.field19198))
         : this.field5361;
   }

   private void method3855(float var1) {
      Direction var4 = this.method3860();
      double var5 = (double)(var1 - this.field5366);
      VoxelShape var7 = this.method3854().method23414(this.field5324, this.getPos());
      if (!var7.method19516()) {
         AxisAlignedBB var8 = this.method3862(var7.method19514());
         List var9 = this.field5324.method7181((Entity)null, Class7769.method25747(var8, var4, var5).method19666(var8));
         if (!var9.isEmpty()) {
            List<AxisAlignedBB> var10 = var7.method19521();
            boolean var11 = this.field5361.method23448(Blocks.field36764);
            Iterator var12 = var9.iterator();

            while (true) {
               Entity var13;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  var13 = (Entity)var12.next();
                  if (var13.method3422() != Class2315.field15865) {
                     if (!var11) {
                        break;
                     }

                     if (!(var13 instanceof ServerPlayerEntity)) {
                        Vector3d var14 = var13.method3433();
                        double var15 = var14.x;
                        double var17 = var14.y;
                        double var19 = var14.z;
                        switch (Class8024.field34486[var4.method544().ordinal()]) {
                           case 1:
                              var15 = (double)var4.method539();
                              break;
                           case 2:
                              var17 = (double)var4.method540();
                              break;
                           case 3:
                              var19 = (double)var4.method541();
                        }

                        var13.method3435(var15, var17, var19);
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
      var1.move(Class2107.field13744, new Vector3d(var2 * (double)var4.method539(), var2 * (double)var4.method540(), var2 * (double)var4.method541()));
      field5365.set((Direction)null);
   }

   private void method3857(float var1) {
      if (this.method3859()) {
         Direction var4 = this.method3860();
         if (var4.method544().method324()) {
            double var5 = this.field5361.method23414(this.field5324, this.field5325).method19513(Class113.field414);
            AxisAlignedBB var7 = this.method3862(new AxisAlignedBB(0.0, var5, 0.0, 1.0, 1.5000000999999998, 1.0));
            double var8 = (double)(var1 - this.field5366);

            for (Entity var11 : this.field5324.method6770((Entity)null, var7, var1x -> method3858(var7, var1x))) {
               method3856(var4, var11, var8, var4);
            }
         }
      }
   }

   private static boolean method3858(AxisAlignedBB var0, Entity var1) {
      return var1.method3422() == Class2315.field15862
         && var1.method3226()
         && var1.getPosX() >= var0.field28449
         && var1.getPosX() <= var0.field28452
         && var1.getPosZ() >= var0.field28451
         && var1.getPosZ() <= var0.field28454;
   }

   private boolean method3859() {
      return this.field5361.method23448(Blocks.field37119);
   }

   public Direction method3860() {
      return !this.field5363 ? this.field5362.method536() : this.field5362;
   }

   private static double method3861(AxisAlignedBB var0, Direction var1, AxisAlignedBB var2) {
      switch (Class8024.field34487[var1.ordinal()]) {
         case 1:
            return var0.field28452 - var2.field28449;
         case 2:
            return var2.field28452 - var0.field28449;
         case 3:
         default:
            return var0.field28453 - var2.field28450;
         case 4:
            return var2.field28453 - var0.field28450;
         case 5:
            return var0.field28454 - var2.field28451;
         case 6:
            return var2.field28454 - var0.field28451;
      }
   }

   private AxisAlignedBB method3862(AxisAlignedBB var1) {
      double var4 = (double)this.method3853(this.field5366);
      return var1.method19667(
         (double)this.field5325.getX() + var4 * (double)this.field5362.method539(),
         (double)this.field5325.getY() + var4 * (double)this.field5362.method540(),
         (double)this.field5325.getZ() + var4 * (double)this.field5362.method541()
      );
   }

   private void method3863(Entity var1, Direction var2, double var3) {
      AxisAlignedBB var7 = var1.getBoundingBox();
      AxisAlignedBB var8 = VoxelShapes.method27426().method19514().method19668(this.field5325);
      if (var7.method19670(var8)) {
         Direction var9 = var2.method536();
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
      if (this.field5324 != null && (this.field5367 < 1.0F || this.field5324.isRemote)) {
         this.field5366 = 1.0F;
         this.field5367 = this.field5366;
         this.field5324.method6762(this.field5325);
         this.method3765();
         if (this.field5324.getBlockState(this.field5325).method23448(Blocks.MOVING_PISTON)) {
            BlockState var3;
            if (!this.field5364) {
               var3 = Block.method11542(this.field5361, this.field5324, this.field5325);
            } else {
               var3 = Blocks.AIR.method11579();
            }

            this.field5324.setBlockState(this.field5325, var3, 3);
            this.field5324.neighborChanged(this.field5325, var3.getBlock(), this.field5325);
         }
      }
   }

   @Override
   public void method3647() {
      this.field5368 = this.field5324.method6783();
      this.field5367 = this.field5366;
      if (!(this.field5367 >= 1.0F)) {
         float var3 = this.field5366 + 0.5F;
         this.method3855(var3);
         this.method3857(var3);
         this.field5366 = var3;
         if (this.field5366 >= 1.0F) {
            this.field5366 = 1.0F;
         }
      } else if (this.field5324.isRemote && this.field5369 < 5) {
         this.field5369++;
      } else {
         this.field5324.method6762(this.field5325);
         this.method3765();
         if (this.field5361 != null && this.field5324.getBlockState(this.field5325).method23448(Blocks.MOVING_PISTON)) {
            BlockState var4 = Block.method11542(this.field5361, this.field5324, this.field5325);
            if (!var4.isAir()) {
               if (var4.method23462(Class8820.field39710) && var4.<Boolean>method23463(Class8820.field39710)) {
                  var4 = var4.method23465(Class8820.field39710, Boolean.valueOf(false));
               }

               this.field5324.setBlockState(this.field5325, var4, 67);
               this.field5324.neighborChanged(this.field5325, var4.getBlock(), this.field5325);
            } else {
               this.field5324.setBlockState(this.field5325, this.field5361, 84);
               Block.method11543(this.field5361, var4, this.field5324, this.field5325, 3);
            }
         }
      }
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.field5361 = Class8354.method29285(var2.getCompound("blockState"));
      this.field5362 = Direction.byIndex(var2.getInt("facing"));
      this.field5366 = var2.getFloat("progress");
      this.field5367 = this.field5366;
      this.field5363 = var2.getBoolean("extending");
      this.field5364 = var2.getBoolean("source");
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.put("blockState", Class8354.method29287(this.field5361));
      var1.method102("facing", this.field5362.getIndex());
      var1.putFloat("progress", this.field5367);
      var1.putBoolean("extending", this.field5363);
      var1.putBoolean("source", this.field5364);
      return var1;
   }

   public VoxelShape method3866(Class1665 var1, BlockPos var2) {
      VoxelShape var5;
      if (!this.field5363 && this.field5364) {
         var5 = this.field5361.method23465(Class3435.field19202, Boolean.valueOf(true)).method23414(var1, var2);
      } else {
         var5 = VoxelShapes.method27425();
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
               .method11579()
               .method23465(Class3436.field19198, this.field5362)
               .method23465(Class3436.field19212, Boolean.valueOf(this.field5363 != 1.0F - this.field5366 < 0.25F));
         }

         float var8 = this.method3853(this.field5366);
         double var9 = (double)((float)this.field5362.method539() * var8);
         double var11 = (double)((float)this.field5362.method540() * var8);
         double var13 = (double)((float)this.field5362.method541() * var8);
         return VoxelShapes.method27431(var5, var7.method23414(var1, var2).withOffset(var9, var11, var13));
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
