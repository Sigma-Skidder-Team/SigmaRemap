package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;

import java.util.Optional;

public class Class9743 {
   private static String[] field45489;

   public static Brain<?> method38192(PiglinBruteEntity var0, Brain<PiglinBruteEntity> var1) {
      method38194(var0, var1);
      method38195(var0, var1);
      method38196(var0, var1);
      var1.method21415(ImmutableSet.of(Activity.field40219));
      var1.method21424(Activity.field40220);
      var1.method21417();
      return var1;
   }

   public static void method38193(PiglinBruteEntity var0) {
      Class9378 var3 = Class9378.method35577(var0.world.getDimensionKey(), var0.getPosition());
      var0.getBrain().method21406(Class8830.field39813, var3);
   }

   private static void method38194(PiglinBruteEntity var0, Brain<PiglinBruteEntity> var1) {
      var1.method21425(Activity.field40219, 0,
              ImmutableList.of(new Class3681(45, 90), new Class3735(), new Class3697(), new Class3701<>()));
   }

   private static void method38195(PiglinBruteEntity var0, Brain<PiglinBruteEntity> var1) {
      var1.method21425(
         Activity.field40220,
         10,
         ImmutableList.of(new Class3733<Class1035>(Class9743::method38201), method38197(), method38198(), new Class3715(EntityType.PLAYER, 4))
      );
   }

   private static void method38196(PiglinBruteEntity var0, Brain<PiglinBruteEntity> var1) {
      var1.method21426(
         Activity.field40229,
         10,
         ImmutableList.of(new Class3685<>(var1x -> !method38200(var0, var1x)), new Class3720(1.0F), new Class3684(20)),
         Class8830.field39826
      );
   }

   private static Class3693<PiglinBruteEntity> method38197() {
      return new Class3693<PiglinBruteEntity>(
         ImmutableList.of(
            Pair.of(new Class3738(EntityType.PLAYER, 8.0F), 1),
            Pair.of(new Class3738(EntityType.PIGLIN, 8.0F), 1),
            Pair.of(new Class3738(EntityType.PIGLIN_BRUTE, 8.0F), 1),
            Pair.of(new Class3738(8.0F), 1),
            Pair.of(new Class3675(30, 60), 1)
         )
      );
   }

   private static Class3693<PiglinBruteEntity> method38198() {
      return new Class3693<PiglinBruteEntity>(
         ImmutableList.of(
            Pair.of(new Class3718(0.6F), 2),
            Pair.of(Class3696.<LivingEntity>method12551(EntityType.PIGLIN, 8, Class8830.field39828, 0.6F, 2), 2),
            Pair.of(Class3696.<LivingEntity>method12551(EntityType.PIGLIN_BRUTE, 8, Class8830.field39828, 0.6F, 2), 2),
            Pair.of(new Class3700(Class8830.field39813, 0.6F, 2, 100), 2),
            Pair.of(new Class3726(Class8830.field39813, 0.6F, 5), 2),
            Pair.of(new Class3675(30, 60), 1)
         )
      );
   }

   public static void method38199(PiglinBruteEntity var0) {
      Brain<PiglinBruteEntity> var3 = var0.getBrain();
      Activity var4 = var3.method21418().orElse(null);
      var3.method21423(ImmutableList.of(Activity.field40229, Activity.field40220));
      Activity var5 = var3.method21418().orElse(null);
      if (var4 != var5) {
         method38206(var0);
      }

      var0.method4304(var3.method21404(Class8830.field39826));
   }

   private static boolean method38200(Class1035 var0, LivingEntity var1) {
      return method38201(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static Optional<? extends LivingEntity> method38201(Class1035 var0) {
      Optional var3 = Class6983.method21586(var0, Class8830.field39849);
      if (var3.isPresent() && method38202((LivingEntity)var3.get())) {
         return var3;
      } else {
         Optional var4 = method38203(var0, Class8830.field39823);
         return !var4.isPresent() ? var0.getBrain().method21410(Class8830.field39848) : var4;
      }
   }

   private static boolean method38202(LivingEntity var0) {
      return EntityPredicates.field34762.test(var0);
   }

   private static Optional<? extends LivingEntity> method38203(Class1035 var0, Class8830<? extends LivingEntity> var1) {
      return var0.getBrain().method21410(var1).filter(var1x -> var1x.isEntityInRange(var0, 12.0));
   }

   public static void method38204(PiglinBruteEntity var0, LivingEntity var1) {
      if (!(var1 instanceof Class1035)) {
         Class4388.method13836(var0, var1);
      }
   }

   public static void method38205(PiglinBruteEntity var0) {
      if ((double)var0.world.rand.nextFloat() < 0.0125) {
         method38206(var0);
      }
   }

   private static void method38206(PiglinBruteEntity var0) {
      var0.getBrain().method21418().ifPresent(var1 -> {
         if (var1 == Activity.field40229) {
            var0.method4638();
         }
      });
   }
}
