package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.server.ServerWorld;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class PolarBearEntity extends AnimalEntity implements IAngerable {
   private static String[] field6009;
   private static final DataParameter<Boolean> field6010 = EntityDataManager.<Boolean>createKey(PolarBearEntity.class, DataSerializers.BOOLEAN);
   private float field6011;
   private float field6012;
   private int field6013;
   private static final RangedInteger field6014 = TickRangeConverter.convertRange(20, 39);
   private int field6015;
   private UUID field6016;

   public PolarBearEntity(EntityType<? extends PolarBearEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.POLAR_BEAR.create(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return false;
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(0, new Class2603(this));
      this.field5600.addGoal(1, new Class2658(this));
      this.field5600.addGoal(1, new Class2752(this));
      this.field5600.addGoal(4, new Class2764(this, 1.25));
      this.field5600.addGoal(5, new Class2736(this, 1.0));
      this.field5600.addGoal(6, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.addGoal(7, new Class2668(this));
      this.field5601.addGoal(1, new Class2707(this));
      this.field5601.addGoal(2, new Class2720(this));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601.addGoal(4, new NearestAttackableTargetGoal<FoxEntity>(this, FoxEntity.class, 10, true, true, (Predicate<LivingEntity>)null));
      this.field5601.addGoal(5, new ResetAngerGoal<PolarBearEntity>(this, false));
   }

   public static MutableAttribute method5180() {
      return MobEntity.method4220()
         .method21849(Attributes.MAX_HEALTH, 30.0)
         .method21849(Attributes.FOLLOW_RANGE, 20.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.25)
         .method21849(Attributes.ATTACK_DAMAGE, 6.0);
   }

   public static boolean method5181(EntityType<PolarBearEntity> var0, IWorld var1, SpawnReason var2, BlockPos var3, Random var4) {
      Optional var7 = var1.func_242406_i(var3);
      return !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Biomes.FROZEN_OCEAN))
            && !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Biomes.DEEP_FROZEN_OCEAN))
         ? canAnimalSpawn(var0, var1, var2, var3, var4)
         : var1.method7021(var3, 0) > 8 && var1.getBlockState(var3.down()).isIn(Blocks.ICE);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method4365((ServerWorld)this.world, compound);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      this.method4364(compound);
   }

   @Override
   public void method4346() {
      this.method4347(field6014.method29319(this.rand));
   }

   @Override
   public void method3016(PlayerEntity var1) {

   }

   @Override
   public void method4347(int var1) {
      this.field6015 = var1;
   }

   @Override
   public int method4348() {
      return this.field6015;
   }

   @Override
   public void setAngerTarget(UUID var1) {
      this.field6016 = var1;
   }

   @Override
   public UUID method4350() {
      return this.field6016;
   }

   @Override
   public SoundEvent getAmbientSound() {
      return !this.isChild() ? SoundEvents.field26970 : SoundEvents.field26971;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26973;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26972;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26974, 0.15F, 1.0F);
   }

   public void method5182() {
      if (this.field6013 <= 0) {
         this.playSound(SoundEvents.field26975, 1.0F, this.getSoundPitch());
         this.field6013 = 40;
      }
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field6010, false);
   }

   @Override
   public void tick() {
      super.tick();
      if (this.world.isRemote) {
         if (this.field6012 != this.field6011) {
            this.recalculateSize();
         }

         this.field6011 = this.field6012;
         if (!this.method5183()) {
            this.field6012 = MathHelper.clamp(this.field6012 - 1.0F, 0.0F, 6.0F);
         } else {
            this.field6012 = MathHelper.clamp(this.field6012 + 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.field6013 > 0) {
         this.field6013--;
      }

      if (!this.world.isRemote) {
         this.method4366((ServerWorld)this.world, true);
      }
   }

   @Override
   public EntitySize getSize(Pose var1) {
      if (!(this.field6012 > 0.0F)) {
         return super.getSize(var1);
      } else {
         float var4 = this.field6012 / 6.0F;
         float var5 = 1.0F + var4;
         return super.getSize(var1).method32100(1.0F, var5);
      }
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      boolean var4 = var1.attackEntityFrom(DamageSource.method31115(this), (float)((int)this.getAttributeValue(Attributes.ATTACK_DAMAGE)));
      if (var4) {
         this.applyEnchantments(this, var1);
      }

      return var4;
   }

   public boolean method5183() {
      return this.dataManager.<Boolean>method35445(field6010);
   }

   public void method5184(boolean var1) {
      this.dataManager.set(field6010, var1);
   }

   public float method5185(float var1) {
      return MathHelper.lerp(var1, this.field6011, this.field6012) / 6.0F;
   }

   @Override
   public float getWaterSlowDown() {
      return 0.98F;
   }

   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new Class5097(1.0F);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
