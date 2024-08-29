package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

import java.util.*;

public class Class4388 {
   private static String[] field21457;
   public static final Item field21458 = Items.field37802;
   private static final Class8369 field21459 = Class8763.method31620(30, 120);
   private static final Class8369 field21460 = Class8763.method31620(10, 40);
   private static final Class8369 field21461 = Class8763.method31620(10, 30);
   private static final Class8369 field21462 = Class8763.method31620(5, 20);
   private static final Class8369 field21463 = Class8763.method31620(5, 7);
   private static final Class8369 field21464 = Class8763.method31620(5, 7);
   private static final Set<Item> field21465 = ImmutableSet.of(Items.field37869, Items.field37870);

   public static Class6947<?> method13798(Class1034 var0, Class6947<Class1034> var1) {
      method13800(var1);
      method13801(var1);
      method13804(var1);
      method13802(var0, var1);
      method13803(var1);
      method13805(var1);
      method13806(var1);
      var1.method21415(ImmutableSet.of(Class8890.field40219));
      var1.method21424(Class8890.field40220);
      var1.method21417();
      return var1;
   }

   public static void method13799(Class1034 var0) {
      int var3 = field21459.method29319(var0.world.field9016);
      var0.method2992().method21407(Class8830.field39855, true, (long)var3);
   }

   private static void method13800(Class6947<Class1034> var0) {
      var0.method21425(
         Class8890.field40219,
         0,
         ImmutableList.<Class3676<? super Class1034>>of(
            new Class3681(45, 90),
            new Class3735(),
            new Class3697(),
            method13810(),
            method13811(),
            new Class3722<>(),
            new Class3747<>(120),
            new Class3705(300, Class4388::method13825),
            new Class3701<>()
         )
      );
   }

   private static void method13801(Class6947<Class1034> var0) {
      var0.method21425(
         Class8890.field40220,
         10,
         ImmutableList.of(
            new Class3738(Class4388::method13875, 14.0F),
            new Class3733<Class1034>(Class1035::method4635, Class4388::method13831),
            new Class3740<Class1034>(Class1034::method4618, new Class3721()),
            method13809(),
            method13845(),
            method13807(),
            method13808(),
            new Class3715(EntityType.PLAYER, 4)
         )
      );
   }

   private static void method13802(Class1034 var0, Class6947<Class1034> var1) {
      var1.method21426(
         Class8890.field40229,
         10,
         ImmutableList.<Class3676<? super Class1034>>of(
            new Class3685<>(var1x -> !method13829(var0, var1x)),
            new Class3740<Class1034>(Class4388::method13866, new Class3704(5, 0.75F)),
            new Class3720(1.0F),
            new Class3684(20),
            new Class3731<>(),
            new Class3680<>(),
            new Class3714<Class1034>(Class4388::method13830, Class8830.field39826)
         ),
         Class8830.field39826
      );
   }

   private static void method13803(Class6947<Class1034> var0) {
      var0.method21426(
         Class8890.field40230,
         10,
         ImmutableList.<Class3676<? super Class1034>>of(
            method13809(),
                 new Class3738(Class4388::method13875, 14.0F),
                 new Class3733<>(Class1035::method4635, Class4388::method13831),
                 new Class3740<>(var0x -> !var0x.method4623(), new Class3748<>(2, 1.0F)),
                 new Class3740<>(Class1034::method4623, new Class3748<>(4, 0.6F)),
                 new Class3693<>(
               ImmutableList.of(Pair.of(new Class3738(EntityType.field41065, 8.0F), 1), Pair.of(new Class3718(0.6F, 2, 1), 1), Pair.of(new Class3675(10, 20), 1))
            )
         ),
         Class8830.field39856
      );
   }

   private static void method13804(Class6947<Class1034> var0) {
      var0.method21426(
         Class8890.field40231,
         10,
         ImmutableList.<Class3676<? super Class1034>>of(new Class3724<>(Class4388::method13879, 1.0F, true, 9), new Class3743<>(9), new Class3732(200, 200)),
         Class8830.field39851
      );
   }

   private static void method13805(Class6947<Class1034> var0) {
      var0.method21426(
         Class8890.field40232,
         10,
         ImmutableList.of(
            Class3690.method12539(Class8830.field39837, 1.0F, 12, true),
            method13807(),
            method13808(),
            new Class3714<Class1034>(Class4388::method13857, Class8830.field39837)
         ),
         Class8830.field39837
      );
   }

   private static void method13806(Class6947<Class1034> var0) {
      var0.method21426(
         Class8890.field40233,
         10,
         ImmutableList.<Class3676<? super Class1034>>of(
            new Class3741<>(0.8F),
            new Class3738(Class4388::method13875, 8.0F),
            new Class3740<>(Entity::isPassenger, method13807()),
            new Class3755<>(8, Class4388::method13828)
         ),
         Class8830.field39830
      );
   }

   private static Class3693<Class1034> method13807() {
      return new Class3693<Class1034>(
         ImmutableList.of(
            Pair.of(new Class3738(EntityType.PLAYER, 8.0F), 1),
            Pair.of(new Class3738(EntityType.field41065, 8.0F), 1),
            Pair.of(new Class3738(8.0F), 1),
            Pair.of(new Class3675(30, 60), 1)
         )
      );
   }

   private static Class3693<Class1034> method13808() {
      return new Class3693<Class1034>(
         ImmutableList.of(
            Pair.of(new Class3718(0.6F), 2),
            Pair.of(Class3696.<Class880>method12551(EntityType.field41065, 8, Class8830.field39828, 0.6F, 2), 2),
            Pair.of(new Class3740<Class880>(Class4388::method13874, new Class3694(0.6F, 3)), 2),
            Pair.of(new Class3675(30, 60), 1)
         )
      );
   }

   private static Class3690<BlockPos> method13809() {
      return Class3690.method12538(Class8830.field39870, 1.0F, 8, false);
   }

   private static Class3744<Class1034, Class880> method13810() {
      return new Class3744<Class1034, Class880>(Class1034::method3005, Class8830.field39848, Class8830.field39837, field21464);
   }

   private static Class3744<Class1034, Class880> method13811() {
      return new Class3744<Class1034, Class880>(Class4388::method13830, Class8830.field39865, Class8830.field39837, field21463);
   }

   public static void method13812(Class1034 var0) {
      Class6947<Class1034> var3 = var0.method2992();
      Class8890 var4 = var3.method21418().orElse(null);
      var3.method21423(
         ImmutableList.of(Class8890.field40231, Class8890.field40229, Class8890.field40232, Class8890.field40230, Class8890.field40233, Class8890.field40220)
      );
      Class8890 var5 = var3.method21418().orElse(null);
      if (var4 != var5) {
         method13837(var0).ifPresent(var0::method4629);
      }

      var0.method4304(var3.method21404(Class8830.field39826));
      if (!var3.method21404(Class8830.field39830) && method13813(var0)) {
         var0.stopRiding();
      }

      if (!var3.method21404(Class8830.field39856)) {
         var3.method21405(Class8830.field39857);
      }

      var0.method4624(var3.method21404(Class8830.field39857));
   }

   private static boolean method13813(Class1034 var0) {
      if (!var0.method3005()) {
         return false;
      } else {
         Entity var3 = var0.getRidingEntity();
         return var3 instanceof Class1034 && ((Class1034)var3).method3005() || var3 instanceof Class1091 && ((Class1091)var3).method3005();
      }
   }

   public static void method13814(Class1034 var0, ItemEntity var1) {
      method13844(var0);
      ItemStack var4;
      if (var1.method4124().getItem() != Items.field37969) {
         var0.method2751(var1, 1);
         var4 = method13816(var1);
      } else {
         var0.method2751(var1, var1.method4124().getCount());
         var4 = var1.method4124();
         var1.method2904();
      }

      Item var5 = var4.getItem();
      if (!method13827(var5)) {
         if (method13870(var5) && !method13864(var0)) {
            method13862(var0);
         } else {
            boolean var6 = var0.method4247(var4);
            if (!var6) {
               method13819(var0, var4);
            }
         }
      } else {
         var0.method2992().method21405(Class8830.field39852);
         method13815(var0, var4);
         method13867(var0);
      }
   }

   private static void method13815(Class1034 var0, ItemStack var1) {
      if (method13878(var0)) {
         var0.method3302(var0.getHeldItem(Hand.field183));
      }

      var0.method4626(var1);
   }

   private static ItemStack method13816(ItemEntity var0) {
      ItemStack var3 = var0.method4124();
      ItemStack var4 = var3.method32106(1);
      if (!var3.isEmpty()) {
         var0.method4125(var3);
      } else {
         var0.method2904();
      }

      return var4;
   }

   public static void method13817(Class1034 var0, boolean var1) {
      ItemStack var4 = var0.getHeldItem(Hand.field183);
      var0.method3095(Hand.field183, ItemStack.EMPTY);
      if (!var0.method4635()) {
         boolean var5 = var0.method4247(var4);
         if (!var5) {
            ItemStack var6 = var0.method3090();
            if (!method13827(var6.getItem())) {
               method13820(var0, Collections.<ItemStack>singletonList(var6));
            } else {
               method13819(var0, var6);
            }

            var0.method4625(var4);
         }
      } else {
         boolean var7 = method13869(var4.getItem());
         if (var1 && var7) {
            method13820(var0, method13824(var0));
         } else if (!var7) {
            boolean var8 = var0.method4247(var4);
            if (!var8) {
               method13819(var0, var4);
            }
         }
      }
   }

   public static void method13818(Class1034 var0) {
      if (method13868(var0) && !var0.method3091().isEmpty()) {
         var0.method3302(var0.method3091());
         var0.method3095(Hand.field183, ItemStack.EMPTY);
      }
   }

   private static void method13819(Class1034 var0, ItemStack var1) {
      ItemStack var4 = var0.method4612(var1);
      method13821(var0, Collections.<ItemStack>singletonList(var4));
   }

   private static void method13820(Class1034 var0, List<ItemStack> var1) {
      Optional var4 = var0.method2992().<PlayerEntity>method21410(Class8830.field39822);
      if (!var4.isPresent()) {
         method13821(var0, var1);
      } else {
         method13822(var0, (PlayerEntity)var4.get(), var1);
      }
   }

   private static void method13821(Class1034 var0, List<ItemStack> var1) {
      method13823(var0, var1, method13863(var0));
   }

   private static void method13822(Class1034 var0, PlayerEntity var1, List<ItemStack> var2) {
      method13823(var0, var2, var1.getPositionVec());
   }

   private static void method13823(Class1034 var0, List<ItemStack> var1, Vector3d var2) {
      if (!var1.isEmpty()) {
         var0.swingArm(Hand.field183);

         for (ItemStack var6 : var1) {
            Class6983.method21578(var0, var6, var2.method11339(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<ItemStack> method13824(Class1034 var0) {
      Class7318 var3 = var0.world.method6715().method1411().method1058(Class8793.field39609);
      return var3.method23182(
         new Class9464((ServerWorld)var0.world)
            .method36454(Class9525.field44330, var0)
            .method36450(var0.world.field9016)
            .method36460(Class8524.field38288)
      );
   }

   private static boolean method13825(Class880 var0, Class880 var1) {
      return var1.getType() == EntityType.field41037 ? new Random(var0.world.method6783()).nextFloat() < 0.1F : false;
   }

   public static boolean method13826(Class1034 var0, ItemStack var1) {
      Item var4 = var1.getItem();
      if (!var4.method11743(Class5985.field26108)) {
         if (method13876(var0) && var0.method2992().method21404(Class8830.field39826)) {
            return false;
         } else if (!method13869(var4)) {
            boolean var5 = var0.method4613(var1);
            if (var4 == Items.field37969) {
               return var5;
            } else if (!method13870(var4)) {
               return !method13827(var4) ? var0.method4627(var1) : method13879(var0) && var5;
            } else {
               return !method13864(var0) && var5;
            }
         } else {
            return method13879(var0);
         }
      } else {
         return false;
      }
   }

   public static boolean method13827(Item var0) {
      return var0.method11743(Class5985.field26109);
   }

   private static boolean method13828(Class1034 var0, Entity var1) {
      if (!(var1 instanceof Class1006)) {
         return false;
      } else {
         Class1006 var4 = (Class1006)var1;
         return !var4.method3005() || !var4.method3066() || method13877(var0) || method13877(var4) || var4 instanceof Class1034 && var4.getRidingEntity() == null;
      }
   }

   private static boolean method13829(Class1034 var0, Class880 var1) {
      return method13831(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static boolean method13830(Class1034 var0) {
      Class6947<Class1034> var3 = var0.method2992();
      if (!var3.method21404(Class8830.field39865)) {
         return false;
      } else {
         Class880 var4 = var3.method21410(Class8830.field39865).get();
         return var0.method3213(var4, 6.0);
      }
   }

   private static Optional<? extends Class880> method13831(Class1034 var0) {
      Class6947 var3 = var0.method2992();
      if (!method13830(var0)) {
         Optional var4 = Class6983.method21586(var0, Class8830.field39849);
         if (var4.isPresent() && method13871((Class880)var4.get())) {
            return var4;
         } else {
            if (var3.method21404(Class8830.field39850)) {
               Optional var5 = var3.<PlayerEntity>method21410(Class8830.field39823);
               if (var5.isPresent()) {
                  return var5;
               }
            }

            Optional var7 = var3.<Class1006>method21410(Class8830.field39848);
            if (var7.isPresent()) {
               return var7;
            } else {
               Optional var6 = var3.<PlayerEntity>method21410(Class8830.field39860);
               return var6.isPresent() && method13871((Class880)var6.get()) ? var6 : Optional.empty();
            }
         }
      } else {
         return Optional.empty();
      }
   }

   public static void method13832(PlayerEntity var0, boolean var1) {
      List<Class1034> var4 = var0.world.method7182(Class1034.class, var0.getBoundingBox().method19664(16.0));
      var4.stream().filter(Class4388::method13865).filter(var2 -> !var1 || Class6983.method21583(var2, var0)).forEach(var1x -> {
         if (!var1x.world.method6789().method17135(Class5462.field24255)) {
            method13849(var1x, var0);
         } else {
            method13850(var1x, var0);
         }
      });
   }

   public static ActionResultType method13833(Class1034 var0, PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (!method13834(var0, var5)) {
         return ActionResultType.field14820;
      } else {
         ItemStack var6 = var5.method32106(1);
         method13815(var0, var6);
         method13867(var0);
         method13844(var0);
         return ActionResultType.field14819;
      }
   }

   public static boolean method13834(Class1034 var0, ItemStack var1) {
      return !method13876(var0) && !method13868(var0) && var0.method4635() && method13869(var1.getItem());
   }

   public static void method13835(Class1034 var0, Class880 var1) {
      if (!(var1 instanceof Class1034)) {
         if (method13878(var0)) {
            method13817(var0, false);
         }

         Class6947 var4 = var0.method2992();
         var4.method21405(Class8830.field39856);
         var4.method21405(Class8830.field39857);
         var4.method21405(Class8830.field39851);
         if (var1 instanceof PlayerEntity) {
            var4.method21407(Class8830.field39854, true, 400L);
         }

         method13853(var0).ifPresent(var2 -> {
            if (var2.getType() != var1.getType()) {
               var4.method21405(Class8830.field39837);
            }
         });
         if (!var0.method3005()) {
            if (var1.getType() == EntityType.field41037 && method13859(var0)) {
               method13860(var0, var1);
               method13855(var0, var1);
            } else {
               method13836(var0, var1);
            }
         } else {
            var4.method21407(Class8830.field39837, var1, 100L);
            if (method13871(var1)) {
               method13846(var0, var1);
            }
         }
      }
   }

   public static void method13836(Class1035 var0, Class880 var1) {
      if (!var0.method2992().method21430(Class8890.field40232) && method13871(var1) && !Class6983.method21582(var0, var1, 4.0)) {
         if (var1.getType() == EntityType.PLAYER && var0.world.method6789().method17135(Class5462.field24255)) {
            method13850(var0, var1);
            method13847(var0);
         } else {
            method13849(var0, var1);
            method13846(var0, var1);
         }
      }
   }

   public static Optional<Class9455> method13837(Class1034 var0) {
      return var0.method2992().method21418().<Class9455>map(var1 -> method13838(var0, var1));
   }

   private static Class9455 method13838(Class1034 var0, Class8890 var1) {
      if (var1 != Class8890.field40229) {
         if (!var0.method4634()) {
            if (var1 == Class8890.field40232 && method13839(var0)) {
               return Sounds.field26936;
            } else if (var1 != Class8890.field40231) {
               if (var1 != Class8890.field40230) {
                  if (!method13873(var0)) {
                     return !method13872(var0) ? Sounds.field26930 : Sounds.field26936;
                  } else {
                     return Sounds.field26934;
                  }
               } else {
                  return Sounds.field26932;
               }
            } else {
               return Sounds.field26929;
            }
         } else {
            return Sounds.field26936;
         }
      } else {
         return Sounds.field26931;
      }
   }

   private static boolean method13839(Class1034 var0) {
      Class6947<Class1034> var3 = var0.method2992();
      return var3.method21404(Class8830.field39837) ? var3.method21410(Class8830.field39837).get().method3213(var0, 12.0) : false;
   }

   public static boolean method13840(Class1034 var0) {
      return var0.method2992().method21404(Class8830.field39855)
         || method13841(var0).stream().anyMatch(var0x -> var0x.method2992().method21404(Class8830.field39855));
   }

   private static List<Class1035> method13841(Class1034 var0) {
      return var0.method2992().<List<Class1035>>method21410(Class8830.field39862).orElse(ImmutableList.of());
   }

   private static List<Class1035> method13842(Class1035 var0) {
      return var0.method2992().<List<Class1035>>method21410(Class8830.field39861).orElse(ImmutableList.of());
   }

   public static boolean method13843(Class880 var0) {
      for (ItemStack var4 : var0.method2947()) {
         Item var5 = var4.getItem();
         if (var5 instanceof Class3279 && ((Class3279)var5).method11806() == Class2114.field13776) {
            return true;
         }
      }

      return false;
   }

   private static void method13844(Class1034 var0) {
      var0.method2992().method21405(Class8830.field39824);
      var0.method4230().method21666();
   }

   private static Class3702<Class1034> method13845() {
      return new Class3702<Class1034>(new Class3744<>(Class1034::method3005, Class8830.field39859, Class8830.field39830, field21461), field21460);
   }

   public static void method13846(Class1035 var0, Class880 var1) {
      method13842(var0).forEach(var1x -> {
         if (var1.getType() != EntityType.field41037 || var1x.method4618() && ((Class1091)var1).method5089()) {
            method13851(var1x, var1);
         }
      });
   }

   public static void method13847(Class1035 var0) {
      method13842(var0).forEach(var0x -> method13854(var0x).ifPresent(var1 -> method13849(var0x, var1)));
   }

   public static void method13848(Class1034 var0) {
      method13841(var0).forEach(Class4388::method13861);
   }

   public static void method13849(Class1035 var0, Class880 var1) {
      if (method13871(var1)) {
         var0.method2992().method21405(Class8830.field39841);
         var0.method2992().method21407(Class8830.field39849, var1.getUniqueID(), 600L);
         if (var1.getType() == EntityType.field41037 && var0.method4618()) {
            method13861(var0);
         }

         if (var1.getType() == EntityType.PLAYER && var0.world.method6789().method17135(Class5462.field24255)) {
            var0.method2992().method21407(Class8830.field39850, true, 600L);
         }
      }
   }

   private static void method13850(Class1035 var0, Class880 var1) {
      Optional var4 = method13854(var0);
      if (!var4.isPresent()) {
         method13849(var0, var1);
      } else {
         method13849(var0, (Class880)var4.get());
      }
   }

   private static void method13851(Class1035 var0, Class880 var1) {
      Optional var4 = method13852(var0);
      Class880 var5 = Class6983.method21584(var0, var4, var1);
      if (!var4.isPresent() || var4.get() != var5) {
         method13849(var0, var5);
      }
   }

   private static Optional<Class880> method13852(Class1035 var0) {
      return Class6983.method21586(var0, Class8830.field39849);
   }

   public static Optional<Class880> method13853(Class1034 var0) {
      return !var0.method2992().method21404(Class8830.field39837) ? Optional.<Class880>empty() : var0.method2992().<Class880>method21410(Class8830.field39837);
   }

   public static Optional<PlayerEntity> method13854(Class1035 var0) {
      return !var0.method2992().method21404(Class8830.field39823) ? Optional.<PlayerEntity>empty() : var0.method2992().<PlayerEntity>method21410(Class8830.field39823);
   }

   private static void method13855(Class1034 var0, Class880 var1) {
      method13841(var0).stream().filter(var0x -> var0x instanceof Class1034).forEach(var1x -> method13856((Class1034)var1x, var1));
   }

   private static void method13856(Class1034 var0, Class880 var1) {
      Class6947 var4 = var0.method2992();
      Class880 var5 = Class6983.method21584(var0, var4.<Class880>method21410(Class8830.field39837), var1);
      var5 = Class6983.method21584(var0, var4.<Class880>method21410(Class8830.field39826), var5);
      method13860(var0, var5);
   }

   private static boolean method13857(Class1034 var0) {
      Class6947<Class1034> var3 = var0.method2992();
      if (var3.method21404(Class8830.field39837)) {
         Class880 var4 = var3.method21410(Class8830.field39837).get();
         EntityType<?> var5 = var4.getType();
         if (var5 != EntityType.field41037) {
            return !method13880(var5) ? false : !var3.method21411(Class8830.field39865, var4);
         } else {
            return method13858(var0);
         }
      } else {
         return true;
      }
   }

   private static boolean method13858(Class1034 var0) {
      return !method13859(var0);
   }

   private static boolean method13859(Class1034 var0) {
      int var3 = var0.method2992().<Integer>method21410(Class8830.field39866).orElse(0) + 1;
      int var4 = var0.method2992().<Integer>method21410(Class8830.field39867).orElse(0);
      return var4 > var3;
   }

   private static void method13860(Class1034 var0, Class880 var1) {
      var0.method2992().method21405(Class8830.field39849);
      var0.method2992().method21405(Class8830.field39826);
      var0.method2992().method21405(Class8830.field39824);
      var0.method2992().method21407(Class8830.field39837, var1, (long)field21462.method29319(var0.world.field9016));
      method13861(var0);
   }

   public static void method13861(Class1035 var0) {
      var0.method2992().method21407(Class8830.field39855, true, (long)field21459.method29319(var0.world.field9016));
   }

   private static void method13862(Class1034 var0) {
      var0.method2992().method21407(Class8830.field39869, true, 200L);
   }

   private static Vector3d method13863(Class1034 var0) {
      Vector3d var3 = Class8037.method27583(var0, 4, 2);
      return var3 != null ? var3 : var0.getPositionVec();
   }

   private static boolean method13864(Class1034 var0) {
      return var0.method2992().method21404(Class8830.field39869);
   }

   public static boolean method13865(Class1035 var0) {
      return var0.method2992().method21430(Class8890.field40220);
   }

   private static boolean method13866(Class880 var0) {
      return var0.method3092(Items.field38148);
   }

   private static void method13867(Class880 var0) {
      var0.method2992().method21407(Class8830.field39851, true, 120L);
   }

   private static boolean method13868(Class1034 var0) {
      return var0.method2992().method21404(Class8830.field39851);
   }

   private static boolean method13869(Item var0) {
      return var0 == field21458;
   }

   private static boolean method13870(Item var0) {
      return field21465.contains(var0);
   }

   private static boolean method13871(Class880 var0) {
      return Class8088.field34762.test(var0);
   }

   private static boolean method13872(Class1034 var0) {
      return var0.method2992().method21404(Class8830.field39870);
   }

   private static boolean method13873(Class880 var0) {
      return var0.method2992().method21404(Class8830.field39868);
   }

   private static boolean method13874(Class880 var0) {
      return !method13873(var0);
   }

   public static boolean method13875(Class880 var0) {
      return var0.getType() == EntityType.PLAYER && var0.method3093(Class4388::method13827);
   }

   private static boolean method13876(Class1034 var0) {
      return var0.method2992().method21404(Class8830.field39854);
   }

   private static boolean method13877(Class880 var0) {
      return var0.method2992().method21404(Class8830.field39835);
   }

   private static boolean method13878(Class1034 var0) {
      return !var0.method3091().isEmpty();
   }

   private static boolean method13879(Class1034 var0) {
      return var0.method3091().isEmpty() || !method13827(var0.method3091().getItem());
   }

   public static boolean method13880(EntityType var0) {
      return var0 == EntityType.field41110 || var0 == EntityType.field41106;
   }
}
