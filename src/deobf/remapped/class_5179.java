package remapped;

import java.util.function.Predicate;

public final class class_5179 implements Predicate<MobEntity> {
   private static String[] field_26658;

   public boolean test(MobEntity var1) {
      return var1 != null && class_107.method_320().containsKey(var1.getType());
   }
}
