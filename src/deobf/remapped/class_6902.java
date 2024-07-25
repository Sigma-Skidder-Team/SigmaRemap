package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class class_6902 {
   private static String[] field_35483;
   private static final class_4376 field_35485 = class_5804.method_26295(5, 20);
   private static final class_4376 field_35484 = class_4376.method_20391(5, 16);

   public static class_1150<?> method_31630(class_1150<class_6704> var0) {
      method_31609(var0);
      method_31627(var0);
      method_31624(var0);
      method_31626(var0);
      var0.method_5114(ImmutableSet.of(class_6275.field_32072));
      var0.method_5130(class_6275.field_32075);
      var0.method_5103();
      return var0;
   }

   private static void method_31609(class_1150<class_6704> var0) {
      var0.method_5124(class_6275.field_32072, 0, ImmutableList.of(new class_4634(45, 90), new class_1657()));
   }

   private static void method_31627(class_1150<class_6704> var0) {
      var0.method_5124(
         class_6275.field_32075,
         10,
         ImmutableList.of(
            new class_3631(class_6044.field_30905, 200),
            new class_3669(class_6629.field_34306, 0.6F),
            class_2300.method_10574(class_6044.field_30905, 1.0F, 8, true),
            new class_8962<class_6704>(class_6902::method_31610),
            new class_2214<class_4612>(
               class_6704::method_30714, (class_5920<? super class_4612>)class_2300.method_10577(class_6044.field_30863, 0.4F, 8, false)
            ),
            new class_5499<class_5834>(new class_6109(8.0F), class_4376.method_20391(30, 60)),
            new class_409(field_35484, 0.6F),
            method_31611()
         )
      );
   }

   private static void method_31624(class_1150<class_6704> var0) {
      var0.method_5116(
         class_6275.field_32070,
         10,
         ImmutableList.of(
            new class_3631(class_6044.field_30905, 200),
            new class_3669(class_6629.field_34306, 0.6F),
            new class_1005(1.0F),
            new class_2214<class_5886>(class_6704::method_30714, new class_5488(40)),
            new class_2214<class_5886>(class_1899::method_26449, new class_5488(15)),
            new class_5443(),
            new class_345<class_6704>(class_6902::method_31605, class_6044.field_30884)
         ),
         class_6044.field_30884
      );
   }

   private static void method_31626(class_1150<class_6704> var0) {
      var0.method_5116(
         class_6275.field_32068,
         10,
         ImmutableList.of(
            class_2300.method_10577(class_6044.field_30913, 1.3F, 15, false),
            method_31611(),
            new class_5499<class_5834>(new class_6109(8.0F), class_4376.method_20391(30, 60)),
            new class_345<class_6704>(class_6902::method_31631, class_6044.field_30913)
         ),
         class_6044.field_30913
      );
   }

   private static class_5197<class_6704> method_31611() {
      return new class_5197<class_6704>(
         ImmutableList.of(Pair.of(new class_1203(0.4F), 2), Pair.of(new class_324(0.4F, 3), 2), Pair.of(new class_102(30, 60), 1))
      );
   }

   public static void method_31614(class_6704 var0) {
      class_1150 var3 = var0.method_26525();
      class_6275 var4 = var3.method_5126().orElse((class_6275)null);
      var3.method_5110(ImmutableList.of(class_6275.field_32070, class_6275.field_32068, class_6275.field_32075));
      class_6275 var5 = var3.method_5126().orElse((class_6275)null);
      if (var4 != var5) {
         method_31618(var0).ifPresent(var0::method_30706);
      }

      var0.method_26891(var3.method_5117(class_6044.field_30884));
   }

   public static void method_31606(class_6704 var0, class_5834 var1) {
      if (!var0.method_26449()) {
         if (var1.method_37387() == class_6629.field_34240 && method_31620(var0)) {
            method_31629(var0, var1);
            method_31613(var0, var1);
         } else {
            method_31608(var0, var1);
         }
      }
   }

   private static void method_31613(class_6704 var0, class_5834 var1) {
      method_31616(var0).forEach(var1x -> method_31619(var1x, var1));
   }

   private static void method_31619(class_6704 var0, class_5834 var1) {
      class_1150 var4 = var0.method_26525();
      class_5834 var5 = class_1225.method_5440(var0, var4.<class_5834>method_5138(class_6044.field_30913), var1);
      var5 = class_1225.method_5440(var0, var4.<class_5834>method_5138(class_6044.field_30884), var5);
      method_31629(var0, var5);
   }

   private static void method_31629(class_6704 var0, class_5834 var1) {
      var0.method_26525().method_5127(class_6044.field_30884);
      var0.method_26525().method_5127(class_6044.field_30889);
      var0.method_26525().method_5107(class_6044.field_30913, var1, (long)field_35485.method_20387(var0.world.field_33033));
   }

   private static Optional<? extends class_5834> method_31610(class_6704 var0) {
      return !method_31623(var0) && !method_31605(var0) ? var0.method_26525().method_5138(class_6044.field_30912) : Optional.empty();
   }

   public static boolean method_31615(class_6704 var0, BlockPos var1) {
      Optional var4 = var0.method_26525().<BlockPos>method_5138(class_6044.field_30905);
      return var4.isPresent() && ((BlockPos)var4.get()).method_12171(var1, 8.0);
   }

   private static boolean method_31631(class_6704 var0) {
      return var0.method_30714() && !method_31620(var0);
   }

   private static boolean method_31620(class_6704 var0) {
      if (!var0.method_26449()) {
         int var3 = var0.method_26525().<Integer>method_5138(class_6044.field_30878).orElse(0);
         int var4 = var0.method_26525().<Integer>method_5138(class_6044.field_30906).orElse(0) + 1;
         return var3 > var4;
      } else {
         return false;
      }
   }

   public static void method_31607(class_6704 var0, class_5834 var1) {
      class_1150 var4 = var0.method_26525();
      var4.method_5127(class_6044.field_30860);
      var4.method_5127(class_6044.field_30892);
      if (!var0.method_26449()) {
         method_31612(var0, var1);
      } else {
         method_31619(var0, var1);
      }
   }

   private static void method_31612(class_6704 var0, class_5834 var1) {
      if ((!var0.method_26525().method_5134(class_6275.field_32068) || var1.method_37387() != class_6629.field_34240)
         && class_3572.field_17480.test(var1)
         && var1.method_37387() != class_6629.field_34306
         && !class_1225.method_5452(var0, var1, 4.0)) {
         method_31617(var0, var1);
         method_31608(var0, var1);
      }
   }

   private static void method_31617(class_6704 var0, class_5834 var1) {
      class_1150 var4 = var0.method_26525();
      var4.method_5127(class_6044.field_30909);
      var4.method_5127(class_6044.field_30892);
      var4.method_5107(class_6044.field_30884, var1, 200L);
   }

   private static void method_31608(class_6704 var0, class_5834 var1) {
      method_31616(var0).forEach(var1x -> method_31625(var1x, var1));
   }

   private static void method_31625(class_6704 var0, class_5834 var1) {
      if (!method_31623(var0)) {
         Optional var4 = var0.method_26525().<class_5834>method_5138(class_6044.field_30884);
         class_5834 var5 = class_1225.method_5440(var0, var4, var1);
         method_31617(var0, var5);
      }
   }

   public static Optional<class_8461> method_31618(class_6704 var0) {
      return var0.method_26525().method_5126().<class_8461>map(var1 -> method_31622(var0, var1));
   }

   private static class_8461 method_31622(class_6704 var0, class_6275 var1) {
      if (var1 == class_6275.field_32068 || var0.method_30710()) {
         return class_463.field_2205;
      } else if (var1 != class_6275.field_32070) {
         return !method_31621(var0) ? class_463.field_2815 : class_463.field_2205;
      } else {
         return class_463.field_2769;
      }
   }

   private static List<class_6704> method_31616(class_6704 var0) {
      return var0.method_26525().<List<class_6704>>method_5138(class_6044.field_30915).orElse(ImmutableList.of());
   }

   private static boolean method_31621(class_6704 var0) {
      return var0.method_26525().method_5117(class_6044.field_30905);
   }

   private static boolean method_31605(class_6704 var0) {
      return var0.method_26525().method_5117(class_6044.field_30892);
   }

   public static boolean method_31623(class_6704 var0) {
      return var0.method_26525().method_5117(class_6044.field_30860);
   }
}
