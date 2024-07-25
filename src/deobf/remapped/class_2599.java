package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;

public class class_2599 extends class_6993 implements class_3832 {
   private static final class_7821<Boolean> field_12843 = class_8073.<Boolean>method_36641(class_2599.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_12845 = class_8073.<Boolean>method_36641(class_2599.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_12838 = class_8073.<Boolean>method_36641(class_2599.class, class_2734.field_13347);
   private static final UUID field_12844 = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final class_9343 field_12839 = new class_9343(field_12844, "Baby speed boost", 0.2F, class_9342.field_47678);
   private final class_4657 field_12846 = new class_4657(8);
   private boolean field_12847 = false;
   public static final ImmutableList<class_3172<? extends class_6127<? super class_2599>>> field_12842 = ImmutableList.of(
      class_3172.field_15861, class_3172.field_15860, class_3172.field_15866, class_3172.field_15865, class_3172.field_15859
   );
   public static final ImmutableList<class_6044<?>> field_12840 = ImmutableList.of(
      class_6044.field_30874,
      class_6044.field_30872,
      class_6044.field_30907,
      class_6044.field_30901,
      class_6044.field_30870,
      class_6044.field_30912,
      class_6044.field_30902,
      class_6044.field_30876,
      class_6044.field_30869,
      class_6044.field_30867,
      class_6044.field_30859,
      class_6044.field_30889,
      new class_6044[]{
         class_6044.field_30909,
         class_6044.field_30884,
         class_6044.field_30865,
         class_6044.field_30861,
         class_6044.field_30888,
         class_6044.field_30866,
         class_6044.field_30880,
         class_6044.field_30913,
         class_6044.field_30897,
         class_6044.field_30893,
         class_6044.field_30879,
         class_6044.field_30890,
         class_6044.field_30895,
         class_6044.field_30862,
         class_6044.field_30864,
         class_6044.field_30914,
         class_6044.field_30891,
         class_6044.field_30908,
         class_6044.field_30903,
         class_6044.field_30878,
         class_6044.field_30906,
         class_6044.field_30873,
         class_6044.field_30904,
         class_6044.field_30911,
         class_6044.field_30857,
         class_6044.field_30905
      }
   );

   public class_2599(EntityType<? extends class_6993> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.method_26449()) {
         var1.putBoolean("IsBaby", true);
      }

      if (this.field_12847) {
         var1.putBoolean("CannotHunt", true);
      }

      var1.put("Inventory", this.field_12846.method_21552());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_26910(var1.getBoolean("IsBaby"));
      this.method_11791(var1.getBoolean("CannotHunt"));
      this.field_12846.method_21549(var1.method_25927("Inventory", 10));
   }

   @Override
   public void method_26614(DamageSource var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);
      this.field_12846.method_21553().forEach(this::method_37310);
   }

   public ItemStack method_11793(ItemStack var1) {
      return this.field_12846.method_21542(var1);
   }

   public boolean method_11800(ItemStack var1) {
      return this.field_12846.method_21541(var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_12843, false);
      this.field_41735.method_36634(field_12845, false);
      this.field_41735.method_36634(field_12838, false);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (field_12843.equals(var1)) {
         this.method_37187();
      }
   }

   public static class_1313 method_11801() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 16.0)
         .method_5984(class_7331.field_37465, 0.35F)
         .method_5984(class_7331.field_37462, 5.0);
   }

   public static boolean method_11799(EntityType<class_2599> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      return !var1.method_28262(var3.method_6100()).method_8350(class_4783.field_23273);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var3 != class_2417.field_12033) {
         if (!(var1.method_43360().nextFloat() < 0.2F)) {
            if (this.method_31995()) {
               this.method_37349(class_6943.field_35707, this.method_11789());
            }
         } else {
            this.method_26910(true);
         }
      }

      class_134.method_537(this);
      this.method_26870(var2);
      this.method_26893(var2);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_26869() {
      return false;
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.method_26925();
   }

   @Override
   public void method_26870(class_9589 var1) {
      if (this.method_31995()) {
         this.method_11798(class_6943.field_35704, new ItemStack(class_4897.field_24338));
         this.method_11798(class_6943.field_35708, new ItemStack(class_4897.field_24849));
         this.method_11798(class_6943.field_35698, new ItemStack(class_4897.field_25088));
         this.method_11798(class_6943.field_35700, new ItemStack(class_4897.field_25132));
      }
   }

   private void method_11798(class_6943 var1, ItemStack var2) {
      if (this.world.field_33033.nextFloat() < 0.1F) {
         this.method_37349(var1, var2);
      }
   }

   @Override
   public class_1193<class_2599> method_26410() {
      return class_1150.<class_2599>method_5128(field_12840, field_12842);
   }

   @Override
   public class_1150<?> method_26585(Dynamic<?> var1) {
      return class_134.method_488(this, this.method_26410().method_5284(var1));
   }

   @Override
   public class_1150<class_2599> method_26525() {
      return (class_1150<class_2599>)super.method_26525();
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      class_6910 var5 = super.method_26857(var1, var2);
      if (!var5.method_31662()) {
         if (!this.world.field_33055) {
            return class_134.method_518(this, var1, var2);
         } else {
            boolean var6 = class_134.method_515(this, var1.method_26617(var2)) && this.method_31993() != class_9316.field_47573;
            return !var6 ? class_6910.field_35521 : class_6910.field_35520;
         }
      } else {
         return var5;
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return !this.method_26449() ? 1.74F : 0.93F;
   }

   @Override
   public double method_37149() {
      return (double)this.method_37074() * 0.92;
   }

   @Override
   public void method_26910(boolean var1) {
      this.method_37372().method_36633(field_12843, var1);
      if (!this.world.field_33055) {
         class_9747 var4 = this.method_26561(class_7331.field_37465);
         var4.method_45004(field_12839);
         if (var1) {
            var4.method_45011(field_12839);
         }
      }
   }

   @Override
   public boolean method_26449() {
      return this.method_37372().<Boolean>method_36640(field_12843);
   }

   private void method_11791(boolean var1) {
      this.field_12847 = var1;
   }

   @Override
   public boolean method_31988() {
      return !this.field_12847;
   }

   @Override
   public void method_26919() {
      this.world.method_29599().startSection("piglinBrain");
      this.method_26525().method_5141((class_6331)this.world, this);
      this.world.method_29599().endSection();
      class_134.method_534(this);
      super.method_26919();
   }

   @Override
   public int method_26427(PlayerEntity var1) {
      return this.field_29915;
   }

   @Override
   public void method_31992(class_6331 var1) {
      class_134.method_496(this);
      this.field_12846.method_21553().forEach(this::method_37310);
      super.method_31992(var1);
   }

   private ItemStack method_11789() {
      return !((double)this.field_41717.nextFloat() < 0.5) ? new ItemStack(class_4897.field_25057) : new ItemStack(class_4897.field_25030);
   }

   private boolean method_11790() {
      return this.field_41735.<Boolean>method_36640(field_12845);
   }

   @Override
   public void method_17810(boolean var1) {
      this.field_41735.method_36633(field_12845, var1);
   }

   @Override
   public void method_17814() {
      this.field_29658 = 0;
   }

   @Override
   public class_9316 method_31993() {
      if (!this.method_11795()) {
         if (class_134.method_491(this.method_26568().method_27960())) {
            return class_9316.field_47573;
         } else if (this.method_26892() && this.method_31987()) {
            return class_9316.field_47570;
         } else if (this.method_11790()) {
            return class_9316.field_47571;
         } else {
            return this.method_26892() && this.method_26443(class_4897.field_25030) ? class_9316.field_47569 : class_9316.field_47576;
         }
      } else {
         return class_9316.field_47574;
      }
   }

   public boolean method_11795() {
      return this.field_41735.<Boolean>method_36640(field_12838);
   }

   public void method_11788(boolean var1) {
      this.field_41735.method_36633(field_12838, var1);
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      boolean var5 = super.attackEntityFrom(var1, var2);
      if (!this.world.field_33055) {
         if (var5 && var1.method_28372() instanceof class_5834) {
            class_134.method_483(this, (class_5834)var1.method_28372());
         }

         return var5;
      } else {
         return false;
      }
   }

   @Override
   public void method_10805(class_5834 var1, float var2) {
      this.method_17815(this, 1.6F);
   }

   @Override
   public void method_17812(class_5834 var1, ItemStack var2, class_5783 var3, float var4) {
      this.method_17811(this, var1, var3, var4, 1.6F);
   }

   @Override
   public boolean method_26878(class_551 var1) {
      return var1 == class_4897.field_25030;
   }

   public void method_11797(ItemStack var1) {
      this.method_26866(class_6943.field_35707, var1);
   }

   public void method_11794(ItemStack var1) {
      if (var1.method_27960() != class_134.field_388) {
         this.method_26866(class_6943.field_35701, var1);
      } else {
         this.method_37349(class_6943.field_35701, var1);
         this.method_26858(class_6943.field_35701);
      }
   }

   @Override
   public boolean method_26873(ItemStack var1) {
      return this.world.method_29537().method_1285(class_291.field_1047) && this.method_26930() && class_134.method_511(this, var1);
   }

   public boolean method_11787(ItemStack var1) {
      class_6943 var4 = class_5886.method_26896(var1);
      ItemStack var5 = this.method_26520(var4);
      return this.method_26881(var1, var5);
   }

   @Override
   public boolean method_26881(ItemStack var1, ItemStack var2) {
      if (class_2931.method_13421(var2)) {
         return false;
      } else {
         boolean var5 = class_134.method_491(var1.method_27960()) || var1.method_27960() == class_4897.field_25030;
         boolean var6 = class_134.method_491(var2.method_27960()) || var2.method_27960() == class_4897.field_25030;
         if (var5 && !var6) {
            return true;
         } else if (!var5 && var6) {
            return false;
         } else {
            return this.method_31995() && var1.method_27960() != class_4897.field_25030 && var2.method_27960() == class_4897.field_25030
               ? false
               : super.method_26881(var1, var2);
         }
      }
   }

   @Override
   public void method_26902(class_91 var1) {
      this.method_26562(var1);
      class_134.method_541(this, var1);
   }

   @Override
   public boolean startRiding(Entity var1, boolean var2) {
      if (this.method_26449() && var1.method_37387() == EntityType.field_34306) {
         var1 = this.method_11792(var1, 3);
      }

      return super.startRiding(var1, var2);
   }

   private Entity method_11792(Entity var1, int var2) {
      List var5 = var1.method_37114();
      return var2 != 1 && !var5.isEmpty() ? this.method_11792((Entity)var5.get(0), var2 - 1) : var1;
   }

   @Override
   public class_8461 method_26918() {
      return !this.world.field_33055 ? class_134.method_499(this).orElse((class_8461)null) : null;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_1945;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2652;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2684, 0.15F, 1.0F);
   }

   public void method_11796(class_8461 var1) {
      this.method_37155(var1, this.method_26439(), this.method_26547());
   }

   @Override
   public void method_31986() {
      this.method_11796(class_463.field_2656);
   }
}
