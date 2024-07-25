package remapped;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class_1225 {
   private static String[] field_6786;

   public static void method_5443(class_5834 var0, class_5834 var1, float var2) {
      method_5448(var0, var1);
      method_5438(var0, var1, var2);
   }

   public static boolean method_5453(class_1150<?> var0, class_5834 var1) {
      return var0.<List<class_5834>>method_5138(class_6044.field_30901).filter(var1x -> var1x.contains(var1)).isPresent();
   }

   public static boolean method_5450(class_1150<?> var0, class_6044<? extends class_5834> var1, EntityType<?> var2) {
      return method_5441(var0, var1, var1x -> var1x.method_37387() == var2);
   }

   private static boolean method_5441(class_1150<?> var0, class_6044<? extends class_5834> var1, Predicate<class_5834> var2) {
      return var0.<class_5834>method_5138(var1).filter(var2).filter(class_5834::method_37330).filter(var1x -> method_5453(var0, var1x)).isPresent();
   }

   private static void method_5448(class_5834 var0, class_5834 var1) {
      method_5444(var0, var1);
      method_5444(var1, var0);
   }

   public static void method_5444(class_5834 var0, class_5834 var1) {
      var0.method_26525().method_5105(class_6044.field_30874, new class_4843(var1, true));
   }

   private static void method_5438(class_5834 var0, class_5834 var1, float var2) {
      byte var5 = 2;
      method_5445(var0, var1, var2, 2);
      method_5445(var1, var0, var2, 2);
   }

   public static void method_5445(class_5834 var0, Entity var1, float var2, int var3) {
      class_6651 var6 = new class_6651(new class_4843(var1, false), var2, var3);
      var0.method_26525().method_5105(class_6044.field_30874, new class_4843(var1, true));
      var0.method_26525().method_5105(class_6044.field_30889, var6);
   }

   public static void method_5446(class_5834 var0, BlockPos var1, float var2, int var3) {
      class_6651 var6 = new class_6651(new class_2933(var1), var2, var3);
      var0.method_26525().method_5105(class_6044.field_30874, new class_2933(var1));
      var0.method_26525().method_5105(class_6044.field_30889, var6);
   }

   public static void method_5439(class_5834 var0, ItemStack var1, class_1343 var2) {
      double var5 = var0.method_37388() - 0.3F;
      class_91 var7 = new class_91(var0.world, var0.getPosX(), var5, var0.getPosZ(), var1);
      float var8 = 0.3F;
      class_1343 var9 = var2.method_6194(var0.method_37245());
      var9 = var9.method_6213().method_6209(0.3F);
      var7.method_37215(var9);
      var7.method_257();
      var0.world.method_7509(var7);
   }

   public static class_6979 method_5456(class_6331 var0, class_6979 var1, int var2) {
      int var5 = var0.method_28956(var1);
      return class_6979.method_31906(var1, var2).filter(var2x -> var0.method_28956(var2x) < var5).min(Comparator.comparingInt(var0::method_28956)).orElse(var1);
   }

   public static boolean method_5451(class_5886 var0, class_5834 var1, int var2) {
      class_2451 var5 = var0.method_26446().method_27960();
      if (var5 instanceof class_551 && var0.method_26878((class_551)var5)) {
         int var6 = ((class_551)var5).method_2654() - var2;
         return var0.method_37124(var1, (double)var6);
      } else {
         return method_5457(var0, var1);
      }
   }

   public static boolean method_5457(class_5834 var0, class_5834 var1) {
      double var4 = var0.method_37273(var1.getPosX(), var1.method_37309(), var1.getPosZ());
      double var6 = (double)(var0.method_37086() * 2.0F * var0.method_37086() * 2.0F + var1.method_37086());
      return var4 <= var6;
   }

   public static boolean method_5452(class_5834 var0, class_5834 var1, double var2) {
      Optional var6 = var0.method_26525().<class_5834>method_5138(class_6044.field_30884);
      if (var6.isPresent()) {
         double var7 = var0.method_37274(((class_5834)var6.get()).method_37245());
         double var9 = var0.method_37274(var1.method_37245());
         return var9 > var7 + var2 * var2;
      } else {
         return false;
      }
   }

   public static boolean method_5449(class_5834 var0, class_5834 var1) {
      class_1150 var4 = var0.method_26525();
      return var4.method_5117(class_6044.field_30901) ? var4.<List<class_5834>>method_5138(class_6044.field_30901).get().contains(var1) : false;
   }

   public static class_5834 method_5440(class_5834 var0, Optional<class_5834> var1, class_5834 var2) {
      return var1.isPresent() ? method_5442(var0, (class_5834)var1.get(), var2) : var2;
   }

   public static class_5834 method_5442(class_5834 var0, class_5834 var1, class_5834 var2) {
      class_1343 var5 = var1.method_37245();
      class_1343 var6 = var2.method_37245();
      return !(var0.method_37274(var5) < var0.method_37274(var6)) ? var2 : var1;
   }

   public static Optional<class_5834> method_5454(class_5834 var0, class_6044<UUID> var1) {
      Optional var4 = var0.method_26525().method_5138(var1);
      return var4.<class_5834>map(var1x -> (class_5834)((class_6331)var0.world).method_28925(var1x));
   }

   public static Stream<class_7666> method_5455(class_7666 var0, Predicate<class_7666> var1) {
      return var0.method_26525()
         .<List<class_5834>>method_5138(class_6044.field_30907)
         .<Stream<class_7666>>map(
            var2 -> var2.stream()
                  .filter(var1xx -> var1xx instanceof class_7666 && var1xx != var0)
                  .<class_7666>map(var0xx -> (class_7666)var0xx)
                  .filter(class_5834::method_37330)
                  .filter(var1)
         )
         .orElseGet(Stream::empty);
   }
}
