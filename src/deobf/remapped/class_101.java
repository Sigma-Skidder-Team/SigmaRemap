package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_101 implements class_4530 {
   field_239("none"),
   field_241("frozen");

   private final String field_242;
   public static final Codec<class_101> field_243 = class_4530.<class_101>method_21048(class_101::values, class_101::method_296);
   private static final Map<String, class_101> field_238 = Arrays.<class_101>stream(values())
      .collect(Collectors.toMap(class_101::method_299, var0 -> (class_101)var0));

   public abstract float method_297(class_1331 var1, float var2);

   private class_101(String var3) {
      this.field_242 = var3;
   }

   public String method_299() {
      return this.field_242;
   }

   @Override
   public String method_21049() {
      return this.field_242;
   }

   public static class_101 method_296(String var0) {
      return field_238.get(var0);
   }
}
