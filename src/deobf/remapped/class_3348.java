package remapped;

import javax.annotation.Nullable;

public class class_3348 extends class_6749 {
   private static final class_7821<Byte> field_16515 = class_8073.<Byte>method_36641(class_3348.class, class_2734.field_13361);
   private static final class_7821<Boolean> field_16516 = class_8073.<Boolean>method_36641(class_3348.class, class_2734.field_13347);
   private ItemStack field_16520 = new ItemStack(class_4897.field_25086);
   private boolean field_16518;
   public int field_16517;

   public class_3348(EntityType<? extends class_3348> var1, World var2) {
      super(var1, var2);
   }

   public class_3348(World var1, LivingEntity var2, ItemStack var3) {
      super(EntityType.field_34284, var2, var1);
      this.field_16520 = var3.method_27973();
      this.field_41735.method_36633(field_16515, (byte)class_2931.method_13431(var3));
      this.field_41735.method_36633(field_16516, var3.method_27977());
   }

   public class_3348(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34284, var2, var4, var6, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_16515, (byte)0);
      this.field_41735.method_36634(field_16516, false);
   }

   @Override
   public void method_37123() {
      if (this.field_34840 > 4) {
         this.field_16518 = true;
      }

      Entity var3 = this.method_26166();
      if ((this.field_16518 || this.method_30926()) && var3 != null) {
         byte var4 = this.field_41735.<Byte>method_36640(field_16515);
         if (var4 > 0 && !this.method_15351()) {
            if (!this.world.field_33055 && this.field_34835 == class_4237.field_20563) {
               this.method_37311(this.method_30925(), 0.1F);
            }

            this.method_37204();
         } else if (var4 > 0) {
            this.method_30919(true);
            class_1343 var5 = new class_1343(
               var3.getPosX() - this.getPosX(), var3.method_37388() - this.method_37309(), var3.getPosZ() - this.getPosZ()
            );
            this.method_37222(this.getPosX(), this.method_37309() + var5.field_7333 * 0.015 * (double)var4, this.getPosZ());
            if (this.world.field_33055) {
               this.field_41713 = this.method_37309();
            }

            double var6 = 0.05 * (double)var4;
            this.method_37215(this.method_37098().method_6209(0.95).method_6215(var5.method_6213().method_6209(var6)));
            if (this.field_16517 == 0) {
               this.method_37155(SoundEvents.field_2181, 10.0F, 1.0F);
            }

            this.field_16517++;
         }
      }

      super.method_37123();
   }

   private boolean method_15351() {
      Entity var3 = this.method_26166();
      return var3 != null && var3.isAlive() ? !(var3 instanceof class_9359) || !var3.method_37221() : false;
   }

   @Override
   public ItemStack method_30925() {
      return this.field_16520.method_27973();
   }

   public boolean method_15352() {
      return this.field_41735.<Boolean>method_36640(field_16516);
   }

   @Nullable
   @Override
   public class_5631 method_30939(class_1343 var1, class_1343 var2) {
      return !this.field_16518 ? super.method_30939(var1, var2) : null;
   }

   @Override
   public void method_26163(class_5631 var1) {
      Entity var4 = var1.method_25524();
      float var5 = 8.0F;
      if (var4 instanceof LivingEntity) {
         LivingEntity var6 = (LivingEntity)var4;
         var5 += class_2931.method_13425(this.field_16520, var6.method_26550());
      }

      Entity var12 = this.method_26166();
      DamageSource var7 = DamageSource.method_28368(this, (Entity)(var12 != null ? var12 : this));
      this.field_16518 = true;
      SoundEvent var8 = SoundEvents.field_2442;
      if (var4.attackEntityFrom(var7, var5)) {
         if (var4.getType() == EntityType.field_34308) {
            return;
         }

         if (var4 instanceof LivingEntity) {
            LivingEntity var9 = (LivingEntity)var4;
            if (var12 instanceof LivingEntity) {
               class_2931.method_13429(var9, var12);
               class_2931.method_13406((LivingEntity)var12, var9);
            }

            this.method_30935(var9);
         }
      }

      this.method_37215(this.method_37098().method_6210(-0.01, -0.1, -0.01));
      float var13 = 1.0F;
      if (this.world instanceof class_6331 && this.world.method_29570() && class_2931.method_13424(this.field_16520)) {
         BlockPos var10 = var4.method_37075();
         if (this.world.method_25263(var10)) {
            class_900 var11 = EntityType.field_34224.method_30484(this.world);
            var11.method_37196(class_1343.method_6200(var10));
            var11.method_3857(!(var12 instanceof class_9359) ? null : (class_9359)var12);
            this.world.method_7509(var11);
            var8 = SoundEvents.field_2225;
            var13 = 5.0F;
         }
      }

      this.method_37155(var8, var13, 1.0F);
   }

   @Override
   public SoundEvent method_30933() {
      return SoundEvents.field_2570;
   }

   @Override
   public void method_37347(PlayerEntity var1) {
      Entity var4 = this.method_26166();
      if (var4 == null || var4.method_37328() == var1.method_37328()) {
         super.method_37347(var1);
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("Trident", 10)) {
         this.field_16520 = ItemStack.method_28015(var1.getCompound("Trident"));
      }

      this.field_16518 = var1.getBoolean("DealtDamage");
      this.field_41735.method_36633(field_16515, (byte)class_2931.method_13431(this.field_16520));
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.put("Trident", this.field_16520.method_27998(new CompoundNBT()));
      var1.putBoolean("DealtDamage", this.field_16518);
   }

   @Override
   public void method_30932() {
      byte var3 = this.field_41735.<Byte>method_36640(field_16515);
      if (this.field_34835 != class_4237.field_20563 || var3 <= 0) {
         super.method_30932();
      }
   }

   @Override
   public float method_30920() {
      return 0.99F;
   }

   @Override
   public boolean method_37185(double var1, double var3, double var5) {
      return true;
   }
}
