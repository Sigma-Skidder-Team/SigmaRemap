package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.UUID;

public abstract class Class1018 extends Class1045 {
   private int field5702;
   private UUID field5703;

   public Class1018(EntityType<? extends Class1018> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14195, 16.0F);
      this.method4224(Class2163.field14196, -1.0F);
   }

   @Override
   public void updateAITasks() {
      if (this.method4767() != 0) {
         this.field5702 = 0;
      }

      super.updateAITasks();
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.method4767() != 0) {
         this.field5702 = 0;
      }

      if (this.field5702 > 0) {
         this.field5702--;
         if (this.field5702 % 10 == 0) {
            double var3 = this.rand.nextGaussian() * 0.02;
            double var5 = this.rand.nextGaussian() * 0.02;
            double var7 = this.rand.nextGaussian() * 0.02;
            this.world.addParticle(ParticleTypes.field34080, this.getPosXRandom(1.0), this.getPosYRandom() + 0.5, this.getPosZRandom(1.0), var3, var5, var7);
         }
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.isInvulnerableTo(var1)) {
         this.field5702 = 0;
         return super.attackEntityFrom(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public float method4339(BlockPos var1, IWorldReader var2) {
      return !var2.getBlockState(var1.down()).isIn(Blocks.field36395) ? var2.method7009(var1) - 0.5F : 10.0F;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("InLove", this.field5702);
      if (this.field5703 != null) {
         var1.method104("LoveCause", this.field5703);
      }
   }

   @Override
   public double getYOffset() {
      return 0.14;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5702 = var1.getInt("InLove");
      this.field5703 = !var1.method106("LoveCause") ? null : var1.method105("LoveCause");
   }

   public static boolean method4500(EntityType<? extends Class1018> var0, IWorld var1, Class2202 var2, BlockPos var3, Random var4) {
      return var1.getBlockState(var3.down()).isIn(Blocks.field36395) && var1.method7021(var3, 0) > 8;
   }

   @Override
   public int method4236() {
      return 120;
   }

   @Override
   public boolean method4254(double var1) {
      return false;
   }

   @Override
   public int getExperiencePoints(PlayerEntity var1) {
      return 1 + this.world.rand.nextInt(3);
   }

   public boolean method4381(ItemStack var1) {
      return var1.getItem() == Items.field37842;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (this.method4381(var5)) {
         int var6 = this.method4767();
         if (!this.world.isRemote && var6 == 0 && this.method4502()) {
            this.method4501(var1, var5);
            this.method4503(var1);
            return ActionResultType.SUCCESS;
         }

         if (this.isChild()) {
            this.method4501(var1, var5);
            this.method4768((int)((float)(-var6 / 20) * 0.1F), true);
            return ActionResultType.method9002(this.world.isRemote);
         }

         if (this.world.isRemote) {
            return ActionResultType.field14819;
         }
      }

      return super.method4285(var1, var2);
   }

   public void method4501(PlayerEntity var1, ItemStack var2) {
      if (!var1.abilities.isCreativeMode) {
         var2.shrink(1);
      }
   }

   public boolean method4502() {
      return this.field5702 <= 0;
   }

   public void method4503(PlayerEntity var1) {
      this.field5702 = 600;
      if (var1 != null) {
         this.field5703 = var1.getUniqueID();
      }

      this.world.setEntityState(this, (byte)18);
   }

   public void method4504(int var1) {
      this.field5702 = var1;
   }

   public int method4505() {
      return this.field5702;
   }

   @Nullable
   public ServerPlayerEntity method4506() {
      if (this.field5703 != null) {
         PlayerEntity var3 = this.world.method7196(this.field5703);
         return !(var3 instanceof ServerPlayerEntity) ? null : (ServerPlayerEntity)var3;
      } else {
         return null;
      }
   }

   public boolean method4507() {
      return this.field5702 > 0;
   }

   public void method4508() {
      this.field5702 = 0;
   }

   public boolean method4386(Class1018 var1) {
      if (var1 != this) {
         return var1.getClass() != this.getClass() ? false : this.method4507() && var1.method4507();
      } else {
         return false;
      }
   }

   public void method4509(ServerWorld var1, Class1018 var2) {
      Class1045 var5 = this.method4389(var1, var2);
      if (var5 != null) {
         ServerPlayerEntity var6 = this.method4506();
         if (var6 == null && var2.method4506() != null) {
            var6 = var2.method4506();
         }

         if (var6 != null) {
            var6.method2911(Stats.field40136);
            CriteriaTriggers.field44479.method15112(var6, this, var2, var5);
         }

         this.method4770(6000);
         var2.method4770(6000);
         this.method4508();
         var2.method4508();
         var5.method4308(true);
         var5.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), 0.0F, 0.0F);
         var1.method6995(var5);
         var1.setEntityState(this, (byte)18);
         if (var1.getGameRules().getBoolean(Class5462.field24227)) {
            var1.addEntity(new ExperienceOrbEntity(var1, this.getPosX(), this.getPosY(), this.getPosZ(), this.getRNG().nextInt(7) + 1));
         }
      }
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 18) {
         super.handleStatusUpdate(var1);
      } else {
         for (int var4 = 0; var4 < 7; var4++) {
            double var5 = this.rand.nextGaussian() * 0.02;
            double var7 = this.rand.nextGaussian() * 0.02;
            double var9 = this.rand.nextGaussian() * 0.02;
            this.world.addParticle(ParticleTypes.field34080, this.getPosXRandom(1.0), this.getPosYRandom() + 0.5, this.getPosZRandom(1.0), var5, var7, var9);
         }
      }
   }
}
