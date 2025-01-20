package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.IAngerable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.UUID;

public class IronGolemEntity extends Class1056 implements IAngerable {
   public static final DataParameter<Byte> field5849 = EntityDataManager.<Byte>createKey(IronGolemEntity.class, DataSerializers.field33390);
   private int field5850;
   private int field5851;
   private static final RangedInteger field5852 = TickRangeConverter.convertRange(20, 39);
   private int field5853;
   private UUID field5854;

   public IronGolemEntity(EntityType<? extends IronGolemEntity> var1, World var2) {
      super(var1, var2);
      this.stepHeight = 1.0F;
   }

   @Override
   public void method4219() {
      this.field5600.addGoal(1, new Class2647(this, 1.0, true));
      this.field5600.addGoal(2, new Class2782(this, 0.9, 32.0F));
      this.field5600.addGoal(2, new Class2742(this, 0.6, false));
      this.field5600.addGoal(4, new Class2739(this, 0.6));
      this.field5600.addGoal(5, new Class2777(this));
      this.field5600.addGoal(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.addGoal(8, new Class2668(this));
      this.field5601.addGoal(1, new Class2700(this));
      this.field5601.addGoal(2, new HurtByTargetGoal(this));
      this.field5601.addGoal(3, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601
         .addGoal(3, new NearestAttackableTargetGoal<MobEntity>(this, MobEntity.class, 5, false, false, var0 -> var0 instanceof IMob && !(var0 instanceof CreeperEntity)));
      this.field5601.addGoal(4, new ResetAngerGoal<IronGolemEntity>(this, false));
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5849, (byte)0);
   }

   public static MutableAttribute method4863() {
      return MobEntity.method4220()
         .method21849(Attributes.MAX_HEALTH, 100.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.25)
         .method21849(Attributes.KNOCKBACK_RESISTANCE, 1.0)
         .method21849(Attributes.ATTACK_DAMAGE, 15.0);
   }

   @Override
   public int decreaseAirSupply(int air) {
      return air;
   }

   @Override
   public void collideWithEntity(Entity var1) {
      if (var1 instanceof IMob && !(var1 instanceof CreeperEntity) && this.getRNG().nextInt(20) == 0) {
         this.method4233((LivingEntity)var1);
      }

      super.collideWithEntity(var1);
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.field5850 > 0) {
         this.field5850--;
      }

      if (this.field5851 > 0) {
         this.field5851--;
      }

      if (horizontalMag(this.getMotion()) > 2.5000003E-7F && this.rand.nextInt(5) == 0) {
         int var3 = MathHelper.floor(this.getPosX());
         int var4 = MathHelper.floor(this.getPosY() - 0.2F);
         int var5 = MathHelper.floor(this.getPosZ());
         BlockState var6 = this.world.getBlockState(new BlockPos(var3, var4, var5));
         if (!var6.isAir()) {
            this.world
               .addParticle(
                  new BlockParticleData(ParticleTypes.BLOCK, var6),
                  this.getPosX() + ((double)this.rand.nextFloat() - 0.5) * (double)this.getWidth(),
                  this.getPosY() + 0.1,
                  this.getPosZ() + ((double)this.rand.nextFloat() - 0.5) * (double)this.getWidth(),
                  4.0 * ((double)this.rand.nextFloat() - 0.5),
                  0.5,
                  ((double)this.rand.nextFloat() - 0.5) * 4.0
               );
         }
      }

      if (!this.world.isRemote) {
         this.method4366((ServerWorld)this.world, true);
      }
   }

   @Override
   public boolean canAttack(EntityType<?> var1) {
      if (this.method4869() && var1 == EntityType.PLAYER) {
         return false;
      } else {
         return var1 != EntityType.CREEPER ? super.canAttack(var1) : false;
      }
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putBoolean("PlayerCreated", this.method4869());
      this.method4364(compound);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method4870(compound.getBoolean("PlayerCreated"));
      this.method4365((ServerWorld)this.world, compound);
   }

   @Override
   public void method4346() {
      this.method4347(field5852.method29319(this.rand));
   }

   @Override
   public void method4347(int var1) {
      this.field5853 = var1;
   }

   @Override
   public int method4348() {
      return this.field5853;
   }

   @Override
   public void setAngerTarget(UUID var1) {
      this.field5854 = var1;
   }

   @Override
   public UUID method4350() {
      return this.field5854;
   }

   private float method4864() {
      return (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      this.field5850 = 10;
      this.world.setEntityState(this, (byte)4);
      float var4 = this.method4864();
      float var5 = (int)var4 <= 0 ? var4 : var4 / 2.0F + (float)this.rand.nextInt((int)var4);
      boolean var6 = var1.attackEntityFrom(DamageSource.method31115(this), var5);
      if (var6) {
         var1.setMotion(var1.getMotion().add(0.0, 0.4F, 0.0));
         this.applyEnchantments(this, var1);
      }

      this.playSound(SoundEvents.field26700, 1.0F, 1.0F);
      return var6;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      Class2286 var5 = this.method4865();
      boolean var6 = super.attackEntityFrom(source, var2);
      if (var6 && this.method4865() != var5) {
         this.playSound(SoundEvents.field26701, 1.0F, 1.0F);
      }

      return var6;
   }

   public Class2286 method4865() {
      return Class2286.method9024(this.getHealth() / this.method3075());
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 4) {
         if (var1 != 11) {
            if (var1 != 34) {
               super.handleStatusUpdate(var1);
            } else {
               this.field5851 = 0;
            }
         } else {
            this.field5851 = 400;
         }
      } else {
         this.field5850 = 10;
         this.playSound(SoundEvents.field26700, 1.0F, 1.0F);
      }
   }

   public int method4866() {
      return this.field5850;
   }

   public void method4867(boolean var1) {
      if (!var1) {
         this.field5851 = 0;
         this.world.setEntityState(this, (byte)34);
      } else {
         this.field5851 = 400;
         this.world.setEntityState(this, (byte)11);
      }
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26703;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26702;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      Item var6 = var5.getItem();
      if (var6 == Items.field37801) {
         float var7 = this.getHealth();
         this.heal(25.0F);
         if (this.getHealth() != var7) {
            float var8 = 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F;
            this.playSound(SoundEvents.field26704, 1.0F, var8);
            if (!var1.abilities.isCreativeMode) {
               var5.shrink(1);
            }

            return ActionResultType.method9002(this.world.isRemote);
         } else {
            return ActionResultType.field14820;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26705, 1.0F, 1.0F);
   }

   public int method4868() {
      return this.field5851;
   }

   public boolean method4869() {
      return (this.dataManager.<Byte>method35445(field5849) & 1) != 0;
   }

   public void method4870(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5849);
      if (!var1) {
         this.dataManager.set(field5849, (byte)(var4 & -2));
      } else {
         this.dataManager.set(field5849, (byte)(var4 | 1));
      }
   }

   @Override
   public void onDeath(DamageSource var1) {
      super.onDeath(var1);
   }

   @Override
   public boolean method4266(IWorldReader var1) {
      BlockPos var4 = this.getPosition();
      BlockPos var5 = var4.down();
      BlockState var6 = var1.getBlockState(var5);
      if (!var6.method23419(var1, var5, this)) {
         return false;
      } else {
         for (int var7 = 1; var7 < 3; var7++) {
            BlockPos var8 = var4.up(var7);
            BlockState var9 = var1.getBlockState(var8);
            if (!Class8170.method28428(var1, var8, var9, var9.getFluidState(), EntityType.IRON_GOLEM)) {
               return false;
            }
         }

         return Class8170.method28428(var1, var4, var1.getBlockState(var4), Fluids.EMPTY.method25049(), EntityType.IRON_GOLEM) && var1.checkNoEntityCollision(this);
      }
   }

   @Override
   public Vector3d func_241205_ce_() {
      return new Vector3d(0.0, (double)(0.875F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
   }
}
