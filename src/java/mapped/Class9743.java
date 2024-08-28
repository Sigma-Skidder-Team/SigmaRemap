package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class Class9743 {
   private static String[] field45489;

   public static Class6947<?> method38192(Class1036 var0, Class6947<Class1036> var1) {
      method38194(var0, var1);
      method38195(var0, var1);
      method38196(var0, var1);
      var1.method21415(ImmutableSet.of(Class8890.field40219));
      var1.method21424(Class8890.field40220);
      var1.method21417();
      return var1;
   }

   public static void method38193(Class1036 var0) {
      Class9378 var3 = Class9378.method35577(var0.field5024.method6813(), var0.method3432());
      var0.method2992().method21406(Class8830.field39813, var3);
   }

   private static void method38194(Class1036 var0, Class6947<Class1036> var1) {
      var1.method21425(Class8890.field40219, 0,
              ImmutableList.of(new Class3681(45, 90), new Class3735(), new Class3697(), new Class3701<>()));
   }

   private static void method38195(Class1036 var0, Class6947<Class1036> var1) {
      var1.method21425(
         Class8890.field40220,
         10,
         ImmutableList.of(new Class3733<Class1035>(Class9743::method38201), method38197(), method38198(), new Class3715(Class8992.field41111, 4))
      );
   }

   private static void method38196(Class1036 var0, Class6947<Class1036> var1) {
      var1.method21426(
         Class8890.field40229,
         10,
         ImmutableList.of(new Class3685<>(var1x -> !method38200(var0, var1x)), new Class3720(1.0F), new Class3684(20)),
         Class8830.field39826
      );
   }

   private static Class3693<Class1036> method38197() {
      return new Class3693<Class1036>(
         ImmutableList.of(
            Pair.of(new Class3738(Class8992.field41111, 8.0F), 1),
            Pair.of(new Class3738(Class8992.field41065, 8.0F), 1),
            Pair.of(new Class3738(Class8992.field41066, 8.0F), 1),
            Pair.of(new Class3738(8.0F), 1),
            Pair.of(new Class3675(30, 60), 1)
         )
      );
   }

   private static Class3693<Class1036> method38198() {
      return new Class3693<Class1036>(
         ImmutableList.of(
            Pair.of(new Class3718(0.6F), 2),
            Pair.of(Class3696.<Class880>method12551(Class8992.field41065, 8, Class8830.field39828, 0.6F, 2), 2),
            Pair.of(Class3696.<Class880>method12551(Class8992.field41066, 8, Class8830.field39828, 0.6F, 2), 2),
            Pair.of(new Class3700(Class8830.field39813, 0.6F, 2, 100), 2),
            Pair.of(new Class3726(Class8830.field39813, 0.6F, 5), 2),
            Pair.of(new Class3675(30, 60), 1)
         )
      );
   }

   public static void method38199(Class1036 var0) {
      Class6947<Class1036> var3 = var0.method2992();
      Class8890 var4 = var3.method21418().orElse(null);
      var3.method21423(ImmutableList.of(Class8890.field40229, Class8890.field40220));
      Class8890 var5 = var3.method21418().orElse(null);
      if (var4 != var5) {
         method38206(var0);
      }

      var0.method4304(var3.method21404(Class8830.field39826));
   }

   private static boolean method38200(Class1035 var0, Class880 var1) {
      return method38201(var0).filter(var1x -> var1x == var1).isPresent();
   }

   private static Optional<? extends Class880> method38201(Class1035 var0) {
      Optional var3 = Class6983.method21586(var0, Class8830.field39849);
      if (var3.isPresent() && method38202((Class880)var3.get())) {
         return var3;
      } else {
         Optional var4 = method38203(var0, Class8830.field39823);
         return !var4.isPresent() ? var0.method2992().method21410(Class8830.field39848) : var4;
      }
   }

   private static boolean method38202(Class880 var0) {
      return Class8088.field34762.test(var0);
   }

   private static Optional<? extends Class880> method38203(Class1035 var0, Class8830<? extends Class880> var1) {
      return var0.method2992().method21410(var1).filter(var1x -> var1x.method3213(var0, 12.0));
   }

   public static void method38204(Class1036 var0, Class880 var1) {
      if (!(var1 instanceof Class1035)) {
         Class4388.method13836(var0, var1);
      }
   }

   public static void method38205(Class1036 var0) {
      if ((double)var0.field5024.field9016.nextFloat() < 0.0125) {
         method38206(var0);
      }
   }

   private static void method38206(Class1036 var0) {
      var0.method2992().method21418().ifPresent(var1 -> {
         if (var1 == Class8890.field40229) {
            var0.method4638();
         }
      });
   }
}
