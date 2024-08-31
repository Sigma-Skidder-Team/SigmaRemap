package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Optional;

public class Class9069 {
   private static String[] field41499;
   private static final Class8369 field41500 = Class8763.method31620(5, 20);
   private static final Class8369 field41501 = Class8369.method29318(5, 16);

   public static Class6947<?> method33778(Class6947<Class1091> var0) {
      method33779(var0);
      method33780(var0);
      method33781(var0);
      method33782(var0);
      var0.method21415(ImmutableSet.of(Class8890.field40219));
      var0.method21424(Class8890.field40220);
      var0.method21417();
      return var0;
   }

   private static void method33779(Class6947<Class1091> var0) {
      var0.method21425(Class8890.field40219, 0, ImmutableList.of(new Class3681(45, 90), new Class3735()));
   }

   private static void method33780(Class6947<Class1091> var0) {
      var0.method21425(
         Class8890.field40220,
         10,
         ImmutableList.<Class3676<? super Class1091>>of(
            new Class3709(Class8830.field39870, 200),
            new Class3736(EntityType.field41037, 0.6F),
            Class3690.method12538(Class8830.field39870, 1.0F, 8, true),
            new Class3733<>(Class9069::method33789),
            new Class3740<>(Class1091::method5084, (Class3676<? super Class1046>)Class3690.method12539(Class8830.field39864, 0.4F, 8, false)),
            new Class3702<LivingEntity>(new Class3738(8.0F), Class8369.method29318(30, 60)),
            new Class3682(field41501, 0.6F),
            method33783()
         )
      );
   }

   private static void method33781(Class6947<Class1091> var0) {
      var0.method21426(
         Class8890.field40229,
         10,
              ImmutableList.<Class3676<? super Class1091>>of(
            new Class3709(Class8830.field39870, 200),
            new Class3736(EntityType.field41037, 0.6F),
            new Class3720(1.0F),
            new Class3740<>(Class1091::method5084, new Class3684(40)),
            new Class3740<>(Class1045::method3005, new Class3684(15)),
            new Class3685<>(),
            new Class3714<Class1091>(Class9069::method33802, Class8830.field39826)
         ),
         Class8830.field39826
      );
   }

   private static void method33782(Class6947<Class1091> var0) {
      var0.method21426(
         Class8890.field40232,
         10,
         ImmutableList.of(
            Class3690.method12539(Class8830.field39837, 1.3F, 15, false),
            method33783(),
            new Class3702<LivingEntity>(new Class3738(8.0F), Class8369.method29318(30, 60)),
            new Class3714<Class1091>(Class9069::method33791, Class8830.field39837)
         ),
         Class8830.field39837
      );
   }

   private static Class3693<Class1091> method33783() {
      return new Class3693<Class1091>(ImmutableList.of(Pair.of(new Class3718(0.4F), 2), Pair.of(new Class3694(0.4F, 3), 2), Pair.of(new Class3675(30, 60), 1)));
   }

   public static void method33784(Class1091 var0) {
      Class6947<Class1091> var3 = var0.method2992();
      Class8890 var4 = var3.method21418().orElse(null);
      var3.method21423(ImmutableList.of(Class8890.field40229, Class8890.field40232, Class8890.field40220));
      Class8890 var5 = var3.method21418().orElse(null);
      if (var4 != var5) {
         method33798(var0).ifPresent(var0::method5090);
      }

      var0.method4304(var3.method21404(Class8830.field39826));
   }

   public static void method33785(Class1091 var0, LivingEntity var1) {
      if (!var0.method3005()) {
         if (var1.getType() == EntityType.field41065 && method33792(var0)) {
            method33788(var0, var1);
            method33786(var0, var1);
         } else {
            method33796(var0, var1);
         }
      }
   }

   private static void method33786(Class1091 var0, LivingEntity var1) {
      method33800(var0).forEach(var1x -> method33787(var1x, var1));
   }

   private static void method33787(Class1091 var0, LivingEntity var1) {
      Class6947 var4 = var0.method2992();
      LivingEntity var5 = Class6983.method21584(var0, var4.<LivingEntity>method21410(Class8830.field39837), var1);
      var5 = Class6983.method21584(var0, var4.<LivingEntity>method21410(Class8830.field39826), var5);
      method33788(var0, var5);
   }

   private static void method33788(Class1091 var0, LivingEntity var1) {
      var0.method2992().method21405(Class8830.field39826);
      var0.method2992().method21405(Class8830.field39824);
      var0.method2992().method21407(Class8830.field39837, var1, (long)field41500.method29319(var0.world.rand));
   }

   private static Optional<? extends LivingEntity> method33789(Class1091 var0) {
      return !method33803(var0) && !method33802(var0) ? var0.method2992().method21410(Class8830.field39823) : Optional.empty();
   }

   public static boolean method33790(Class1091 var0, BlockPos var1) {
      Optional var4 = var0.method2992().<BlockPos>method21410(Class8830.field39870);
      return var4.isPresent() && ((BlockPos)var4.get()).method8316(var1, 8.0);
   }

   private static boolean method33791(Class1091 var0) {
      return var0.method5084() && !method33792(var0);
   }

   private static boolean method33792(Class1091 var0) {
      if (!var0.method3005()) {
         int var3 = var0.method2992().<Integer>method21410(Class8830.field39866).orElse(0);
         int var4 = var0.method2992().<Integer>method21410(Class8830.field39867).orElse(0) + 1;
         return var3 > var4;
      } else {
         return false;
      }
   }

   public static void method33793(Class1091 var0, LivingEntity var1) {
      Class6947 var4 = var0.method2992();
      var4.method21405(Class8830.field39871);
      var4.method21405(Class8830.field39829);
      if (!var0.method3005()) {
         method33794(var0, var1);
      } else {
         method33787(var0, var1);
      }
   }

   private static void method33794(Class1091 var0, LivingEntity var1) {
      if ((!var0.method2992().method21430(Class8890.field40232) || var1.getType() != EntityType.field41065)
         && Class8088.field34762.test(var1)
         && var1.getType() != EntityType.field41037
         && !Class6983.method21582(var0, var1, 4.0)) {
         method33795(var0, var1);
         method33796(var0, var1);
      }
   }

   private static void method33795(Class1091 var0, LivingEntity var1) {
      Class6947 var4 = var0.method2992();
      var4.method21405(Class8830.field39841);
      var4.method21405(Class8830.field39829);
      var4.method21407(Class8830.field39826, var1, 200L);
   }

   private static void method33796(Class1091 var0, LivingEntity var1) {
      method33800(var0).forEach(var1x -> method33797(var1x, var1));
   }

   private static void method33797(Class1091 var0, LivingEntity var1) {
      if (!method33803(var0)) {
         Optional var4 = var0.method2992().<LivingEntity>method21410(Class8830.field39826);
         LivingEntity var5 = Class6983.method21584(var0, var4, var1);
         method33795(var0, var5);
      }
   }

   public static Optional<SoundEvent> method33798(Class1091 var0) {
      return var0.method2992().method21418().<SoundEvent>map(var1 -> method33799(var0, var1));
   }

   private static SoundEvent method33799(Class1091 var0, Class8890 var1) {
      if (var1 == Class8890.field40232 || var0.method5087()) {
         return Sounds.field26658;
      } else if (var1 != Class8890.field40229) {
         return !method33801(var0) ? Sounds.field26652 : Sounds.field26658;
      } else {
         return Sounds.field26653;
      }
   }

   private static List<Class1091> method33800(Class1091 var0) {
      return var0.method2992().<List<Class1091>>method21410(Class8830.field39863).orElse(ImmutableList.of());
   }

   private static boolean method33801(Class1091 var0) {
      return var0.method2992().method21404(Class8830.field39870);
   }

   private static boolean method33802(Class1091 var0) {
      return var0.method2992().method21404(Class8830.field39829);
   }

   public static boolean method33803(Class1091 var0) {
      return var0.method2992().method21404(Class8830.field39871);
   }
}
