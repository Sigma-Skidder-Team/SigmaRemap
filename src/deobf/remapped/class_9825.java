package remapped;

public class class_9825 extends class_516 implements class_1869 {
   private static final class_7821<Integer> field_49780 = class_8073.<Integer>method_36641(class_9825.class, class_2734.field_13366);
   private class_1343 field_49778 = class_1343.field_7335;
   private BlockPos field_49779 = BlockPos.field_7306;
   private class_55 field_49777 = class_55.field_38;

   public class_9825(EntityType<? extends class_9825> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
      this.field_29900 = new class_9650(this, this);
      this.field_29919 = new class_5009(this, this);
   }

   @Override
   public class_1902 method_26847() {
      return new class_3044(this, this);
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(1, new class_2094(this, null));
      this.goalSelector.addGoal(2, new class_2871(this, null));
      this.goalSelector.addGoal(3, new class_9653(this, null));
      this.targetSelector.addGoal(1, new class_4012(this, null));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_49780, 0);
   }

   public void method_45299(int var1) {
      this.field_41735.method_36633(field_49780, class_9299.method_42829(var1, 0, 64));
   }

   private void method_45293() {
      this.method_37187();
      this.method_26561(Attributes.ATTACK_DAMAGE).method_45006((double)(6 + this.method_45296()));
   }

   public int method_45296() {
      return this.field_41735.<Integer>method_36640(field_49780);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.35F;
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_49780.equals(var1)) {
         this.method_45293();
      }

      super.method_37191(var1);
   }

   @Override
   public boolean method_26869() {
      return true;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.world.field_33055) {
         float var3 = class_9299.method_42840((float)(this.method_37145() * 3 + this.field_41697) * 0.13F + (float) Math.PI);
         float var4 = class_9299.method_42840((float)(this.method_37145() * 3 + this.field_41697 + 1) * 0.13F + (float) Math.PI);
         if (var3 > 0.0F && var4 <= 0.0F) {
            this.world
               .method_29527(
                  this.getPosX(),
                  this.method_37309(),
                  this.getPosZ(),
                  class_463.field_2067,
                  this.method_37197(),
                  0.95F + this.field_41717.nextFloat() * 0.05F,
                  0.95F + this.field_41717.nextFloat() * 0.05F,
                  false
               );
         }

         int var5 = this.method_45296();
         float var6 = class_9299.method_42840(this.rotationYaw * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var5);
         float var7 = class_9299.method_42818(this.rotationYaw * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var5);
         float var8 = (0.3F + var3 * 0.45F) * ((float)var5 * 0.2F + 1.0F);
         this.world
            .method_43361(
               class_3090.field_15328,
               this.getPosX() + (double)var6,
               this.method_37309() + (double)var8,
               this.getPosZ() + (double)var7,
               0.0,
               0.0,
               0.0
            );
         this.world
            .method_43361(
               class_3090.field_15328,
               this.getPosX() - (double)var6,
               this.method_37309() + (double)var8,
               this.getPosZ() - (double)var7,
               0.0,
               0.0,
               0.0
            );
      }
   }

   @Override
   public void method_26606() {
      if (this.isAlive() && this.method_26884()) {
         this.method_37178(8);
      }

      super.method_26606();
   }

   @Override
   public void method_26919() {
      super.method_26919();
   }

   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.field_49779 = this.method_37075().method_6082(5);
      this.method_45299(0);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.method_25938("AX")) {
         this.field_49779 = new BlockPos(var1.method_25947("AX"), var1.method_25947("AY"), var1.method_25947("AZ"));
      }

      this.method_45299(var1.method_25947("Size"));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("AX", this.field_49779.method_12173());
      var1.putInt("AY", this.field_49779.method_12165());
      var1.putInt("AZ", this.field_49779.method_12185());
      var1.putInt("Size", this.method_45296());
   }

   @Override
   public boolean method_37176(double var1) {
      return true;
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2024;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2191;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2308;
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public float method_26439() {
      return 1.0F;
   }

   @Override
   public boolean method_26610(EntityType<?> var1) {
      return true;
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      int var4 = this.method_45296();
      class_6097 var5 = super.method_37190(var1);
      float var6 = (var5.field_31199 + 0.2F * (float)var4) / var5.field_31199;
      return var5.method_27942(var6);
   }
}
