package remapped;

import javax.annotation.Nullable;

public class class_9310 extends class_5521 implements class_2354 {
   private static final class_8137 field_47543 = class_8137.method_37019(class_4897.field_24813, class_4783.field_23429.method_10803());
   private static final class_7821<Integer> field_47542 = class_8073.<Integer>method_36641(class_9310.class, class_2734.field_13366);
   private static final class_7821<Integer> field_47545 = class_8073.<Integer>method_36641(class_9310.class, class_2734.field_13366);
   private static final class_7821<Integer> field_47538 = class_8073.<Integer>method_36641(class_9310.class, class_2734.field_13366);
   private boolean field_47539;
   private class_9310 field_47541;
   private class_9310 field_47540;

   public class_9310(class_6629<? extends class_9310> var1, World var2) {
      super(var1, var2);
   }

   public boolean method_42975() {
      return false;
   }

   private void method_42983(int var1) {
      this.field_41735.method_36633(field_47542, Math.max(1, Math.min(5, var1)));
   }

   private void method_42980() {
      int var3 = !(this.field_41717.nextFloat() < 0.04F) ? 3 : 5;
      this.method_42983(1 + this.field_41717.nextInt(var3));
   }

   public int method_42988() {
      return this.field_41735.<Integer>method_36640(field_47542);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("Variant", this.method_42977());
      var1.method_25931("Strength", this.method_42988());
      if (!this.field_20021.method_31498(1).method_28022()) {
         var1.put("DecorItem", this.field_20021.method_31498(1).method_27998(new CompoundNBT()));
      }
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.method_42983(var1.method_25947("Strength"));
      super.method_37314(var1);
      this.method_42972(var1.method_25947("Variant"));
      if (var1.contains("DecorItem", 10)) {
         this.field_20021.method_31503(1, ItemStack.method_28015(var1.getCompound("DecorItem")));
      }

      this.method_19070();
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_9169(this, 1.2));
      this.field_29916.method_3485(2, new class_3078(this, 2.1F));
      this.field_29916.method_3485(3, new class_1837(this, 1.25, 40, 20.0F));
      this.field_29916.method_3485(3, new class_518(this, 1.2));
      this.field_29916.method_3485(4, new class_9513(this, 1.0));
      this.field_29916.method_3485(5, new class_8676(this, 1.0));
      this.field_29916.method_3485(6, new class_2889(this, 0.7));
      this.field_29916.method_3485(7, new class_4407(this, class_704.class, 6.0F));
      this.field_29916.method_3485(8, new class_9691(this));
      this.field_29908.method_3485(1, new class_5145(this));
      this.field_29908.method_3485(2, new class_2712(this));
   }

   public static class_1313 method_42979() {
      return method_25018().method_5984(class_7331.field_37471, 40.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_47542, 0);
      this.field_41735.method_36634(field_47545, -1);
      this.field_41735.method_36634(field_47538, 0);
   }

   public int method_42977() {
      return class_9299.method_42829(this.field_41735.<Integer>method_36640(field_47538), 0, 3);
   }

   public void method_42972(int var1) {
      this.field_41735.method_36633(field_47538, var1);
   }

   @Override
   public int method_19085() {
      return !this.method_25017() ? super.method_19085() : 2 + 3 * this.method_25019();
   }

   @Override
   public void method_37340(Entity var1) {
      if (this.method_37072(var1)) {
         float var4 = class_9299.method_42840(this.field_29605 * (float) (Math.PI / 180.0));
         float var5 = class_9299.method_42818(this.field_29605 * (float) (Math.PI / 180.0));
         float var6 = 0.3F;
         var1.method_37256(
            this.method_37302() + (double)(0.3F * var5),
            this.method_37309() + this.method_37149() + var1.method_37106(),
            this.method_37156() - (double)(0.3F * var4)
         );
      }
   }

   @Override
   public double method_37149() {
      return (double)this.method_37074() * 0.67;
   }

   @Override
   public boolean method_26863() {
      return false;
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return field_47543.test(var1);
   }

   @Override
   public boolean method_19060(class_704 var1, ItemStack var2) {
      byte var5 = 0;
      byte var6 = 0;
      float var7 = 0.0F;
      boolean var8 = false;
      class_2451 var9 = var2.method_27960();
      if (var9 != class_4897.field_24813) {
         if (var9 == class_4783.field_23429.method_10803()) {
            var5 = 90;
            var6 = 6;
            var7 = 10.0F;
            if (this.method_19043() && this.method_8634() == 0 && this.method_24870()) {
               var8 = true;
               this.method_24869(var1);
            }
         }
      } else {
         var5 = 10;
         var6 = 3;
         var7 = 2.0F;
      }

      if (this.method_26551() < this.method_26465() && var7 > 0.0F) {
         this.heal(var7);
         var8 = true;
      }

      if (this.method_26449() && var5 > 0) {
         this.world.method_43361(class_3090.field_15361, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), 0.0, 0.0, 0.0);
         if (!this.world.field_33055) {
            this.method_8632(var5);
         }

         var8 = true;
      }

      if (var6 > 0 && (var8 || !this.method_19043()) && this.method_19062() < this.method_19075()) {
         var8 = true;
         if (!this.world.field_33055) {
            this.method_19074(var6);
         }
      }

      if (var8 && !this.method_37378()) {
         class_8461 var10 = this.method_19083();
         if (var10 != null) {
            this.world
               .method_29528(
                  (class_704)null,
                  this.method_37302(),
                  this.method_37309(),
                  this.method_37156(),
                  this.method_19083(),
                  this.method_37197(),
                  1.0F,
                  1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F
               );
         }
      }

      return var8;
   }

   @Override
   public boolean method_26468() {
      return this.method_26450() || this.method_19086();
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_42980();
      int var8;
      if (!(var4 instanceof class_5404)) {
         var8 = this.field_41717.nextInt(4);
         var4 = new class_5404(var8, null);
      } else {
         var8 = ((class_5404)var4).field_27574;
      }

      this.method_42972(var8);
      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   @Override
   public class_8461 method_19056() {
      return class_463.field_2712;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2584;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2539;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2085;
   }

   @Nullable
   @Override
   public class_8461 method_19083() {
      return class_463.field_2895;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2691, 0.15F, 1.0F);
   }

   @Override
   public void method_25020() {
      this.method_37155(class_463.field_2454, 1.0F, (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public void method_19037() {
      class_8461 var3 = this.method_19056();
      if (var3 != null) {
         this.method_37155(var3, this.method_26439(), this.method_26547());
      }
   }

   @Override
   public int method_25019() {
      return this.method_42988();
   }

   @Override
   public boolean method_19052() {
      return true;
   }

   @Override
   public boolean method_19067() {
      return !this.field_20021.method_31498(1).method_28022();
   }

   @Override
   public boolean method_19069(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      return class_391.field_1619.method_10609(var4);
   }

   @Override
   public boolean method_43356() {
      return false;
   }

   @Override
   public void method_36982(class_6867 var1) {
      class_9077 var4 = this.method_42989();
      super.method_36982(var1);
      class_9077 var5 = this.method_42989();
      if (this.field_41697 > 20 && var5 != null && var5 != var4) {
         this.method_37155(class_463.field_2192, 0.5F, 1.0F);
      }
   }

   @Override
   public void method_19070() {
      if (!this.world.field_33055) {
         super.method_19070();
         this.method_42973(method_42978(this.field_20021.method_31498(1)));
      }
   }

   private void method_42973(class_9077 var1) {
      this.field_41735.method_36633(field_47545, var1 != null ? var1.method_41794() : -1);
   }

   @Nullable
   private static class_9077 method_42978(ItemStack var0) {
      class_6414 var3 = class_6414.method_29269(var0.method_27960());
      return !(var3 instanceof class_2325) ? null : ((class_2325)var3).method_10672();
   }

   @Nullable
   public class_9077 method_42989() {
      int var3 = this.field_41735.<Integer>method_36640(field_47545);
      return var3 != -1 ? class_9077.method_41789(var3) : null;
   }

   @Override
   public int method_19075() {
      return 30;
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      return var1 != this && var1 instanceof class_9310 && this.method_19058() && ((class_9310)var1).method_19058();
   }

   public class_9310 method_42990(class_6331 var1, class_1899 var2) {
      class_9310 var5 = this.method_42987();
      this.method_19055(var2, var5);
      class_9310 var6 = (class_9310)var2;
      int var7 = this.field_41717.nextInt(Math.max(this.method_42988(), var6.method_42988())) + 1;
      if (this.field_41717.nextFloat() < 0.03F) {
         var7++;
      }

      var5.method_42983(var7);
      var5.method_42972(!this.field_41717.nextBoolean() ? var6.method_42977() : this.method_42977());
      return var5;
   }

   public class_9310 method_42987() {
      return class_6629.field_34327.method_30484(this.world);
   }

   private void method_42985(class_5834 var1) {
      class_7548 var4 = new class_7548(this.world, this);
      double var5 = var1.method_37302() - this.method_37302();
      double var7 = var1.method_37080(0.3333333333333333) - var4.method_37309();
      double var9 = var1.method_37156() - this.method_37156();
      float var11 = class_9299.method_42842(var5 * var5 + var9 * var9) * 0.2F;
      var4.method_26161(var5, var7 + (double)var11, var9, 1.5F, 10.0F);
      if (!this.method_37378()) {
         this.world
            .method_29528(
               (class_704)null,
               this.method_37302(),
               this.method_37309(),
               this.method_37156(),
               class_463.field_2821,
               this.method_37197(),
               1.0F,
               1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F
            );
      }

      this.world.method_7509(var4);
      this.field_47539 = true;
   }

   private void method_42986(boolean var1) {
      this.field_47539 = var1;
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      int var5 = this.method_26490(var1, var2);
      if (var5 <= 0) {
         return false;
      } else {
         if (var1 >= 6.0F) {
            this.attackEntityFrom(DamageSource.field_31684, (float)var5);
            if (this.method_37151()) {
               for (Entity var7 : this.method_37379()) {
                  var7.attackEntityFrom(DamageSource.field_31684, (float)var5);
               }
            }
         }

         this.method_26512();
         return true;
      }
   }

   public void method_42976() {
      if (this.field_47541 != null) {
         this.field_47541.field_47540 = null;
      }

      this.field_47541 = null;
   }

   public void method_42982(class_9310 var1) {
      this.field_47541 = var1;
      this.field_47541.field_47540 = this;
   }

   public boolean method_42971() {
      return this.field_47540 != null;
   }

   public boolean method_42974() {
      return this.field_47541 != null;
   }

   @Nullable
   public class_9310 method_42970() {
      return this.field_47541;
   }

   @Override
   public double method_21378() {
      return 2.0;
   }

   @Override
   public void method_19088() {
      if (!this.method_42974() && this.method_26449()) {
         super.method_19088();
      }
   }

   @Override
   public boolean method_19042() {
      return false;
   }

   @Override
   public void method_10805(class_5834 var1, float var2) {
      this.method_42985(var1);
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, 0.75 * (double)this.method_37277(), (double)this.method_37086() * 0.5);
   }
}
