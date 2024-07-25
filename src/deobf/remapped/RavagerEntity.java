package remapped;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public class RavagerEntity extends AbstractRaiderEntity {
   private static final Predicate<Entity> field_40350 = var0 -> var0.isAlive() && !(var0 instanceof RavagerEntity);
   private int attackTick;
   private int stunTick;
   private int roarTick;

   public RavagerEntity(EntityType<? extends RavagerEntity> var1, World var2) {
      super(var1, var2);
      this.field_41733 = 1.0F;
      this.field_29915 = 20;
   }

   @Override
   public void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(4, new AttackGoal(this));
      this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.4));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this, AbstractRaiderEntity.class).setCallsForHelp());
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<AbstractVillagerEntity>(this, AbstractVillagerEntity.class, true));
      this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
   }

   @Override
   public void updateMovementGoalFlags() {
      boolean flag = !(this.getControllingPassenger() instanceof MobEntity) || this.getControllingPassenger().getType().isContained(EntityTypeTags.RAIDERS);
      boolean flag1 = !(this.getRidingEntity() instanceof BoatEntity);
      this.goalSelector.setFlag(Flag.MOVE, flag);
      this.goalSelector.setFlag(Flag.JUMP, flag && flag1);
      this.goalSelector.setFlag(Flag.LOOK, flag);
      this.goalSelector.setFlag(Flag.TARGET, flag);
   }

   public static MutableAttribute func_234297_m_() {
      return MonsterEntity.func_234295_eP_()
         .createMutableAttribute(Attributes.MAX_HEALTH, 100.0)
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3)
         .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.75)
         .createMutableAttribute(Attributes.ATTACK_DAMAGE, 12.0)
         .createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 1.5)
         .createMutableAttribute(Attributes.FOLLOW_RANGE, 32.0);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("AttackTick", this.attackTick);
      var1.putInt("StunTick", this.stunTick);
      var1.putInt("RoarTick", this.roarTick);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.attackTick = var1.method_25947("AttackTick");
      this.stunTick = var1.method_25947("StunTick");
      this.roarTick = var1.method_25947("RoarTick");
   }

   @Override
   public SoundEvent getRaidLossSound() {
      return SoundEvents.ENTITY_RAVAGER_CELEBRATE;
   }

   @Override
   public PathNavigator createNavigator(World var1) {
      return new Navigator(this, var1);
   }

   @Override
   public int getHorizontalFaceSpeed() {
      return 45;
   }

   @Override
   public double getMountedYOffset() {
      return 2.1;
   }

   @Override
   public boolean canBeSteered() {
      return !this.isAIDisabled() && this.getControllingPassenger() instanceof LivingEntity;
   }

   @Nullable
   @Override
   public Entity getControllingPassenger() {
      return !this.getPassengers().isEmpty() ? this.getPassengers().get(0) : null;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.isAlive()) {
         if (!this.isMovementBlocked()) {
            double var3 = this.getAttackTarget() == null ? 0.3 : 0.35;
            double var5 = this.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue();
            this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(MathHelper.lerp(0.1, var5, var3));
         } else {
            this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.0);
         }

         if (this.collidedHorizontally && this.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING)) {
            boolean flag = false;
            Box var8 = this.getBoundingBox().grow(0.2);

            for (BlockPos var10 : BlockPos.method_6075(
               MathHelper.floor(var8.field_19941),
               MathHelper.floor(var8.field_19937),
               MathHelper.floor(var8.field_19938),
               MathHelper.floor(var8.field_19940),
               MathHelper.floor(var8.field_19939),
               MathHelper.floor(var8.field_19942)
            )) {
               class_2522 var11 = this.world.method_28262(var10);
               class_6414 var12 = var11.method_8360();
               if (var12 instanceof class_4423) {
                  flag = this.world.method_7511(var10, true, this) || flag;
               }
            }

            if (!flag && this.onGround) {
               this.method_26595();
            }
         }

         if (this.roarTick > 0) {
            this.roarTick--;
            if (this.roarTick == 10) {
               this.method_35657();
            }
         }

         if (this.attackTick > 0) {
            this.attackTick--;
         }

         if (this.stunTick > 0) {
            this.stunTick--;
            this.method_35659();
            if (this.stunTick == 0) {
               this.method_37155(SoundEvents.field_2440, 1.0F, 1.0F);
               this.roarTick = 20;
            }
         }
      }
   }

   private void method_35659() {
      if (this.field_41717.nextInt(6) == 0) {
         double var3 = this.getPosX()
            - (double)this.method_37086() * Math.sin((double)(this.field_29605 * (float) (Math.PI / 180.0)))
            + (this.field_41717.nextDouble() * 0.6 - 0.3);
         double var5 = this.method_37309() + (double)this.method_37074() - 0.3;
         double var7 = this.getPosZ()
            + (double)this.method_37086() * Math.cos((double)(this.field_29605 * (float) (Math.PI / 180.0)))
            + (this.field_41717.nextDouble() * 0.6 - 0.3);
         this.world.method_43361(class_3090.field_15353, var3, var5, var7, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   public boolean isMovementBlocked() {
      return super.isMovementBlocked() || this.attackTick > 0 || this.stunTick > 0 || this.roarTick > 0;
   }

   @Override
   public boolean method_26420(Entity var1) {
      return this.stunTick <= 0 && this.roarTick <= 0 ? super.method_26420(var1) : false;
   }

   @Override
   public void method_26469(LivingEntity var1) {
      if (this.roarTick == 0) {
         if (!(this.field_41717.nextDouble() < 0.5)) {
            this.method_35658(var1);
         } else {
            this.stunTick = 40;
            this.method_37155(SoundEvents.field_2615, 1.0F, 1.0F);
            this.world.method_29587(this, (byte)39);
            var1.method_37183(this);
         }

         var1.field_41743 = true;
      }
   }

   private void method_35657() {
      if (this.isAlive()) {
         for (Entity var4 : this.world.<Entity>method_25869(LivingEntity.class, this.getBoundingBox().grow(4.0), field_40350)) {
            if (!(var4 instanceof class_7637)) {
               var4.attackEntityFrom(DamageSource.method_28345(this), 6.0F);
            }

            this.method_35658(var4);
         }

         class_1343 var11 = this.getBoundingBox().method_18926();

         for (int var12 = 0; var12 < 40; var12++) {
            double var5 = this.field_41717.nextGaussian() * 0.2;
            double var7 = this.field_41717.nextGaussian() * 0.2;
            double var9 = this.field_41717.nextGaussian() * 0.2;
            this.world.method_43361(class_3090.field_15343, var11.field_7336, var11.field_7333, var11.field_7334, var5, var7, var9);
         }
      }
   }

   private void method_35658(Entity var1) {
      double var4 = var1.getPosX() - this.getPosX();
      double var6 = var1.getPosZ() - this.getPosZ();
      double var8 = Math.max(var4 * var4 + var6 * var6, 0.001);
      var1.method_37186(var4 / var8 * 4.0, 0.2, var6 / var8 * 4.0);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 4) {
         if (var1 == 39) {
            this.stunTick = 40;
         }
      } else {
         this.attackTick = 10;
         this.method_37155(SoundEvents.field_2738, 1.0F, 1.0F);
      }

      super.method_37336(var1);
   }

   public int method_35656() {
      return this.attackTick;
   }

   public int method_35654() {
      return this.stunTick;
   }

   public int method_35655() {
      return this.roarTick;
   }

   @Override
   public boolean method_26442(Entity var1) {
      this.attackTick = 10;
      this.world.method_29587(this, (byte)4);
      this.method_37155(SoundEvents.field_2738, 1.0F, 1.0F);
      return super.method_26442(var1);
   }

   @Nullable
   @Override
   public SoundEvent method_26918() {
      return SoundEvents.field_2412;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2520;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2504;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(SoundEvents.field_2392, 0.15F, 1.0F);
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return !var1.method_22550(this.getBoundingBox());
   }

   @Override
   public void method_18602(int var1, boolean var2) {
   }

   @Override
   public boolean method_21357() {
      return false;
   }
}
