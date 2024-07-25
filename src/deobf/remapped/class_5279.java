package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum class_5279 {
   field_26992("major_negative", -5, 100, 10, 10),
   field_26999("minor_negative", -1, 200, 20, 20),
   field_27000("minor_positive", 1, 200, 1, 5),
   field_26995("major_positive", 5, 100, 0, 100),
   field_27004("trading", 1, 25, 2, 20);

   public final String field_27003;
   public final int field_26994;
   public final int field_26996;
   public final int field_26997;
   public final int field_27001;
   private static final Map<String, class_5279> field_26998 = Stream.<class_5279>of(values())
      .collect(ImmutableMap.toImmutableMap(var0 -> var0.field_27003, Function.identity()));

   private class_5279(String var3, int var4, int var5, int var6, int var7) {
      this.field_27003 = var3;
      this.field_26994 = var4;
      this.field_26996 = var5;
      this.field_26997 = var6;
      this.field_27001 = var7;
   }

   @Nullable
   public static class_5279 method_24103(String var0) {
      return field_26998.get(var0);
   }
}
