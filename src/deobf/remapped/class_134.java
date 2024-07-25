package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class class_134 {
   private static String[] field_394;
   public static final class_2451 field_388 = class_4897.field_25108;
   private static final class_4376 field_387 = class_5804.method_26295(30, 120);
   private static final class_4376 field_390 = class_5804.method_26295(10, 40);
   private static final class_4376 field_393 = class_5804.method_26295(10, 30);
   private static final class_4376 field_391 = class_5804.method_26295(5, 20);
   private static final class_4376 field_389 = class_5804.method_26295(5, 7);
   private static final class_4376 field_392 = class_5804.method_26295(5, 7);
   private static final Set<class_2451> field_395 = ImmutableSet.of(class_4897.field_25297, class_4897.field_24897);

   public static class_1150<?> method_488(class_2599 var0, class_1150<class_2599> var1) {
      method_506(var1);
      method_473(var1);
      method_478(var1);
      method_479(var0, var1);
      method_544(var1);
      method_516(var1);
      method_475(var1);
      var1.method_5114(ImmutableSet.of(class_6275.field_32072));
      var1.method_5130(class_6275.field_32075);
      var1.method_5103();
      return var1;
   }

   public static void method_537(class_2599 var0) {
      int var3 = field_387.method_20387(var0.world.field_33033);
      var0.method_26525().method_5107(class_6044.field_30864, true, (long)var3);
   }

   private static void method_506(class_1150<class_2599> var0) {
      var0.method_5124(
         class_6275.field_32072,
         0,
         ImmutableList.of(
            new class_4634(45, 90),
            new class_1657(),
            new class_3371(),
            method_545(),
            method_532(),
            new class_6040(),
            new class_601(120),
            new class_9273(300, class_134::method_477),
            new class_885()
         )
      );
   }

   private static void method_473(class_1150<class_2599> var0) {
      var0.method_5124(
         class_6275.field_32075,
         10,
         ImmutableList.of(
            new class_6109(class_134::method_512, 14.0F),
            new class_8962<class_2599>(class_6993::method_31995, class_134::method_519),
            new class_2214<class_2599>(class_2599::method_31988, new class_7087()),
            method_508(),
            method_535(),
            method_530(),
            method_525(),
            new class_6198(EntityType.field_34300, 4)
         )
      );
   }

   private static void method_479(class_2599 var0, class_1150<class_2599> var1) {
      var1.method_5116(
         class_6275.field_32070,
         10,
         ImmutableList.of(
            new class_5443(var1x -> !method_526(var0, var1x)),
            new class_2214<class_2599>(class_134::method_490, new class_8148(5, 0.75F)),
            new class_1005(1.0F),
            new class_5488(20),
            new class_3424(),
            new class_9296(),
            new class_345<class_2599>(class_134::method_542, class_6044.field_30884)
         ),
         class_6044.field_30884
      );
   }

   private static void method_544(class_1150<class_2599> var0) {
      var0.method_5116(
         class_6275.field_32063,
         10,
         ImmutableList.of(
            method_508(),
            new class_6109(class_134::method_512, 14.0F),
            new class_8962<class_2599>(class_6993::method_31995, class_134::method_519),
            new class_2214<class_2599>(var0x -> !var0x.method_11795(), new class_1149(2, 1.0F)),
            new class_2214<class_2599>(class_2599::method_11795, new class_1149(4, 0.6F)),
            new class_5197(
               ImmutableList.of(
                  Pair.of(new class_6109(EntityType.field_34240, 8.0F), 1), Pair.of(new class_1203(0.6F, 2, 1), 1), Pair.of(new class_102(10, 20), 1)
               )
            )
         ),
         class_6044.field_30895
      );
   }

   private static void method_478(class_1150<class_2599> var0) {
      var0.method_5116(
         class_6275.field_32078,
         10,
         ImmutableList.of(new class_5576<class_2599>(class_134::method_520, 1.0F, true, 9), new class_7113(9), new class_5237(200, 200)),
         class_6044.field_30897
      );
   }

   private static void method_516(class_1150<class_2599> var0) {
      var0.method_5116(
         class_6275.field_32068,
         10,
         ImmutableList.of(
            class_2300.method_10577(class_6044.field_30913, 1.0F, 12, true),
            method_530(),
            method_525(),
            new class_345<class_2599>(class_134::method_523, class_6044.field_30913)
         ),
         class_6044.field_30913
      );
   }

   private static void method_475(class_1150<class_2599> var0) {
      var0.method_5116(
         class_6275.field_32066,
         10,
         ImmutableList.of(
            new class_5007(0.8F),
            new class_6109(class_134::method_512, 8.0F),
            new class_2214<class_2599>(Entity::isPassenger, method_530()),
            new class_5674(8, class_134::method_503)
         ),
         class_6044.field_30903
      );
   }

   private static class_5197<class_2599> method_530() {
      return new class_5197<class_2599>(
         ImmutableList.of(
            Pair.of(new class_6109(EntityType.field_34300, 8.0F), 1),
            Pair.of(new class_6109(EntityType.field_34240, 8.0F), 1),
            Pair.of(new class_6109(8.0F), 1),
            Pair.of(new class_102(30, 60), 1)
         )
      );
   }

   private static class_5197<class_2599> method_525() {
      return new class_5197<class_2599>(
         ImmutableList.of(
            Pair.of(new class_1203(0.6F), 2),
            Pair.of(class_4741.<class_5834>method_21905(EntityType.field_34240, 8, class_6044.field_30861, 0.6F, 2), 2),
            Pair.of(new class_2214<class_5834>(class_134::method_502, new class_324(0.6F, 3)), 2),
            Pair.of(new class_102(30, 60), 1)
         )
      );
   }

   private static class_2300<BlockPos> method_508() {
      return class_2300.method_10574(class_6044.field_30905, 1.0F, 8, false);
   }

   private static class_6959<class_2599, class_5834> method_545() {
      return new class_6959<class_2599, class_5834>(class_2599::method_26449, class_6044.field_30891, class_6044.field_30913, field_392);
   }

   private static class_6959<class_2599, class_5834> method_532() {
      return new class_6959<class_2599, class_5834>(class_134::method_542, class_6044.field_30908, class_6044.field_30913, field_389);
   }

   public static void method_534(class_2599 var0) {
      class_1150 var3 = var0.method_26525();
      class_6275 var4 = var3.method_5126().orElse((class_6275)null);
      var3.method_5110(
         ImmutableList.of(
            class_6275.field_32078, class_6275.field_32070, class_6275.field_32068, class_6275.field_32063, class_6275.field_32066, class_6275.field_32075
         )
      );
      class_6275 var5 = var3.method_5126().orElse((class_6275)null);
      if (var4 != var5) {
         method_499(var0).ifPresent(var0::method_11796);
      }

      var0.method_26891(var3.method_5117(class_6044.field_30884));
      if (!var3.method_5117(class_6044.field_30903) && method_514(var0)) {
         var0.method_37390();
      }

      if (!var3.method_5117(class_6044.field_30895)) {
         var3.method_5127(class_6044.field_30862);
      }

      var0.method_11788(var3.method_5117(class_6044.field_30862));
   }

   private static boolean method_514(class_2599 var0) {
      if (!var0.method_26449()) {
         return false;
      } else {
         Entity var3 = var0.method_37243();
         return var3 instanceof class_2599 && ((class_2599)var3).method_26449() || var3 instanceof class_6704 && ((class_6704)var3).method_26449();
      }
   }

   public static void method_541(class_2599 var0, class_91 var1) {
      method_539(var0);
      ItemStack var4;
      if (var1.method_264().method_27960() != class_4897.field_24659) {
         var0.method_26467(var1, 1);
         var4 = method_481(var1);
      } else {
         var0.method_26467(var1, var1.method_264().method_27997());
         var4 = var1.method_264();
         var1.method_37204();
      }

      class_2451 var5 = var4.method_27960();
      if (!method_491(var5)) {
         if (method_472(var5) && !method_480(var0)) {
            method_524(var0);
         } else {
            boolean var6 = var0.method_26879(var4);
            if (!var6) {
               method_493(var0, var4);
            }
         }
      } else {
         var0.method_26525().method_5127(class_6044.field_30893);
         method_546(var0, var4);
         method_482(var0);
      }
   }

   private static void method_546(class_2599 var0, ItemStack var1) {
      if (method_528(var0)) {
         var0.method_37310(var0.method_26617(Hand.OFF_HAND));
      }

      var0.method_11794(var1);
   }

   private static ItemStack method_481(class_91 var0) {
      ItemStack var3 = var0.method_264();
      ItemStack var4 = var3.method_27953(1);
      if (!var3.method_28022()) {
         var0.method_248(var3);
      } else {
         var0.method_37204();
      }

      return var4;
   }

   public static void method_485(class_2599 var0, boolean var1) {
      ItemStack var4 = var0.method_26617(Hand.OFF_HAND);
      var0.method_26615(Hand.OFF_HAND, ItemStack.EMPTY);
      if (!var0.method_31995()) {
         boolean var5 = var0.method_26879(var4);
         if (!var5) {
            ItemStack var6 = var0.method_26446();
            if (!method_491(var6.method_27960())) {
               method_498(var0, Collections.<ItemStack>singletonList(var6));
            } else {
               method_493(var0, var6);
            }

            var0.method_11797(var4);
         }
      } else {
         boolean var7 = method_513(var4.method_27960());
         if (var1 && var7) {
            method_498(var0, method_527(var0));
         } else if (!var7) {
            boolean var8 = var0.method_26879(var4);
            if (!var8) {
               method_493(var0, var4);
            }
         }
      }
   }

   public static void method_496(class_2599 var0) {
      if (method_468(var0) && !var0.method_26568().method_28022()) {
         var0.method_37310(var0.method_26568());
         var0.method_26615(Hand.OFF_HAND, ItemStack.EMPTY);
      }
   }

   private static void method_493(class_2599 var0, ItemStack var1) {
      ItemStack var4 = var0.method_11793(var1);
      method_495(var0, Collections.<ItemStack>singletonList(var4));
   }

   private static void method_498(class_2599 var0, List<ItemStack> var1) {
      Optional var4 = var0.method_26525().<class_704>method_5138(class_6044.field_30870);
      if (!var4.isPresent()) {
         method_495(var0, var1);
      } else {
         method_486(var0, (class_704)var4.get(), var1);
      }
   }

   private static void method_495(class_2599 var0, List<ItemStack> var1) {
      method_497(var0, var1, method_464(var0));
   }

   private static void method_486(class_2599 var0, class_704 var1, List<ItemStack> var2) {
      method_497(var0, var2, var1.method_37245());
   }

   private static void method_497(class_2599 var0, List<ItemStack> var1, class_1343 var2) {
      if (!var1.isEmpty()) {
         var0.method_26597(Hand.OFF_HAND);

         for (ItemStack var6 : var1) {
            class_1225.method_5439(var0, var6, var2.method_6214(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<ItemStack> method_527(class_2599 var0) {
      class_1758 var3 = var0.world.method_29522().method_1722().method_4604(class_5931.field_30100);
      return var3.method_7862(
         new class_8480((class_6331)var0.world)
            .method_39065(class_8712.field_44676, var0)
            .method_39068(var0.world.field_33033)
            .method_39064(class_4933.field_25567)
      );
   }

   private static boolean method_477(class_5834 var0, class_5834 var1) {
      return var1.method_37387() == EntityType.field_34306 ? new Random(var0.world.method_29546()).nextFloat() < 0.1F : false;
   }

   public static boolean method_511(class_2599 var0, ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      if (!var4.method_11250(class_391.field_1598)) {
         if (method_484(var0) && var0.method_26525().method_5117(class_6044.field_30884)) {
            return false;
         } else if (!method_513(var4)) {
            boolean var5 = var0.method_11800(var1);
            if (var4 == class_4897.field_24659) {
               return var5;
            } else if (!method_472(var4)) {
               return !method_491(var4) ? var0.method_11787(var1) : method_520(var0) && var5;
            } else {
               return !method_480(var0) && var5;
            }
         } else {
            return method_520(var0);
         }
      } else {
         return false;
      }
   }

   public static boolean method_491(class_2451 var0) {
      return var0.method_11250(class_391.field_1643);
   }

   private static boolean method_503(class_2599 var0, Entity var1) {
      if (!(var1 instanceof class_5886)) {
         return false;
      } else {
         class_5886 var4 = (class_5886)var1;
         return !var4.method_26449()
            || !var4.method_37330()
            || method_543(var0)
            || method_543(var4)
            || var4 instanceof class_2599 && var4.method_37243() == null;
      }
   }

   private static boolean method_526(class_2599 var0, class_5834 var1) {
      return method_519(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static boolean method_542(class_2599 var0) {
      class_1150 var3 = var0.method_26525();
      if (!var3.method_5117(class_6044.field_30908)) {
         return false;
      } else {
         class_5834 var4 = var3.<class_5834>method_5138(class_6044.field_30908).get();
         return var0.method_37124(var4, 6.0);
      }
   }

   private static Optional<? extends class_5834> method_519(class_2599 var0) {
      class_1150 var3 = var0.method_26525();
      if (!method_542(var0)) {
         Optional var4 = class_1225.method_5454(var0, class_6044.field_30866);
         if (var4.isPresent() && method_504((class_5834)var4.get())) {
            return var4;
         } else {
            if (var3.method_5117(class_6044.field_30880)) {
               Optional var5 = var3.<class_704>method_5138(class_6044.field_30912);
               if (var5.isPresent()) {
                  return var5;
               }
            }

            Optional var7 = var3.<class_5886>method_5138(class_6044.field_30891);
            if (var7.isPresent()) {
               return var7;
            } else {
               Optional var6 = var3.<class_704>method_5138(class_6044.field_30904);
               return var6.isPresent() && method_504((class_5834)var6.get()) ? var6 : Optional.empty();
            }
         }
      } else {
         return Optional.empty();
      }
   }

   public static void method_474(class_704 var0, boolean var1) {
      List var4 = var0.world.<class_2599>method_25868(class_2599.class, var0.method_37241().method_18898(16.0));
      var4.stream().filter(class_134::method_531).filter(var2 -> !var1 || class_1225.method_5449(var2, var0)).forEach(var1x -> {
         if (!var1x.field_41768.method_29537().method_1285(class_291.field_1039)) {
            method_533(var1x, var0);
         } else {
            method_521(var1x, var0);
         }
      });
   }

   public static class_6910 method_518(class_2599 var0, class_704 var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (!method_515(var0, var5)) {
         return class_6910.field_35521;
      } else {
         ItemStack var6 = var5.method_27953(1);
         method_546(var0, var6);
         method_482(var0);
         method_539(var0);
         return class_6910.field_35518;
      }
   }

   public static boolean method_515(class_2599 var0, ItemStack var1) {
      return !method_484(var0) && !method_468(var0) && var0.method_31995() && method_513(var1.method_27960());
   }

   public static void method_483(class_2599 var0, class_5834 var1) {
      if (!(var1 instanceof class_2599)) {
         if (method_528(var0)) {
            method_485(var0, false);
         }

         class_1150 var4 = var0.method_26525();
         var4.method_5127(class_6044.field_30895);
         var4.method_5127(class_6044.field_30862);
         var4.method_5127(class_6044.field_30897);
         if (var1 instanceof class_704) {
            var4.method_5107(class_6044.field_30879, true, 400L);
         }

         method_469(var0).ifPresent(var2 -> {
            if (var2.method_37387() != var1.method_37387()) {
               var4.method_5127(class_6044.field_30913);
            }
         });
         if (!var0.method_26449()) {
            if (var1.method_37387() == EntityType.field_34306 && method_510(var0)) {
               method_492(var0, var1);
               method_487(var0, var1);
            } else {
               method_522(var0, var1);
            }
         } else {
            var4.method_5107(class_6044.field_30913, var1, 100L);
            if (method_504(var1)) {
               method_540(var0, var1);
            }
         }
      }
   }

   public static void method_522(class_6993 var0, class_5834 var1) {
      if (!var0.method_26525().method_5134(class_6275.field_32068) && method_504(var1) && !class_1225.method_5452(var0, var1, 4.0)) {
         if (var1.method_37387() == EntityType.field_34300 && var0.world.method_29537().method_1285(class_291.field_1039)) {
            method_521(var0, var1);
            method_517(var0);
         } else {
            method_533(var0, var1);
            method_540(var0, var1);
         }
      }
   }

   public static Optional<class_8461> method_499(class_2599 var0) {
      return var0.method_26525().method_5126().<class_8461>map(var1 -> method_463(var0, var1));
   }

   private static class_8461 method_463(class_2599 var0, class_6275 var1) {
      if (var1 != class_6275.field_32070) {
         if (!var0.method_31990()) {
            if (var1 == class_6275.field_32068 && method_529(var0)) {
               return class_463.field_2337;
            } else if (var1 != class_6275.field_32078) {
               if (var1 != class_6275.field_32063) {
                  if (!method_507(var0)) {
                     return !method_489(var0) ? class_463.field_2573 : class_463.field_2337;
                  } else {
                     return class_463.field_2222;
                  }
               } else {
                  return class_463.field_2144;
               }
            } else {
               return class_463.field_2580;
            }
         } else {
            return class_463.field_2337;
         }
      } else {
         return class_463.field_2856;
      }
   }

   private static boolean method_529(class_2599 var0) {
      class_1150 var3 = var0.method_26525();
      return var3.method_5117(class_6044.field_30913) ? var3.<class_5834>method_5138(class_6044.field_30913).get().method_37124(var0, 12.0) : false;
   }

   public static boolean method_465(class_2599 var0) {
      return var0.method_26525().method_5117(class_6044.field_30864)
         || method_494(var0).stream().anyMatch(var0x -> var0x.method_26525().method_5117(class_6044.field_30864));
   }

   private static List<class_6993> method_494(class_2599 var0) {
      return var0.method_26525().<List<class_6993>>method_5138(class_6044.field_30902).orElse(ImmutableList.of());
   }

   private static List<class_6993> method_471(class_6993 var0) {
      return var0.method_26525().<List<class_6993>>method_5138(class_6044.field_30876).orElse(ImmutableList.of());
   }

   public static boolean method_500(class_5834 var0) {
      for (ItemStack var4 : var0.method_37262()) {
         class_2451 var5 = var4.method_27960();
         if (var5 instanceof class_8228 && ((class_8228)var5).method_37667() == class_5667.field_28729) {
            return true;
         }
      }

      return false;
   }

   private static void method_539(class_2599 var0) {
      var0.method_26525().method_5127(class_6044.field_30889);
      var0.method_26927().method_5620();
   }

   private static class_5499<class_2599> method_535() {
      return new class_5499<class_2599>(new class_6959(class_2599::method_26449, class_6044.field_30914, class_6044.field_30903, field_393), field_390);
   }

   public static void method_540(class_6993 var0, class_5834 var1) {
      method_471(var0).forEach(var1x -> {
         if (var1.method_37387() != EntityType.field_34306 || var1x.method_31988() && ((class_6704)var1).method_30707()) {
            method_536(var1x, var1);
         }
      });
   }

   public static void method_517(class_6993 var0) {
      method_471(var0).forEach(var0x -> method_476(var0x).ifPresent(var1 -> method_533(var0x, var1)));
   }

   public static void method_509(class_2599 var0) {
      method_494(var0).forEach(class_134::method_470);
   }

   public static void method_533(class_6993 var0, class_5834 var1) {
      if (method_504(var1)) {
         var0.method_26525().method_5127(class_6044.field_30909);
         var0.method_26525().method_5107(class_6044.field_30866, var1.method_37328(), 600L);
         if (var1.method_37387() == EntityType.field_34306 && var0.method_31988()) {
            method_470(var0);
         }

         if (var1.method_37387() == EntityType.field_34300 && var0.world.method_29537().method_1285(class_291.field_1039)) {
            var0.method_26525().method_5107(class_6044.field_30880, true, 600L);
         }
      }
   }

   private static void method_521(class_6993 var0, class_5834 var1) {
      Optional var4 = method_476(var0);
      if (!var4.isPresent()) {
         method_533(var0, var1);
      } else {
         method_533(var0, (class_5834)var4.get());
      }
   }

   private static void method_536(class_6993 var0, class_5834 var1) {
      Optional var4 = method_538(var0);
      class_5834 var5 = class_1225.method_5440(var0, var4, var1);
      if (!var4.isPresent() || var4.get() != var5) {
         method_533(var0, var5);
      }
   }

   private static Optional<class_5834> method_538(class_6993 var0) {
      return class_1225.method_5454(var0, class_6044.field_30866);
   }

   public static Optional<class_5834> method_469(class_2599 var0) {
      return !var0.method_26525().method_5117(class_6044.field_30913)
         ? Optional.<class_5834>empty()
         : var0.method_26525().<class_5834>method_5138(class_6044.field_30913);
   }

   public static Optional<class_704> method_476(class_6993 var0) {
      return !var0.method_26525().method_5117(class_6044.field_30912)
         ? Optional.<class_704>empty()
         : var0.method_26525().<class_704>method_5138(class_6044.field_30912);
   }

   private static void method_487(class_2599 var0, class_5834 var1) {
      method_494(var0).stream().filter(var0x -> var0x instanceof class_2599).forEach(var1x -> method_501((class_2599)var1x, var1));
   }

   private static void method_501(class_2599 var0, class_5834 var1) {
      class_1150 var4 = var0.method_26525();
      class_5834 var5 = class_1225.method_5440(var0, var4.<class_5834>method_5138(class_6044.field_30913), var1);
      var5 = class_1225.method_5440(var0, var4.<class_5834>method_5138(class_6044.field_30884), var5);
      method_492(var0, var5);
   }

   private static boolean method_523(class_2599 var0) {
      class_1150 var3 = var0.method_26525();
      if (var3.method_5117(class_6044.field_30913)) {
         class_5834 var4 = var3.<class_5834>method_5138(class_6044.field_30913).get();
         EntityType var5 = var4.method_37387();
         if (var5 != EntityType.field_34306) {
            return !method_466(var5) ? false : !var3.method_5140(class_6044.field_30908, var4);
         } else {
            return method_505(var0);
         }
      } else {
         return true;
      }
   }

   private static boolean method_505(class_2599 var0) {
      return !method_510(var0);
   }

   private static boolean method_510(class_2599 var0) {
      int var3 = var0.method_26525().<Integer>method_5138(class_6044.field_30878).orElse(0) + 1;
      int var4 = var0.method_26525().<Integer>method_5138(class_6044.field_30906).orElse(0);
      return var4 > var3;
   }

   private static void method_492(class_2599 var0, class_5834 var1) {
      var0.method_26525().method_5127(class_6044.field_30866);
      var0.method_26525().method_5127(class_6044.field_30884);
      var0.method_26525().method_5127(class_6044.field_30889);
      var0.method_26525().method_5107(class_6044.field_30913, var1, (long)field_391.method_20387(var0.world.field_33033));
      method_470(var0);
   }

   public static void method_470(class_6993 var0) {
      var0.method_26525().method_5107(class_6044.field_30864, true, (long)field_387.method_20387(var0.world.field_33033));
   }

   private static void method_524(class_2599 var0) {
      var0.method_26525().method_5107(class_6044.field_30857, true, 200L);
   }

   private static class_1343 method_464(class_2599 var0) {
      class_1343 var3 = class_3425.method_15834(var0, 4, 2);
      return var3 != null ? var3 : var0.method_37245();
   }

   private static boolean method_480(class_2599 var0) {
      return var0.method_26525().method_5117(class_6044.field_30857);
   }

   public static boolean method_531(class_6993 var0) {
      return var0.method_26525().method_5134(class_6275.field_32075);
   }

   private static boolean method_490(class_5834 var0) {
      return var0.method_26443(class_4897.field_25030);
   }

   private static void method_482(class_5834 var0) {
      var0.method_26525().method_5107(class_6044.field_30897, true, 120L);
   }

   private static boolean method_468(class_2599 var0) {
      return var0.method_26525().method_5117(class_6044.field_30897);
   }

   private static boolean method_513(class_2451 var0) {
      return var0 == field_388;
   }

   private static boolean method_472(class_2451 var0) {
      return field_395.contains(var0);
   }

   private static boolean method_504(class_5834 var0) {
      return class_3572.field_17480.test(var0);
   }

   private static boolean method_489(class_2599 var0) {
      return var0.method_26525().method_5117(class_6044.field_30905);
   }

   private static boolean method_507(class_5834 var0) {
      return var0.method_26525().method_5117(class_6044.field_30911);
   }

   private static boolean method_502(class_5834 var0) {
      return !method_507(var0);
   }

   public static boolean method_512(class_5834 var0) {
      return var0.method_37387() == EntityType.field_34300 && var0.method_26564(class_134::method_491);
   }

   private static boolean method_484(class_2599 var0) {
      return var0.method_26525().method_5117(class_6044.field_30879);
   }

   private static boolean method_543(class_5834 var0) {
      return var0.method_26525().method_5117(class_6044.field_30867);
   }

   private static boolean method_528(class_2599 var0) {
      return !var0.method_26568().method_28022();
   }

   private static boolean method_520(class_2599 var0) {
      return var0.method_26568().method_28022() || !method_491(var0.method_26568().method_27960());
   }

   public static boolean method_466(EntityType var0) {
      return var0 == EntityType.field_34234 || var0 == EntityType.field_34244;
   }
}
