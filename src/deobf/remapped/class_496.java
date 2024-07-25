package remapped;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_496 extends class_5467 {
   private static final class_7821<Integer> field_3097 = class_8073.<Integer>method_36641(class_496.class, class_2734.field_13366);
   private static final class_7821<Integer> field_3081 = class_8073.<Integer>method_36641(class_496.class, class_2734.field_13366);
   private static final class_7821<Integer> field_3082 = class_8073.<Integer>method_36641(class_496.class, class_2734.field_13366);
   private static final class_7821<Byte> field_3079 = class_8073.<Byte>method_36641(class_496.class, class_2734.field_13361);
   private static final class_7821<Byte> field_3096 = class_8073.<Byte>method_36641(class_496.class, class_2734.field_13361);
   private static final class_7821<Byte> field_3091 = class_8073.<Byte>method_36641(class_496.class, class_2734.field_13361);
   private static final class_4931 field_3092 = new class_4931().method_22607(8.0).method_22601().method_22603();
   private boolean field_3095;
   private boolean field_3093;
   public int field_3086;
   private class_1343 field_3080;
   private float field_3089;
   private float field_3094;
   private float field_3090;
   private float field_3085;
   private float field_3088;
   private float field_3083;
   private class_5670 field_3084;
   private static final Predicate<class_91> field_3087 = var0 -> {
      class_2451 var3 = var0.method_264().method_27960();
      return (var3 == class_4783.field_23886.method_10803() || var3 == class_4783.field_23770.method_10803()) && var0.isAlive() && !var0.method_258();
   };

   public class_496(EntityType<? extends class_496> var1, World var2) {
      super(var1, var2);
      this.field_29900 = new class_2648(this);
      if (!this.method_26449()) {
         this.method_26871(true);
      }
   }

   @Override
   public boolean method_26612(ItemStack var1) {
      class_6943 var4 = MobEntity.method_26896(var1);
      return !this.method_26520(var4).method_28022() ? false : var4 == class_6943.field_35707 && super.method_26612(var1);
   }

   public int method_2430() {
      return this.field_41735.<Integer>method_36640(field_3097);
   }

   public void method_2439(int var1) {
      this.field_41735.method_36633(field_3097, var1);
   }

   public boolean method_2464() {
      return this.method_2438(2);
   }

   public boolean method_2449() {
      return this.method_2438(8);
   }

   public void method_2442(boolean var1) {
      this.method_2446(8, var1);
   }

   public boolean method_2450() {
      return this.method_2438(16);
   }

   public void method_2471(boolean var1) {
      this.method_2446(16, var1);
   }

   public boolean method_2427() {
      return this.field_41735.<Integer>method_36640(field_3082) > 0;
   }

   public void method_2456(boolean var1) {
      this.field_41735.method_36633(field_3082, !var1 ? 0 : 1);
   }

   private int method_2461() {
      return this.field_41735.<Integer>method_36640(field_3082);
   }

   private void method_2440(int var1) {
      this.field_41735.method_36633(field_3082, var1);
   }

   public void method_2418(boolean var1) {
      this.method_2446(2, var1);
      if (!var1) {
         this.method_2428(0);
      }
   }

   public int method_2460() {
      return this.field_41735.<Integer>method_36640(field_3081);
   }

   public void method_2428(int var1) {
      this.field_41735.method_36633(field_3081, var1);
   }

   public class_1360 method_2467() {
      return class_1360.method_6266(this.field_41735.<Byte>method_36640(field_3079));
   }

   public void method_2415(class_1360 var1) {
      if (var1.method_6265() > 6) {
         var1 = class_1360.method_6270(this.field_41717);
      }

      this.field_41735.method_36633(field_3079, (byte)var1.method_6265());
   }

   public class_1360 method_2435() {
      return class_1360.method_6266(this.field_41735.<Byte>method_36640(field_3096));
   }

   public void method_2424(class_1360 var1) {
      if (var1.method_6265() > 6) {
         var1 = class_1360.method_6270(this.field_41717);
      }

      this.field_41735.method_36633(field_3096, (byte)var1.method_6265());
   }

   public boolean method_2436() {
      return this.method_2438(4);
   }

   public void method_2445(boolean var1) {
      this.method_2446(4, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_3097, 0);
      this.field_41735.method_36634(field_3081, 0);
      this.field_41735.method_36634(field_3079, (byte)0);
      this.field_41735.method_36634(field_3096, (byte)0);
      this.field_41735.method_36634(field_3091, (byte)0);
      this.field_41735.method_36634(field_3082, 0);
   }

   private boolean method_2438(int var1) {
      return (this.field_41735.<Byte>method_36640(field_3091) & var1) != 0;
   }

   private void method_2446(int var1, boolean var2) {
      byte var5 = this.field_41735.<Byte>method_36640(field_3091);
      if (!var2) {
         this.field_41735.method_36633(field_3091, (byte)(var5 & ~var1));
      } else {
         this.field_41735.method_36633(field_3091, (byte)(var5 | var1));
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.method_25941("MainGene", this.method_2467().method_6269());
      var1.method_25941("HiddenGene", this.method_2435().method_6269());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_2415(class_1360.method_6262(var1.method_25965("MainGene")));
      this.method_2424(class_1360.method_6262(var1.method_25965("HiddenGene")));
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      class_496 var5 = EntityType.field_34232.method_30484(var1);
      if (var2 instanceof class_496) {
         var5.method_2444(this, (class_496)var2);
      }

      var5.method_2455();
      return var5;
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(2, new class_4520(this, 2.0));
      this.goalSelector.addGoal(2, new class_3031(this, this, 1.0));
      this.goalSelector.addGoal(3, new class_5685(this, 1.2F, true));
      this.goalSelector.addGoal(4, new class_7228(this, 1.0, class_8137.method_37019(class_4783.field_23886.method_10803()), false));
      this.goalSelector.addGoal(6, new class_368<PlayerEntity>(this, PlayerEntity.class, 8.0F, 2.0, 2.0));
      this.goalSelector.addGoal(6, new class_368<MonsterEntity>(this, MonsterEntity.class, 4.0F, 2.0, 2.0));
      this.goalSelector.addGoal(7, new class_2256(this));
      this.goalSelector.addGoal(8, new class_6630(this));
      this.goalSelector.addGoal(8, new class_8399(this));
      this.field_3084 = new class_5670(this, PlayerEntity.class, 6.0F);
      this.goalSelector.addGoal(9, this.field_3084);
      this.goalSelector.addGoal(10, new class_9691(this));
      this.goalSelector.addGoal(12, new class_4205(this));
      this.goalSelector.addGoal(13, new class_8676(this, 1.25));
      this.goalSelector.addGoal(14, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.targetSelector.addGoal(1, new class_2199(this).setCallsForHelp(new Class[0]));
   }

   public static MutableAttribute method_2413() {
      return MobEntity.method_26846().createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.15F).createMutableAttribute(Attributes.ATTACK_DAMAGE, 6.0);
   }

   public class_1360 method_2448() {
      return class_1360.method_6268(this.method_2467(), this.method_2435());
   }

   public boolean method_2468() {
      return this.method_2448() == class_1360.field_7402;
   }

   public boolean method_2462() {
      return this.method_2448() == class_1360.field_7409;
   }

   public boolean method_2423() {
      return this.method_2448() == class_1360.field_7400;
   }

   public boolean method_2416() {
      return this.method_2448() == class_1360.field_7406;
   }

   @Override
   public boolean method_26892() {
      return this.method_2448() == class_1360.field_7403;
   }

   @Override
   public boolean method_26887(PlayerEntity var1) {
      return false;
   }

   @Override
   public boolean method_26442(Entity var1) {
      this.method_37155(SoundEvents.field_1937, 1.0F, 1.0F);
      if (!this.method_26892()) {
         this.field_3093 = true;
      }

      return super.method_26442(var1);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.method_2462()) {
         if (this.world.method_29570() && !this.method_37285()) {
            this.method_2442(true);
            this.method_2456(false);
         } else if (!this.method_2427()) {
            this.method_2442(false);
         }
      }

      if (this.getAttackTarget() == null) {
         this.field_3095 = false;
         this.field_3093 = false;
      }

      if (this.method_2430() > 0) {
         if (this.getAttackTarget() != null) {
            this.method_26914(this.getAttackTarget(), 90.0F, 90.0F);
         }

         if (this.method_2430() == 29 || this.method_2430() == 14) {
            this.method_37155(SoundEvents.field_1968, 1.0F, 1.0F);
         }

         this.method_2439(this.method_2430() - 1);
      }

      if (this.method_2464()) {
         this.method_2428(this.method_2460() + 1);
         if (this.method_2460() <= 20) {
            if (this.method_2460() == 1) {
               this.method_37155(SoundEvents.field_2556, 1.0F, 1.0F);
            }
         } else {
            this.method_2418(false);
            this.method_2426();
         }
      }

      if (!this.method_2436()) {
         this.field_3086 = 0;
      } else {
         this.method_2466();
      }

      if (this.method_2449()) {
         this.rotationPitch = 0.0F;
      }

      this.method_2433();
      this.method_2441();
      this.method_2417();
      this.method_2469();
   }

   public boolean method_2421() {
      return this.method_2462() && this.world.method_29570();
   }

   private void method_2441() {
      if (!this.method_2427()
         && this.method_2449()
         && !this.method_2421()
         && !this.method_26520(class_6943.field_35707).method_28022()
         && this.field_41717.nextInt(80) == 1) {
         this.method_2456(true);
      } else if (this.method_26520(class_6943.field_35707).method_28022() || !this.method_2449()) {
         this.method_2456(false);
      }

      if (this.method_2427()) {
         this.method_2472();
         if (!this.world.field_33055 && this.method_2461() > 80 && this.field_41717.nextInt(20) == 1) {
            if (this.method_2461() > 100 && this.method_2447(this.method_26520(class_6943.field_35707))) {
               if (!this.world.field_33055) {
                  this.method_37349(class_6943.field_35707, ItemStack.EMPTY);
               }

               this.method_2442(false);
            }

            this.method_2456(false);
            return;
         }

         this.method_2440(this.method_2461() + 1);
      }
   }

   private void method_2472() {
      if (this.method_2461() % 5 == 0) {
         this.method_37155(
            SoundEvents.field_2757, 0.5F + 0.5F * (float)this.field_41717.nextInt(2), (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F
         );

         for (int var3 = 0; var3 < 6; var3++) {
            class_1343 var4 = new class_1343(
               ((double)this.field_41717.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.field_41717.nextFloat() - 0.5) * 0.1
            );
            var4 = var4.method_6212(-this.rotationPitch * (float) (Math.PI / 180.0));
            var4 = var4.method_6192(-this.rotationYaw * (float) (Math.PI / 180.0));
            double var5 = (double)(-this.field_41717.nextFloat()) * 0.6 - 0.3;
            class_1343 var7 = new class_1343(((double)this.field_41717.nextFloat() - 0.5) * 0.8, var5, 1.0 + ((double)this.field_41717.nextFloat() - 0.5) * 0.4);
            var7 = var7.method_6192(-this.field_29605 * (float) (Math.PI / 180.0));
            var7 = var7.method_6214(this.getPosX(), this.method_37388() + 1.0, this.getPosZ());
            this.world
               .method_43361(
                  new class_8661(class_3090.field_15351, this.method_26520(class_6943.field_35707)),
                  var7.field_7336,
                  var7.field_7333,
                  var7.field_7334,
                  var4.field_7336,
                  var4.field_7333 + 0.05,
                  var4.field_7334
               );
         }
      }
   }

   private void method_2433() {
      this.field_3094 = this.field_3089;
      if (!this.method_2449()) {
         this.field_3089 = Math.max(0.0F, this.field_3089 - 0.19F);
      } else {
         this.field_3089 = Math.min(1.0F, this.field_3089 + 0.15F);
      }
   }

   private void method_2417() {
      this.field_3085 = this.field_3090;
      if (!this.method_2450()) {
         this.field_3090 = Math.max(0.0F, this.field_3090 - 0.19F);
      } else {
         this.field_3090 = Math.min(1.0F, this.field_3090 + 0.15F);
      }
   }

   private void method_2469() {
      this.field_3083 = this.field_3088;
      if (!this.method_2436()) {
         this.field_3088 = Math.max(0.0F, this.field_3088 - 0.19F);
      } else {
         this.field_3088 = Math.min(1.0F, this.field_3088 + 0.15F);
      }
   }

   public float method_2411(float var1) {
      return MathHelper.method_42795(var1, this.field_3094, this.field_3089);
   }

   public float method_2420(float var1) {
      return MathHelper.method_42795(var1, this.field_3085, this.field_3090);
   }

   public float method_2425(float var1) {
      return MathHelper.method_42795(var1, this.field_3083, this.field_3088);
   }

   private void method_2466() {
      this.field_3086++;
      if (this.field_3086 <= 32) {
         if (!this.world.field_33055) {
            class_1343 var3 = this.method_37098();
            if (this.field_3086 != 1) {
               if ((float)this.field_3086 != 7.0F && (float)this.field_3086 != 15.0F && (float)this.field_3086 != 23.0F) {
                  this.method_37214(this.field_3080.field_7336, var3.field_7333, this.field_3080.field_7334);
               } else {
                  this.method_37214(0.0, !this.onGround ? var3.field_7333 : 0.27, 0.0);
               }
            } else {
               float var4 = this.rotationYaw * (float) (Math.PI / 180.0);
               float var5 = !this.method_26449() ? 0.2F : 0.1F;
               this.field_3080 = new class_1343(
                  var3.field_7336 + (double)(-MathHelper.sin(var4) * var5), 0.0, var3.field_7334 + (double)(MathHelper.cos(var4) * var5)
               );
               this.method_37215(this.field_3080.method_6214(0.0, 0.27, 0.0));
            }
         }
      } else {
         this.method_2445(false);
      }
   }

   private void method_2426() {
      class_1343 var3 = this.method_37098();
      this.world
         .method_43361(
            class_3090.field_15326,
            this.getPosX() - (double)(this.method_37086() + 1.0F) * 0.5 * (double) MathHelper.sin(this.field_29605 * (float) (Math.PI / 180.0)),
            this.method_37388() - 0.1F,
            this.getPosZ() + (double)(this.method_37086() + 1.0F) * 0.5 * (double) MathHelper.cos(this.field_29605 * (float) (Math.PI / 180.0)),
            var3.field_7336,
            0.0,
            var3.field_7334
         );
      this.method_37155(SoundEvents.field_2410, 1.0F, 1.0F);

      for (class_496 var5 : this.world.<class_496>method_25868(class_496.class, this.getBoundingBox().grow(10.0))) {
         if (!var5.method_26449() && var5.onGround && !var5.method_37285() && var5.method_2451()) {
            var5.method_26595();
         }
      }

      if (!this.world.method_22567() && this.field_41717.nextInt(700) == 0 && this.world.getGameRules().getBoolean(GameRules.field_1033)) {
         this.method_37312(class_4897.field_24592);
      }
   }

   @Override
   public void method_26902(class_91 var1) {
      if (this.method_26520(class_6943.field_35707).method_28022() && field_3087.test(var1)) {
         this.method_26562(var1);
         ItemStack var4 = var1.method_264();
         this.method_37349(class_6943.field_35707, var4);
         this.field_29923[class_6943.field_35707.method_31767()] = 2.0F;
         this.method_26467(var1, var4.method_27997());
         var1.method_37204();
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      this.method_2442(false);
      return super.attackEntityFrom(var1, var2);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_2415(class_1360.method_6270(this.field_41717));
      this.method_2424(class_1360.method_6270(this.field_41717));
      this.method_2455();
      if (var4 == null) {
         var4 = new class_1821(0.2F);
      }

      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   public void method_2444(class_496 var1, class_496 var2) {
      if (var2 != null) {
         if (!this.field_41717.nextBoolean()) {
            this.method_2415(var2.method_2454());
            this.method_2424(var1.method_2454());
         } else {
            this.method_2415(var1.method_2454());
            this.method_2424(var2.method_2454());
         }
      } else if (!this.field_41717.nextBoolean()) {
         this.method_2415(class_1360.method_6270(this.field_41717));
         this.method_2424(var1.method_2454());
      } else {
         this.method_2415(var1.method_2454());
         this.method_2424(class_1360.method_6270(this.field_41717));
      }

      if (this.field_41717.nextInt(32) == 0) {
         this.method_2415(class_1360.method_6270(this.field_41717));
      }

      if (this.field_41717.nextInt(32) == 0) {
         this.method_2424(class_1360.method_6270(this.field_41717));
      }
   }

   private class_1360 method_2454() {
      return !this.field_41717.nextBoolean() ? this.method_2435() : this.method_2467();
   }

   public void method_2455() {
      if (this.method_2416()) {
         this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(10.0);
      }

      if (this.method_2468()) {
         this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.07F);
      }
   }

   private void method_2432() {
      if (!this.method_37285()) {
         this.method_26904(0.0F);
         this.method_26927().method_5620();
         this.method_2442(true);
      }
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (!this.method_2421()) {
         if (this.method_2450()) {
            this.method_2471(false);
            return class_6910.method_31659(this.world.field_33055);
         } else if (!this.method_24866(var5)) {
            return class_6910.field_35521;
         } else {
            if (this.getAttackTarget() != null) {
               this.field_3095 = true;
            }

            if (!this.method_26449()) {
               if (!this.world.field_33055 && this.method_8634() == 0 && this.method_24870()) {
                  this.method_24867(var1, var5);
                  this.method_24869(var1);
               } else {
                  if (this.world.field_33055 || this.method_2449() || this.method_37285()) {
                     return class_6910.field_35521;
                  }

                  this.method_2432();
                  this.method_2456(true);
                  ItemStack var6 = this.method_26520(class_6943.field_35707);
                  if (!var6.method_28022() && !var1.playerAbilities.isCreativeMode) {
                     this.method_37310(var6);
                  }

                  this.method_37349(class_6943.field_35707, new ItemStack(var5.method_27960(), 1));
                  this.method_24867(var1, var5);
               }
            } else {
               this.method_24867(var1, var5);
               this.method_8633((int)((float)(-this.method_8634() / 20) * 0.1F), true);
            }

            return class_6910.field_35520;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   @Nullable
   @Override
   public SoundEvent method_26918() {
      if (!this.method_26892()) {
         return !this.method_2462() ? SoundEvents.field_2724 : SoundEvents.field_2593;
      } else {
         return SoundEvents.field_2781;
      }
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(SoundEvents.field_2675, 0.15F, 1.0F);
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return var1.method_27960() == class_4783.field_23886.method_10803();
   }

   private boolean method_2447(ItemStack var1) {
      return this.method_24866(var1) || var1.method_27960() == class_4783.field_23770.method_10803();
   }

   @Nullable
   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2877;
   }

   @Nullable
   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2595;
   }

   public boolean method_2451() {
      return !this.method_2450() && !this.method_2421() && !this.method_2427() && !this.method_2436() && !this.method_2449();
   }
}
