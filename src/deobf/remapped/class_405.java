package remapped;

import com.google.common.collect.Sets;
import java.util.HashSet;
import javax.annotation.Nullable;

public abstract class class_405 extends class_1899 implements class_5908, class_233 {
   private static final class_7821<Integer> field_1686 = class_8073.<Integer>method_36641(class_405.class, class_2734.field_13366);
   private PlayerEntity field_1684;
   public class_2795 field_1687;
   private final class_4657 field_1685 = new class_4657(8);

   public class_405(EntityType<? extends class_405> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6357, 16.0F);
      this.method_26895(class_1108.field_6352, -1.0F);
   }

   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new class_1821(false);
      }

      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   public int method_2026() {
      return this.field_41735.<Integer>method_36640(field_1686);
   }

   public void method_2019(int var1) {
      this.field_41735.method_36633(field_1686, var1);
   }

   @Override
   public int method_973() {
      return 0;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return !this.method_26449() ? 1.62F : 0.81F;
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_1686, 0);
   }

   @Override
   public void method_975(PlayerEntity var1) {
      this.field_1684 = var1;
   }

   @Nullable
   @Override
   public PlayerEntity method_978() {
      return this.field_1684;
   }

   public boolean method_2024() {
      return this.field_1684 != null;
   }

   @Override
   public class_2795 method_974() {
      if (this.field_1687 == null) {
         this.field_1687 = new class_2795();
         this.method_2016();
      }

      return this.field_1687;
   }

   @Override
   public void method_980(class_2795 var1) {
   }

   @Override
   public void method_984(int var1) {
   }

   @Override
   public void method_981(class_8014 var1) {
      var1.method_36358();
      this.field_29913 = -this.method_26850();
      this.method_2023(var1);
      if (this.field_1684 instanceof class_9359) {
         class_8807.field_45051.method_16038((class_9359)this.field_1684, this, var1.method_36362());
      }
   }

   public abstract void method_2023(class_8014 var1);

   @Override
   public boolean method_982() {
      return true;
   }

   @Override
   public void method_979(ItemStack var1) {
      if (!this.world.field_33055 && this.field_29913 > -this.method_26850() + 20) {
         this.field_29913 = -this.method_26850();
         this.method_37155(this.method_2018(!var1.method_28022()), this.method_26439(), this.method_26547());
      }
   }

   @Override
   public class_8461 method_976() {
      return class_463.field_2635;
   }

   public class_8461 method_2018(boolean var1) {
      return !var1 ? class_463.field_2883 : class_463.field_2635;
   }

   public void method_2020() {
      this.method_37155(class_463.field_2716, this.method_26439(), this.method_26547());
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      class_2795 var4 = this.method_974();
      if (!var4.isEmpty()) {
         var1.put("Offers", var4.method_12711());
      }

      var1.put("Inventory", this.field_1685.method_21552());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("Offers", 10)) {
         this.field_1687 = new class_2795(var1.getCompound("Offers"));
      }

      this.field_1685.method_21549(var1.method_25927("Inventory", 10));
   }

   @Nullable
   @Override
   public Entity method_37326(class_6331 var1) {
      this.method_2025();
      return super.method_37326(var1);
   }

   public void method_2025() {
      this.method_975((PlayerEntity)null);
   }

   @Override
   public void method_26452(DamageSource var1) {
      super.method_26452(var1);
      this.method_2025();
   }

   public void method_2022(class_5079 var1) {
      for (int var4 = 0; var4 < 5; var4++) {
         double var5 = this.field_41717.nextGaussian() * 0.02;
         double var7 = this.field_41717.nextGaussian() * 0.02;
         double var9 = this.field_41717.nextGaussian() * 0.02;
         this.world.method_43361(var1, this.method_37361(1.0), this.method_37255() + 1.0, this.method_37383(1.0), var5, var7, var9);
      }
   }

   @Override
   public boolean method_26887(PlayerEntity var1) {
      return false;
   }

   public class_4657 method_2017() {
      return this.field_1685;
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      if (!super.method_37166(var1, var2)) {
         int var5 = var1 - 300;
         if (var5 >= 0 && var5 < this.field_1685.method_31505()) {
            this.field_1685.method_31503(var5, var2);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public World method_972() {
      return this.world;
   }

   public abstract void method_2016();

   public void method_2021(class_2795 var1, class_4904[] var2, int var3) {
      HashSet var6 = Sets.newHashSet();
      if (var2.length <= var3) {
         for (int var7 = 0; var7 < var2.length; var7++) {
            var6.add(var7);
         }
      } else {
         while (var6.size() < var3) {
            var6.add(this.field_41717.nextInt(var2.length));
         }
      }

      for (Integer var8 : var6) {
         class_4904 var9 = var2[var8];
         class_8014 var10 = var9.method_22451(this, this.field_41717);
         if (var10 != null) {
            var1.add(var10);
         }
      }
   }

   @Override
   public class_1343 method_37202(float var1) {
      float var4 = class_9299.method_42795(var1, this.field_29611, this.field_29605) * (float) (Math.PI / 180.0);
      class_1343 var5 = new class_1343(0.0, this.method_37241().method_18901() - 1.0, 0.2);
      return this.method_37280(var1).method_6215(var5.method_6192(-var4));
   }
}
