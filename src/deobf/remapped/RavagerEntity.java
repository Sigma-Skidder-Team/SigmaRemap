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
      this.goalSelector.addGoal(0, new class_787(this));
      this.goalSelector.addGoal(4, new class_829(this));
      this.goalSelector.addGoal(5, new class_2889(this, 0.4));
      this.goalSelector.addGoal(6, new class_4407(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(10, new class_4407(this, class_5886.class, 8.0F));
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this, AbstractRaiderEntity.class).setCallsForHelp());
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<class_405>(this, class_405.class, true));
      this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<class_8127>(this, class_8127.class, true));
   }

   @Override
   public void method_26872() {
      boolean var3 = !(this.method_37259() instanceof class_5886) || this.method_37259().method_37387().method_30453(class_5218.field_26788);
      boolean var4 = !(this.method_37243() instanceof BoatEntity);
      this.goalSelector.method_3493(class_1891.field_9564, var3);
      this.goalSelector.method_3493(class_1891.field_9561, var3 && var4);
      this.goalSelector.method_3493(class_1891.field_9560, var3);
      this.goalSelector.method_3493(class_1891.field_9563, var3);
   }

   public static class_1313 method_35660() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 100.0)
         .method_5984(class_7331.field_37465, 0.3)
         .method_5984(class_7331.field_37463, 0.75)
         .method_5984(class_7331.field_37462, 12.0)
         .method_5984(class_7331.field_37467, 1.5)
         .method_5984(class_7331.field_37471, 32.0);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("AttackTick", this.attackTick);
      var1.method_25931("StunTick", this.stunTick);
      var1.method_25931("RoarTick", this.roarTick);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.attackTick = var1.method_25947("AttackTick");
      this.stunTick = var1.method_25947("StunTick");
      this.roarTick = var1.method_25947("RoarTick");
   }

   @Override
   public class_8461 method_18591() {
      return class_463.field_2326;
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_9052(this, var1);
   }

   @Override
   public int method_26903() {
      return 45;
   }

   @Override
   public double method_37149() {
      return 2.1;
   }

   @Override
   public boolean method_26863() {
      return !this.method_26859() && this.method_37259() instanceof class_5834;
   }

   @Nullable
   @Override
   public Entity method_37259() {
      return !this.method_37114().isEmpty() ? this.method_37114().get(0) : null;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.isAlive()) {
         if (!this.method_26468()) {
            double var3 = this.method_17809() == null ? 0.3 : 0.35;
            double var5 = this.method_26561(class_7331.field_37465).method_44996();
            this.method_26561(class_7331.field_37465).method_45006(class_9299.method_42794(0.1, var5, var3));
         } else {
            this.method_26561(class_7331.field_37465).method_45006(0.0);
         }

         if (this.field_41744 && this.world.method_29537().method_1285(class_291.field_1047)) {
            boolean var7 = false;
            Box var8 = this.method_37241().method_18898(0.2);

            for (BlockPos var10 : BlockPos.method_6075(
               class_9299.method_42847(var8.field_19941),
               class_9299.method_42847(var8.field_19937),
               class_9299.method_42847(var8.field_19938),
               class_9299.method_42847(var8.field_19940),
               class_9299.method_42847(var8.field_19939),
               class_9299.method_42847(var8.field_19942)
            )) {
               class_2522 var11 = this.world.method_28262(var10);
               class_6414 var12 = var11.method_8360();
               if (var12 instanceof class_4423) {
                  var7 = this.world.method_7511(var10, true, this) || var7;
               }
            }

            if (!var7 && this.onGround) {
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
               this.method_37155(class_463.field_2440, 1.0F, 1.0F);
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
   public boolean method_26468() {
      return super.method_26468() || this.attackTick > 0 || this.stunTick > 0 || this.roarTick > 0;
   }

   @Override
   public boolean method_26420(Entity var1) {
      return this.stunTick <= 0 && this.roarTick <= 0 ? super.method_26420(var1) : false;
   }

   @Override
   public void method_26469(class_5834 var1) {
      if (this.roarTick == 0) {
         if (!(this.field_41717.nextDouble() < 0.5)) {
            this.method_35658(var1);
         } else {
            this.stunTick = 40;
            this.method_37155(class_463.field_2615, 1.0F, 1.0F);
            this.world.method_29587(this, (byte)39);
            var1.method_37183(this);
         }

         var1.field_41743 = true;
      }
   }

   private void method_35657() {
      if (this.isAlive()) {
         for (Entity var4 : this.world.<Entity>method_25869(class_5834.class, this.method_37241().method_18898(4.0), field_40350)) {
            if (!(var4 instanceof class_7637)) {
               var4.attackEntityFrom(DamageSource.method_28345(this), 6.0F);
            }

            this.method_35658(var4);
         }

         class_1343 var11 = this.method_37241().method_18926();

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
         this.method_37155(class_463.field_2738, 1.0F, 1.0F);
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
      this.method_37155(class_463.field_2738, 1.0F, 1.0F);
      return super.method_26442(var1);
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return class_463.field_2412;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2520;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2504;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2392, 0.15F, 1.0F);
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return !var1.method_22550(this.method_37241());
   }

   @Override
   public void method_18602(int var1, boolean var2) {
   }

   @Override
   public boolean method_21357() {
      return false;
   }
}
