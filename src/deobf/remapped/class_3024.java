package remapped;

public class class_3024 extends class_5467 {
   private static final class_8137 field_14826 = class_8137.method_37019(
      class_4897.field_24621, class_4897.field_24435, class_4897.field_24480, class_4897.field_24883
   );
   public float field_14831;
   public float field_14827;
   public float field_14830;
   public float field_14829;
   public float field_14825 = 1.0F;
   public int field_14824 = this.field_41717.nextInt(6000) + 6000;
   public boolean field_14828;

   public class_3024(EntityType<? extends class_3024> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6359, 0.0F);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_518(this, 1.4));
      this.field_29916.method_3485(2, new class_9513(this, 1.0));
      this.field_29916.method_3485(3, new class_7228(this, 1.0, false, field_14826));
      this.field_29916.method_3485(4, new class_8676(this, 1.1));
      this.field_29916.method_3485(5, new class_2889(this, 1.0));
      this.field_29916.method_3485(6, new class_4407(this, class_704.class, 6.0F));
      this.field_29916.method_3485(7, new class_9691(this));
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return !this.method_26449() ? var2.field_31200 * 0.92F : var2.field_31200 * 0.85F;
   }

   public static class_1313 method_13807() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 4.0).method_5984(class_7331.field_37465, 0.25);
   }

   @Override
   public void method_26606() {
      super.method_26606();
      this.field_14829 = this.field_14831;
      this.field_14830 = this.field_14827;
      this.field_14827 = (float)((double)this.field_14827 + (double)(!this.onGround ? 4 : -1) * 0.3);
      this.field_14827 = class_9299.method_42828(this.field_14827, 0.0F, 1.0F);
      if (!this.onGround && this.field_14825 < 1.0F) {
         this.field_14825 = 1.0F;
      }

      this.field_14825 = (float)((double)this.field_14825 * 0.9);
      class_1343 var3 = this.method_37098();
      if (!this.onGround && var3.field_7333 < 0.0) {
         this.method_37215(var3.method_6210(1.0, 0.6, 1.0));
      }

      this.field_14831 = this.field_14831 + this.field_14825 * 2.0F;
      if (!this.world.field_33055 && this.isAlive() && !this.method_26449() && !this.method_13809() && --this.field_14824 <= 0) {
         this.method_37155(class_463.field_2876, 1.0F, (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
         this.method_37312(class_4897.field_24962);
         this.field_14824 = this.field_41717.nextInt(6000) + 6000;
      }
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_1957;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2424;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2698;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2840, 0.15F, 1.0F);
   }

   public class_3024 method_13810(class_6331 var1, class_1899 var2) {
      return EntityType.field_34263.method_30484(var1);
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return field_14826.test(var1);
   }

   @Override
   public int method_26427(class_704 var1) {
      return !this.method_13809() ? super.method_26427(var1) : 10;
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_14828 = var1.getBoolean("IsChickenJockey");
      if (var1.method_25938("EggLayTime")) {
         this.field_14824 = var1.method_25947("EggLayTime");
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.putBoolean("IsChickenJockey", this.field_14828);
      var1.method_25931("EggLayTime", this.field_14824);
   }

   @Override
   public boolean method_26911(double var1) {
      return this.method_13809();
   }

   @Override
   public void method_37340(Entity var1) {
      super.method_37340(var1);
      float var4 = class_9299.method_42818(this.field_29605 * (float) (Math.PI / 180.0));
      float var5 = class_9299.method_42840(this.field_29605 * (float) (Math.PI / 180.0));
      float var6 = 0.1F;
      float var7 = 0.0F;
      var1.method_37256(
         this.getPosX() + (double)(0.1F * var4), this.method_37080(0.5) + var1.method_37106() + 0.0, this.getPosZ() - (double)(0.1F * var5)
      );
      if (var1 instanceof class_5834) {
         ((class_5834)var1).field_29605 = this.field_29605;
      }
   }

   public boolean method_13809() {
      return this.field_14828;
   }

   public void method_13808(boolean var1) {
      this.field_14828 = var1;
   }
}
