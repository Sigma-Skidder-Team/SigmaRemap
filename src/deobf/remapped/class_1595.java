package remapped;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class class_1595 extends MonsterEntity implements class_2354 {
   private final class_5479<class_1595> field_8312 = new class_5479<class_1595>(this, 1.0, 20, 15.0F);
   private final class_9037 field_8311 = new class_1054(this, this, 1.2, false);

   public class_1595(EntityType<? extends class_1595> var1, World var2) {
      super(var1, var2);
      this.method_7153();
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(2, new class_5311(this));
      this.goalSelector.addGoal(3, new class_2829(this, 1.0));
      this.goalSelector.addGoal(3, new class_6837<class_9408>(this, class_9408.class, 6.0F, 1.0, 1.2));
      this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
      this.goalSelector.addGoal(6, new class_9691(this));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<class_3845>(this, class_3845.class, 10, true, false, class_3845.field_18768));
   }

   public static MutableAttribute method_7151() {
      return MonsterEntity.func_234295_eP_().createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(this.method_7150(), 0.15F, 1.0F);
   }

   public abstract SoundEvent method_7150();

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public void livingTick() {
      boolean var3 = this.method_26884();
      if (var3) {
         ItemStack var4 = this.method_26520(class_6943.field_35704);
         if (!var4.method_28022()) {
            if (var4.method_27959()) {
               var4.method_27999(var4.method_28026() + this.field_41717.nextInt(2));
               if (var4.method_28026() >= var4.method_27957()) {
                  this.method_26448(class_6943.field_35704);
                  this.method_37349(class_6943.field_35704, ItemStack.EMPTY);
               }
            }

            var3 = false;
         }

         if (var3) {
            this.method_37178(8);
         }
      }

      super.livingTick();
   }

   @Override
   public void method_37189() {
      super.method_37189();
      if (this.getRidingEntity() instanceof class_4612) {
         class_4612 var3 = (class_4612)this.getRidingEntity();
         this.field_29605 = var3.field_29605;
      }
   }

   @Override
   public void method_26870(class_9589 var1) {
      super.method_26870(var1);
      this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_25206));
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      this.method_26870(var2);
      this.method_26893(var2);
      this.method_7153();
      this.method_26871(this.field_41717.nextFloat() < 0.55F * var2.method_44284());
      if (this.method_26520(class_6943.field_35704).method_28022()) {
         LocalDate var8 = LocalDate.now();
         int var9 = var8.get(ChronoField.DAY_OF_MONTH);
         int var10 = var8.get(ChronoField.MONTH_OF_YEAR);
         if (var10 == 10 && var9 == 31 && this.field_41717.nextFloat() < 0.25F) {
            this.method_37349(class_6943.field_35704, new ItemStack(!(this.field_41717.nextFloat() < 0.1F) ? class_4783.field_23281 : class_4783.field_23855));
            this.field_29918[class_6943.field_35704.method_31767()] = 0.0F;
         }
      }

      return var4;
   }

   public void method_7153() {
      if (this.world != null && !this.world.field_33055) {
         this.goalSelector.method_3488(this.field_8311);
         this.goalSelector.method_3488(this.field_8312);
         ItemStack var3 = this.method_26617(class_8462.method_38934(this, class_4897.field_25206));
         if (var3.method_27960() != class_4897.field_25206) {
            this.goalSelector.addGoal(4, this.field_8311);
         } else {
            byte var4 = 20;
            if (this.world.method_43370() != class_423.field_1782) {
               var4 = 40;
            }

            this.field_8312.method_24899(var4);
            this.goalSelector.addGoal(4, this.field_8312);
         }
      }
   }

   @Override
   public void method_10805(LivingEntity var1, float var2) {
      ItemStack var5 = this.method_26475(this.method_26617(class_8462.method_38934(this, class_4897.field_25206)));
      class_6749 var6 = this.method_7152(var5, var2);
      double var7 = var1.getPosX() - this.getPosX();
      double var9 = var1.method_37080(0.3333333333333333) - var6.method_37309();
      double var11 = var1.getPosZ() - this.getPosZ();
      double var13 = (double) MathHelper.sqrt(var7 * var7 + var11 * var11);
      var6.method_26161(var7, var9 + var13 * 0.2F, var11, 1.6F, (float)(14 - this.world.method_43370().method_2097() * 4));
      this.method_37155(SoundEvents.field_2526, 1.0F, 1.0F / (this.method_26594().nextFloat() * 0.4F + 0.8F));
      this.world.method_7509(var6);
   }

   public class_6749 method_7152(ItemStack var1, float var2) {
      return class_8462.method_38930(this, var1, var2);
   }

   @Override
   public boolean method_26878(class_551 var1) {
      return var1 == class_4897.field_25206;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_7153();
   }

   @Override
   public void method_37349(class_6943 var1, ItemStack var2) {
      super.method_37349(var1, var2);
      if (!this.world.field_33055) {
         this.method_7153();
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 1.74F;
   }

   @Override
   public double method_37106() {
      return -0.6;
   }
}
