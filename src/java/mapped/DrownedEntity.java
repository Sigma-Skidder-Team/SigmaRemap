package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class DrownedEntity extends ZombieEntity implements Class1022 {
   private static String[] field5754;
   private boolean field5755;
   public final Class6997 field5756;
   public final Class6991 field5757;

   public DrownedEntity(EntityType<? extends DrownedEntity> var1, World var2) {
      super(var1, var2);
      this.stepHeight = 1.0F;
      this.field5596 = new Class6835(this);
      this.method4224(PathNodeType.WATER, 0.0F);
      this.field5756 = new Class6997(this, var2);
      this.field5757 = new Class6991(this, var2);
   }

   @Override
   public void applyEntityAI() {
      this.field5600.addGoal(1, new Class2670(this, 1.0));
      this.field5600.addGoal(2, new Class2599(this, 1.0, 40, 10.0F));
      this.field5600.addGoal(2, new Class2655(this, 1.0, false));
      this.field5600.addGoal(5, new Class2629(this, 1.0));
      this.field5600.addGoal(6, new Class2659(this, 1.0, this.world.getSeaLevel()));
      this.field5600.addGoal(7, new Class2736(this, 1.0));
      this.field5601.addGoal(1, new HurtByTargetGoal(this, DrownedEntity.class).method10918(ZombifiedPiglinEntity.class));
      this.field5601.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4646));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<Class1043>(this, Class1043.class, false));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
      this.field5601.addGoal(5, new NearestAttackableTargetGoal<TurtleEntity>(this, TurtleEntity.class, 10, true, false, TurtleEntity.field5963));
   }

   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      if (this.getItemStackFromSlot(EquipmentSlotType.OFFHAND).isEmpty() && this.rand.nextFloat() < 0.03F) {
         this.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(Items.field38146));
         this.field5605[EquipmentSlotType.OFFHAND.getIndex()] = 2.0F;
      }

      return var4;
   }

   public static boolean canSpawn(EntityType<DrownedEntity> var0, ServerWorldAccess var1, SpawnReason var2, BlockPos var3, Random var4) {
      Optional var7 = var1.method7178(var3);
      boolean var8 = var1.method6997() != Difficulty.PEACEFUL
         && method4340(var1, var3, var4)
         && (var2 == SpawnReason.field14393 || var1.getFluidState(var3).method23486(FluidTags.field40469));
      return !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Biomes.RIVER))
            && !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Biomes.FROZEN_RIVER))
         ? var4.nextInt(40) == 0 && method4641(var1, var3) && var8
         : var4.nextInt(15) == 0 && var8;
   }

   private static boolean method4641(IWorld var0, BlockPos var1) {
      return var1.getY() < var0.getSeaLevel() - 5;
   }

   @Override
   public boolean method4642() {
      return false;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.isInWater() ? SoundEvents.field26514 : SoundEvents.field26515;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return !this.isInWater() ? SoundEvents.field26518 : SoundEvents.field26519;
   }

   @Override
   public SoundEvent getDeathSound() {
      return !this.isInWater() ? SoundEvents.field26516 : SoundEvents.field26517;
   }

   @Override
   public SoundEvent method4643() {
      return SoundEvents.field26521;
   }

   @Override
   public SoundEvent method2859() {
      return SoundEvents.field26522;
   }

   @Override
   public ItemStack method4644() {
      return ItemStack.EMPTY;
   }

   @Override
   public void method4270(Class9755 var1) {
      if ((double)this.rand.nextFloat() > 0.9) {
         int var4 = this.rand.nextInt(16);
         if (var4 >= 10) {
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.field37906));
         } else {
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.TRIDENT));
         }
      }
   }

   @Override
   public boolean method4250(ItemStack var1, ItemStack var2) {
      if (var2.getItem() != Items.field38146) {
         if (var2.getItem() != Items.TRIDENT) {
            return var1.getItem() != Items.TRIDENT ? super.method4250(var1, var2) : true;
         } else {
            return var1.getItem() != Items.TRIDENT ? false : var1.method32117() < var2.method32117();
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean shouldDrown() {
      return false;
   }

   @Override
   public boolean method4266(IWorldReader var1) {
      return var1.checkNoEntityCollision(this);
   }

   public boolean method4646(LivingEntity var1) {
      return var1 == null ? false : !this.world.method6740() || var1.isInWater();
   }

   @Override
   public boolean method2952() {
      return !this.isSwimming();
   }

   private boolean method4647() {
      if (this.field5755) {
         return true;
      } else {
         LivingEntity var3 = this.method4232();
         return var3 != null && var3.isInWater();
      }
   }

   @Override
   public void travel(Vector3d var1) {
      if (this.isServerWorld() && this.isInWater() && this.method4647()) {
         this.moveRelative(0.01F, var1);
         this.move(MoverType.SELF, this.getMotion());
         this.setMotion(this.getMotion().scale(0.9));
      } else {
         super.travel(var1);
      }
   }

   @Override
   public void updateSwimming() {
      if (!this.world.isRemote) {
         if (this.isServerWorld() && this.isInWater() && this.method4647()) {
            this.field5599 = this.field5756;
            this.setSwimming(true);
         } else {
            this.field5599 = this.field5757;
            this.setSwimming(false);
         }
      }
   }

   public boolean method4648() {
      Class8238 var3 = this.method4230().method21657();
      if (var3 != null) {
         BlockPos var4 = var3.method28712();
         if (var4 != null) {
            double var5 = this.getDistanceNearest((double)var4.getX(), (double)var4.getY(), (double)var4.getZ());
            if (var5 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void method4530(LivingEntity var1, float var2) {
      TridentEntity var5 = new TridentEntity(this.world, this, new ItemStack(Items.TRIDENT));
      double var6 = var1.getPosX() - this.getPosX();
      double var8 = var1.getPosYHeight(0.3333333333333333) - var5.getPosY();
      double var10 = var1.getPosZ() - this.getPosZ();
      double var12 = (double) MathHelper.sqrt(var6 * var6 + var10 * var10);
      var5.shoot(var6, var8 + var12 * 0.2F, var10, 1.6F, (float)(14 - this.world.method6997().getId() * 4));
      this.playSound(SoundEvents.field26520, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
      this.world.addEntity(var5);
   }

   public void method4649(boolean var1) {
      this.field5755 = var1;
   }

   // $VF: synthetic method
   public static Class6990 method4650(DrownedEntity var0, Class6990 var1) {
      return var0.field5599 = var1;
   }

   // $VF: synthetic method
   public static boolean method4651(DrownedEntity var0) {
      return var0.method4647();
   }

   // $VF: synthetic method
   public static boolean method4652(DrownedEntity var0) {
      return var0.field5755;
   }
}
