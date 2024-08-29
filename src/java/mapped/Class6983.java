package mapped;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class6983 {
   private static String[] field30211;

   public static void method21569(Class880 var0, Class880 var1, float var2) {
      method21573(var0, var1);
      method21575(var0, var1, var2);
   }

   public static boolean method21570(Class6947<?> var0, Class880 var1) {
      return var0.<List<Class880>>method21410(Class8830.field39819).filter(var1x -> var1x.contains(var1)).isPresent();
   }

   public static boolean method21571(Class6947<?> var0, Class8830<? extends Class880> var1, EntityType<?> var2) {
      return method21572(var0, var1, var1x -> var1x.getType() == var2);
   }

   private static boolean method21572(Class6947<?> var0, Class8830<? extends Class880> var1, Predicate<Class880> var2) {
      return var0.method21410(var1).filter(var2).filter(Class880::method3066).filter(var1x -> method21570(var0, var1x)).isPresent();
   }

   private static void method21573(Class880 var0, Class880 var1) {
      method21574(var0, var1);
      method21574(var1, var0);
   }

   public static void method21574(Class880 var0, Class880 var1) {
      var0.method2992().method21406(Class8830.field39825, new Class7865(var1, true));
   }

   private static void method21575(Class880 var0, Class880 var1, float var2) {
      byte var5 = 2;
      method21576(var0, var1, var2, 2);
      method21576(var1, var0, var2, 2);
   }

   public static void method21576(Class880 var0, Entity var1, float var2, int var3) {
      Class8999 var6 = new Class8999(new Class7865(var1, false), var2, var3);
      var0.method2992().method21406(Class8830.field39825, new Class7865(var1, true));
      var0.method2992().method21406(Class8830.field39824, var6);
   }

   public static void method21577(Class880 var0, BlockPos var1, float var2, int var3) {
      Class8999 var6 = new Class8999(new Class7863(var1), var2, var3);
      var0.method2992().method21406(Class8830.field39825, new Class7863(var1));
      var0.method2992().method21406(Class8830.field39824, var6);
   }

   public static void method21578(Class880 var0, ItemStack var1, Vector3d var2) {
      double var5 = var0.method3442() - 0.3F;
      ItemEntity var7 = new ItemEntity(var0.world, var0.getPosX(), var5, var0.getPosZ(), var1);
      float var8 = 0.3F;
      Vector3d var9 = var2.method11336(var0.getPositionVec());
      var9 = var9.method11333().method11344(0.3F);
      var7.method3434(var9);
      var7.method4131();
      var0.world.method6916(var7);
   }

   public static Class2002 method21579(ServerWorld var0, Class2002 var1, int var2) {
      int var5 = var0.method6955(var1);
      return Class2002.method8427(var1, var2).filter(var2x -> var0.method6955(var2x) < var5).min(Comparator.comparingInt(var0::method6955)).orElse(var1);
   }

   public static boolean method21580(Class1006 var0, Class880 var1, int var2) {
      Item var5 = var0.method3090().getItem();
      if (var5 instanceof Class3262 && var0.method4234((Class3262)var5)) {
         int var6 = ((Class3262)var5).method11771() - var2;
         return var0.method3213(var1, (double)var6);
      } else {
         return method21581(var0, var1);
      }
   }

   public static boolean method21581(Class880 var0, Class880 var1) {
      double var4 = var0.method3276(var1.getPosX(), var1.getPosY(), var1.getPosZ());
      double var6 = (double)(var0.method3429() * 2.0F * var0.method3429() * 2.0F + var1.method3429());
      return var4 <= var6;
   }

   public static boolean method21582(Class880 var0, Class880 var1, double var2) {
      Optional var6 = var0.method2992().<Class880>method21410(Class8830.field39826);
      if (var6.isPresent()) {
         double var7 = var0.method3278(((Class880)var6.get()).getPositionVec());
         double var9 = var0.method3278(var1.getPositionVec());
         return var9 > var7 + var2 * var2;
      } else {
         return false;
      }
   }

   public static boolean method21583(Class880 var0, Class880 var1) {
      Class6947<?> var4 = var0.method2992();
      return var4.method21404(Class8830.field39819) ? var4.method21410(Class8830.field39819).get().contains(var1) : false;
   }

   public static Class880 method21584(Class880 var0, Optional<Class880> var1, Class880 var2) {
      return var1.isPresent() ? method21585(var0, (Class880)var1.get(), var2) : var2;
   }

   public static Class880 method21585(Class880 var0, Class880 var1, Class880 var2) {
      Vector3d var5 = var1.getPositionVec();
      Vector3d var6 = var2.getPositionVec();
      return !(var0.method3278(var5) < var0.method3278(var6)) ? var2 : var1;
   }

   public static Optional<Class880> method21586(Class880 var0, Class8830<UUID> var1) {
      Optional<UUID> var4 = var0.method2992().method21410(var1);
      return var4.map(var1x -> (Class880)((ServerWorld)var0.world).method6942(var1x));
   }

   public static Stream<Class1042> method21587(Class1042 var0, Predicate<Class1042> var1) {
      return var0.method2992()
         .<List<Class880>>method21410(Class8830.field39818)
         .<Stream<Class1042>>map(
            var2 -> var2.stream()
                  .filter(var1xx -> var1xx instanceof Class1042 && var1xx != var0)
                  .<Class1042>map(var0xx -> (Class1042)var0xx)
                  .filter(Class880::method3066)
                  .filter(var1)
         )
         .orElseGet(Stream::empty);
   }
}
