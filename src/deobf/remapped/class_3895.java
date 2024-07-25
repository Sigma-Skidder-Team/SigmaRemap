package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;

public class class_3895 extends class_1173 implements class_1869, class_9479 {
   private static final class_7821<Boolean> field_18951 = class_8073.<Boolean>method_36641(class_3895.class, class_2734.field_13347);
   private int field_18950;
   public static final ImmutableList<? extends class_3172<? extends class_6127<? super class_3895>>> field_18948 = ImmutableList.of(
      class_3172.field_15861, class_3172.field_15860
   );
   public static final ImmutableList<? extends class_6044<?>> field_18949 = ImmutableList.of(
      class_6044.field_30907,
      class_6044.field_30901,
      class_6044.field_30870,
      class_6044.field_30912,
      class_6044.field_30874,
      class_6044.field_30889,
      class_6044.field_30909,
      class_6044.field_30888,
      class_6044.field_30884,
      class_6044.field_30865
   );

   public class_3895(EntityType<? extends class_3895> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
   }

   @Override
   public class_1193<class_3895> method_26410() {
      return class_1150.<class_3895>method_5128(field_18949, field_18948);
   }

   @Override
   public class_1150<?> method_26585(Dynamic<?> var1) {
      class_1150 var4 = this.method_26410().method_5284(var1);
      method_18034(var4);
      method_18037(var4);
      method_18041(var4);
      var4.method_5114(ImmutableSet.of(class_6275.field_32072));
      var4.method_5130(class_6275.field_32075);
      var4.method_5103();
      return var4;
   }

   private static void method_18034(class_1150<class_3895> var0) {
      var0.method_5124(class_6275.field_32072, 0, ImmutableList.of(new class_4634(45, 90), new class_1657()));
   }

   private static void method_18037(class_1150<class_3895> var0) {
      var0.method_5124(
         class_6275.field_32075,
         10,
         ImmutableList.of(
            new class_8962(class_3895::method_18033),
            new class_5499<class_5834>(new class_6109(8.0F), class_4376.method_20391(30, 60)),
            new class_5197(ImmutableList.of(Pair.of(new class_1203(0.4F), 2), Pair.of(new class_324(0.4F, 3), 2), Pair.of(new class_102(30, 60), 1)))
         )
      );
   }

   private static void method_18041(class_1150<class_3895> var0) {
      var0.method_5116(
         class_6275.field_32070,
         10,
         ImmutableList.of(
            new class_1005(1.0F),
            new class_2214<MobEntity>(class_3895::method_18039, new class_5488(40)),
            new class_2214<MobEntity>(class_3895::method_26449, new class_5488(15)),
            new class_5443()
         ),
         class_6044.field_30884
      );
   }

   private Optional<? extends class_5834> method_18033() {
      return this.method_26525()
         .<List<class_5834>>method_5138(class_6044.field_30901)
         .orElse(ImmutableList.of())
         .stream()
         .filter(class_3895::method_18035)
         .findFirst();
   }

   private static boolean method_18035(class_5834 var0) {
      EntityType var3 = var0.getType();
      return var3 != EntityType.field_34244 && var3 != EntityType.field_34210 && class_3572.field_17480.test(var0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_18951, false);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (field_18951.equals(var1)) {
         this.method_37187();
      }
   }

   public static class_1313 method_18038() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 40.0)
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37463, 0.6F)
         .method_5984(class_7331.field_37467, 1.0)
         .method_5984(class_7331.field_37462, 6.0);
   }

   public boolean method_18039() {
      return !this.method_26449();
   }

   @Override
   public boolean method_26442(Entity var1) {
      if (var1 instanceof class_5834) {
         this.field_18950 = 10;
         this.world.method_29587(this, (byte)4);
         this.method_37155(class_463.field_2853, 1.0F, this.method_26547());
         return class_9479.method_43797(this, (class_5834)var1);
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26887(PlayerEntity var1) {
      return !this.method_26920();
   }

   @Override
   public void method_26469(class_5834 var1) {
      if (!this.method_26449()) {
         class_9479.method_43796(this, var1);
      }
   }

   @Override
   public double method_37149() {
      return (double)this.method_37074() - (!this.method_26449() ? 0.15 : 0.2);
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      boolean var5 = super.attackEntityFrom(var1, var2);
      if (!this.world.field_33055) {
         if (var5 && var1.method_28372() instanceof class_5834) {
            class_5834 var6 = (class_5834)var1.method_28372();
            if (class_3572.field_17480.test(var6) && !class_1225.method_5452(this, var6, 4.0)) {
               this.method_18042(var6);
            }

            return var5;
         } else {
            return var5;
         }
      } else {
         return false;
      }
   }

   private void method_18042(class_5834 var1) {
      this.field_29675.method_5127(class_6044.field_30909);
      this.field_29675.method_5107(class_6044.field_30884, var1, 200L);
   }

   @Override
   public class_1150<class_3895> method_26525() {
      return (class_1150<class_3895>)super.method_26525();
   }

   public void method_18036() {
      class_6275 var3 = this.field_29675.method_5126().orElse((class_6275)null);
      this.field_29675.method_5110(ImmutableList.of(class_6275.field_32070, class_6275.field_32075));
      class_6275 var4 = this.field_29675.method_5126().orElse((class_6275)null);
      if (var4 == class_6275.field_32070 && var3 != class_6275.field_32070) {
         this.method_18040();
      }

      this.method_26891(this.field_29675.method_5117(class_6044.field_30884));
   }

   @Override
   public void method_26919() {
      this.world.method_29599().startSection("zoglinBrain");
      this.method_26525().method_5141((class_6331)this.world, this);
      this.world.method_29599().endSection();
      this.method_18036();
   }

   @Override
   public void method_26910(boolean var1) {
      this.method_37372().method_36633(field_18951, var1);
      if (!this.world.field_33055 && var1) {
         this.method_26561(class_7331.field_37462).method_45006(0.5);
      }
   }

   @Override
   public boolean method_26449() {
      return this.method_37372().<Boolean>method_36640(field_18951);
   }

   @Override
   public void method_26606() {
      if (this.field_18950 > 0) {
         this.field_18950--;
      }

      super.method_26606();
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 4) {
         super.method_37336(var1);
      } else {
         this.field_18950 = 10;
         this.method_37155(class_463.field_2853, 1.0F, this.method_26547());
      }
   }

   @Override
   public int method_43795() {
      return this.field_18950;
   }

   @Override
   public class_8461 method_26918() {
      if (!this.world.field_33055) {
         return !this.field_29675.method_5117(class_6044.field_30884) ? class_463.field_2726 : class_463.field_2845;
      } else {
         return null;
      }
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2553;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2363;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2189, 0.15F, 1.0F);
   }

   public void method_18040() {
      this.method_37155(class_463.field_2845, 1.0F, this.method_26547());
   }

   @Override
   public void method_26929() {
      super.method_26929();
      class_1892.method_8440(this);
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.method_26449()) {
         var1.putBoolean("IsBaby", true);
      }
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.getBoolean("IsBaby")) {
         this.method_26910(true);
      }
   }
}
