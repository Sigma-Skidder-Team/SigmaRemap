package mapped;

import java.util.function.Predicate;

public final class Class119 implements Predicate<MobEntity> {
   private static String[] field426;

   public boolean test(MobEntity var1) {
      return var1 != null && Class1015.method4418().containsKey(var1.getType());
   }
}
