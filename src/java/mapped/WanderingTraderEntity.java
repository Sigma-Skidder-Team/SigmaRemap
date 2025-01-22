package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class WanderingTraderEntity extends Class1043 {
   private BlockPos field5798;
   private int field5799;

   public WanderingTraderEntity(EntityType<? extends WanderingTraderEntity> var1, World var2) {
      super(var1, var2);
      this.forceSpawn = true;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600
         .addGoal(
            0,
            new Class2596<WanderingTraderEntity>(
               this,
               PotionUtils.method38187(new ItemStack(Items.field37971), Potions.INVISIBILITY),
               SoundEvents.field27217,
               var1 -> this.world.method6741() && !var1.isInvisible()
            )
         );
      this.field5600
         .addGoal(
            0,
            new Class2596<WanderingTraderEntity>(this, new ItemStack(Items.MILK_BUCKET), SoundEvents.field27222, var1 -> this.world.method6740() && var1.isInvisible())
         );
      this.field5600.addGoal(1, new Class2781(this));
      this.field5600.addGoal(1, new Class2770<ZombieEntity>(this, ZombieEntity.class, 8.0F, 0.5, 0.5));
      this.field5600.addGoal(1, new Class2770<EvokerEntity>(this, EvokerEntity.class, 12.0F, 0.5, 0.5));
      this.field5600.addGoal(1, new Class2770<VindicatorEntity>(this, VindicatorEntity.class, 8.0F, 0.5, 0.5));
      this.field5600.addGoal(1, new Class2770<VexEntity>(this, VexEntity.class, 8.0F, 0.5, 0.5));
      this.field5600.addGoal(1, new Class2770<Class1024>(this, Class1024.class, 15.0F, 0.5, 0.5));
      this.field5600.addGoal(1, new Class2770<IllusionerEntity>(this, IllusionerEntity.class, 12.0F, 0.5, 0.5));
      this.field5600.addGoal(1, new Class2770<ZoglinEntity>(this, ZoglinEntity.class, 10.0F, 0.5, 0.5));
      this.field5600.addGoal(1, new Class2747(this, 0.5));
      this.field5600.addGoal(1, new Class2615(this));
      this.field5600.addGoal(2, new Class2789(this, this, 2.0, 0.35));
      this.field5600.addGoal(4, new Class2660(this, 0.35));
      this.field5600.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 0.35));
      this.field5600.addGoal(9, new Class2613(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.addGoal(10, new Class2612(this, MobEntity.class, 8.0F));
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return null;
   }

   @Override
   public boolean method4746() {
      return false;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() != Items.field38034 && this.isAlive() && !this.method4741() && !this.isChild()) {
         if (var2 == Hand.MAIN_HAND) {
            var1.method2911(Stats.field40139);
         }

         if (!this.method4742().isEmpty()) {
            if (!this.world.isRemote) {
               this.method4683(var1);
               this.method4872(var1, this.getDisplayName(), 1);
            }

            return ActionResultType.method9002(this.world.isRemote);
         } else {
            return ActionResultType.method9002(this.world.isRemote);
         }
      } else {
         return super.method4285(var1, var2);
      }
   }

   @Override
   public void method4713() {
      Class5391[] var3 = (Class5391[]) VillagerTrades.field45415.get(1);
      Class5391[] var4 = (Class5391[]) VillagerTrades.field45415.get(2);
      if (var3 != null && var4 != null) {
         Class46 var5 = this.method4742();
         this.method4754(var5, var3, 5);
         int var6 = this.rand.nextInt(var4.length);
         Class5391 var7 = var4[var6];
         Class9346 var8 = var7.method16977(this, this.rand);
         if (var8 != null) {
            var5.add(var8);
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putInt("DespawnDelay", this.field5799);
      if (this.field5798 != null) {
         compound.put("WanderTarget", NBTUtil.writeBlockPos(this.field5798));
      }
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      if (compound.contains("DespawnDelay", 99)) {
         this.field5799 = compound.getInt("DespawnDelay");
      }

      if (compound.contains("WanderTarget")) {
         this.field5798 = NBTUtil.readBlockPos(compound.getCompound("WanderTarget"));
      }

      this.method4770(Math.max(0, this.method4767()));
   }

   @Override
   public boolean method4254(double var1) {
      return false;
   }

   @Override
   public void method4696(Class9346 var1) {
      if (var1.method35385()) {
         int var4 = 3 + this.rand.nextInt(4);
         this.world.addEntity(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), var4));
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.method4741() ? SoundEvents.field27215 : SoundEvents.field27223;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27220;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27216;
   }

   @Override
   public SoundEvent getDrinkSound(ItemStack var1) {
      Item var4 = var1.getItem();
      return var4 != Items.MILK_BUCKET ? SoundEvents.field27219 : SoundEvents.field27218;
   }

   @Override
   public SoundEvent method4749(boolean var1) {
      return !var1 ? SoundEvents.field27221 : SoundEvents.field27224;
   }

   @Override
   public SoundEvent method4748() {
      return SoundEvents.field27224;
   }

   public void method4755(int var1) {
      this.field5799 = var1;
   }

   public int method4756() {
      return this.field5799;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.isRemote) {
         this.method4757();
      }
   }

   private void method4757() {
      if (this.field5799 > 0 && !this.method4741() && --this.field5799 == 0) {
         this.remove();
      }
   }

   public void method4758(BlockPos var1) {
      this.field5798 = var1;
   }

   @Nullable
   private BlockPos method4759() {
      return this.field5798;
   }

   // $VF: synthetic method
   public static Class6990 method4762(WanderingTraderEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static BlockPos method4763(WanderingTraderEntity var0) {
      return var0.method4759();
   }

   // $VF: synthetic method
   public static Class6990 method4764(WanderingTraderEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4765(WanderingTraderEntity var0) {
      return var0.field5599;
   }

   // $VF: synthetic method
   public static Class6990 method4766(WanderingTraderEntity var0) {
      return var0.field5599;
   }
}
