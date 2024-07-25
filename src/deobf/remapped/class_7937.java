package remapped;

import javax.annotation.Nullable;

public class class_7937 extends MonsterEntity {
   private static String[] field_40596;
   private static final class_7821<Byte> field_40597 = class_8073.<Byte>method_36641(class_7937.class, class_2734.field_13361);

   public class_7937(EntityType<? extends class_7937> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(1, new SwimGoal(this));
      this.goalSelector.addGoal(3, new class_1937(this, 0.4F));
      this.goalSelector.addGoal(4, new class_5215(this));
      this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
      this.goalSelector.addGoal(6, new class_9691(this));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
      this.targetSelector.addGoal(2, new class_1721<PlayerEntity>(this, PlayerEntity.class));
      this.targetSelector.addGoal(3, new class_1721<IronGolemEntity>(this, IronGolemEntity.class));
   }

   @Override
   public double getMountedYOffset() {
      return (double)(this.method_37074() * 0.5F);
   }

   @Override
   public class_1249 createNavigator(World var1) {
      return new class_8696(this, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_40597, (byte)0);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.world.field_33055) {
         this.method_35904(this.field_41744);
      }
   }

   public static MutableAttribute method_35905() {
      return MonsterEntity.func_234295_eP_().createMutableAttribute(Attributes.MAX_HEALTH, 16.0).createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3F);
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2371;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2519;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2833;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_1974, 0.15F, 1.0F);
   }

   @Override
   public boolean method_26505() {
      return this.method_35903();
   }

   @Override
   public void method_37130(class_2522 var1, class_1343 var2) {
      if (!var1.method_8350(class_4783.field_23718)) {
         super.method_37130(var1, var2);
      }
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13575;
   }

   @Override
   public boolean method_26495(class_2250 var1) {
      return var1.method_10339() != Effects.field_19718 ? super.method_26495(var1) : false;
   }

   public boolean method_35903() {
      return (this.field_41735.<Byte>method_36640(field_40597) & 1) != 0;
   }

   public void method_35904(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_40597);
      if (!var1) {
         var4 = (byte)(var4 & -2);
      } else {
         var4 = (byte)(var4 | 1);
      }

      this.field_41735.method_36633(field_40597, var4);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      if (var1.method_43360().nextInt(100) == 0) {
         class_6778 var8 = EntityType.field_34241.method_30484(this.world);
         var8.method_37144(this.getPosX(), this.method_37309(), this.getPosZ(), this.rotationYaw, 0.0F);
         var8.method_26864(var1, var2, var3, (class_8733)null, (CompoundNBT)null);
         var8.method_37353(this);
      }

      if (var4 == null) {
         var4 = new class_258();
         if (var1.method_43370() == class_423.field_1782 && var1.method_43360().nextFloat() < 0.1F * var2.method_44284()) {
            ((class_258)var4).method_1126(var1.method_43360());
         }
      }

      if (var4 instanceof class_258) {
         class_1425 var10 = ((class_258)var4).field_907;
         if (var10 != null) {
            this.method_26558(new class_2250(var10, Integer.MAX_VALUE));
         }
      }

      return var4;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.65F;
   }
}
