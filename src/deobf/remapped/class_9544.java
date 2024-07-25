package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class class_9544 {
   private static String[] field_48559;

   public static class_1150<?> method_44049(class_7263 var0, class_1150<class_7263> var1) {
      method_44052(var0, var1);
      method_44039(var0, var1);
      method_44040(var0, var1);
      var1.method_5114(ImmutableSet.of(class_6275.field_32072));
      var1.method_5130(class_6275.field_32075);
      var1.method_5103();
      return var1;
   }

   public static void method_44041(class_7263 var0) {
      class_8150 var3 = class_8150.method_37410(var0.world.method_29545(), var0.method_37075());
      var0.method_26525().method_5105(class_6044.field_30854, var3);
   }

   private static void method_44052(class_7263 var0, class_1150<class_7263> var1) {
      var1.method_5124(class_6275.field_32072, 0, ImmutableList.of(new class_4634(45, 90), new class_1657(), new class_3371(), new class_885()));
   }

   private static void method_44039(class_7263 var0, class_1150<class_7263> var1) {
      var1.method_5124(
         class_6275.field_32075,
         10,
         ImmutableList.of(new class_8962<class_6993>(class_9544::method_44045), method_44050(), method_44047(), new class_6198(EntityType.field_34300, 4))
      );
   }

   private static void method_44040(class_7263 var0, class_1150<class_7263> var1) {
      var1.method_5116(
         class_6275.field_32070,
         10,
         ImmutableList.of(new class_5443(var1x -> !method_44046(var0, var1x)), new class_1005(1.0F), new class_5488(20)),
         class_6044.field_30884
      );
   }

   private static class_5197<class_7263> method_44050() {
      return new class_5197<class_7263>(
         ImmutableList.of(
            Pair.of(new class_6109(EntityType.field_34300, 8.0F), 1),
            Pair.of(new class_6109(EntityType.field_34240, 8.0F), 1),
            Pair.of(new class_6109(EntityType.field_34257, 8.0F), 1),
            Pair.of(new class_6109(8.0F), 1),
            Pair.of(new class_102(30, 60), 1)
         )
      );
   }

   private static class_5197<class_7263> method_44047() {
      return new class_5197<class_7263>(
         ImmutableList.of(
            Pair.of(new class_1203(0.6F), 2),
            Pair.of(class_4741.<LivingEntity>method_21905(EntityType.field_34240, 8, class_6044.field_30861, 0.6F, 2), 2),
            Pair.of(class_4741.<LivingEntity>method_21905(EntityType.field_34257, 8, class_6044.field_30861, 0.6F, 2), 2),
            Pair.of(new class_7375(class_6044.field_30854, 0.6F, 2, 100), 2),
            Pair.of(new class_5863(class_6044.field_30854, 0.6F, 5), 2),
            Pair.of(new class_102(30, 60), 1)
         )
      );
   }

   public static void method_44044(class_7263 var0) {
      class_1150 var3 = var0.method_26525();
      class_6275 var4 = var3.method_5126().orElse((class_6275)null);
      var3.method_5110(ImmutableList.of(class_6275.field_32070, class_6275.field_32075));
      class_6275 var5 = var3.method_5126().orElse((class_6275)null);
      if (var4 != var5) {
         method_44051(var0);
      }

      var0.method_26891(var3.method_5117(class_6044.field_30884));
   }

   private static boolean method_44046(class_6993 var0, LivingEntity var1) {
      return method_44045(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static Optional<? extends LivingEntity> method_44045(class_6993 var0) {
      Optional var3 = class_1225.method_5454(var0, class_6044.field_30866);
      if (var3.isPresent() && method_44054((LivingEntity)var3.get())) {
         return var3;
      } else {
         Optional var4 = method_44053(var0, class_6044.field_30912);
         return !var4.isPresent() ? var0.method_26525().method_5138(class_6044.field_30891) : var4;
      }
   }

   private static boolean method_44054(LivingEntity var0) {
      return class_3572.field_17480.test(var0);
   }

   private static Optional<? extends LivingEntity> method_44053(class_6993 var0, class_6044<? extends LivingEntity> var1) {
      return var0.method_26525().method_5138(var1).filter(var1x -> var1x.method_37124(var0, 12.0));
   }

   public static void method_44048(class_7263 var0, LivingEntity var1) {
      if (!(var1 instanceof class_6993)) {
         class_134.method_522(var0, var1);
      }
   }

   public static void method_44043(class_7263 var0) {
      if ((double)var0.world.field_33033.nextFloat() < 0.0125) {
         method_44051(var0);
      }
   }

   private static void method_44051(class_7263 var0) {
      var0.method_26525().method_5126().ifPresent(var1 -> {
         if (var1 == class_6275.field_32070) {
            var0.method_33189();
         }
      });
   }
}
