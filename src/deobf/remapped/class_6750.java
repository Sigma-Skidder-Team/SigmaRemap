package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_6750 implements class_4530 {
   field_34851("none"),
   field_34844("rain"),
   field_34846("snow");

   public static final Codec<class_6750> field_34847 = class_4530.<class_6750>method_21048(class_6750::values, class_6750::method_30945);
   private static final Map<String, class_6750> field_34848 = Arrays.<class_6750>stream(values())
      .collect(Collectors.toMap(class_6750::method_30944, var0 -> (class_6750)var0));
   private final String field_34849;

   private class_6750(String var3) {
      this.field_34849 = var3;
   }

   public String method_30944() {
      return this.field_34849;
   }

   public static class_6750 method_30945(String var0) {
      return field_34848.get(var0);
   }

   @Override
   public String method_21049() {
      return this.field_34849;
   }
}
