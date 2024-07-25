package remapped;

import java.util.Random;

public class class_2667 extends MonsterEntity {
   private int field_13118;
   private boolean field_13119;

   public class_2667(EntityType<? extends class_2667> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 3;
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(1, new SwimGoal(this));
      this.goalSelector.addGoal(2, new class_9037(this, 1.0, false));
      this.goalSelector.addGoal(3, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 8.0F));
      this.goalSelector.addGoal(8, new class_9691(this));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setCallsForHelp());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.13F;
   }

   public static MutableAttribute method_12023() {
      return MonsterEntity.func_234295_eP_()
         .createMutableAttribute(Attributes.MAX_HEALTH, 8.0)
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25)
         .createMutableAttribute(Attributes.ATTACK_DAMAGE, 2.0);
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public SoundEvent method_26918() {
      return SoundEvents.field_2844;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2324;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2756;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(SoundEvents.field_2103, 0.15F, 1.0F);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field_13118 = var1.method_25947("Lifetime");
      this.field_13119 = var1.getBoolean("PlayerSpawned");
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Lifetime", this.field_13118);
      var1.putBoolean("PlayerSpawned", this.field_13119);
   }

   @Override
   public void method_37123() {
      this.field_29605 = this.rotationYaw;
      super.method_37123();
   }

   @Override
   public void method_37090(float var1) {
      this.rotationYaw = var1;
      super.method_37090(var1);
   }

   @Override
   public double method_37106() {
      return 0.1;
   }

   public boolean method_12022() {
      return this.field_13119;
   }

   public void method_12025(boolean var1) {
      this.field_13119 = var1;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.field_33055) {
         if (!this.method_26925()) {
            this.field_13118++;
         }

         if (this.field_13118 >= 2400) {
            this.method_37204();
         }
      } else {
         for (int var3 = 0; var3 < 2; var3++) {
            this.world
               .method_43361(
                  class_3090.field_15356,
                  this.method_37361(0.5),
                  this.method_37255(),
                  this.method_37383(0.5),
                  (this.field_41717.nextDouble() - 0.5) * 2.0,
                  -this.field_41717.nextDouble(),
                  (this.field_41717.nextDouble() - 0.5) * 2.0
               );
         }
      }
   }

   public static boolean method_12024(EntityType<class_2667> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      if (!method_5198(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         PlayerEntity var7 = var1.method_25857((double)var3.getX() + 0.5, (double)var3.method_12165() + 0.5, (double)var3.method_12185() + 0.5, 5.0, true);
         return var7 == null;
      }
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13575;
   }
}
