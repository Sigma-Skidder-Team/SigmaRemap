package remapped;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public enum class_4772 {
   field_23130("points", PlayerEntity::method_3159, (var0, var1) -> {
      if (var1 < var0.method_3194()) {
         var0.method_43247(var1);
         return true;
      } else {
         return false;
      }
   }, var0 -> MathHelper.floor(var0.field_3842 * (float)var0.method_3194())),
   field_23132("levels", class_9359::method_3220, (var0, var1) -> {
      var0.method_43277(var1);
      return true;
   }, var0 -> var0.field_3840);

   public final BiConsumer<class_9359, Integer> field_23128;
   public final BiPredicate<class_9359, Integer> field_23126;
   public final String field_23129;
   private final ToIntFunction<class_9359> field_23133;

   private class_4772(String var3, BiConsumer<class_9359, Integer> var4, BiPredicate<class_9359, Integer> var5, ToIntFunction<class_9359> var6) {
      this.field_23128 = var4;
      this.field_23129 = var3;
      this.field_23126 = var5;
      this.field_23133 = var6;
   }
}
