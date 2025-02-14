package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class RavagerEntity extends AbstractRaiderEntity {
   private static final Predicate<Entity> field5727 = var0 -> var0.isAlive() && !(var0 instanceof RavagerEntity);
   private int field5728;
   private int field5729;
   private int field5730;

   public RavagerEntity(EntityType<? extends RavagerEntity> var1, World var2) {
      super(var1, var2);
      this.stepHeight = 1.0F;
      this.field5594 = 20;
   }

   @Override
   public void method4219() {
      super.method4219();
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(4, new Class2653(this));
      this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.4));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this, AbstractRaiderEntity.class).method10918());
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<Class1043>(this, Class1043.class, true));
      this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
   }

   @Override
   public void method4240() {
      boolean var3 = !(this.method3407() instanceof MobEntity) || this.method3407().getType().method33228(EntityTypeTags.field38735);
      boolean var4 = !(this.getRidingEntity() instanceof BoatEntity);
      this.goalSelector.method20010(Class2240.field14657, var3);
      this.goalSelector.method20010(Class2240.field14659, var3 && var4);
      this.goalSelector.method20010(Class2240.field14658, var3);
      this.goalSelector.method20010(Class2240.field14660, var3);
   }

   public static MutableAttribute method4581() {
      return MonsterEntity.method4343()
         .method21849(Attributes.MAX_HEALTH, 100.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.3)
         .method21849(Attributes.KNOCKBACK_RESISTANCE, 0.75)
         .method21849(Attributes.ATTACK_DAMAGE, 12.0)
         .method21849(Attributes.ATTACK_KNOCKBACK, 1.5)
         .method21849(Attributes.FOLLOW_RANGE, 32.0);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putInt("AttackTick", this.field5728);
      compound.putInt("StunTick", this.field5729);
      compound.putInt("RoarTick", this.field5730);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.field5728 = compound.getInt("AttackTick");
      this.field5729 = compound.getInt("StunTick");
      this.field5730 = compound.getInt("RoarTick");
   }

   @Override
   public SoundEvent method4546() {
      return SoundEvents.field26995;
   }

   @Override
   public Class6990 method4221(World var1) {
      return new Class6992(this, var1);
   }

   @Override
   public int method4260() {
      return 45;
   }

   @Override
   public double method3310() {
      return 2.1;
   }

   @Override
   public boolean method4277() {
      return !this.method4305() && this.method3407() instanceof LivingEntity;
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.getPassengers().isEmpty() ? this.getPassengers().get(0) : null;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.isAlive()) {
         if (!this.isMovementBlocked()) {
            double var3 = this.getAttackTarget() == null ? 0.3 : 0.35;
            double var5 = this.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue();
            this.getAttribute(Attributes.MOVEMENT_SPEED).method38661(MathHelper.lerp(0.1, var5, var3));
         } else {
            this.getAttribute(Attributes.MOVEMENT_SPEED).method38661(0.0);
         }

         if (this.collidedHorizontally && this.world.getGameRules().getBoolean(GameRules.field24224)) {
            boolean var7 = false;
            AxisAlignedBB var8 = this.getBoundingBox().grow(0.2);

            for (BlockPos var10 : BlockPos.getAllInBoxMutable(
               MathHelper.floor(var8.minX),
               MathHelper.floor(var8.minY),
               MathHelper.floor(var8.minZ),
               MathHelper.floor(var8.maxX),
               MathHelper.floor(var8.maxY),
               MathHelper.floor(var8.maxZ)
            )) {
               BlockState var11 = this.world.getBlockState(var10);
               Block var12 = var11.getBlock();
               if (var12 instanceof LeavesBlock) {
                  var7 = this.world.destroyBlock(var10, true, this) || var7;
               }
            }

            if (!var7 && this.onGround) {
               this.jump();
            }
         }

         if (this.field5730 > 0) {
            this.field5730--;
            if (this.field5730 == 10) {
               this.method4583();
            }
         }

         if (this.field5728 > 0) {
            this.field5728--;
         }

         if (this.field5729 > 0) {
            this.field5729--;
            this.method4582();
            if (this.field5729 == 0) {
               this.playSound(SoundEvents.field27000, 1.0F, 1.0F);
               this.field5730 = 20;
            }
         }
      }
   }

   private void method4582() {
      if (this.rand.nextInt(6) == 0) {
         double var3 = this.getPosX()
            - (double)this.getWidth() * Math.sin((double)(this.renderYawOffset * (float) (Math.PI / 180.0)))
            + (this.rand.nextDouble() * 0.6 - 0.3);
         double var5 = this.getPosY() + (double)this.getHeight() - 0.3;
         double var7 = this.getPosZ()
            + (double)this.getWidth() * Math.cos((double)(this.renderYawOffset * (float) (Math.PI / 180.0)))
            + (this.rand.nextDouble() * 0.6 - 0.3);
         this.world.addParticle(ParticleTypes.field34068, var3, var5, var7, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   public boolean isMovementBlocked() {
      return super.isMovementBlocked() || this.field5728 > 0 || this.field5729 > 0 || this.field5730 > 0;
   }

   @Override
   public boolean canEntityBeSeen(Entity var1) {
      return this.field5729 <= 0 && this.field5730 <= 0 ? super.canEntityBeSeen(var1) : false;
   }

   @Override
   public void constructKnockBackVector(LivingEntity var1) {
      if (this.field5730 == 0) {
         if (!(this.rand.nextDouble() < 0.5)) {
            this.method4584(var1);
         } else {
            this.field5729 = 40;
            this.playSound(SoundEvents.field26999, 1.0F, 1.0F);
            this.world.setEntityState(this, (byte)39);
            var1.applyEntityCollision(this);
         }

         var1.velocityChanged = true;
      }
   }

   private void method4583() {
      if (this.isAlive()) {
         for (Entity var4 : this.world.<Entity>getEntitiesInAABBexcluding(LivingEntity.class, this.getBoundingBox().grow(4.0), field5727)) {
            if (!(var4 instanceof Class1025)) {
               var4.attackEntityFrom(DamageSource.method31115(this), 6.0F);
            }

            this.method4584(var4);
         }

         Vector3d var11 = this.getBoundingBox().getCenter();

         for (int var12 = 0; var12 < 40; var12++) {
            double var5 = this.rand.nextGaussian() * 0.2;
            double var7 = this.rand.nextGaussian() * 0.2;
            double var9 = this.rand.nextGaussian() * 0.2;
            this.world.addParticle(ParticleTypes.POOF, var11.x, var11.y, var11.z, var5, var7, var9);
         }
      }
   }

   private void method4584(Entity var1) {
      double var4 = var1.getPosX() - this.getPosX();
      double var6 = var1.getPosZ() - this.getPosZ();
      double var8 = Math.max(var4 * var4 + var6 * var6, 0.001);
      var1.addVelocity(var4 / var8 * 4.0, 0.2, var6 / var8 * 4.0);
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 4) {
         if (var1 == 39) {
            this.field5729 = 40;
         }
      } else {
         this.field5728 = 10;
         this.playSound(SoundEvents.field26994, 1.0F, 1.0F);
      }

      super.handleStatusUpdate(var1);
   }

   public int method4585() {
      return this.field5728;
   }

   public int method4586() {
      return this.field5729;
   }

   public int method4587() {
      return this.field5730;
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      this.field5728 = 10;
      this.world.setEntityState(this, (byte)4);
      this.playSound(SoundEvents.field26994, 1.0F, 1.0F);
      return super.attackEntityAsMob(var1);
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26993;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26997;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26996;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field26998, 0.15F, 1.0F);
   }

   @Override
   public boolean method4266(IWorldReader var1) {
      return !var1.containsAnyLiquid(this.getBoundingBox());
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   @Override
   public boolean method4570() {
      return false;
   }
}
