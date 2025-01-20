package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.RangedInteger;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.TickRangeConverter;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Optional;

public class Class9069 {
   private static String[] field41499;
   private static final RangedInteger field41500 = TickRangeConverter.convertRange(5, 20);
   private static final RangedInteger field41501 = RangedInteger.method29318(5, 16);

   public static Brain<?> method33778(Brain<HoglinEntity> var0) {
      method33779(var0);
      method33780(var0);
      method33781(var0);
      method33782(var0);
      var0.method21415(ImmutableSet.of(Activity.field40219));
      var0.method21424(Activity.field40220);
      var0.method21417();
      return var0;
   }

   private static void method33779(Brain<HoglinEntity> var0) {
      var0.method21425(Activity.field40219, 0, ImmutableList.of(new Class3681(45, 90), new Class3735()));
   }

   private static void method33780(Brain<HoglinEntity> var0) {
      var0.method21425(
         Activity.field40220,
         10,
         ImmutableList.<Class3676<? super HoglinEntity>>of(
            new Class3709(Class8830.field39870, 200),
            new Class3736(EntityType.HOGLIN, 0.6F),
            Class3690.method12538(Class8830.field39870, 1.0F, 8, true),
            new Class3733<>(Class9069::method33789),
            new Class3740<>(HoglinEntity::method5084, (Class3676<? super CreatureEntity>)Class3690.method12539(Class8830.field39864, 0.4F, 8, false)),
            new Class3702<LivingEntity>(new Class3738(8.0F), RangedInteger.method29318(30, 60)),
            new Class3682(field41501, 0.6F),
            method33783()
         )
      );
   }

   private static void method33781(Brain<HoglinEntity> var0) {
      var0.method21426(
         Activity.field40229,
         10,
              ImmutableList.<Class3676<? super HoglinEntity>>of(
            new Class3709(Class8830.field39870, 200),
            new Class3736(EntityType.HOGLIN, 0.6F),
            new Class3720(1.0F),
            new Class3740<>(HoglinEntity::method5084, new Class3684(40)),
            new Class3740<>(Class1045::isChild, new Class3684(15)),
            new Class3685<>(),
            new Class3714<HoglinEntity>(Class9069::method33802, Class8830.field39826)
         ),
         Class8830.field39826
      );
   }

   private static void method33782(Brain<HoglinEntity> var0) {
      var0.method21426(
         Activity.field40232,
         10,
         ImmutableList.of(
            Class3690.method12539(Class8830.field39837, 1.3F, 15, false),
            method33783(),
            new Class3702<LivingEntity>(new Class3738(8.0F), RangedInteger.method29318(30, 60)),
            new Class3714<HoglinEntity>(Class9069::method33791, Class8830.field39837)
         ),
         Class8830.field39837
      );
   }

   private static Class3693<HoglinEntity> method33783() {
      return new Class3693<HoglinEntity>(ImmutableList.of(Pair.of(new Class3718(0.4F), 2), Pair.of(new Class3694(0.4F, 3), 2), Pair.of(new Class3675(30, 60), 1)));
   }

   public static void method33784(HoglinEntity var0) {
      Brain<HoglinEntity> var3 = var0.getBrain();
      Activity var4 = var3.method21418().orElse(null);
      var3.method21423(ImmutableList.of(Activity.field40229, Activity.field40232, Activity.field40220));
      Activity var5 = var3.method21418().orElse(null);
      if (var4 != var5) {
         method33798(var0).ifPresent(var0::method5090);
      }

      var0.method4304(var3.method21404(Class8830.field39826));
   }

   public static void method33785(HoglinEntity var0, LivingEntity var1) {
      if (!var0.isChild()) {
         if (var1.getType() == EntityType.PIGLIN && method33792(var0)) {
            method33788(var0, var1);
            method33786(var0, var1);
         } else {
            method33796(var0, var1);
         }
      }
   }

   private static void method33786(HoglinEntity var0, LivingEntity var1) {
      method33800(var0).forEach(var1x -> method33787(var1x, var1));
   }

   private static void method33787(HoglinEntity var0, LivingEntity var1) {
      Brain var4 = var0.getBrain();
      LivingEntity var5 = Class6983.method21584(var0, var4.<LivingEntity>method21410(Class8830.field39837), var1);
      var5 = Class6983.method21584(var0, var4.<LivingEntity>method21410(Class8830.field39826), var5);
      method33788(var0, var5);
   }

   private static void method33788(HoglinEntity var0, LivingEntity var1) {
      var0.getBrain().method21405(Class8830.field39826);
      var0.getBrain().method21405(Class8830.field39824);
      var0.getBrain().method21407(Class8830.field39837, var1, (long)field41500.method29319(var0.world.rand));
   }

   private static Optional<? extends LivingEntity> method33789(HoglinEntity var0) {
      return !method33803(var0) && !method33802(var0) ? var0.getBrain().method21410(Class8830.field39823) : Optional.empty();
   }

   public static boolean method33790(HoglinEntity var0, BlockPos var1) {
      Optional var4 = var0.getBrain().<BlockPos>method21410(Class8830.field39870);
      return var4.isPresent() && ((BlockPos)var4.get()).withinDistance(var1, 8.0);
   }

   private static boolean method33791(HoglinEntity var0) {
      return var0.method5084() && !method33792(var0);
   }

   private static boolean method33792(HoglinEntity var0) {
      if (!var0.isChild()) {
         int var3 = var0.getBrain().<Integer>method21410(Class8830.field39866).orElse(0);
         int var4 = var0.getBrain().<Integer>method21410(Class8830.field39867).orElse(0) + 1;
         return var3 > var4;
      } else {
         return false;
      }
   }

   public static void method33793(HoglinEntity var0, LivingEntity var1) {
      Brain var4 = var0.getBrain();
      var4.method21405(Class8830.field39871);
      var4.method21405(Class8830.field39829);
      if (!var0.isChild()) {
         method33794(var0, var1);
      } else {
         method33787(var0, var1);
      }
   }

   private static void method33794(HoglinEntity var0, LivingEntity var1) {
      if ((!var0.getBrain().method21430(Activity.field40232) || var1.getType() != EntityType.PIGLIN)
         && EntityPredicates.field34762.test(var1)
         && var1.getType() != EntityType.HOGLIN
         && !Class6983.method21582(var0, var1, 4.0)) {
         method33795(var0, var1);
         method33796(var0, var1);
      }
   }

   private static void method33795(HoglinEntity var0, LivingEntity var1) {
      Brain var4 = var0.getBrain();
      var4.method21405(Class8830.field39841);
      var4.method21405(Class8830.field39829);
      var4.method21407(Class8830.field39826, var1, 200L);
   }

   private static void method33796(HoglinEntity var0, LivingEntity var1) {
      method33800(var0).forEach(var1x -> method33797(var1x, var1));
   }

   private static void method33797(HoglinEntity var0, LivingEntity var1) {
      if (!method33803(var0)) {
         Optional var4 = var0.getBrain().<LivingEntity>method21410(Class8830.field39826);
         LivingEntity var5 = Class6983.method21584(var0, var4, var1);
         method33795(var0, var5);
      }
   }

   public static Optional<SoundEvent> method33798(HoglinEntity var0) {
      return var0.getBrain().method21418().<SoundEvent>map(var1 -> method33799(var0, var1));
   }

   private static SoundEvent method33799(HoglinEntity var0, Activity var1) {
      if (var1 == Activity.field40232 || var0.method5087()) {
         return SoundEvents.field26658;
      } else if (var1 != Activity.field40229) {
         return !method33801(var0) ? SoundEvents.field26652 : SoundEvents.field26658;
      } else {
         return SoundEvents.field26653;
      }
   }

   private static List<HoglinEntity> method33800(HoglinEntity var0) {
      return var0.getBrain().<List<HoglinEntity>>method21410(Class8830.field39863).orElse(ImmutableList.of());
   }

   private static boolean method33801(HoglinEntity var0) {
      return var0.getBrain().method21404(Class8830.field39870);
   }

   private static boolean method33802(HoglinEntity var0) {
      return var0.getBrain().method21404(Class8830.field39829);
   }

   public static boolean method33803(HoglinEntity var0) {
      return var0.getBrain().method21404(Class8830.field39871);
   }
}
