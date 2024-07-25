package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public enum class_6139 {
   field_31493("feet", (var0, var1) -> var0),
   field_31490("eyes", (var0, var1) -> new class_1343(var0.field_7336, var0.field_7333 + (double)var1.method_37277(), var0.field_7334));

   private static final Map<String, class_6139> field_31488 = Util.<Map<String, class_6139>>method_44659(Maps.newHashMap(), var0 -> {
      for (class_6139 var6 : values()) {
         var0.put(var6.field_31492, var6);
      }
   });
   private final String field_31492;
   private final BiFunction<class_1343, Entity, class_1343> field_31489;

   private class_6139(String var3, BiFunction<class_1343, Entity, class_1343> var4) {
      this.field_31492 = var3;
      this.field_31489 = var4;
   }

   @Nullable
   public static class_6139 method_28186(String var0) {
      return field_31488.get(var0);
   }

   public class_1343 method_28187(Entity var1) {
      return this.field_31489.apply(var1.method_37245(), var1);
   }

   public class_1343 method_28188(class_9155 var1) {
      Entity var4 = var1.method_42200();
      return var4 != null ? this.field_31489.apply(var1.method_42192(), var4) : var1.method_42192();
   }
}
