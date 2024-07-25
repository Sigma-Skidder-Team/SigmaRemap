package remapped;

public class class_2547 extends class_7429 implements class_2354 {
   private static String[] field_12618;
   private int field_12620;
   private final class_1343[][] field_12619;

   public class_2547(EntityType<? extends class_2547> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
      this.field_12619 = new class_1343[2][4];

      for (int var5 = 0; var5 < 4; var5++) {
         this.field_12619[0][var5] = class_1343.field_7335;
         this.field_12619[1][var5] = class_1343.field_7335;
      }
   }

   @Override
   public void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new class_9577(this));
      this.goalSelector.addGoal(4, new class_1314(this, null));
      this.goalSelector.addGoal(5, new class_1042(this, null));
      this.goalSelector.addGoal(6, new class_5479<class_2547>(this, 0.5, 20, 15.0F));
      this.goalSelector.addGoal(8, new class_8285(this, 0.6));
      this.goalSelector.addGoal(9, new LookAtGoal(this, PlayerEntity.class, 3.0F, 1.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, AbstractRaiderEntity.class).setCallsForHelp());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true).method_4209(300));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<AbstractVillagerEntity>(this, AbstractVillagerEntity.class, false).method_4209(300));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, false).method_4209(300));
   }

   public static class_1313 method_11596() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37465, 0.5)
         .method_5984(class_7331.field_37471, 18.0)
         .method_5984(class_7331.field_37468, 32.0);
   }

   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25206));
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_37329() {
      super.method_37329();
   }

   @Override
   public Box method_37210() {
      return this.method_37241().method_18899(3.0, 0.0, 3.0);
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.world.field_33055 && this.method_37109()) {
         this.field_12620--;
         if (this.field_12620 < 0) {
            this.field_12620 = 0;
         }

         if (this.field_29645 == 1 || this.field_41697 % 1200 == 0) {
            this.field_12620 = 3;
            float var6 = -6.0F;
            byte var4 = 13;

            for (int var5 = 0; var5 < 4; var5++) {
               this.field_12619[0][var5] = this.field_12619[1][var5];
               this.field_12619[1][var5] = new class_1343(
                  (double)(-6.0F + (float)this.field_41717.nextInt(13)) * 0.5,
                  (double)Math.max(0, this.field_41717.nextInt(6) - 4),
                  (double)(-6.0F + (float)this.field_41717.nextInt(13)) * 0.5
               );
            }

            for (int var7 = 0; var7 < 16; var7++) {
               this.world.method_43361(class_3090.field_15385, this.method_37361(0.5), this.method_37255(), this.method_37205(0.5), 0.0, 0.0, 0.0);
            }

            this.world
               .method_29527(this.getPosX(), this.method_37309(), this.getPosZ(), class_463.field_1956, this.method_37197(), 1.0F, 1.0F, false);
         } else if (this.field_29645 == this.field_29662 - 1) {
            this.field_12620 = 3;

            for (int var3 = 0; var3 < 4; var3++) {
               this.field_12619[0][var3] = this.field_12619[1][var3];
               this.field_12619[1][var3] = new class_1343(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public class_8461 method_18591() {
      return class_463.field_2727;
   }

   public class_1343[] method_11597(float var1) {
      if (this.field_12620 <= 0) {
         return this.field_12619[1];
      } else {
         double var4 = (double)(((float)this.field_12620 - var1) / 3.0F);
         var4 = Math.pow(var4, 0.25);
         class_1343[] var6 = new class_1343[4];

         for (int var7 = 0; var7 < 4; var7++) {
            var6[var7] = this.field_12619[1][var7].method_6209(1.0 - var4).method_6215(this.field_12619[0][var7].method_6209(var4));
         }

         return var6;
      }
   }

   @Override
   public boolean method_37344(Entity var1) {
      if (super.method_37344(var1)) {
         return true;
      } else {
         return var1 instanceof class_5834 && ((class_5834)var1).method_26550() == class_2780.field_13576
            ? this.method_37095() == null && var1.method_37095() == null
            : false;
      }
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2727;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2386;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2888;
   }

   @Override
   public class_8461 method_33826() {
      return class_463.field_2521;
   }

   @Override
   public void method_18602(int var1, boolean var2) {
   }

   @Override
   public void method_10805(class_5834 var1, float var2) {
      ItemStack var5 = this.method_26475(this.method_26617(class_8462.method_38934(this, class_4897.field_25206)));
      class_6749 var6 = class_8462.method_38930(this, var5, var2);
      double var7 = var1.getPosX() - this.getPosX();
      double var9 = var1.method_37080(0.3333333333333333) - var6.method_37309();
      double var11 = var1.getPosZ() - this.getPosZ();
      double var13 = (double)class_9299.method_42842(var7 * var7 + var11 * var11);
      var6.method_26161(var7, var9 + var13 * 0.2F, var11, 1.6F, (float)(14 - this.world.method_43370().method_2097() * 4));
      this.method_37155(class_463.field_2526, 1.0F, 1.0F / (this.method_26594().nextFloat() * 0.4F + 0.8F));
      this.world.method_7509(var6);
   }

   @Override
   public class_5871 method_34604() {
      if (!this.method_33825()) {
         return !this.method_26892() ? class_5871.field_29811 : class_5871.field_29813;
      } else {
         return class_5871.field_29814;
      }
   }
}
