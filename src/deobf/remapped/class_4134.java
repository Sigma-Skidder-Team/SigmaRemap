package remapped;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class class_4134 extends class_7637 implements class_3832 {
   private static final class_7821<Boolean> field_20121 = class_8073.<Boolean>method_36641(class_4134.class, class_2734.field_13347);
   private final class_4657 field_20123 = new class_4657(5);

   public class_4134(EntityType<? extends class_4134> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(2, new class_1052(this, this, 10.0F));
      this.goalSelector.addGoal(3, new class_1801<class_4134>(this, 1.0, 8.0F));
      this.goalSelector.addGoal(8, new class_8285(this, 0.6));
      this.goalSelector.addGoal(9, new LookAtGoal(this, PlayerEntity.class, 15.0F, 1.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 15.0F));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, AbstractRaiderEntity.class).setCallsForHelp());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<AbstractVillagerEntity>(this, AbstractVillagerEntity.class, false));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
   }

   public static MutableAttribute method_19206() {
      return MonsterEntity.func_234295_eP_()
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35F)
         .createMutableAttribute(Attributes.MAX_HEALTH, 24.0)
         .createMutableAttribute(Attributes.ATTACK_DAMAGE, 5.0)
         .createMutableAttribute(Attributes.FOLLOW_RANGE, 32.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_20121, false);
   }

   @Override
   public boolean method_26878(class_551 var1) {
      return var1 == class_4897.field_25030;
   }

   public boolean method_19205() {
      return this.field_41735.<Boolean>method_36640(field_20121);
   }

   @Override
   public void method_17810(boolean var1) {
      this.field_41735.method_36633(field_20121, var1);
   }

   @Override
   public void method_17814() {
      this.field_29658 = 0;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      class_3416 var4 = new class_3416();

      for (int var5 = 0; var5 < this.field_20123.method_31505(); var5++) {
         ItemStack var6 = this.field_20123.method_31498(var5);
         if (!var6.method_28022()) {
            var4.add(var6.method_27998(new CompoundNBT()));
         }
      }

      var1.put("Inventory", var4);
   }

   @Override
   public class_5871 method_34604() {
      if (!this.method_19205()) {
         if (!this.method_26443(class_4897.field_25030)) {
            return !this.method_26892() ? class_5871.field_29812 : class_5871.field_29818;
         } else {
            return class_5871.field_29817;
         }
      } else {
         return class_5871.field_29815;
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      class_3416 var4 = var1.method_25927("Inventory", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         ItemStack var6 = ItemStack.method_28015(var4.method_15764(var5));
         if (!var6.method_28022()) {
            this.field_20123.method_21542(var6);
         }
      }

      this.method_26871(true);
   }

   @Override
   public float method_21376(BlockPos var1, class_4924 var2) {
      class_2522 var5 = var2.method_28262(var1.method_6100());
      return !var5.method_8350(class_4783.field_23259) && !var5.method_8350(class_4783.field_23216) ? 0.5F - var2.method_22566(var1) : 10.0F;
   }

   @Override
   public int method_26856() {
      return 1;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_26870(var2);
      this.method_26893(var2);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_26870(class_9589 var1) {
      this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25030));
   }

   @Override
   public void method_26890(float var1) {
      super.method_26890(var1);
      if (this.field_41717.nextInt(300) == 0) {
         ItemStack var4 = this.method_26446();
         if (var4.method_27960() == class_4897.field_25030) {
            Map var5 = class_2931.method_13402(var4);
            var5.putIfAbsent(class_3668.field_17843, 1);
            class_2931.method_13398(var5, var4);
            this.method_37349(class_6943.field_35707, var4);
         }
      }
   }

   @Override
   public boolean method_37344(Entity var1) {
      if (super.method_37344(var1)) {
         return true;
      } else {
         return var1 instanceof LivingEntity && ((LivingEntity)var1).method_26550() == class_2780.field_13576
            ? this.method_37095() == null && var1.method_37095() == null
            : false;
      }
   }

   @Override
   public SoundEvent method_26918() {
      return SoundEvents.field_2093;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2624;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2487;
   }

   @Override
   public void method_10805(LivingEntity var1, float var2) {
      this.method_17815(this, 1.6F);
   }

   @Override
   public void method_17812(LivingEntity var1, ItemStack var2, class_5783 var3, float var4) {
      this.method_17811(this, var1, var3, var4, 1.6F);
   }

   @Override
   public void method_26902(class_91 var1) {
      ItemStack var4 = var1.method_264();
      if (!(var4.method_27960() instanceof class_1967)) {
         class_2451 var5 = var4.method_27960();
         if (this.method_19207(var5)) {
            this.method_26562(var1);
            ItemStack var6 = this.field_20123.method_21542(var4);
            if (!var6.method_28022()) {
               var4.method_28017(var6.method_27997());
            } else {
               var1.method_37204();
            }
         }
      } else {
         super.method_26902(var1);
      }
   }

   private boolean method_19207(class_2451 var1) {
      return this.method_18600() && var1 == class_4897.field_24696;
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      if (!super.method_37166(var1, var2)) {
         int var5 = var1 - 300;
         if (var5 >= 0 && var5 < this.field_20123.method_31505()) {
            this.field_20123.method_31503(var5, var2);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_18602(int var1, boolean var2) {
      class_2452 var5 = this.method_18589();
      boolean var6 = this.field_41717.nextFloat() <= var5.method_11272();
      if (var6) {
         ItemStack var7 = new ItemStack(class_4897.field_25030);
         HashMap var8 = Maps.newHashMap();
         if (var1 <= var5.method_11302(class_423.field_1789)) {
            if (var1 > var5.method_11302(class_423.field_1784)) {
               var8.put(class_3668.field_17846, 1);
            }
         } else {
            var8.put(class_3668.field_17846, 2);
         }

         var8.put(class_3668.field_17875, 1);
         class_2931.method_13398(var8, var7);
         this.method_37349(class_6943.field_35707, var7);
      }
   }

   @Override
   public SoundEvent getRaidLossSound() {
      return SoundEvents.field_2306;
   }
}
