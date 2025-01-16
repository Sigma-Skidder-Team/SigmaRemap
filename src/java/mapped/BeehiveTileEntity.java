package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BeeThingyIdk;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeehiveTileEntity extends TileEntity implements ITickableTileEntity {
   private final List<BeeThingyIdk> field5392 = Lists.newArrayList();
   private BlockPos field5393 = null;

   public BeehiveTileEntity() {
      super(TileEntityType.field21453);
   }

   @Override
   public void markDirty() {
      if (this.method3912()) {
         this.method3915((PlayerEntity)null, this.world.getBlockState(this.getPos()), Class2084.field13573);
      }

      super.markDirty();
   }

   public boolean method3912() {
      if (this.world == null) {
         return false;
      } else {
         for (BlockPos var4 : BlockPos.method8359(this.pos.add(-1, -1, -1), this.pos.add(1, 1, 1))) {
            if (this.world.getBlockState(var4).getBlock() instanceof Class3399) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean method3913() {
      return this.field5392.isEmpty();
   }

   public boolean method3914() {
      return this.field5392.size() == 3;
   }

   public void method3915(PlayerEntity var1, BlockState var2, Class2084 var3) {
      List<Entity> var6 = this.method3916(var2, var3);
      if (var1 != null) {
         for (Entity var8 : var6) {
            if (var8 instanceof BeeEntity) {
               BeeEntity var9 = (BeeEntity)var8;
               if (var1.getPositionVec().squareDistanceTo(var8.getPositionVec()) <= 16.0) {
                  if (this.method3920()) {
                     var9.method4426(400);
                  } else {
                     var9.method4233(var1);
                  }
               }
            }
         }
      }
   }

   private List<Entity> method3916(BlockState var1, Class2084 var2) {
      ArrayList var5 = Lists.newArrayList();
      this.field5392.removeIf(var4 -> this.method3923(var1, var4, var5, var2));
      return var5;
   }

   public void method3917(Entity var1, boolean var2) {
      this.method3922(var1, var2, 0);
   }

   public int method3918() {
      return this.field5392.size();
   }

   public static int method3919(BlockState var0) {
      return var0.<Integer>get(Class3366.field18936);
   }

   public boolean method3920() {
      return Class3244.method11654(this.world, this.getPos());
   }

   public void method3921() {
      DebugPacketSender.method23624(this);
   }

   public void method3922(Entity var1, boolean var2, int var3) {
      if (this.field5392.size() < 3) {
         var1.stopRiding();
         var1.removePassengers();
         CompoundNBT var6 = new CompoundNBT();
         var1.writeUnlessPassenger(var6);
         this.field5392.add(new Thingy(var6, var3, !var2 ? 600 : 2400));
         if (this.world != null) {
            if (var1 instanceof BeeEntity) {
               BeeEntity var7 = (BeeEntity)var1;
               if (var7.method4422() && (!this.method3925() || this.world.rand.nextBoolean())) {
                  this.field5393 = var7.method4421();
               }
            }

            BlockPos var8 = this.getPos();
            this.world
               .playSound(
                  (PlayerEntity)null,
                  (double)var8.getX(),
                  (double)var8.getY(),
                  (double)var8.getZ(),
                  SoundEvents.field26396,
                  SoundCategory.field14732,
                  1.0F,
                  1.0F
               );
         }

         var1.remove();
      }
   }

   private boolean method3923(BlockState var1, Thingy var2, List<Entity> var3, Class2084 var4) {
      if ((this.world.method6741() || this.world.method6795()) && var4 != Class2084.field13573) {
         return false;
      } else {
         BlockPos var7 = this.getPos();
         CompoundNBT var8 = Thingy.method35245(var2);
         var8.remove("Passengers");
         var8.remove("Leash");
         var8.remove("UUID");
         Direction var9 = var1.<Direction>get(Class3366.field18935);
         BlockPos var10 = var7.offset(var9);
         boolean var11 = !this.world.getBlockState(var10).method23414(this.world, var10).isEmpty();
         if (var11 && var4 != Class2084.field13573) {
            return false;
         } else {
            Entity var12 = EntityType.method33223(var8, this.world, var0 -> var0);
            if (var12 == null) {
               return false;
            } else if (var12.getType().method33228(EntityTypeTags.field38736)) {
               if (var12 instanceof BeeEntity) {
                  BeeEntity var13 = (BeeEntity)var12;
                  if (this.method3925() && !var13.method4422() && this.world.rand.nextFloat() < 0.9F) {
                     var13.method4423(this.field5393);
                  }

                  if (var4 == Class2084.field13571) {
                     var13.method4449();
                     if (var1.getBlock().isIn(BlockTags.field32794)) {
                        int var14 = method3919(var1);
                        if (var14 < 5) {
                           int var15 = this.world.rand.nextInt(100) != 0 ? 1 : 2;
                           if (var14 + var15 > 5) {
                              var15--;
                           }

                           this.world.setBlockState(this.getPos(), var1.with(Class3366.field18936, Integer.valueOf(var14 + var15)));
                        }
                     }
                  }

                  this.method3924(Thingy.method35246(var2), var13);
                  if (var3 != null) {
                     var3.add(var13);
                  }

                  float var24 = var12.getWidth();
                  double var16 = !var11 ? 0.55 + (double)(var24 / 2.0F) : 0.0;
                  double var18 = (double)var7.getX() + 0.5 + var16 * (double)var9.getXOffset();
                  double var20 = (double)var7.getY() + 0.5 - (double)(var12.getHeight() / 2.0F);
                  double var22 = (double)var7.getZ() + 0.5 + var16 * (double)var9.getZOffset();
                  var12.setLocationAndAngles(var18, var20, var22, var12.rotationYaw, var12.rotationPitch);
               }

               this.world.playSound((PlayerEntity)null, var7, SoundEvents.field26397, SoundCategory.field14732, 1.0F, 1.0F);
               return this.world.addEntity(var12);
            } else {
               return false;
            }
         }
      }
   }

   private void method3924(int var1, BeeEntity var2) {
      int var5 = var2.method4767();
      if (var5 >= 0) {
         if (var5 > 0) {
            var2.method4770(Math.max(0, var5 - var1));
         }
      } else {
         var2.method4770(Math.min(0, var5 + var1));
      }

      var2.method4504(Math.max(0, var2.method4505() - var1));
      var2.method4429();
   }

   private boolean method3925() {
      return this.field5393 != null;
   }

   private void method3926() {
      Iterator var3 = this.field5392.iterator();
      BlockState var4 = this.getBlockState();

      while (var3.hasNext()) {
         Thingy var5 = (Thingy)var3.next();
         if (Thingy.method35246(var5) > Thingy.method35248(var5)) {
            Class2084 var6 = !Thingy.method35245(var5).getBoolean("HasNectar") ? Class2084.field13572 : Class2084.field13571;
            if (this.method3923(var4, var5, (List<Entity>)null, var6)) {
               var3.remove();
            }
         }

         Thingy.method35247(var5);
      }
   }

   @Override
   public void tick() {
      if (!this.world.isRemote) {
         this.method3926();
         BlockPos var3 = this.getPos();
         if (this.field5392.size() > 0 && this.world.method6814().nextDouble() < 0.005) {
            double var4 = (double)var3.getX() + 0.5;
            double var6 = (double)var3.getY();
            double var8 = (double)var3.getZ() + 0.5;
            this.world.playSound((PlayerEntity)null, var4, var6, var8, SoundEvents.field26399, SoundCategory.field14732, 1.0F, 1.0F);
         }

         this.method3921();
      }
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5392.clear();
      ListNBT var5 = var2.getList("Bees", 10);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         CompoundNBT var7 = var5.getCompound(var6);
         Thingy var8 = new Thingy(var7.getCompound("EntityData"), var7.getInt("TicksInHive"), var7.getInt("MinOccupationTicks"));
         this.field5392.add(var8);
      }

      this.field5393 = null;
      if (var2.contains("FlowerPos")) {
         this.field5393 = NBTUtil.readBlockPos(var2.getCompound("FlowerPos"));
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.put("Bees", this.method3927());
      if (this.method3925()) {
         var1.put("FlowerPos", NBTUtil.writeBlockPos(this.field5393));
      }

      return var1;
   }

   public ListNBT method3927() {
      ListNBT var3 = new ListNBT();

      for (Thingy var5 : this.field5392) {
         Thingy.method35245(var5).remove("UUID");
         CompoundNBT var6 = new CompoundNBT();
         var6.put("EntityData", Thingy.method35245(var5));
         var6.putInt("TicksInHive", Thingy.method35246(var5));
         var6.putInt("MinOccupationTicks", Thingy.method35248(var5));
         var3.add(var6);
      }

      return var3;
   }
}
